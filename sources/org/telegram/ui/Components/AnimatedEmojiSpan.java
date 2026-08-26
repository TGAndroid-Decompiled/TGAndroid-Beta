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
import android.graphics.drawable.Drawable;
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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.ChartPickerDelegate$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.spoilers.SpoilerEffect;

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

    public static class AnimatedEmojiHolder implements InvalidateHolder {
        public float alpha;
        private ImageReceiver.BackgroundThreadDrawHolder[] backgroundDrawHolder = new ImageReceiver.BackgroundThreadDrawHolder[2];
        public AnimatedEmojiDrawable drawable;
        public Rect drawableBounds;
        public float drawingYOffset;
        public boolean insideSpoiler;
        private final boolean invalidateInParent;
        public Layout layout;
        private int rawIndex;
        public boolean skipDraw;
        public AnimatedEmojiSpan span;
        public SpansChunk spansChunk;
        public Drawable thumbDrawable;
        private final View view;

        public AnimatedEmojiHolder(View view, boolean z) {
            this.view = view;
            this.invalidateInParent = z;
        }

        public void draw(Canvas canvas, long j, float f, float f2, float f3, ColorFilter colorFilter) {
            if (!(f == 0.0f && f2 == 0.0f) && outOfBounds(f, f2)) {
                this.skipDraw = true;
                return;
            }
            this.skipDraw = false;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.drawable;
            if (animatedEmojiDrawable == null) {
                if (this.thumbDrawable != null) {
                    float extraScale = this.span.getExtraScale();
                    this.thumbDrawable.setAlpha((int) (f3 * 255.0f * this.alpha));
                    this.thumbDrawable.setBounds(this.drawableBounds);
                    if (extraScale == 1.0f && !this.span.invert) {
                        this.thumbDrawable.draw(canvas);
                        return;
                    }
                    canvas.save();
                    canvas.scale((this.span.invert ? -1 : 1) * extraScale, extraScale, this.drawableBounds.centerX(), this.drawableBounds.centerY());
                    this.thumbDrawable.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            }
            if (animatedEmojiDrawable.getImageReceiver() != null) {
                AnimatedEmojiDrawable animatedEmojiDrawable2 = this.drawable;
                if (colorFilter == null) {
                    colorFilter = Theme.chat_animatedEmojiTextColorFilter;
                }
                animatedEmojiDrawable2.setColorFilter(colorFilter);
                this.drawable.setTime(j);
                float extraScale2 = this.span.getExtraScale();
                if (extraScale2 != 1.0f || this.span.invert) {
                    canvas.save();
                    canvas.scale((this.span.invert ? -1 : 1) * extraScale2, extraScale2, this.drawableBounds.centerX(), this.drawableBounds.centerY());
                    this.drawable.draw(canvas, this.drawableBounds, f3 * this.alpha);
                    canvas.restore();
                } else {
                    this.drawable.draw(canvas, this.drawableBounds, f3 * this.alpha);
                }
                if (this.span.isAnimating()) {
                    invalidate();
                }
            }
        }

        @Override
        public void invalidate() {
            View view = this.view;
            if (view != null) {
                if (!this.invalidateInParent || view.getParent() == null) {
                    this.view.invalidate();
                } else {
                    ((View) this.view.getParent()).invalidate();
                }
            }
        }

        public boolean outOfBounds(float f, float f2) {
            Rect rect = this.drawableBounds;
            return ((float) rect.bottom) < f || ((float) rect.top) > f2;
        }

        public void prepareForBackgroundDraw(long j, int i) {
            AnimatedEmojiDrawable animatedEmojiDrawable = this.drawable;
            if (animatedEmojiDrawable == null) {
                return;
            }
            ImageReceiver imageReceiver = animatedEmojiDrawable.getImageReceiver();
            this.drawable.update(j);
            this.drawable.setBounds(this.drawableBounds);
            if (imageReceiver != null) {
                AnimatedEmojiSpan animatedEmojiSpan = this.span;
                if (animatedEmojiSpan != null && animatedEmojiSpan.document == null && this.drawable.getDocument() != null) {
                    this.span.document = this.drawable.getDocument();
                }
                imageReceiver.setAlpha(this.alpha);
                imageReceiver.setImageCoords(this.drawableBounds);
                ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = this.backgroundDrawHolder;
                backgroundThreadDrawHolderArr[i] = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i], i);
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = this.backgroundDrawHolder[i];
                backgroundThreadDrawHolder.overrideAlpha = this.alpha;
                backgroundThreadDrawHolder.setBounds(this.drawableBounds);
                this.backgroundDrawHolder[i].time = j;
            }
        }

        public void releaseDrawInBackground(int i) {
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = this.backgroundDrawHolder[i];
            if (backgroundThreadDrawHolder != null) {
                backgroundThreadDrawHolder.release();
            }
        }
    }

    public interface InvalidateHolder {
        void invalidate();
    }

    public static class SpansChunk {
        private final boolean allowBackgroundRendering;
        DrawingInBackgroundThreadDrawable backgroundThreadDrawable;
        ArrayList<AnimatedEmojiHolder> holders = new ArrayList<>();
        Layout layout;
        final View view;

        public SpansChunk(View view, Layout layout, boolean z) {
            this.layout = layout;
            this.view = view;
            this.allowBackgroundRendering = z;
        }

        private void checkBackgroundRendering() {
            DrawingInBackgroundThreadDrawable drawingInBackgroundThreadDrawable;
            if (this.allowBackgroundRendering && this.holders.size() >= 10 && this.backgroundThreadDrawable == null && LiteMode.isEnabled(16388)) {
                DrawingInBackgroundThreadDrawable drawingInBackgroundThreadDrawable2 = new DrawingInBackgroundThreadDrawable() {
                    private final ArrayList<AnimatedEmojiHolder> backgroundHolders = new ArrayList<>();

                    @Override
                    public void drawInBackground(Canvas canvas) {
                        for (int i = 0; i < this.backgroundHolders.size(); i++) {
                            AnimatedEmojiHolder animatedEmojiHolder = this.backgroundHolders.get(i);
                            if (animatedEmojiHolder != null && animatedEmojiHolder.drawable != null && animatedEmojiHolder.backgroundDrawHolder[this.threadIndex] != null) {
                                animatedEmojiHolder.drawable.draw(canvas, animatedEmojiHolder.backgroundDrawHolder[this.threadIndex], true);
                            }
                        }
                    }

                    @Override
                    public void drawInUiThread(Canvas canvas, float f) {
                        Canvas canvas2;
                        float f2;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int i = 0;
                        while (i < SpansChunk.this.holders.size()) {
                            AnimatedEmojiHolder animatedEmojiHolder = SpansChunk.this.holders.get(i);
                            if (animatedEmojiHolder.span.spanDrawn) {
                                canvas2 = canvas;
                                f2 = f;
                                animatedEmojiHolder.draw(canvas2, jCurrentTimeMillis, 0.0f, 0.0f, f2, null);
                            } else {
                                canvas2 = canvas;
                                f2 = f;
                            }
                            i++;
                            canvas = canvas2;
                            f = f2;
                        }
                    }

                    @Override
                    public void onFrameReady() {
                        for (int i = 0; i < this.backgroundHolders.size(); i++) {
                            if (this.backgroundHolders.get(i) != null) {
                                this.backgroundHolders.get(i).releaseDrawInBackground(this.threadIndex);
                            }
                        }
                        this.backgroundHolders.clear();
                        View view = SpansChunk.this.view;
                        if (view == null || view.getParent() == null) {
                            return;
                        }
                        ((View) SpansChunk.this.view.getParent()).invalidate();
                    }

                    @Override
                    public void onPaused() {
                        super.onPaused();
                    }

                    @Override
                    public void onResume() {
                        View view = SpansChunk.this.view;
                        if (view == null || view.getParent() == null) {
                            return;
                        }
                        ((View) SpansChunk.this.view.getParent()).invalidate();
                    }

                    @Override
                    public void prepareDraw(long j) {
                        this.backgroundHolders.clear();
                        this.backgroundHolders.addAll(SpansChunk.this.holders);
                        int i = 0;
                        while (i < this.backgroundHolders.size()) {
                            AnimatedEmojiHolder animatedEmojiHolder = this.backgroundHolders.get(i);
                            if (animatedEmojiHolder.span.spanDrawn) {
                                animatedEmojiHolder.prepareForBackgroundDraw(j, this.threadIndex);
                            } else {
                                this.backgroundHolders.remove(i);
                                i--;
                            }
                            i++;
                        }
                    }
                };
                this.backgroundThreadDrawable = drawingInBackgroundThreadDrawable2;
                drawingInBackgroundThreadDrawable2.padding = AndroidUtilities.dp(3.0f);
                this.backgroundThreadDrawable.onAttachToWindow();
                return;
            }
            if (this.holders.size() >= 10 || (drawingInBackgroundThreadDrawable = this.backgroundThreadDrawable) == null) {
                return;
            }
            drawingInBackgroundThreadDrawable.onDetachFromWindow();
            this.backgroundThreadDrawable = null;
        }

        public void add(AnimatedEmojiHolder animatedEmojiHolder) {
            this.holders.add(animatedEmojiHolder);
            animatedEmojiHolder.spansChunk = this;
            checkBackgroundRendering();
        }

        public void draw(Canvas canvas, List<SpoilerEffect> list, long j, float f, float f2, float f3, float f4, ColorFilter colorFilter) {
            for (int i = 0; i < this.holders.size(); i++) {
                AnimatedEmojiHolder animatedEmojiHolder = this.holders.get(i);
                if (animatedEmojiHolder != null) {
                    AnimatedEmojiDrawable animatedEmojiDrawable = animatedEmojiHolder.drawable;
                    if (animatedEmojiDrawable != null) {
                        animatedEmojiDrawable.setColorFilter(colorFilter);
                    }
                    AnimatedEmojiSpan animatedEmojiSpan = animatedEmojiHolder.span;
                    if (animatedEmojiSpan.spanDrawn) {
                        float f5 = animatedEmojiSpan.measuredSize / 2.0f;
                        float f6 = animatedEmojiSpan.lastDrawnCx;
                        float f7 = animatedEmojiSpan.lastDrawnCy;
                        animatedEmojiHolder.drawableBounds.set((int) (f6 - f5), (int) (f7 - f5), (int) (f6 + f5), (int) (f7 + f5));
                        float fMax = (list == null || list.isEmpty() || !animatedEmojiHolder.insideSpoiler) ? 1.0f : Math.max(0.0f, list.get(0).rippleProgress);
                        animatedEmojiHolder.drawingYOffset = f3;
                        animatedEmojiHolder.alpha = fMax;
                        if (this.backgroundThreadDrawable == null) {
                            animatedEmojiHolder.draw(canvas, j, f, f2, f4, colorFilter);
                        }
                    }
                }
            }
            DrawingInBackgroundThreadDrawable drawingInBackgroundThreadDrawable = this.backgroundThreadDrawable;
            if (drawingInBackgroundThreadDrawable != null) {
                drawingInBackgroundThreadDrawable.draw(canvas, j, this.layout.getWidth(), AndroidUtilities.dp(2.0f) + this.layout.getHeight(), f4);
            }
        }

        public void release() {
            this.holders.clear();
            checkBackgroundRendering();
        }

        public void remove(AnimatedEmojiHolder animatedEmojiHolder) {
            this.holders.remove(animatedEmojiHolder);
            animatedEmojiHolder.spansChunk = null;
            checkBackgroundRendering();
        }
    }

    public static class TextViewEmojis extends TextView {
        private int cacheType;
        private ColorFilter emojiColorFilter;
        EmojiGroupedSpans stack;

        public TextViewEmojis(Context context) {
            super(context);
            this.cacheType = 0;
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.stack = AnimatedEmojiSpan.update(this.cacheType, this, this.stack, getLayout());
        }

        @Override
        public void onDetachedFromWindow() {
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
        public void onMeasure(int i, int i2) {
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
        public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            super.setText(charSequence, bufferType);
            this.stack = AnimatedEmojiSpan.update(this.cacheType, this, this.stack, getLayout());
        }
    }

    public AnimatedEmojiSpan(TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        this(document.id, 1.2f, fontMetricsInt);
        this.document = document;
    }

    private boolean animateChanges(float f, float f2) {
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
        this.moveAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                AnimatedEmojiSpan.this.moveAnimator = null;
            }
        });
        this.moveAnimator.setDuration(140L);
        this.moveAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.moveAnimator.start();
        return true;
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
            animatedEmojiSpan2 = new AnimatedEmojiSpan(document, animatedEmojiSpan.scale, fontMetricsInt != null ? fontMetricsInt : animatedEmojiSpan.fontMetrics);
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

    private static void expandFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i) {
        int i2 = fontMetricsInt.descent;
        int i3 = fontMetricsInt.ascent;
        int i4 = i2 - i3;
        if (i <= i4) {
            return;
        }
        int i5 = i - i4;
        int i6 = (i5 + 1) / 2;
        int i7 = i3 - i6;
        fontMetricsInt.ascent = i7;
        fontMetricsInt.descent = i2 + (i5 - i6);
        fontMetricsInt.top = Math.min(fontMetricsInt.top, i7);
        fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, fontMetricsInt.descent);
    }

    public boolean isAnimating() {
        return (this.moveAnimator == null && this.scaleAnimator == null) ? false : true;
    }

    private static boolean isInsideSpoiler(Layout layout, int i, int i2) {
        if (layout != null && (layout.getText() instanceof Spanned)) {
            TextStyleSpan[] textStyleSpanArr = (TextStyleSpan[]) ((Spanned) layout.getText()).getSpans(Math.max(0, i), Math.min(layout.getText().length() - 1, i2), TextStyleSpan.class);
            for (int i3 = 0; textStyleSpanArr != null && i3 < textStyleSpanArr.length; i3++) {
                TextStyleSpan textStyleSpan = textStyleSpanArr[i3];
                if (textStyleSpan != null && textStyleSpan.isSpoiler()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void lambda$animateChanges$2(float f, float f2, float f3, float f4, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.lastDrawnCy = AndroidUtilities.lerp(f, f2, fFloatValue);
        this.lastDrawnCx = AndroidUtilities.lerp(f3, f4, fFloatValue);
    }

    public void lambda$getExtraScale$0(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.extraScale = fFloatValue;
        this.scale = AndroidUtilities.lerp(0.2f, 1.0f, fFloatValue);
        lockPositionChanging = false;
    }

    public void lambda$getExtraScale$1(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.extraScale = fFloatValue;
        this.scale = AndroidUtilities.lerp(0.0f, 1.0f, fFloatValue);
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
            this.scaleAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    AnimatedEmojiSpan.this.scaleAnimator = null;
                    boolean unused = AnimatedEmojiSpan.lockPositionChanging = false;
                }
            });
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
            this.scaleAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    AnimatedEmojiSpan.this.scaleAnimator = null;
                    if (AnimatedEmojiSpan.this.removedAction != null) {
                        AnimatedEmojiSpan.this.removedAction.run();
                        AnimatedEmojiSpan.this.removedAction = null;
                    }
                }
            });
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
            expandFontMetrics(fontMetricsInt2, this.minimumLineHeight);
        }
        return Math.max(0, this.measuredSize - 1);
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
        if (canvas == null || layout == null || emojiGroupedSpans == null) {
            return;
        }
        if (Emoji.emojiDrawingYOffset == 0.0f && f == 0.0f) {
            z = false;
        } else {
            canvas.save();
            canvas.translate(0.0f, Emoji.emojiDrawingYOffset + AndroidUtilities.dp(20.0f * f));
            z = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < emojiGroupedSpans.backgroundDrawingArray.size(); i++) {
            SpansChunk spansChunk = emojiGroupedSpans.backgroundDrawingArray.get(i);
            if (spansChunk.layout == layout) {
                spansChunk.draw(canvas, list, jCurrentTimeMillis, f2, f3, f4, f5, colorFilter);
                break;
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    public static EmojiGroupedSpans update(int i, View view, EmojiGroupedSpans emojiGroupedSpans, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z) {
        return update(i, view, false, emojiGroupedSpans, arrayList, z);
    }

    public AnimatedEmojiSpan(TLRPC.Document document, float f, Paint.FontMetricsInt fontMetricsInt) {
        this(document.id, f, fontMetricsInt);
        this.document = document;
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

    public AnimatedEmojiSpan(long j, Paint.FontMetricsInt fontMetricsInt) {
        this(j, 1.2f, fontMetricsInt);
    }

    public static void release(View view, EmojiGroupedSpans emojiGroupedSpans) {
        if (emojiGroupedSpans == null) {
            return;
        }
        emojiGroupedSpans.release();
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

    public static class EmojiGroupedSpans {
        private int rawIndex;
        public ArrayList<AnimatedEmojiHolder> holders = new ArrayList<>();
        HashMap<Layout, SpansChunk> groupedByLayout = new HashMap<>();
        ArrayList<SpansChunk> backgroundDrawingArray = new ArrayList<>();

        public void add(Layout layout, AnimatedEmojiHolder animatedEmojiHolder) {
            this.holders.add(animatedEmojiHolder);
            SpansChunk spansChunk = this.groupedByLayout.get(layout);
            if (spansChunk == null) {
                spansChunk = new SpansChunk(animatedEmojiHolder.view, layout, false);
                this.groupedByLayout.put(layout, spansChunk);
                this.backgroundDrawingArray.add(spansChunk);
            }
            spansChunk.add(animatedEmojiHolder);
            AnimatedEmojiDrawable animatedEmojiDrawable = animatedEmojiHolder.drawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(animatedEmojiHolder);
            }
        }

        public void clearPositions() {
            for (int i = 0; i < this.holders.size(); i++) {
                this.holders.get(i).span.spanDrawn = false;
            }
        }

        public boolean hasLayout(Layout layout) {
            return this.groupedByLayout.containsKey(layout);
        }

        public boolean isEmpty() {
            return this.holders.isEmpty();
        }

        public void recordPositions(boolean z) {
            for (int i = 0; i < this.holders.size(); i++) {
                this.holders.get(i).span.recordPositions = z;
            }
        }

        public void release() {
            while (this.holders.size() > 0) {
                remove(0);
            }
        }

        public void remove(Layout layout, AnimatedEmojiHolder animatedEmojiHolder) {
            this.holders.remove(animatedEmojiHolder);
            SpansChunk spansChunk = this.groupedByLayout.get(layout);
            if (spansChunk != null) {
                spansChunk.remove(animatedEmojiHolder);
                if (spansChunk.holders.isEmpty()) {
                    this.groupedByLayout.remove(layout);
                    this.backgroundDrawingArray.remove(spansChunk);
                }
            }
            AnimatedEmojiDrawable animatedEmojiDrawable = animatedEmojiHolder.drawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(animatedEmojiHolder);
            }
        }

        public void replaceLayout(Layout layout, Layout layout2) {
            SpansChunk spansChunkRemove;
            if (layout2 == null || (spansChunkRemove = this.groupedByLayout.remove(layout2)) == null) {
                return;
            }
            spansChunkRemove.layout = layout;
            for (int i = 0; i < spansChunkRemove.holders.size(); i++) {
                spansChunkRemove.holders.get(i).layout = layout;
            }
            this.groupedByLayout.put(layout, spansChunkRemove);
        }

        public void remove(int i) {
            AnimatedEmojiHolder animatedEmojiHolderRemove = this.holders.remove(i);
            SpansChunk spansChunk = this.groupedByLayout.get(animatedEmojiHolderRemove.layout);
            if (spansChunk != null) {
                spansChunk.remove(animatedEmojiHolderRemove);
                if (spansChunk.holders.isEmpty()) {
                    this.groupedByLayout.remove(animatedEmojiHolderRemove.layout);
                    this.backgroundDrawingArray.remove(spansChunk);
                }
                AnimatedEmojiDrawable animatedEmojiDrawable = animatedEmojiHolderRemove.drawable;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.removeView(animatedEmojiHolderRemove);
                    return;
                }
                return;
            }
            throw new RuntimeException("!!!");
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
        AnimatedEmojiHolder animatedEmojiHolder;
        int i3;
        int i4;
        EmojiGroupedSpans emojiGroupedSpans2 = emojiGroupedSpans;
        if (layoutArr == null || layoutArr.length <= 0) {
            if (emojiGroupedSpans2 != null) {
                emojiGroupedSpans2.holders.clear();
                emojiGroupedSpans2.release();
            }
            return null;
        }
        int i5 = 0;
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
                            animatedEmojiSpanCloneSpan = cloneSpan(animatedEmojiSpanCloneSpan, null);
                            animatedEmojiSpanArr[i7] = animatedEmojiSpanCloneSpan;
                            spannable.setSpan(animatedEmojiSpanCloneSpan, spanStart, spanEnd, 33);
                        }
                        if (emojiGroupedSpans2 == null) {
                            emojiGroupedSpans2 = new EmojiGroupedSpans();
                        }
                        int i8 = 0;
                        while (true) {
                            if (i8 >= emojiGroupedSpans2.holders.size()) {
                                animatedEmojiHolder = null;
                                break;
                            }
                            if (emojiGroupedSpans2.holders.get(i8).span == animatedEmojiSpanCloneSpan && emojiGroupedSpans2.holders.get(i8).layout == layout) {
                                animatedEmojiHolder = emojiGroupedSpans2.holders.get(i8);
                                break;
                            }
                            i8++;
                        }
                        if (animatedEmojiHolder == null) {
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
                                animatedEmojiHolder2.drawable = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, i4, animatedEmojiSpanCloneSpan.getDocumentId(), animatedEmojiSpanCloneSpan.documentAbsolutePath);
                            } else {
                                i3 = i6;
                                TLRPC.Document document = animatedEmojiSpanCloneSpan.document;
                                if (document != null) {
                                    animatedEmojiHolder2.drawable = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, i4, document);
                                } else {
                                    long j = animatedEmojiSpanCloneSpan.documentId;
                                    if (j != 0) {
                                        animatedEmojiHolder2.drawable = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, i4, j, null);
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
                            emojiGroupedSpans2.add(layout, animatedEmojiHolder2);
                        } else {
                            i3 = i6;
                            animatedEmojiHolder.insideSpoiler = isInsideSpoiler(layout, spanned.getSpanStart(animatedEmojiSpanCloneSpan), spanned.getSpanEnd(animatedEmojiSpanCloneSpan));
                        }
                    }
                    i7++;
                    i6 = i3;
                }
                i2 = i6;
            }
            if (emojiGroupedSpans2 != null) {
                int i10 = 0;
                while (i10 < emojiGroupedSpans2.holders.size()) {
                    if (emojiGroupedSpans2.holders.get(i10).layout == layout) {
                        AnimatedEmojiSpan animatedEmojiSpan = emojiGroupedSpans2.holders.get(i10).span;
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
            i6 = i2 + 1;
            i5 = 0;
        }
        if (emojiGroupedSpans2 != null) {
            int i12 = 0;
            while (i12 < emojiGroupedSpans2.holders.size()) {
                Layout layout2 = emojiGroupedSpans2.holders.get(i12).layout;
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
                    animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, i2, animatedEmojiSpan2.documentId);
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
                AnimatedEmojiDrawable animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, i2, animatedEmojiSpan.documentId);
                animatedEmojiDrawableMake.addView(view);
                longSparseArray.put(animatedEmojiSpan.getDocumentId(), animatedEmojiDrawableMake);
            }
        }
        return longSparseArray;
    }
}
