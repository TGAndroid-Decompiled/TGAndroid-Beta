package org.telegram.ui.Components.spoilers;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.style.ForegroundColorSpan;
import android.text.style.ReplacementSpan;
import android.view.Choreographer;
import android.view.View;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.utils.Choreographer60FpsContent;
import org.telegram.ui.ActionBar.BottomSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Components.CapsuleBlobDrawable$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.QuoteSpan;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.Tooltip;
import org.telegram.ui.PhotoViewer;

public final class SpoilerEffect extends Drawable {
    public static final float[] ALPHAS;
    public static final int MAX_PARTICLES_PER_ENTITY;
    public static final int PARTICLES_PER_CHARACTER;
    public static WeakHashMap lazyLayoutLines;
    public static final float[][] particlePoints;
    public static final Path tempPath;
    public static Paint xRefPaint;
    public int bitmapSize;
    public final RectF boundsFWithInset;
    public PorterDuffColorFilter colorFilter;
    public final float[] halfStrokeWidths;
    public boolean insideQuote;
    public boolean invalidateParent;
    public int lastColor;
    public long lastDrawTime;
    public int mAlpha;
    public View mParent;
    public int maxParticles;
    public Runnable onRippleEndCallback;
    public final Paint[] particlePaints;
    public final float[] particleRands;
    public final ArrayList particles;
    public final Stack particlesPool;
    public final int[] renderCount;
    public boolean reverseAnimator;
    public ValueAnimator rippleAnimator;
    public TimeInterpolator rippleInterpolator;
    public float rippleMaxRadius;
    public float rippleProgress;
    public float rippleX;
    public float rippleY;
    public boolean shouldInvalidateColor;
    public RectF visibleRect;

    public final class Particle {
        public int alpha;
        public float currentTime;
        public float lifeTime;
        public float vecX;
        public float vecY;
        public float velocity;
        public float x;
        public float y;
    }

    static {
        int i = SharedConfig.getDevicePerformanceClass() != 2 ? 100 : 150;
        MAX_PARTICLES_PER_ENTITY = i;
        PARTICLES_PER_CHARACTER = SharedConfig.getDevicePerformanceClass() != 2 ? 10 : 30;
        ALPHAS = new float[]{0.3f, 0.6f, 1.0f};
        particlePoints = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 3, i * 5);
        tempPath = new Path();
    }

    public SpoilerEffect() {
        float[] fArr = ALPHAS;
        this.particlePaints = new Paint[fArr.length];
        this.halfStrokeWidths = new float[fArr.length];
        this.particlesPool = new Stack();
        this.particleRands = new float[14];
        this.renderCount = new int[fArr.length];
        this.particles = new ArrayList();
        this.rippleProgress = -1.0f;
        this.mAlpha = 255;
        this.rippleInterpolator = new CapsuleBlobDrawable$$ExternalSyntheticLambda0(1);
        this.boundsFWithInset = new RectF();
        for (int i = 0; i < fArr.length; i++) {
            this.particlePaints[i] = new Paint();
            if (i == 0) {
                this.particlePaints[i].setStrokeWidth(AndroidUtilities.dp(1.4f));
                this.particlePaints[i].setStyle(Paint.Style.STROKE);
                this.particlePaints[i].setStrokeCap(Paint.Cap.ROUND);
            } else {
                this.particlePaints[i].setStrokeWidth(AndroidUtilities.dp(1.2f));
                this.particlePaints[i].setStyle(Paint.Style.STROKE);
                this.particlePaints[i].setStrokeCap(Paint.Cap.ROUND);
            }
            this.halfStrokeWidths[i] = this.particlePaints[i].getStrokeWidth() * 0.5f;
        }
        SharedConfig.getDevicePerformanceClass();
        setColor(0);
    }

    public static void addSpoilers(View view, Layout layout, Stack stack, List list) {
        if (layout.getText() instanceof Spanned) {
            addSpoilers(view, layout, -1, -1, (Spanned) layout.getText(), stack, list, null);
        }
    }

    public static void clipOutCanvas(Canvas canvas, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = tempPath;
        path.rewind();
        for (int i = 0; i < arrayList.size(); i++) {
            Rect bounds = ((SpoilerEffect) arrayList.get(i)).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    public static void layoutDrawMaybe(Canvas canvas, Layout layout) {
        if (!(canvas instanceof SizeNotifierFrameLayout.SimplerCanvas)) {
            layout.draw(canvas);
            return;
        }
        int alpha = layout.getPaint().getAlpha();
        layout.getPaint().setAlpha((int) (alpha * 0.4f));
        if (lazyLayoutLines == null) {
            lazyLayoutLines = new WeakHashMap();
        }
        ArrayList arrayList = (ArrayList) lazyLayoutLines.get(layout);
        if (arrayList == null) {
            arrayList = new ArrayList();
            int lineCount = layout.getLineCount();
            for (int i = 0; i < lineCount; i++) {
                arrayList.add(new RectF(layout.getLineLeft(i), layout.getLineTop(i), layout.getLineRight(i), layout.getLineBottom(i)));
            }
            lazyLayoutLines.put(layout, arrayList);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            canvas.drawRect((RectF) arrayList.get(i2), layout.getPaint());
        }
        layout.getPaint().setAlpha(alpha);
    }

    public static void renderWithRipple(View view, boolean z, int i, int i2, AtomicReference atomicReference, int i3, Layout layout, List list, Canvas canvas, boolean z2) {
        StaticLayout staticLayout;
        TextStyleSpan[] textStyleSpanArr;
        int i4;
        if (list == null || list.isEmpty()) {
            layoutDrawMaybe(canvas, layout);
            return;
        }
        Layout layoutBuild = (Layout) atomicReference.get();
        int i5 = 0;
        if (layoutBuild == null || !layout.getText().toString().equals(layoutBuild.getText().toString()) || layout.getWidth() != layoutBuild.getWidth() || layout.getHeight() != layoutBuild.getHeight()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(layout.getText());
            if (layout.getText() instanceof Spanned) {
                Spanned spanned = (Spanned) layout.getText();
                TextStyleSpan[] textStyleSpanArr2 = (TextStyleSpan[]) spanned.getSpans(0, spanned.length(), TextStyleSpan.class);
                int i6 = 0;
                while (i6 < Math.min(100, textStyleSpanArr2.length)) {
                    TextStyleSpan textStyleSpan = textStyleSpanArr2[i6];
                    if (textStyleSpan.isSpoiler()) {
                        int spanStart = spanned.getSpanStart(textStyleSpan);
                        int spanEnd = spanned.getSpanEnd(textStyleSpan);
                        Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(spanStart, spanEnd, Emoji.EmojiSpan.class);
                        int length = emojiSpanArr.length;
                        while (i5 < length) {
                            TextStyleSpan[] textStyleSpanArr3 = textStyleSpanArr2;
                            final Emoji.EmojiSpan emojiSpan = emojiSpanArr[i5];
                            spannableStringBuilder.setSpan(new ReplacementSpan() {
                                @Override
                                public final void draw(Canvas canvas2, CharSequence charSequence, int i7, int i8, float f, int i9, int i10, int i11, Paint paint) {
                                }

                                @Override
                                public final int getSize(Paint paint, CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
                                    return emojiSpan.getSize(paint, charSequence, i7, i8, fontMetricsInt);
                                }
                            }, spanned.getSpanStart(emojiSpan), spanned.getSpanEnd(emojiSpan), spanned.getSpanFlags(textStyleSpan));
                            spannableStringBuilder.removeSpan(emojiSpan);
                            i5++;
                            textStyleSpanArr2 = textStyleSpanArr3;
                            i6 = i6;
                            length = length;
                            emojiSpanArr = emojiSpanArr;
                        }
                        textStyleSpanArr = textStyleSpanArr2;
                        i4 = i6;
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(0), spanStart, spanEnd, spanned.getSpanFlags(textStyleSpan));
                        spannableStringBuilder.removeSpan(textStyleSpan);
                    } else {
                        textStyleSpanArr = textStyleSpanArr2;
                        i4 = i6;
                    }
                    i6 = i4 + 1;
                    textStyleSpanArr2 = textStyleSpanArr;
                    i5 = 0;
                }
            }
            if (i3 == 1) {
                staticLayout = new StaticLayout(spannableStringBuilder, layout.getPaint(), layout.getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, AndroidUtilities.dp(1.66f), false);
            } else {
                if (Build.VERSION.SDK_INT >= 24) {
                    layoutBuild = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), layout.getPaint(), layout.getWidth()).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(layout.getAlignment()).setLineSpacing(layout.getSpacingAdd(), layout.getSpacingMultiplier()).build();
                } else {
                    staticLayout = new StaticLayout(spannableStringBuilder, layout.getPaint(), layout.getWidth(), layout.getAlignment(), layout.getSpacingMultiplier(), layout.getSpacingAdd(), false);
                }
                atomicReference.set(layoutBuild);
            }
            layoutBuild = staticLayout;
            atomicReference.set(layoutBuild);
        }
        if (list.isEmpty()) {
            layoutDrawMaybe(canvas, layout);
        } else {
            canvas.save();
            canvas.translate(0.0f, i2);
            layoutBuild.draw(canvas);
            canvas.restore();
        }
        if (list.isEmpty()) {
            return;
        }
        Path path = tempPath;
        path.rewind();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Rect bounds = ((SpoilerEffect) it.next()).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        int i7 = 0;
        if (!list.isEmpty() && ((SpoilerEffect) list.get(0)).rippleProgress != -1.0f) {
            canvas.save();
            canvas.clipPath(path);
            path.rewind();
            if (!list.isEmpty()) {
                ((SpoilerEffect) list.get(0)).getRipplePath(path);
            }
            canvas.clipPath(path);
            canvas.translate(0.0f, -view.getPaddingTop());
            layoutDrawMaybe(canvas, layout);
            canvas.restore();
            i7 = 0;
        }
        boolean z3 = ((SpoilerEffect) list.get(i7)).rippleProgress != -1.0f;
        if (z3) {
            int measuredWidth = view.getMeasuredWidth();
            if (z2 && (view.getParent() instanceof View)) {
                measuredWidth = ((View) view.getParent()).getMeasuredWidth();
            }
            canvas.saveLayer(0.0f, 0.0f, measuredWidth, view.getMeasuredHeight(), null, 31);
        } else {
            canvas.save();
        }
        canvas.translate(0.0f, -view.getPaddingTop());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            SpoilerEffect spoilerEffect = (SpoilerEffect) it2.next();
            spoilerEffect.invalidateParent = z;
            if (spoilerEffect.mParent != view) {
                spoilerEffect.mParent = view;
            }
            boolean z4 = spoilerEffect.shouldInvalidateColor;
            spoilerEffect.shouldInvalidateColor = false;
            if (z4) {
                spoilerEffect.setColor(ColorUtils.blendARGB(Math.max(0.0f, spoilerEffect.rippleProgress), i, (i3 == 1 ? layout.getPaint() : Theme.chat_msgTextPaint).getColor()));
            } else {
                spoilerEffect.setColor(i);
            }
            spoilerEffect.draw(canvas);
        }
        if (z3) {
            path.rewind();
            ((SpoilerEffect) list.get(0)).getRipplePath(path);
            if (xRefPaint == null) {
                Paint paint = new Paint(1);
                xRefPaint = paint;
                paint.setColor(-16777216);
                xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            canvas.drawPath(path, xRefPaint);
        }
        canvas.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        if (SpoilerEffectBitmapFactory.factory == null) {
            SpoilerEffectBitmapFactory.factory = new SpoilerEffectBitmapFactory();
        }
        SpoilerEffectBitmapFactory spoilerEffectBitmapFactory = SpoilerEffectBitmapFactory.factory;
        PhotoViewer.AnonymousClass14[] anonymousClass14Arr = spoilerEffectBitmapFactory.bitmapBuffers;
        PhotoViewer.AnonymousClass14 anonymousClass14 = anonymousClass14Arr[0];
        int i2 = spoilerEffectBitmapFactory.size;
        if (anonymousClass14 == null) {
            anonymousClass14Arr[0] = new PhotoViewer.AnonymousClass14(i2);
            spoilerEffectBitmapFactory.shaderPaint = new Paint();
            spoilerEffectBitmapFactory.shaderSpoilerEffects = new ArrayList(100);
            float f = i2;
            int i3 = (int) (f / 10.0f);
            int iDp = (int) ((f / AndroidUtilities.dp(200.0f)) * 60.0f);
            int i4 = 0;
            while (true) {
                if (i4 >= 10) {
                    break;
                }
                int i5 = 0;
                for (int i6 = 10; i5 < i6; i6 = 10) {
                    SpoilerEffect spoilerEffect = new SpoilerEffect();
                    spoilerEffect.bitmapSize = i2;
                    int i7 = i3 * i4;
                    int i8 = i3 * i5;
                    spoilerEffect.setBounds(i7, i8 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f) + i7 + i3, AndroidUtilities.dp(5.0f) + i8 + i3);
                    int iMin = Math.min(MAX_PARTICLES_PER_ENTITY * 5, iDp);
                    spoilerEffect.maxParticles = iMin;
                    while (true) {
                        Stack stack = spoilerEffect.particlesPool;
                        if (spoilerEffect.particles.size() + stack.size() < iMin) {
                            stack.push(new Particle());
                        }
                    }
                    spoilerEffect.setColor(-1);
                    spoilerEffectBitmapFactory.shaderSpoilerEffects.add(spoilerEffect);
                    i5++;
                }
                i4++;
            }
            i = 128;
            spoilerEffectBitmapFactory.doDraw(new Canvas((Bitmap) anonymousClass14Arr[0].blur), new Rect(0, 0, i2, i2));
            spoilerEffectBitmapFactory.shaderPaint.setShader((BitmapShader) anonymousClass14Arr[0].this$0);
            spoilerEffectBitmapFactory.lastUpdateTime = System.currentTimeMillis();
        } else {
            i = 128;
            if (spoilerEffectBitmapFactory.isDrawnWithClipRegion && !LiteMode.isEnabled(128)) {
                spoilerEffectBitmapFactory.currentBitmapBuffer = 0;
                spoilerEffectBitmapFactory.doDraw(new Canvas((Bitmap) anonymousClass14Arr[0].blur), new Rect(0, 0, i2, i2));
                spoilerEffectBitmapFactory.shaderPaint.setShader((BitmapShader) anonymousClass14Arr[0].this$0);
                spoilerEffectBitmapFactory.lastUpdateTime = System.currentTimeMillis();
                spoilerEffectBitmapFactory.isDrawnWithClipRegion = false;
            }
        }
        Paint paint = spoilerEffectBitmapFactory.shaderPaint;
        paint.setColorFilter(this.colorFilter);
        canvas.drawRect(bounds, paint);
        if (LiteMode.isEnabled(i)) {
            Choreographer60FpsContent choreographer60FpsContent = Choreographer60FpsContent.getInstance();
            choreographer60FpsContent.getClass();
            Choreographer60FpsContent.checkMainThread();
            choreographer60FpsContent.mDrawablesToInvalidate.add(this);
            if (SpoilerEffectBitmapFactory.factory == null) {
                SpoilerEffectBitmapFactory.factory = new SpoilerEffectBitmapFactory();
            }
            SpoilerEffectBitmapFactory spoilerEffectBitmapFactory2 = SpoilerEffectBitmapFactory.factory;
            spoilerEffectBitmapFactory2.getClass();
            int i9 = bounds.left;
            int i10 = spoilerEffectBitmapFactory2.size;
            int i11 = ((i9 % i10) + i10) % i10;
            int i12 = ((bounds.top % i10) + i10) % i10;
            int iMin2 = Math.min(bounds.width(), i10) + i11;
            int iMin3 = Math.min(bounds.height(), i10) + i12;
            int iMin4 = Math.min(iMin2, i10);
            int iMin5 = Math.min(iMin3, i10);
            Rect rect = spoilerEffectBitmapFactory2.clipRegion;
            rect.union(i11, i12, iMin4, iMin5);
            if (iMin2 > i10) {
                rect.union(0, i12, iMin2 - i10, Math.min(iMin3, i10));
            }
            if (iMin3 > i10) {
                rect.union(i11, 0, Math.min(iMin2, i10), iMin3 - i10);
            }
            if (iMin2 > i10 && iMin3 > i10) {
                rect.union(0, 0, iMin2 - i10, iMin3 - i10);
            }
            if (spoilerEffectBitmapFactory2.invalidated || rect.isEmpty()) {
                return;
            }
            spoilerEffectBitmapFactory2.invalidated = true;
            Choreographer.getInstance().postFrameCallback(spoilerEffectBitmapFactory2.postFrameCallback);
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void getRipplePath(Path path) {
        path.addCircle(this.rippleX, this.rippleY, MathUtils.clamp(this.rippleProgress, 0.0f, 1.0f) * this.rippleMaxRadius, Path.Direction.CW);
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        View view = this.mParent;
        if (view != null) {
            if (view.getParent() != null && this.invalidateParent) {
                ((View) view.getParent()).invalidate();
            } else if (view instanceof BaseCell) {
                ((BaseCell) view).invalidateLite();
            } else {
                view.invalidate();
            }
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.boundsFWithInset;
        rectF.set(rect);
        rectF.inset(0.0f, AndroidUtilities.dp(2.5f));
    }

    @Override
    public final void setAlpha(int i) {
        this.mAlpha = i;
        int i2 = 0;
        while (true) {
            float[] fArr = ALPHAS;
            if (i2 >= fArr.length) {
                return;
            }
            this.particlePaints[i2].setAlpha((int) (fArr[i2] * i));
            i2++;
        }
    }

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Iterator it = this.particles.iterator();
        while (it.hasNext()) {
            Particle particle = (Particle) it.next();
            if (!getBounds().contains((int) particle.x, (int) particle.y)) {
                it.remove();
            }
            Stack stack = this.particlesPool;
            if (stack.size() < this.maxParticles) {
                stack.push(particle);
            }
        }
    }

    public final void setColor(int i) {
        if (this.lastColor == i) {
            return;
        }
        int i2 = 0;
        while (true) {
            float[] fArr = ALPHAS;
            if (i2 >= fArr.length) {
                this.colorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
                this.lastColor = i;
                return;
            } else {
                this.particlePaints[i2].setColor(ColorUtils.setAlphaComponent(i, (int) (this.mAlpha * fArr[i2])));
                i2++;
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        for (Paint paint : this.particlePaints) {
            paint.setColorFilter(colorFilter);
        }
    }

    public final void setVisibleBounds(float f, float f2, float f3) {
        if (this.visibleRect == null) {
            this.visibleRect = new RectF();
        }
        RectF rectF = this.visibleRect;
        if (rectF.left == 0.0f && rectF.right == f2 && rectF.top == f && rectF.bottom == f3) {
            return;
        }
        rectF.left = 0.0f;
        rectF.top = f;
        rectF.right = f2;
        rectF.bottom = f3;
        invalidateSelf();
    }

    public final void startRipple(float f, float f2, float f3, boolean z) {
        this.rippleX = f;
        this.rippleY = f2;
        this.rippleMaxRadius = f3;
        this.rippleProgress = z ? 1.0f : 0.0f;
        this.reverseAnimator = z;
        ValueAnimator valueAnimator = this.rippleAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int alpha = this.reverseAnimator ? 255 : this.particlePaints[ALPHAS.length - 1].getAlpha();
        ValueAnimator duration = ValueAnimator.ofFloat(this.rippleProgress, z ? 0.0f : 1.0f).setDuration((long) MathUtils.clamp(this.rippleMaxRadius * 0.3f, 250.0f, 550.0f));
        this.rippleAnimator = duration;
        duration.setInterpolator(this.rippleInterpolator);
        this.rippleAnimator.addUpdateListener(new BottomSheet$$ExternalSyntheticLambda3(this, alpha, 6));
        this.rippleAnimator.addListener(new Tooltip.AnonymousClass1(this, 22));
        this.rippleAnimator.start();
        invalidateSelf();
    }

    public static void addSpoilers(View view, Layout layout, int i, int i2, Stack stack, List list) {
        if (layout.getText() instanceof Spanned) {
            addSpoilers(view, layout, i, i2, (Spanned) layout.getText(), stack, list, null);
        }
    }

    public static void addSpoilers(final View view, final Layout layout, int i, int i2, Spanned spanned, final Stack stack, final List list, final ArrayList arrayList) {
        final int i3;
        final int i4;
        if (layout == null) {
            return;
        }
        TextStyleSpan[] textStyleSpanArr = (TextStyleSpan[]) spanned.getSpans(0, layout.getText().length(), TextStyleSpan.class);
        for (int i5 = 0; i5 < Math.min(100, textStyleSpanArr.length); i5++) {
            if (textStyleSpanArr[i5].isSpoiler()) {
                int spanStart = spanned.getSpanStart(textStyleSpanArr[i5]);
                int spanEnd = spanned.getSpanEnd(textStyleSpanArr[i5]);
                if (i == -1 && i2 == -1) {
                    int lineForOffset = layout.getLineForOffset(spanEnd);
                    int iMin = Integer.MAX_VALUE;
                    int iMax = Integer.MIN_VALUE;
                    for (int lineForOffset2 = layout.getLineForOffset(spanStart); lineForOffset2 <= lineForOffset; lineForOffset2++) {
                        iMin = Math.min(iMin, (int) layout.getLineLeft(lineForOffset2));
                        iMax = Math.max(iMax, (int) layout.getLineRight(lineForOffset2));
                    }
                    i3 = iMin;
                    i4 = iMax;
                } else {
                    i3 = i;
                    i4 = i2;
                }
                layout.getSelectionPath(spanStart, spanEnd, new Path() {
                    @Override
                    public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
                        Stack stack2 = stack;
                        SpoilerEffect spoilerEffect = (stack2 == null || stack2.isEmpty()) ? new SpoilerEffect() : (SpoilerEffect) stack2.remove(0);
                        spoilerEffect.insideQuote = false;
                        ArrayList arrayList2 = arrayList;
                        if (arrayList2 != null) {
                            float f5 = (f2 + f4) / 2.0f;
                            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                QuoteSpan.Block block = (QuoteSpan.Block) arrayList2.get(i6);
                                if (f5 >= block.top && f5 <= block.bottom) {
                                    spoilerEffect.insideQuote = true;
                                    break;
                                }
                            }
                        }
                        spoilerEffect.rippleProgress = -1.0f;
                        ValueAnimator valueAnimator = spoilerEffect.rippleAnimator;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        spoilerEffect.shouldInvalidateColor = true;
                        int iMax2 = (int) Math.max(f, i3);
                        int i7 = (int) f2;
                        int i8 = i4;
                        spoilerEffect.setBounds(iMax2, i7, (int) Math.min(f3, i8 <= 0 ? 2.1474836E9f : i8), (int) f4);
                        spoilerEffect.setColor(layout.getPaint().getColor());
                        spoilerEffect.rippleInterpolator = Easings.easeInQuad;
                        int iWidth = spoilerEffect.getBounds().width() / AndroidUtilities.dp(6.0f);
                        int i9 = SpoilerEffect.PARTICLES_PER_CHARACTER;
                        int iClamp = MathUtils.clamp(iWidth * i9, i9, SpoilerEffect.MAX_PARTICLES_PER_ENTITY);
                        spoilerEffect.maxParticles = iClamp;
                        while (true) {
                            Stack stack3 = spoilerEffect.particlesPool;
                            if (spoilerEffect.particles.size() + stack3.size() >= iClamp) {
                                break;
                            } else {
                                stack3.push(new Particle());
                            }
                        }
                        View view2 = view;
                        if (view2 != null) {
                            spoilerEffect.mParent = view2;
                        }
                        list.add(spoilerEffect);
                    }
                });
            }
        }
        if (!(view instanceof TextView) || stack == null) {
            return;
        }
        stack.clear();
    }
}
