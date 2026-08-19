package org.telegram.ui.Components.spoilers;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
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
import android.view.View;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.Choreographer60FpsContent;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.QuoteSpan;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TextStyleSpan;

public class SpoilerEffect extends Drawable {
    public static final float[] ALPHAS;
    public static final int MAX_PARTICLES_PER_ENTITY;
    public static final int PARTICLES_PER_CHARACTER;
    private static WeakHashMap lazyLayoutLines;
    private static final float[][] particlePoints;
    private static final Path tempPath;
    private static Paint xRefPaint;
    private int bitmapSize;
    private final RectF boundsFWithInset;
    private ColorFilter colorFilter;
    private final float[] halfStrokeWidths;
    public boolean insideQuote;
    private boolean invalidateParent;
    private boolean isLowDevice;
    private int lastColor;
    private long lastDrawTime;
    private int mAlpha;
    private View mParent;
    private int maxParticles;
    private Runnable onRippleEndCallback;
    private final Paint[] particlePaints;
    private final float[] particleRands;
    private final ArrayList particles;
    private final Stack particlesPool;
    private final int[] renderCount;
    private boolean reverseAnimator;
    private ValueAnimator rippleAnimator;
    private TimeInterpolator rippleInterpolator;
    private float rippleMaxRadius;
    private float rippleProgress;
    private float rippleX;
    private float rippleY;
    private boolean shouldInvalidateColor;
    private boolean suppressUpdates;
    private RectF visibleRect;

    public static float $r8$lambda$DlWWdeTSSSqeRn6DubqCDzjPfOU(float f) {
        return f;
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    static {
        int iMeasureMaxParticlesCount = measureMaxParticlesCount();
        MAX_PARTICLES_PER_ENTITY = iMeasureMaxParticlesCount;
        PARTICLES_PER_CHARACTER = measureParticlesPerCharacter();
        ALPHAS = new float[]{0.3f, 0.6f, 1.0f};
        particlePoints = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 3, iMeasureMaxParticlesCount * 5);
        tempPath = new Path();
    }

    private static int measureParticlesPerCharacter() {
        return SharedConfig.getDevicePerformanceClass() != 2 ? 10 : 30;
    }

    private static int measureMaxParticlesCount() {
        return SharedConfig.getDevicePerformanceClass() != 2 ? 100 : 150;
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
        this.rippleInterpolator = new TimeInterpolator() {
            @Override
            public final float getInterpolation(float f) {
                return SpoilerEffect.$r8$lambda$DlWWdeTSSSqeRn6DubqCDzjPfOU(f);
            }
        };
        this.boundsFWithInset = new RectF();
        for (int i = 0; i < ALPHAS.length; i++) {
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
        this.isLowDevice = SharedConfig.getDevicePerformanceClass() == 0;
        setColor(0);
    }

    public void setSuppressUpdates(boolean z) {
        this.suppressUpdates = z;
        invalidateSelf();
    }

    public void setInvalidateParent(boolean z) {
        this.invalidateParent = z;
    }

    public void updateMaxParticles() {
        int iWidth = getBounds().width() / AndroidUtilities.dp(6.0f);
        int i = PARTICLES_PER_CHARACTER;
        setMaxParticlesCount(MathUtils.clamp(iWidth * i, i, MAX_PARTICLES_PER_ENTITY));
    }

    public void setOnRippleEndCallback(Runnable runnable) {
        this.onRippleEndCallback = runnable;
    }

    public void startRipple(float f, float f2, float f3) {
        startRipple(f, f2, f3, false);
    }

    public void startRipple(float f, float f2, float f3, boolean z) {
        this.rippleX = f;
        this.rippleY = f2;
        this.rippleMaxRadius = f3;
        this.rippleProgress = z ? 1.0f : 0.0f;
        this.reverseAnimator = z;
        ValueAnimator valueAnimator = this.rippleAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final int alpha = this.reverseAnimator ? 255 : this.particlePaints[ALPHAS.length - 1].getAlpha();
        ValueAnimator duration = ValueAnimator.ofFloat(this.rippleProgress, z ? 0.0f : 1.0f).setDuration((long) MathUtils.clamp(this.rippleMaxRadius * 0.3f, 250.0f, 550.0f));
        this.rippleAnimator = duration;
        duration.setInterpolator(this.rippleInterpolator);
        this.rippleAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SpoilerEffect.$r8$lambda$Bw7XpHB9YmMEfXpK99wL0DSN4Ag(this.f$0, alpha, valueAnimator2);
            }
        });
        this.rippleAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                Iterator it = SpoilerEffect.this.particles.iterator();
                while (it.hasNext()) {
                    Particle particle = (Particle) it.next();
                    if (SpoilerEffect.this.particlesPool.size() < SpoilerEffect.this.maxParticles) {
                        SpoilerEffect.this.particlesPool.push(particle);
                    }
                    it.remove();
                }
                if (SpoilerEffect.this.onRippleEndCallback != null) {
                    SpoilerEffect.this.onRippleEndCallback.run();
                    SpoilerEffect.this.onRippleEndCallback = null;
                }
                SpoilerEffect.this.rippleAnimator = null;
                SpoilerEffect.this.invalidateSelf();
            }
        });
        this.rippleAnimator.start();
        invalidateSelf();
    }

    public static void $r8$lambda$Bw7XpHB9YmMEfXpK99wL0DSN4Ag(SpoilerEffect spoilerEffect, int i, ValueAnimator valueAnimator) {
        spoilerEffect.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        spoilerEffect.rippleProgress = fFloatValue;
        spoilerEffect.setAlpha((int) (i * (1.0f - fFloatValue)));
        spoilerEffect.shouldInvalidateColor = true;
        spoilerEffect.invalidateSelf();
    }

    public void setRippleInterpolator(TimeInterpolator timeInterpolator) {
        this.rippleInterpolator = timeInterpolator;
    }

    public void getRipplePath(Path path) {
        path.addCircle(this.rippleX, this.rippleY, this.rippleMaxRadius * MathUtils.clamp(this.rippleProgress, 0.0f, 1.0f), Path.Direction.CW);
    }

    public boolean hasRipplePath() {
        return this.rippleMaxRadius > 0.0f && this.rippleProgress > 0.0f;
    }

    public float getRippleProgress() {
        return this.rippleProgress;
    }

    public boolean shouldInvalidateColor() {
        boolean z = this.shouldInvalidateColor;
        this.shouldInvalidateColor = false;
        return z;
    }

    public void setRippleProgress(float f) {
        ValueAnimator valueAnimator;
        this.rippleProgress = f;
        if (f == -1.0f && (valueAnimator = this.rippleAnimator) != null) {
            valueAnimator.cancel();
        }
        this.shouldInvalidateColor = true;
    }

    @Override
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Iterator it = this.particles.iterator();
        while (it.hasNext()) {
            Particle particle = (Particle) it.next();
            if (!getBounds().contains((int) particle.x, (int) particle.y)) {
                it.remove();
            }
            if (this.particlesPool.size() < this.maxParticles) {
                this.particlesPool.push(particle);
            }
        }
    }

    @Override
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        Paint paint = SpoilerEffectBitmapFactory.getInstance().getPaint();
        paint.setColorFilter(this.colorFilter);
        canvas.drawRect(bounds, paint);
        if (LiteMode.isEnabled(128)) {
            Choreographer60FpsContent.getInstance().postInvalidateDrawable(this);
            SpoilerEffectBitmapFactory.getInstance().checkUpdate(bounds);
        }
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.boundsFWithInset.set(rect);
        this.boundsFWithInset.inset(0.0f, AndroidUtilities.dp(2.5f));
    }

    public void addPoints(SpoilerEffectBitmapFactory.PointsBuffer[] pointsBufferArr, Rect rect) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (pointsBufferArr != null) {
            int length = pointsBufferArr.length;
            float[] fArr = ALPHAS;
            if (length != fArr.length) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            int iMin = (int) Math.min(jCurrentTimeMillis - this.lastDrawTime, 34L);
            this.lastDrawTime = jCurrentTimeMillis;
            ArrayList arrayList = this.particles;
            Stack stack = this.particlesPool;
            int i6 = this.maxParticles;
            int length2 = fArr.length;
            Rect bounds = getBounds();
            float f = bounds.left;
            float f2 = bounds.top;
            float fWidth = bounds.width();
            float fHeight = bounds.height();
            RectF rectF = this.boundsFWithInset;
            float f3 = rectF.left;
            float f4 = rectF.top;
            float f5 = rectF.right;
            float f6 = rectF.bottom;
            float fDpf2 = AndroidUtilities.dpf2(1.0f);
            float f7 = rect.left - fDpf2;
            float f8 = rect.top - fDpf2;
            float f9 = rect.right + fDpf2;
            float f10 = rect.bottom + fDpf2;
            float f11 = iMin;
            float f12 = f11 / 500.0f;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                int i8 = size;
                Particle particle = (Particle) arrayList.get(i7);
                float f13 = f11;
                float f14 = fHeight;
                float fMin = Math.min(particle.currentTime + f13, particle.lifeTime);
                particle.currentTime = fMin;
                float f15 = particle.x;
                float f16 = particle.y;
                boolean z = f15 < f3 || f15 > f5 || f16 < f4 || f16 > f6;
                if (fMin >= particle.lifeTime || z) {
                    if (stack.size() < i6) {
                        stack.push(particle);
                    }
                    int i9 = i8 - 1;
                    if (i7 != i9) {
                        arrayList.set(i7, (Particle) arrayList.get(i9));
                    }
                    arrayList.remove(i9);
                    size = i8 - 1;
                    i7--;
                } else {
                    float f17 = particle.velocity * f12;
                    particle.x = f15 + (particle.vecX * f17);
                    particle.y = f16 + (particle.vecY * f17);
                    size = i8;
                }
                i7++;
                fHeight = f14;
                f11 = f13;
            }
            float f18 = fHeight;
            int size2 = arrayList.size();
            if (size2 < i6) {
                int i10 = i6 - size2;
                float f19 = -1.0f;
                Arrays.fill(this.particleRands, 0, Math.min(i10, 14), -1.0f);
                int i11 = 0;
                int i12 = 0;
                while (i11 < i10) {
                    float fNextFloat = this.particleRands[i12];
                    if (fNextFloat == f19) {
                        fNextFloat = Utilities.fastRandom.nextFloat();
                        this.particleRands[i12] = fNextFloat;
                    }
                    int i13 = i12 + 1;
                    if (i13 == 14) {
                        i13 = 0;
                    }
                    Particle particle2 = !stack.isEmpty() ? (Particle) stack.pop() : new Particle();
                    int i14 = 0;
                    while (true) {
                        particle2.x = f + (Utilities.fastRandom.nextFloat() * fWidth);
                        particle2.y = (Utilities.fastRandom.nextFloat() * f18) + f2;
                        i14++;
                        if (particle2.x >= f3 && particle2.x <= f5 && particle2.y >= f4 && particle2.y <= f6) {
                            i5 = i13;
                            break;
                        }
                        i5 = i13;
                        if (i14 >= 4) {
                            break;
                        } else {
                            i13 = i5;
                        }
                    }
                    double d = ((((double) fNextFloat) * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                    particle2.vecX = (float) Math.cos(d);
                    particle2.vecY = (float) Math.sin(d);
                    particle2.currentTime = 0.0f;
                    particle2.lifeTime = Utilities.fastRandom.nextInt(2000) + 1000;
                    particle2.velocity = (fNextFloat * 6.0f) + 4.0f;
                    particle2.alpha = Utilities.fastRandom.nextInt(length2);
                    arrayList.add(particle2);
                    i11++;
                    i12 = i5;
                    f19 = -1.0f;
                }
                size2 = arrayList.size();
            }
            for (int i15 = 0; i15 < length2; i15++) {
                this.renderCount[i15] = 0;
            }
            int i16 = this.bitmapSize;
            int i17 = 0;
            while (i17 < size2) {
                Particle particle3 = (Particle) arrayList.get(i17);
                float f20 = particle3.x;
                float f21 = particle3.y;
                if (f20 < f7 || f20 > f9 || f21 < f8 || f21 > f10) {
                    i = size2;
                } else {
                    int i18 = particle3.alpha;
                    float[] fArr2 = particlePoints[i18];
                    int[] iArr = this.renderCount;
                    int i19 = iArr[i18];
                    int i20 = i19 + 1;
                    if (i20 >= fArr2.length) {
                        i = size2;
                    } else {
                        fArr2[i19] = f20;
                        fArr2[i20] = f21;
                        int i21 = i19 + 2;
                        float f22 = this.halfStrokeWidths[i18];
                        if (f20 < f22 && (i4 = i19 + 3) < fArr2.length) {
                            fArr2[i21] = i16 + f20;
                            fArr2[i4] = f21;
                            i21 = i19 + 4;
                        }
                        float f23 = i16;
                        float f24 = f23 - f22;
                        if (f20 > f24) {
                            int i22 = i21 + 1;
                            i = size2;
                            if (i22 < fArr2.length) {
                                fArr2[i21] = f20 - f23;
                                fArr2[i22] = f21;
                                i21 += 2;
                            }
                        } else {
                            i = size2;
                        }
                        if (f21 < f22 && (i3 = i21 + 1) < fArr2.length) {
                            fArr2[i21] = f20;
                            fArr2[i3] = f21 + f23;
                            i21 += 2;
                        }
                        if (f21 > f24 && (i2 = i21 + 1) < fArr2.length) {
                            fArr2[i21] = f20;
                            fArr2[i2] = f21 - f23;
                            i21 += 2;
                        }
                        iArr[i18] = i21;
                    }
                }
                i17++;
                size2 = i;
            }
            for (int i23 = 0; i23 < length2; i23++) {
                pointsBufferArr[i23].addPoints(particlePoints[i23], 0, this.renderCount[i23]);
            }
        }
    }

    public void drawPoints(Canvas canvas, SpoilerEffectBitmapFactory.PointsBuffer[] pointsBufferArr) {
        if (pointsBufferArr == null || pointsBufferArr.length != ALPHAS.length) {
            return;
        }
        for (int i = 0; i < ALPHAS.length; i++) {
            pointsBufferArr[i].draw(canvas, this.particlePaints[i]);
        }
    }

    public void setVisibleBounds(float f, float f2, float f3, float f4) {
        if (this.visibleRect == null) {
            this.visibleRect = new RectF();
        }
        RectF rectF = this.visibleRect;
        if (rectF.left == f && rectF.right == f3 && rectF.top == f2 && rectF.bottom == f4) {
            return;
        }
        rectF.left = f;
        rectF.top = f2;
        rectF.right = f3;
        rectF.bottom = f4;
        invalidateSelf();
    }

    @Override
    public void invalidateSelf() {
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

    public void setParentView(View view) {
        this.mParent = view;
    }

    public View getParentView() {
        return this.mParent;
    }

    @Override
    public void setAlpha(int i) {
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
    public void setColorFilter(ColorFilter colorFilter) {
        for (Paint paint : this.particlePaints) {
            paint.setColorFilter(colorFilter);
        }
    }

    public void setColor(int i) {
        if (this.lastColor == i) {
            return;
        }
        int i2 = 0;
        while (true) {
            float[] fArr = ALPHAS;
            if (i2 < fArr.length) {
                this.particlePaints[i2].setColor(ColorUtils.setAlphaComponent(i, (int) (this.mAlpha * fArr[i2])));
                i2++;
            } else {
                this.colorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
                this.lastColor = i;
                return;
            }
        }
    }

    public void setMaxParticlesCount(int i) {
        this.maxParticles = i;
        while (this.particlesPool.size() + this.particles.size() < i) {
            this.particlesPool.push(new Particle());
        }
    }

    public static void addSpoilers(TextView textView, Stack stack, List list) {
        int measuredWidth = textView.getMeasuredWidth();
        addSpoilers(textView, textView.getLayout(), 0, measuredWidth > 0 ? measuredWidth : -2, (Spanned) textView.getText(), stack, list, null);
    }

    public static void addSpoilers(TextView textView, Stack stack, List list, ArrayList arrayList) {
        int measuredWidth = textView.getMeasuredWidth();
        addSpoilers(textView, textView.getLayout(), 0, measuredWidth > 0 ? measuredWidth : -2, (Spanned) textView.getText(), stack, list, arrayList);
    }

    public static void addSpoilers(View view, Layout layout, Stack stack, List list) {
        if (layout.getText() instanceof Spanned) {
            addSpoilers(view, layout, (Spanned) layout.getText(), stack, list);
        }
    }

    public static void addSpoilers(View view, Layout layout, int i, int i2, Stack stack, List list) {
        if (layout.getText() instanceof Spanned) {
            addSpoilers(view, layout, i, i2, (Spanned) layout.getText(), stack, list, null);
        }
    }

    public static void addSpoilers(View view, Layout layout, Spanned spanned, Stack stack, List list) {
        if (layout == null) {
            return;
        }
        addSpoilers(view, layout, -1, -1, spanned, stack, list, null);
    }

    public static void addSpoilers(View view, Layout layout, int i, int i2, Spanned spanned, Stack stack, List list, ArrayList arrayList) {
        int i3;
        int i4;
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
                addSpoilerRangesInternal(view, layout, i3, i4, spanStart, spanEnd, stack, list, arrayList);
            }
        }
        if (!(view instanceof TextView) || stack == null) {
            return;
        }
        stack.clear();
    }

    private static void addSpoilerRangesInternal(final View view, final Layout layout, final int i, final int i2, int i3, int i4, final Stack stack, final List list, final ArrayList arrayList) {
        layout.getSelectionPath(i3, i4, new Path() {
            @Override
            public void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
                SpoilerEffect.addSpoilerRangeInternal(view, layout, f, f2, f3, f4, stack, list, i, i2, arrayList);
            }
        });
    }

    public static void addSpoilerRangeInternal(View view, Layout layout, float f, float f2, float f3, float f4, Stack stack, List list, int i, int i2, ArrayList arrayList) {
        SpoilerEffect spoilerEffect = (stack == null || stack.isEmpty()) ? new SpoilerEffect() : (SpoilerEffect) stack.remove(0);
        spoilerEffect.insideQuote = false;
        if (arrayList != null) {
            float f5 = (f2 + f4) / 2.0f;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                QuoteSpan.Block block = (QuoteSpan.Block) arrayList.get(i3);
                if (f5 >= block.top && f5 <= block.bottom) {
                    spoilerEffect.insideQuote = true;
                    break;
                }
            }
        }
        spoilerEffect.setRippleProgress(-1.0f);
        spoilerEffect.setBounds((int) Math.max(f, i), (int) f2, (int) Math.min(f3, i2 <= 0 ? 2.1474836E9f : i2), (int) f4);
        spoilerEffect.setColor(layout.getPaint().getColor());
        spoilerEffect.setRippleInterpolator(Easings.easeInQuad);
        spoilerEffect.updateMaxParticles();
        if (view != null) {
            spoilerEffect.setParentView(view);
        }
        list.add(spoilerEffect);
    }

    public static void clipOutCanvas(Canvas canvas, List list) {
        if (list.isEmpty()) {
            return;
        }
        tempPath.rewind();
        for (int i = 0; i < list.size(); i++) {
            Rect bounds = ((SpoilerEffect) list.get(i)).getBounds();
            tempPath.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        canvas.clipPath(tempPath, Region.Op.DIFFERENCE);
    }

    public static void layoutDrawMaybe(Layout layout, Canvas canvas) {
        if (canvas instanceof SizeNotifierFrameLayout.SimplerCanvas) {
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
            return;
        }
        layout.draw(canvas);
    }

    public static void renderWithRipple(View view, boolean z, int i, int i2, AtomicReference atomicReference, int i3, Layout layout, List list, Canvas canvas, boolean z2) {
        StaticLayout staticLayout;
        TextStyleSpan[] textStyleSpanArr;
        int i4;
        if (list == null || list.isEmpty()) {
            layoutDrawMaybe(layout, canvas);
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
                                public void draw(Canvas canvas2, CharSequence charSequence, int i7, int i8, float f, int i9, int i10, int i11, Paint paint) {
                                }

                                @Override
                                public int getSize(Paint paint, CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
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
        if (!list.isEmpty()) {
            canvas.save();
            canvas.translate(0.0f, i2);
            layoutBuild.draw(canvas);
            canvas.restore();
        } else {
            layoutDrawMaybe(layout, canvas);
        }
        if (list.isEmpty()) {
            return;
        }
        tempPath.rewind();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Rect bounds = ((SpoilerEffect) it.next()).getBounds();
            tempPath.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        int i7 = 0;
        if (!list.isEmpty() && ((SpoilerEffect) list.get(0)).rippleProgress != -1.0f) {
            canvas.save();
            Path path = tempPath;
            canvas.clipPath(path);
            path.rewind();
            if (!list.isEmpty()) {
                ((SpoilerEffect) list.get(0)).getRipplePath(path);
            }
            canvas.clipPath(path);
            canvas.translate(0.0f, -view.getPaddingTop());
            layoutDrawMaybe(layout, canvas);
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
            spoilerEffect.setInvalidateParent(z);
            if (spoilerEffect.getParentView() != view) {
                spoilerEffect.setParentView(view);
            }
            if (spoilerEffect.shouldInvalidateColor()) {
                spoilerEffect.setColor(ColorUtils.blendARGB(i, (i3 == 1 ? layout.getPaint() : Theme.chat_msgTextPaint).getColor(), Math.max(0.0f, spoilerEffect.getRippleProgress())));
            } else {
                spoilerEffect.setColor(i);
            }
            spoilerEffect.draw(canvas);
        }
        if (z3) {
            Path path2 = tempPath;
            path2.rewind();
            ((SpoilerEffect) list.get(0)).getRipplePath(path2);
            if (xRefPaint == null) {
                Paint paint = new Paint(1);
                xRefPaint = paint;
                paint.setColor(-16777216);
                xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            canvas.drawPath(path2, xRefPaint);
        }
        canvas.restore();
    }

    public void setSize(int i) {
        this.bitmapSize = i;
    }

    private static class Particle {
        private int alpha;
        private float currentTime;
        private float lifeTime;
        private float vecX;
        private float vecY;
        private float velocity;
        private float x;
        private float y;

        private Particle() {
        }
    }
}
