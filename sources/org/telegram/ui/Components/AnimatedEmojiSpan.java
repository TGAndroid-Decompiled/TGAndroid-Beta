package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.ChartPickerDelegate$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.PhotoViewer;

public class AnimatedEmojiSpan extends ReplacementSpan {
    private static boolean lockPositionChanging;
    private boolean animateChanges;
    public int cacheType;
    public TLRPC.Document document;
    public String documentAbsolutePath;
    public long documentId;
    public String emoji;
    public float extraScale;
    private Paint.FontMetricsInt fontMetrics;
    public boolean fromEmojiKeyboard;
    public boolean full;
    public boolean invert;
    private boolean isAdded;
    private boolean isRemoved;
    float lastDrawnCx;
    float lastDrawnCy;
    protected int measuredSize;
    private int minimumLineHeight;
    private ValueAnimator moveAnimator;
    boolean positionChanged;
    private boolean preserveFontMetrics;
    private boolean recordPositions;
    private Runnable removedAction;
    private float scale;
    private ValueAnimator scaleAnimator;
    public float size;
    boolean spanDrawn;
    public boolean standard;
    public boolean top;

    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final AnimatedEmojiSpan this$0;

        public AnonymousClass1(AnimatedEmojiSpan animatedEmojiSpan, int i) {
            this.$r8$classId = i;
            this.this$0 = animatedEmojiSpan;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.scaleAnimator = null;
                    boolean unused = AnimatedEmojiSpan.lockPositionChanging = false;
                    break;
                case 1:
                    AnimatedEmojiSpan animatedEmojiSpan = this.this$0;
                    animatedEmojiSpan.scaleAnimator = null;
                    if (animatedEmojiSpan.removedAction != null) {
                        animatedEmojiSpan.removedAction.run();
                        animatedEmojiSpan.removedAction = null;
                    }
                    break;
                default:
                    this.this$0.moveAnimator = null;
                    break;
            }
        }
    }

    public final class AnimatedEmojiHolder implements InvalidateHolder {
        public float alpha;
        public AnimatedEmojiDrawable drawable;
        public Rect drawableBounds;
        public float drawingYOffset;
        public boolean insideSpoiler;
        public final boolean invalidateInParent;
        public Layout layout;
        public boolean skipDraw;
        public AnimatedEmojiSpan span;
        public Emoji.EmojiDrawable thumbDrawable;
        public final View view;

        public AnimatedEmojiHolder(View view, boolean z) {
            this.view = view;
            this.invalidateInParent = z;
        }

        @Override
        public final void invalidate() {
            View view = this.view;
            if (view != null) {
                if (!this.invalidateInParent || view.getParent() == null) {
                    view.invalidate();
                } else {
                    ((View) view.getParent()).invalidate();
                }
            }
        }
    }

    public final class EmojiGroupedSpans {
        public final ArrayList holders = new ArrayList();
        public final HashMap groupedByLayout = new HashMap();
        public final ArrayList backgroundDrawingArray = new ArrayList();

        public final void clearPositions() {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.holders;
                if (i >= arrayList.size()) {
                    return;
                }
                ((AnimatedEmojiHolder) arrayList.get(i)).span.spanDrawn = false;
                i++;
            }
        }

        public final void remove(int i) {
            AnimatedEmojiHolder animatedEmojiHolder = (AnimatedEmojiHolder) this.holders.remove(i);
            HashMap map = this.groupedByLayout;
            SpansChunk spansChunk = (SpansChunk) map.get(animatedEmojiHolder.layout);
            if (spansChunk == null) {
                throw new RuntimeException("!!!");
            }
            ArrayList arrayList = spansChunk.holders;
            arrayList.remove(animatedEmojiHolder);
            arrayList.size();
            if (arrayList.isEmpty()) {
                map.remove(animatedEmojiHolder.layout);
                this.backgroundDrawingArray.remove(spansChunk);
            }
            AnimatedEmojiDrawable animatedEmojiDrawable = animatedEmojiHolder.drawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(animatedEmojiHolder);
            }
        }
    }

    public interface InvalidateHolder {
        void invalidate();
    }

    public final class SpansChunk {
        public final ArrayList holders = new ArrayList();
        public Layout layout;

        public SpansChunk(Layout layout) {
            this.layout = layout;
        }
    }

    public class TextViewEmojis extends TextView {
        public int cacheType;
        public PorterDuffColorFilter emojiColorFilter;
        public EmojiGroupedSpans stack;

        public TextViewEmojis(Context context) {
            super(context);
            this.cacheType = 0;
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.stack = AnimatedEmojiSpan.update(this.cacheType, this, this.stack, getLayout());
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            AnimatedEmojiSpan.release(this, this.stack);
        }

        @Override
        public void onDraw(Canvas canvas) {
            float height;
            Canvas canvas2;
            super.onDraw(canvas);
            if ((getGravity() & 16) == 0 || getLayout() == null) {
                height = 0.0f;
            } else {
                height = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
            }
            float paddingRight = LocaleController.isRTL ? getPaddingRight() : getPaddingLeft();
            if (height == 0.0f && paddingRight == 0.0f) {
                canvas2 = canvas;
            } else {
                canvas.save();
                canvas2 = canvas;
                canvas2.translate(paddingRight, height);
            }
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, getLayout(), this.stack, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.emojiColorFilter);
            if (height == 0.0f && paddingRight == 0.0f) {
                return;
            }
            canvas.restore();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.stack = AnimatedEmojiSpan.update(this.cacheType, this, this.stack, getLayout());
        }

        public void setCacheType(int i) {
            if (this.cacheType == i) {
                return;
            }
            this.cacheType = i;
            this.stack = AnimatedEmojiSpan.update(i, this, this.stack, getLayout());
        }

        public void setEmojiColor(int i) {
            this.emojiColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        }

        @Override
        public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            super.setText(charSequence, bufferType);
            this.stack = AnimatedEmojiSpan.update(this.cacheType, this, this.stack, getLayout());
        }
    }

    public AnimatedEmojiSpan(TLRPC.Document document) {
        this(document.id, 1.2f, null);
        this.document = document;
    }

    public static boolean access$400(AnimatedEmojiSpan animatedEmojiSpan) {
        return (animatedEmojiSpan.moveAnimator == null && animatedEmojiSpan.scaleAnimator == null) ? false : true;
    }

    public static void applyFontMetricsForString(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spannable) {
            AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), AnimatedEmojiSpan.class);
            if (animatedEmojiSpanArr != null) {
                for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                    animatedEmojiSpan.applyFontMetrics(paint.getFontMetricsInt());
                }
            }
        }
    }

    public static AnimatedEmojiSpan cloneSpan(AnimatedEmojiSpan animatedEmojiSpan, Paint.FontMetricsInt fontMetricsInt) {
        AnimatedEmojiSpan animatedEmojiSpan2;
        TLRPC.Document document = animatedEmojiSpan.document;
        if (document != null) {
            animatedEmojiSpan2 = new AnimatedEmojiSpan(document.id, animatedEmojiSpan.scale, fontMetricsInt != null ? fontMetricsInt : animatedEmojiSpan.fontMetrics);
            animatedEmojiSpan2.document = document;
        } else {
            animatedEmojiSpan2 = new AnimatedEmojiSpan(animatedEmojiSpan.documentId, animatedEmojiSpan.scale, fontMetricsInt != null ? fontMetricsInt : animatedEmojiSpan.fontMetrics);
        }
        if (fontMetricsInt != null) {
            animatedEmojiSpan2.size = animatedEmojiSpan.size;
        }
        animatedEmojiSpan2.fromEmojiKeyboard = animatedEmojiSpan.fromEmojiKeyboard;
        animatedEmojiSpan2.isAdded = animatedEmojiSpan.isAdded;
        animatedEmojiSpan2.isRemoved = animatedEmojiSpan.isRemoved;
        return animatedEmojiSpan2;
    }

    public static CharSequence cloneSpans(CharSequence charSequence) {
        return cloneSpans(charSequence, -1, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, EmojiGroupedSpans emojiGroupedSpans, float f, List<SpoilerEffect> list, float f2, float f3, float f4, float f5) {
        drawAnimatedEmojis(canvas, layout, emojiGroupedSpans, f, list, f2, f3, f4, f5, null);
    }

    public static boolean isInsideSpoiler(Layout layout, int i, int i2) {
        if (!(layout.getText() instanceof Spanned)) {
            return false;
        }
        TextStyleSpan[] textStyleSpanArr = (TextStyleSpan[]) ((Spanned) layout.getText()).getSpans(Math.max(0, i), Math.min(layout.getText().length() - 1, i2), TextStyleSpan.class);
        for (int i3 = 0; textStyleSpanArr != null && i3 < textStyleSpanArr.length; i3++) {
            TextStyleSpan textStyleSpan = textStyleSpanArr[i3];
            if (textStyleSpan != null && textStyleSpan.isSpoiler()) {
                return true;
            }
        }
        return false;
    }

    public static CharSequence onlyEmojiSpans(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class)) {
            if (!(characterStyle instanceof AnimatedEmojiSpan) && !(characterStyle instanceof Emoji.EmojiSpan)) {
                spannableStringBuilder.removeSpan(characterStyle);
            }
        }
        return spannableStringBuilder;
    }

    public static void release(View view, LongSparseArray<AnimatedEmojiDrawable> longSparseArray) {
        if (longSparseArray == null) {
            return;
        }
        for (int i = 0; i < longSparseArray.size(); i++) {
            AnimatedEmojiDrawable animatedEmojiDrawableValueAt = longSparseArray.valueAt(i);
            if (animatedEmojiDrawableValueAt != null) {
                animatedEmojiDrawableValueAt.removeView(view);
            }
        }
        longSparseArray.clear();
    }

    public static EmojiGroupedSpans update(int i, View view, EmojiGroupedSpans emojiGroupedSpans, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i, view, emojiGroupedSpans, arrayList, false);
    }

    public final boolean animateChanges(float f, float f2) {
        int i = 2;
        if (this.moveAnimator != null) {
            return true;
        }
        if (!this.animateChanges) {
            return false;
        }
        this.animateChanges = false;
        float f3 = this.lastDrawnCx;
        float f4 = this.lastDrawnCy;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.moveAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ChartPickerDelegate$$ExternalSyntheticLambda0(this, f4, f2, f3, f, 1));
        this.moveAnimator.addListener(new AnonymousClass1(this, i));
        this.moveAnimator.setDuration(140L);
        this.moveAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.moveAnimator.start();
        return true;
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i) {
        this.fontMetrics = fontMetricsInt;
        this.cacheType = i;
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.recordPositions) {
            this.spanDrawn = true;
            float f2 = (this.measuredSize / 2.0f) + f;
            float f3 = ((i5 - i3) / 2.0f) + i3;
            float f4 = this.lastDrawnCy;
            if (f3 == f4 || f4 == 0.0f) {
                float f5 = this.lastDrawnCx;
                if (f2 != f5 && f5 != 0.0f) {
                    if (animateChanges(f2, f3)) {
                        return;
                    }
                }
            } else if (animateChanges(f2, f3)) {
                return;
            }
            if (lockPositionChanging) {
                return;
            }
            if (f2 == this.lastDrawnCx && f3 == this.lastDrawnCy) {
                return;
            }
            this.lastDrawnCx = f2;
            this.lastDrawnCy = f3;
            this.positionChanged = true;
        }
    }

    public long getDocumentId() {
        TLRPC.Document document = this.document;
        return document != null ? document.id : this.documentId;
    }

    public float getExtraScale() {
        final int i = 1;
        final int i2 = 0;
        if (this.isAdded) {
            lockPositionChanging = true;
            this.isAdded = false;
            this.extraScale = 0.0f;
            ValueAnimator valueAnimator = this.scaleAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.scaleAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.extraScale, 1.0f);
            this.scaleAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final AnimatedEmojiSpan f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$getExtraScale$0(valueAnimator2);
                            break;
                        default:
                            this.f$0.lambda$getExtraScale$1(valueAnimator2);
                            break;
                    }
                }
            });
            this.scaleAnimator.addListener(new AnonymousClass1(this, i2));
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.scaleAnimator.start();
        } else if (this.isRemoved) {
            this.isRemoved = false;
            this.extraScale = 1.0f;
            ValueAnimator valueAnimator2 = this.scaleAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllListeners();
                this.scaleAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.extraScale, 0.0f);
            this.scaleAnimator = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final AnimatedEmojiSpan f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$getExtraScale$0(valueAnimator3);
                            break;
                        default:
                            this.f$0.lambda$getExtraScale$1(valueAnimator3);
                            break;
                    }
                }
            });
            this.scaleAnimator.addListener(new AnonymousClass1(this, i));
            this.scaleAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.start();
        }
        return this.extraScale;
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        boolean z = this.preserveFontMetrics && fontMetricsInt2 != null;
        int i3 = z ? fontMetricsInt2.top : 0;
        int i4 = z ? fontMetricsInt2.ascent : 0;
        int i5 = z ? fontMetricsInt2.descent : 0;
        int i6 = z ? fontMetricsInt2.bottom : 0;
        int i7 = z ? fontMetricsInt2.leading : 0;
        if (fontMetricsInt2 == null && this.top) {
            fontMetricsInt2 = paint.getFontMetricsInt();
        }
        int i8 = fontMetricsInt2 == null ? 0 : fontMetricsInt2.ascent;
        int i9 = fontMetricsInt2 == null ? 0 : fontMetricsInt2.descent;
        Paint.FontMetricsInt fontMetricsInt3 = this.fontMetrics;
        if (fontMetricsInt3 == null) {
            int i10 = (int) this.size;
            int iDp = AndroidUtilities.dp(8.0f);
            int iDp2 = AndroidUtilities.dp(10.0f);
            if (fontMetricsInt2 != null) {
                float f = this.scale;
                int i11 = (int) (((-iDp2) - iDp) * f);
                fontMetricsInt2.top = i11;
                int i12 = (int) ((iDp2 - iDp) * f);
                fontMetricsInt2.bottom = i12;
                fontMetricsInt2.ascent = i11;
                fontMetricsInt2.descent = i12;
                fontMetricsInt2.leading = 0;
            }
            this.measuredSize = (int) (i10 * this.scale);
        } else {
            this.measuredSize = (int) (this.size * this.scale);
            if (fontMetricsInt2 != null) {
                if (this.full) {
                    float fAbs = Math.abs(this.fontMetrics.top) + Math.abs(fontMetricsInt3.bottom);
                    fontMetricsInt2.ascent = (int) Math.ceil((this.fontMetrics.top / fAbs) * this.measuredSize);
                    fontMetricsInt2.descent = (int) Math.ceil((this.fontMetrics.bottom / fAbs) * this.measuredSize);
                    fontMetricsInt2.top = (int) Math.ceil((this.fontMetrics.top / fAbs) * this.measuredSize);
                    fontMetricsInt2.bottom = (int) Math.ceil((this.fontMetrics.bottom / fAbs) * this.measuredSize);
                } else {
                    fontMetricsInt2.ascent = fontMetricsInt3.ascent;
                    fontMetricsInt2.descent = fontMetricsInt3.descent;
                    fontMetricsInt2.top = fontMetricsInt3.top;
                    fontMetricsInt2.bottom = fontMetricsInt3.bottom;
                }
            }
        }
        if (fontMetricsInt2 != null && this.top) {
            int i13 = fontMetricsInt2.ascent;
            int i14 = fontMetricsInt2.descent;
            int i15 = ((i9 - i14) + (i8 - i13)) / 2;
            fontMetricsInt2.ascent = i13 + i15;
            fontMetricsInt2.descent = i14 - i15;
        }
        if (z) {
            fontMetricsInt2.top = i3;
            fontMetricsInt2.ascent = i4;
            fontMetricsInt2.descent = i5;
            fontMetricsInt2.bottom = i6;
            fontMetricsInt2.leading = i7;
            int i16 = this.minimumLineHeight;
            int i17 = i5 - i4;
            if (i16 > i17) {
                int i18 = i16 - i17;
                int i19 = (i18 + 1) / 2;
                int i20 = i4 - i19;
                fontMetricsInt2.ascent = i20;
                fontMetricsInt2.descent = i5 + (i18 - i19);
                fontMetricsInt2.top = Math.min(i3, i20);
                fontMetricsInt2.bottom = Math.max(fontMetricsInt2.bottom, fontMetricsInt2.descent);
            }
        }
        return Math.max(0, this.measuredSize - 1);
    }

    public final void lambda$animateChanges$2(float f, float f2, float f3, float f4, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.lastDrawnCy = AndroidUtilities.lerp(f, f2, fFloatValue);
        this.lastDrawnCx = AndroidUtilities.lerp(f3, f4, fFloatValue);
    }

    public final void lambda$getExtraScale$0(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.extraScale = fFloatValue;
        this.scale = AndroidUtilities.lerp(0.2f, 1.0f, fFloatValue);
        lockPositionChanging = false;
    }

    public final void lambda$getExtraScale$1(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.extraScale = fFloatValue;
        this.scale = AndroidUtilities.lerp(0.0f, 1.0f, fFloatValue);
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
        if (fontMetricsInt != null) {
            float fAbs = Math.abs(this.fontMetrics.ascent) + Math.abs(fontMetricsInt.descent);
            this.size = fAbs;
            if (fAbs == 0.0f) {
                this.size = AndroidUtilities.dp(20.0f);
            }
        }
    }

    public void setAdded() {
        this.isAdded = true;
        this.extraScale = 0.0f;
    }

    public void setAnimateChanges() {
        this.animateChanges = true;
    }

    public AnimatedEmojiSpan setMinimumLineHeight(int i) {
        this.minimumLineHeight = i;
        return this;
    }

    public AnimatedEmojiSpan setPreserveFontMetrics(boolean z) {
        this.preserveFontMetrics = z;
        return this;
    }

    public void setRemoved(Runnable runnable) {
        this.removedAction = runnable;
        this.isRemoved = true;
        this.extraScale = 1.0f;
    }

    public AnimatedEmojiSpan setSize(int i) {
        this.size = i;
        return this;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i) {
        return cloneSpans(charSequence, i, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, EmojiGroupedSpans emojiGroupedSpans, float f, List<SpoilerEffect> list, float f2, float f3, float f4, float f5, ColorFilter colorFilter) {
        boolean z;
        float f6;
        float fMax;
        AnimatedEmojiDrawable animatedEmojiDrawable;
        ColorFilter colorFilter2;
        AnimatedEmojiDrawable animatedEmojiDrawable2;
        PhotoViewer.AnonymousClass11 anonymousClass11;
        float extraScale;
        int i;
        AnimatedEmojiDrawable animatedEmojiDrawable3;
        Rect rect;
        float f7;
        PhotoViewer.AnonymousClass11 anonymousClass12;
        long j;
        float extraScale2;
        int i2;
        if (canvas == null || layout == null || emojiGroupedSpans == null) {
            return;
        }
        boolean z2 = false;
        if (Emoji.emojiDrawingYOffset == 0.0f && f == 0.0f) {
            z = false;
        } else {
            canvas.save();
            canvas.translate(0.0f, Emoji.emojiDrawingYOffset + AndroidUtilities.dp(20.0f * f));
            z = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = emojiGroupedSpans.backgroundDrawingArray;
            if (i3 >= arrayList.size()) {
                break;
            }
            SpansChunk spansChunk = (SpansChunk) arrayList.get(i3);
            if (spansChunk.layout == layout) {
                int i4 = 0;
                ?? r6 = z2;
                while (true) {
                    ArrayList arrayList2 = spansChunk.holders;
                    if (i4 >= arrayList2.size()) {
                        break;
                    }
                    AnimatedEmojiHolder animatedEmojiHolder = (AnimatedEmojiHolder) arrayList2.get(i4);
                    if (animatedEmojiHolder != null) {
                        AnimatedEmojiDrawable animatedEmojiDrawable4 = animatedEmojiHolder.drawable;
                        if (animatedEmojiDrawable4 != null) {
                            animatedEmojiDrawable4.setColorFilter(colorFilter);
                        }
                        AnimatedEmojiSpan animatedEmojiSpan = animatedEmojiHolder.span;
                        if (animatedEmojiSpan.spanDrawn) {
                            float f8 = animatedEmojiSpan.measuredSize / 2.0f;
                            float f9 = animatedEmojiSpan.lastDrawnCx;
                            float f10 = animatedEmojiSpan.lastDrawnCy;
                            animatedEmojiHolder.drawableBounds.set((int) (f9 - f8), (int) (f10 - f8), (int) (f9 + f8), (int) (f10 + f8));
                            if (list == null || list.isEmpty() || !animatedEmojiHolder.insideSpoiler) {
                                f6 = 0.0f;
                                fMax = 1.0f;
                            } else {
                                f6 = 0.0f;
                                fMax = Math.max(0.0f, list.get(r6).rippleProgress);
                            }
                            animatedEmojiHolder.drawingYOffset = f4;
                            animatedEmojiHolder.alpha = fMax;
                            if (f2 == f6 && f3 == f6) {
                                animatedEmojiHolder.skipDraw = r6;
                                animatedEmojiDrawable = animatedEmojiHolder.drawable;
                                if (animatedEmojiDrawable == null) {
                                    if (animatedEmojiHolder.thumbDrawable != null) {
                                        extraScale2 = animatedEmojiHolder.span.getExtraScale();
                                        animatedEmojiHolder.thumbDrawable.setAlpha((int) (animatedEmojiHolder.alpha * 255.0f * f5));
                                        animatedEmojiHolder.thumbDrawable.setBounds(animatedEmojiHolder.drawableBounds);
                                        if (extraScale2 == 1.0f) {
                                            canvas.save();
                                            if (animatedEmojiHolder.span.invert) {
                                                i2 = -1;
                                            } else {
                                                i2 = 1;
                                            }
                                            canvas.scale(i2 * extraScale2, extraScale2, animatedEmojiHolder.drawableBounds.centerX(), animatedEmojiHolder.drawableBounds.centerY());
                                            animatedEmojiHolder.thumbDrawable.draw(canvas);
                                            canvas.restore();
                                        } else {
                                            canvas.save();
                                            if (animatedEmojiHolder.span.invert) {
                                                i2 = -1;
                                            } else {
                                                i2 = 1;
                                            }
                                            canvas.scale(i2 * extraScale2, extraScale2, animatedEmojiHolder.drawableBounds.centerX(), animatedEmojiHolder.drawableBounds.centerY());
                                            animatedEmojiHolder.thumbDrawable.draw(canvas);
                                            canvas.restore();
                                        }
                                    }
                                } else if (animatedEmojiDrawable.imageReceiver != null) {
                                    if (colorFilter == null) {
                                        colorFilter2 = Theme.chat_animatedEmojiTextColorFilter;
                                    } else {
                                        colorFilter2 = colorFilter;
                                    }
                                    animatedEmojiDrawable.setColorFilter(colorFilter2);
                                    animatedEmojiDrawable2 = animatedEmojiHolder.drawable;
                                    anonymousClass11 = animatedEmojiDrawable2.imageReceiver;
                                    if (anonymousClass11 != null) {
                                        if (animatedEmojiDrawable2.cacheType == 8) {
                                            j = 0;
                                        } else {
                                            j = jCurrentTimeMillis;
                                        }
                                        anonymousClass11.setCurrentTime(j);
                                    } else {
                                        spansChunk = spansChunk;
                                    }
                                    extraScale = animatedEmojiHolder.span.getExtraScale();
                                    if (extraScale == 1.0f) {
                                        canvas.save();
                                        if (animatedEmojiHolder.span.invert) {
                                            i = -1;
                                        } else {
                                            i = 1;
                                        }
                                        canvas.scale(i * extraScale, extraScale, animatedEmojiHolder.drawableBounds.centerX(), animatedEmojiHolder.drawableBounds.centerY());
                                        animatedEmojiDrawable3 = animatedEmojiHolder.drawable;
                                        rect = animatedEmojiHolder.drawableBounds;
                                        f7 = animatedEmojiHolder.alpha * f5;
                                        anonymousClass12 = animatedEmojiDrawable3.imageReceiver;
                                        if (anonymousClass12 != null) {
                                            anonymousClass12.setImageCoords(rect);
                                            animatedEmojiDrawable3.imageReceiver.setAlpha(f7);
                                            animatedEmojiDrawable3.imageReceiver.draw(canvas);
                                        }
                                        canvas.restore();
                                    } else {
                                        canvas.save();
                                        if (animatedEmojiHolder.span.invert) {
                                            i = -1;
                                        } else {
                                            i = 1;
                                        }
                                        canvas.scale(i * extraScale, extraScale, animatedEmojiHolder.drawableBounds.centerX(), animatedEmojiHolder.drawableBounds.centerY());
                                        animatedEmojiDrawable3 = animatedEmojiHolder.drawable;
                                        rect = animatedEmojiHolder.drawableBounds;
                                        f7 = animatedEmojiHolder.alpha * f5;
                                        anonymousClass12 = animatedEmojiDrawable3.imageReceiver;
                                        if (anonymousClass12 != null) {
                                            anonymousClass12.setImageCoords(rect);
                                            animatedEmojiDrawable3.imageReceiver.setAlpha(f7);
                                            animatedEmojiDrawable3.imageReceiver.draw(canvas);
                                        }
                                        canvas.restore();
                                    }
                                    if (access$400(animatedEmojiHolder.span)) {
                                        animatedEmojiHolder.invalidate();
                                    }
                                }
                                spansChunk = spansChunk;
                            } else {
                                Rect rect2 = animatedEmojiHolder.drawableBounds;
                                if (rect2.bottom < f2 || rect2.top > f3) {
                                    spansChunk = spansChunk;
                                    animatedEmojiHolder.skipDraw = true;
                                } else {
                                    animatedEmojiHolder.skipDraw = r6;
                                    animatedEmojiDrawable = animatedEmojiHolder.drawable;
                                    if (animatedEmojiDrawable == null) {
                                        if (animatedEmojiHolder.thumbDrawable != null) {
                                            extraScale2 = animatedEmojiHolder.span.getExtraScale();
                                            animatedEmojiHolder.thumbDrawable.setAlpha((int) (animatedEmojiHolder.alpha * 255.0f * f5));
                                            animatedEmojiHolder.thumbDrawable.setBounds(animatedEmojiHolder.drawableBounds);
                                            if (extraScale2 == 1.0f || animatedEmojiHolder.span.invert) {
                                                canvas.save();
                                                if (animatedEmojiHolder.span.invert) {
                                                    i2 = -1;
                                                } else {
                                                    i2 = 1;
                                                }
                                                canvas.scale(i2 * extraScale2, extraScale2, animatedEmojiHolder.drawableBounds.centerX(), animatedEmojiHolder.drawableBounds.centerY());
                                                animatedEmojiHolder.thumbDrawable.draw(canvas);
                                                canvas.restore();
                                            } else {
                                                animatedEmojiHolder.thumbDrawable.draw(canvas);
                                            }
                                        }
                                    } else if (animatedEmojiDrawable.imageReceiver != null) {
                                        if (colorFilter == null) {
                                            colorFilter2 = Theme.chat_animatedEmojiTextColorFilter;
                                        } else {
                                            colorFilter2 = colorFilter;
                                        }
                                        animatedEmojiDrawable.setColorFilter(colorFilter2);
                                        animatedEmojiDrawable2 = animatedEmojiHolder.drawable;
                                        anonymousClass11 = animatedEmojiDrawable2.imageReceiver;
                                        if (anonymousClass11 != null) {
                                            if (animatedEmojiDrawable2.cacheType == 8) {
                                                j = 0;
                                            } else {
                                                j = jCurrentTimeMillis;
                                            }
                                            anonymousClass11.setCurrentTime(j);
                                        } else {
                                            spansChunk = spansChunk;
                                        }
                                        extraScale = animatedEmojiHolder.span.getExtraScale();
                                        if (extraScale == 1.0f || animatedEmojiHolder.span.invert) {
                                            canvas.save();
                                            if (animatedEmojiHolder.span.invert) {
                                                i = -1;
                                            } else {
                                                i = 1;
                                            }
                                            canvas.scale(i * extraScale, extraScale, animatedEmojiHolder.drawableBounds.centerX(), animatedEmojiHolder.drawableBounds.centerY());
                                            animatedEmojiDrawable3 = animatedEmojiHolder.drawable;
                                            rect = animatedEmojiHolder.drawableBounds;
                                            f7 = animatedEmojiHolder.alpha * f5;
                                            anonymousClass12 = animatedEmojiDrawable3.imageReceiver;
                                            if (anonymousClass12 != null) {
                                                anonymousClass12.setImageCoords(rect);
                                                animatedEmojiDrawable3.imageReceiver.setAlpha(f7);
                                                animatedEmojiDrawable3.imageReceiver.draw(canvas);
                                            }
                                            canvas.restore();
                                        } else {
                                            AnimatedEmojiDrawable animatedEmojiDrawable5 = animatedEmojiHolder.drawable;
                                            Rect rect3 = animatedEmojiHolder.drawableBounds;
                                            float f11 = animatedEmojiHolder.alpha * f5;
                                            PhotoViewer.AnonymousClass11 anonymousClass13 = animatedEmojiDrawable5.imageReceiver;
                                            if (anonymousClass13 != null) {
                                                anonymousClass13.setImageCoords(rect3);
                                                animatedEmojiDrawable5.imageReceiver.setAlpha(f11);
                                                animatedEmojiDrawable5.imageReceiver.draw(canvas);
                                            }
                                        }
                                        if (access$400(animatedEmojiHolder.span)) {
                                            animatedEmojiHolder.invalidate();
                                        }
                                    }
                                    spansChunk = spansChunk;
                                }
                            }
                        } else {
                            spansChunk = spansChunk;
                        }
                    } else {
                        spansChunk = spansChunk;
                    }
                    i4++;
                    spansChunk = spansChunk;
                    r6 = 0;
                }
            } else {
                i3++;
                z2 = false;
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    public static EmojiGroupedSpans update(int i, View view, EmojiGroupedSpans emojiGroupedSpans, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z) {
        return update(i, view, false, emojiGroupedSpans, arrayList, z);
    }

    public AnimatedEmojiSpan(long j, Paint.FontMetricsInt fontMetricsInt) {
        this(j, 1.2f, fontMetricsInt);
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i, Paint.FontMetricsInt fontMetricsInt) {
        return cloneSpans(charSequence, i, fontMetricsInt, 1.0f);
    }

    public static EmojiGroupedSpans update(int i, View view, boolean z, EmojiGroupedSpans emojiGroupedSpans, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i, view, z, emojiGroupedSpans, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
    }

    public AnimatedEmojiSpan(long j, float f, Paint.FontMetricsInt fontMetricsInt) {
        this.extraScale = 1.0f;
        this.full = false;
        this.top = false;
        this.invert = false;
        this.size = AndroidUtilities.dp(20.0f);
        this.cacheType = -1;
        this.recordPositions = true;
        this.documentId = j;
        this.scale = f;
        this.fontMetrics = fontMetricsInt;
        if (fontMetricsInt != null) {
            float fAbs = Math.abs(fontMetricsInt.ascent) + Math.abs(fontMetricsInt.descent);
            this.size = fAbs;
            if (fAbs == 0.0f) {
                this.size = AndroidUtilities.dp(20.0f);
            }
        }
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i, Paint.FontMetricsInt fontMetricsInt, float f) {
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0 && ((animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned.getSpans(0, spanned.length(), AnimatedEmojiSpan.class)) == null || animatedEmojiSpanArr.length > 0)) {
            charSequence = new SpannableString(spanned);
            for (int i2 = 0; i2 < characterStyleArr.length; i2++) {
                CharacterStyle characterStyle = characterStyleArr[i2];
                if (characterStyle != null && (characterStyle instanceof AnimatedEmojiSpan)) {
                    int spanStart = spanned.getSpanStart(characterStyle);
                    int spanEnd = spanned.getSpanEnd(characterStyleArr[i2]);
                    AnimatedEmojiSpan animatedEmojiSpan = (AnimatedEmojiSpan) characterStyleArr[i2];
                    charSequence.removeSpan(animatedEmojiSpan);
                    AnimatedEmojiSpan animatedEmojiSpanCloneSpan = cloneSpan(animatedEmojiSpan, fontMetricsInt);
                    if (i != -1) {
                        animatedEmojiSpanCloneSpan.cacheType = i;
                    }
                    animatedEmojiSpanCloneSpan.scale = animatedEmojiSpan.scale * f;
                    charSequence.setSpan(animatedEmojiSpanCloneSpan, spanStart, spanEnd, 33);
                }
            }
        }
        return charSequence;
    }

    public static EmojiGroupedSpans update(int i, View view, boolean z, EmojiGroupedSpans emojiGroupedSpans, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z2) {
        Layout[] layoutArr = new Layout[arrayList == null ? 0 : arrayList.size()];
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                layoutArr[i2] = arrayList.get(i2).textLayout;
            }
        }
        return update(i, view, z, emojiGroupedSpans, z2, layoutArr);
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i, int i2) {
        this.fontMetrics = fontMetricsInt;
        this.size = i;
        this.cacheType = i2;
    }

    public static void release(View view, EmojiGroupedSpans emojiGroupedSpans) {
        if (emojiGroupedSpans == null) {
            return;
        }
        while (emojiGroupedSpans.holders.size() > 0) {
            emojiGroupedSpans.remove(0);
        }
    }

    public static EmojiGroupedSpans update(int i, View view, EmojiGroupedSpans emojiGroupedSpans, Layout... layoutArr) {
        return update(i, view, false, emojiGroupedSpans, layoutArr);
    }

    public static EmojiGroupedSpans update(int i, View view, boolean z, EmojiGroupedSpans emojiGroupedSpans, Layout... layoutArr) {
        return update(i, view, z, emojiGroupedSpans, false, layoutArr);
    }

    public static EmojiGroupedSpans update(int i, View view, boolean z, EmojiGroupedSpans emojiGroupedSpans, boolean z2, Layout... layoutArr) {
        int i2;
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        ArrayList arrayList;
        AnimatedEmojiHolder animatedEmojiHolder;
        int i3;
        int i4;
        EmojiGroupedSpans emojiGroupedSpans2 = emojiGroupedSpans;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i5 = 0;
        if (layoutArr == null || layoutArr.length <= 0) {
            if (emojiGroupedSpans2 == null) {
                return null;
            }
            ArrayList arrayList2 = emojiGroupedSpans2.holders;
            arrayList2.clear();
            while (arrayList2.size() > 0) {
                emojiGroupedSpans2.remove(0);
            }
            return null;
        }
        int i6 = 0;
        while (i6 < layoutArr.length) {
            Layout layout = layoutArr[i6];
            if (layout == null || !(layout.getText() instanceof Spanned)) {
                i2 = i6;
                animatedEmojiSpanArr = null;
            } else {
                Spanned spanned = (Spanned) layout.getText();
                animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned.getSpans(i5, spanned.length(), AnimatedEmojiSpan.class);
                int i7 = 0;
                while (animatedEmojiSpanArr != null && i7 < animatedEmojiSpanArr.length) {
                    AnimatedEmojiSpan animatedEmojiSpanCloneSpan = animatedEmojiSpanArr[i7];
                    if (animatedEmojiSpanCloneSpan == null) {
                        i3 = i6;
                    } else {
                        if (z2 && (layout.getText() instanceof Spannable)) {
                            int spanStart = spanned.getSpanStart(animatedEmojiSpanCloneSpan);
                            int spanEnd = spanned.getSpanEnd(animatedEmojiSpanCloneSpan);
                            Spannable spannable = (Spannable) spanned;
                            spannable.removeSpan(animatedEmojiSpanCloneSpan);
                            animatedEmojiSpanCloneSpan = cloneSpan(animatedEmojiSpanCloneSpan, fontMetricsInt);
                            animatedEmojiSpanArr[i7] = animatedEmojiSpanCloneSpan;
                            spannable.setSpan(animatedEmojiSpanCloneSpan, spanStart, spanEnd, 33);
                        }
                        if (emojiGroupedSpans2 == null) {
                            emojiGroupedSpans2 = new EmojiGroupedSpans();
                        }
                        int i8 = 0;
                        while (true) {
                            arrayList = emojiGroupedSpans2.holders;
                            if (i8 >= arrayList.size()) {
                                animatedEmojiHolder = fontMetricsInt;
                                break;
                            }
                            if (((AnimatedEmojiHolder) arrayList.get(i8)).span == animatedEmojiSpanCloneSpan && ((AnimatedEmojiHolder) arrayList.get(i8)).layout == layout) {
                                animatedEmojiHolder = (AnimatedEmojiHolder) arrayList.get(i8);
                                break;
                            }
                            i8++;
                        }
                        if (animatedEmojiHolder == 0) {
                            AnimatedEmojiHolder animatedEmojiHolder2 = new AnimatedEmojiHolder(view, z);
                            animatedEmojiHolder2.layout = layout;
                            if (animatedEmojiSpanCloneSpan.standard) {
                                i4 = 8;
                            } else {
                                i4 = animatedEmojiSpanCloneSpan.cacheType;
                                if (i4 < 0) {
                                    i4 = i;
                                }
                            }
                            if (animatedEmojiSpanCloneSpan.documentAbsolutePath != null) {
                                i3 = i6;
                                animatedEmojiHolder2.drawable = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, animatedEmojiSpanCloneSpan.getDocumentId(), animatedEmojiSpanCloneSpan.documentAbsolutePath, i4);
                            } else {
                                i3 = i6;
                                TLRPC.Document document = animatedEmojiSpanCloneSpan.document;
                                if (document != null) {
                                    animatedEmojiHolder2.drawable = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, i4, document);
                                } else {
                                    long j = animatedEmojiSpanCloneSpan.documentId;
                                    if (j != 0) {
                                        animatedEmojiHolder2.drawable = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, j, null, i4);
                                    }
                                }
                            }
                            int i9 = animatedEmojiSpanCloneSpan.cacheType;
                            if ((i9 == 20 || i9 == 21) && !TextUtils.isEmpty(animatedEmojiSpanCloneSpan.emoji)) {
                                AnimatedEmojiDrawable animatedEmojiDrawable = animatedEmojiHolder2.drawable;
                                if (animatedEmojiDrawable != null) {
                                    animatedEmojiDrawable.setupEmojiThumb(animatedEmojiSpanCloneSpan.emoji);
                                } else {
                                    animatedEmojiHolder2.thumbDrawable = Emoji.getEmojiDrawable(animatedEmojiSpanCloneSpan.emoji);
                                }
                            }
                            animatedEmojiHolder2.insideSpoiler = isInsideSpoiler(layout, spanned.getSpanStart(animatedEmojiSpanCloneSpan), spanned.getSpanEnd(animatedEmojiSpanCloneSpan));
                            animatedEmojiHolder2.drawableBounds = new Rect();
                            animatedEmojiHolder2.span = animatedEmojiSpanCloneSpan;
                            arrayList.add(animatedEmojiHolder2);
                            HashMap map = emojiGroupedSpans2.groupedByLayout;
                            SpansChunk spansChunk = (SpansChunk) map.get(layout);
                            if (spansChunk == null) {
                                spansChunk = new SpansChunk(layout);
                                map.put(layout, spansChunk);
                                emojiGroupedSpans2.backgroundDrawingArray.add(spansChunk);
                            }
                            ArrayList arrayList3 = spansChunk.holders;
                            arrayList3.add(animatedEmojiHolder2);
                            arrayList3.size();
                            AnimatedEmojiDrawable animatedEmojiDrawable2 = animatedEmojiHolder2.drawable;
                            if (animatedEmojiDrawable2 != null) {
                                animatedEmojiDrawable2.addView(animatedEmojiHolder2);
                            }
                        } else {
                            i3 = i6;
                            animatedEmojiHolder.insideSpoiler = isInsideSpoiler(layout, spanned.getSpanStart(animatedEmojiSpanCloneSpan), spanned.getSpanEnd(animatedEmojiSpanCloneSpan));
                        }
                    }
                    i7++;
                    i6 = i3;
                    fontMetricsInt = null;
                }
                i2 = i6;
            }
            if (emojiGroupedSpans2 != null) {
                int i10 = 0;
                while (true) {
                    ArrayList arrayList4 = emojiGroupedSpans2.holders;
                    if (i10 < arrayList4.size()) {
                        if (((AnimatedEmojiHolder) arrayList4.get(i10)).layout == layout) {
                            AnimatedEmojiSpan animatedEmojiSpan = ((AnimatedEmojiHolder) arrayList4.get(i10)).span;
                            int i11 = 0;
                            while (true) {
                                if (animatedEmojiSpanArr != null && i11 < animatedEmojiSpanArr.length) {
                                    if (animatedEmojiSpanArr[i11] == animatedEmojiSpan) {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    emojiGroupedSpans2.remove(i10);
                                    i10--;
                                    break;
                                }
                            }
                        }
                        i10++;
                    }
                }
            }
            i6 = i2 + 1;
            fontMetricsInt = null;
            i5 = 0;
        }
        if (emojiGroupedSpans2 != null) {
            int i12 = 0;
            while (true) {
                ArrayList arrayList5 = emojiGroupedSpans2.holders;
                if (i12 >= arrayList5.size()) {
                    break;
                }
                Layout layout2 = ((AnimatedEmojiHolder) arrayList5.get(i12)).layout;
                int i13 = 0;
                while (true) {
                    if (i13 < layoutArr.length) {
                        if (layoutArr[i13] == layout2) {
                            break;
                        }
                        i13++;
                    } else {
                        emojiGroupedSpans2.remove(i12);
                        i12--;
                        break;
                    }
                }
                i12++;
            }
        }
        return emojiGroupedSpans2;
    }

    public static LongSparseArray<AnimatedEmojiDrawable> update(View view, AnimatedEmojiSpan[] animatedEmojiSpanArr, LongSparseArray<AnimatedEmojiDrawable> longSparseArray) {
        return update(0, view, animatedEmojiSpanArr, longSparseArray);
    }

    public static LongSparseArray<AnimatedEmojiDrawable> update(int i, View view, AnimatedEmojiSpan[] animatedEmojiSpanArr, LongSparseArray<AnimatedEmojiDrawable> longSparseArray) {
        int i2;
        AnimatedEmojiDrawable animatedEmojiDrawableMake;
        if (animatedEmojiSpanArr == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i3 = 0;
        while (i3 < longSparseArray.size()) {
            long jKeyAt = longSparseArray.keyAt(i3);
            AnimatedEmojiDrawable animatedEmojiDrawable = longSparseArray.get(jKeyAt);
            if (animatedEmojiDrawable == null) {
                longSparseArray.remove(jKeyAt);
            } else {
                int i4 = 0;
                while (true) {
                    if (i4 < animatedEmojiSpanArr.length) {
                        AnimatedEmojiSpan animatedEmojiSpan = animatedEmojiSpanArr[i4];
                        if (animatedEmojiSpan != null && animatedEmojiSpan.getDocumentId() == jKeyAt) {
                            break;
                        }
                        i4++;
                    } else {
                        animatedEmojiDrawable.removeView(view);
                        longSparseArray.remove(jKeyAt);
                    }
                }
                i3++;
            }
            i3--;
            i3++;
        }
        for (AnimatedEmojiSpan animatedEmojiSpan2 : animatedEmojiSpanArr) {
            if (animatedEmojiSpan2 != null && longSparseArray.get(animatedEmojiSpan2.getDocumentId()) == null) {
                if (animatedEmojiSpan2.standard) {
                    i2 = 8;
                } else {
                    i2 = animatedEmojiSpan2.cacheType;
                    if (i2 < 0) {
                        i2 = i;
                    }
                }
                TLRPC.Document document = animatedEmojiSpan2.document;
                if (document != null) {
                    animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, i2, document);
                } else {
                    animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, animatedEmojiSpan2.documentId, null, i2);
                }
                animatedEmojiDrawableMake.addView(view);
                longSparseArray.put(animatedEmojiSpan2.getDocumentId(), animatedEmojiDrawableMake);
            }
        }
        return longSparseArray;
    }

    public static LongSparseArray<AnimatedEmojiDrawable> update(View view, ArrayList<AnimatedEmojiSpan> arrayList, LongSparseArray<AnimatedEmojiDrawable> longSparseArray) {
        return update(0, view, arrayList, longSparseArray);
    }

    public static LongSparseArray<AnimatedEmojiDrawable> update(int i, View view, ArrayList<AnimatedEmojiSpan> arrayList, LongSparseArray<AnimatedEmojiDrawable> longSparseArray) {
        int i2;
        if (arrayList == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i3 = 0;
        while (i3 < longSparseArray.size()) {
            long jKeyAt = longSparseArray.keyAt(i3);
            AnimatedEmojiDrawable animatedEmojiDrawable = longSparseArray.get(jKeyAt);
            if (animatedEmojiDrawable == null) {
                longSparseArray.remove(jKeyAt);
            } else {
                int i4 = 0;
                while (true) {
                    if (i4 < arrayList.size()) {
                        if (arrayList.get(i4) != null && arrayList.get(i4).getDocumentId() == jKeyAt) {
                            break;
                        }
                        i4++;
                    } else {
                        animatedEmojiDrawable.addView(view);
                        longSparseArray.remove(jKeyAt);
                    }
                }
                i3++;
            }
            i3--;
            i3++;
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            AnimatedEmojiSpan animatedEmojiSpan = arrayList.get(i5);
            if (animatedEmojiSpan != null && longSparseArray.get(animatedEmojiSpan.getDocumentId()) == null) {
                if (animatedEmojiSpan.standard) {
                    i2 = 8;
                } else {
                    i2 = animatedEmojiSpan.cacheType;
                    if (i2 < 0) {
                        i2 = i;
                    }
                }
                AnimatedEmojiDrawable animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, animatedEmojiSpan.documentId, null, i2);
                animatedEmojiDrawableMake.addView(view);
                longSparseArray.put(animatedEmojiSpan.getDocumentId(), animatedEmojiDrawableMake);
            }
        }
        return longSparseArray;
    }
}
