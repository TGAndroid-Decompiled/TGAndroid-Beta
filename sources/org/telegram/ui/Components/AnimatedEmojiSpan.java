package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
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
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
public class AnimatedEmojiSpan extends ReplacementSpan {
    private static boolean lockPositionChanging;
    private boolean animateChanges;
    public int cacheType;
    public TLRPC$Document document;
    public String documentAbsolutePath;
    public long documentId;
    public String emoji;
    private float extraScale;
    private Paint.FontMetricsInt fontMetrics;
    public boolean fromEmojiKeyboard;
    public boolean full;
    public boolean invert;
    private boolean isAdded;
    private boolean isRemoved;
    float lastDrawnCx;
    float lastDrawnCy;
    protected int measuredSize;
    private ValueAnimator moveAnimator;
    boolean positionChanged;
    private boolean recordPositions;
    private Runnable removedAction;
    private float scale;
    private ValueAnimator scaleAnimator;
    public float size;
    boolean spanDrawn;
    public boolean standard;
    public boolean top;

    public interface InvalidateHolder {
        void invalidate();
    }

    public void setAdded() {
        this.isAdded = true;
        this.extraScale = 0.0f;
        lockPositionChanging = true;
    }

    public void setAnimateChanges() {
        this.animateChanges = true;
    }

    public void setRemoved(Runnable runnable) {
        this.removedAction = runnable;
        this.isRemoved = true;
        this.extraScale = 1.0f;
    }

    public float getExtraScale() {
        if (this.isAdded) {
            this.isAdded = false;
            this.extraScale = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.scaleAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AnimatedEmojiSpan.this.lambda$getExtraScale$0(valueAnimator);
                }
            });
            this.scaleAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    AnimatedEmojiSpan.this.scaleAnimator = null;
                }
            });
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.scaleAnimator.start();
        } else if (this.isRemoved) {
            this.isRemoved = false;
            this.extraScale = 1.0f;
            ValueAnimator valueAnimator = this.scaleAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.scaleAnimator.cancel();
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.extraScale, 0.0f);
            this.scaleAnimator = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    AnimatedEmojiSpan.this.lambda$getExtraScale$1(valueAnimator2);
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

    public void lambda$getExtraScale$0(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.extraScale = floatValue;
        this.scale = AndroidUtilities.lerp(0.2f, 1.0f, floatValue);
        lockPositionChanging = false;
    }

    public void lambda$getExtraScale$1(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.extraScale = floatValue;
        this.scale = AndroidUtilities.lerp(0.0f, 1.0f, floatValue);
    }

    public AnimatedEmojiSpan(TLRPC$Document tLRPC$Document, Paint.FontMetricsInt fontMetricsInt) {
        this(tLRPC$Document.id, 1.2f, fontMetricsInt);
        this.document = tLRPC$Document;
    }

    public AnimatedEmojiSpan(TLRPC$Document tLRPC$Document, float f, Paint.FontMetricsInt fontMetricsInt) {
        this(tLRPC$Document.id, f, fontMetricsInt);
        this.document = tLRPC$Document;
    }

    public AnimatedEmojiSpan(long j, Paint.FontMetricsInt fontMetricsInt) {
        this(j, 1.2f, fontMetricsInt);
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
            float abs = Math.abs(fontMetricsInt.descent) + Math.abs(fontMetricsInt.ascent);
            this.size = abs;
            if (abs == 0.0f) {
                this.size = AndroidUtilities.dp(20.0f);
            }
        }
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

    public long getDocumentId() {
        TLRPC$Document tLRPC$Document = this.document;
        return tLRPC$Document != null ? tLRPC$Document.id : this.documentId;
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
        if (fontMetricsInt != null) {
            float abs = Math.abs(fontMetricsInt.descent) + Math.abs(this.fontMetrics.ascent);
            this.size = abs;
            if (abs == 0.0f) {
                this.size = AndroidUtilities.dp(20.0f);
            }
        }
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i, int i2) {
        this.fontMetrics = fontMetricsInt;
        this.size = i;
        this.cacheType = i2;
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i) {
        this.fontMetrics = fontMetricsInt;
        this.cacheType = i;
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt == null && this.top) {
            fontMetricsInt = paint.getFontMetricsInt();
        }
        int i3 = fontMetricsInt == null ? 0 : fontMetricsInt.ascent;
        int i4 = fontMetricsInt == null ? 0 : fontMetricsInt.descent;
        Paint.FontMetricsInt fontMetricsInt2 = this.fontMetrics;
        if (fontMetricsInt2 == null) {
            int i5 = (int) this.size;
            int dp = AndroidUtilities.dp(8.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            if (fontMetricsInt != null) {
                float f = (-dp2) - dp;
                float f2 = this.scale;
                fontMetricsInt.top = (int) (f * f2);
                float f3 = dp2 - dp;
                fontMetricsInt.bottom = (int) (f3 * f2);
                fontMetricsInt.ascent = (int) (f * f2);
                fontMetricsInt.descent = (int) (f3 * f2);
                fontMetricsInt.leading = 0;
            }
            this.measuredSize = (int) (i5 * this.scale);
        } else {
            this.measuredSize = (int) (this.size * this.scale);
            if (fontMetricsInt != null) {
                if (!this.full) {
                    fontMetricsInt.ascent = fontMetricsInt2.ascent;
                    fontMetricsInt.descent = fontMetricsInt2.descent;
                    fontMetricsInt.top = fontMetricsInt2.top;
                    fontMetricsInt.bottom = fontMetricsInt2.bottom;
                } else {
                    float abs = Math.abs(fontMetricsInt2.bottom) + Math.abs(this.fontMetrics.top);
                    fontMetricsInt.ascent = (int) Math.ceil((this.fontMetrics.top / abs) * this.measuredSize);
                    fontMetricsInt.descent = (int) Math.ceil((this.fontMetrics.bottom / abs) * this.measuredSize);
                    fontMetricsInt.top = (int) Math.ceil((this.fontMetrics.top / abs) * this.measuredSize);
                    fontMetricsInt.bottom = (int) Math.ceil((this.fontMetrics.bottom / abs) * this.measuredSize);
                }
            }
        }
        if (fontMetricsInt != null && this.top) {
            int i6 = fontMetricsInt.ascent;
            int i7 = fontMetricsInt.descent;
            int i8 = ((i3 - i6) + (i4 - i7)) / 2;
            fontMetricsInt.ascent = i6 + i8;
            fontMetricsInt.descent = i7 - i8;
        }
        return Math.max(0, this.measuredSize - 1);
    }

    public boolean isAnimating() {
        return (this.moveAnimator == null && this.scaleAnimator == null) ? false : true;
    }

    private boolean animateChanges(final float f, final float f2) {
        if (this.moveAnimator != null) {
            return true;
        }
        if (this.animateChanges) {
            this.animateChanges = false;
            final float f3 = this.lastDrawnCx;
            final float f4 = this.lastDrawnCy;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.moveAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AnimatedEmojiSpan.this.lambda$animateChanges$2(f4, f2, f3, f, valueAnimator);
                }
            });
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
        return false;
    }

    public void lambda$animateChanges$2(float f, float f2, float f3, float f4, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.lastDrawnCy = AndroidUtilities.lerp(f, f2, floatValue);
        this.lastDrawnCx = AndroidUtilities.lerp(f3, f4, floatValue);
    }

    @Override
    public void draw(android.graphics.Canvas r1, java.lang.CharSequence r2, int r3, int r4, float r5, int r6, int r7, int r8, android.graphics.Paint r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AnimatedEmojiSpan.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, EmojiGroupedSpans emojiGroupedSpans, float f, List<SpoilerEffect> list, float f2, float f3, float f4, float f5) {
        drawAnimatedEmojis(canvas, layout, emojiGroupedSpans, f, list, f2, f3, f4, f5, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, EmojiGroupedSpans emojiGroupedSpans, float f, List<SpoilerEffect> list, float f2, float f3, float f4, float f5, ColorFilter colorFilter) {
        boolean z;
        if (canvas == null || layout == null || emojiGroupedSpans == null) {
            return;
        }
        int i = 0;
        if (Emoji.emojiDrawingYOffset == 0.0f && f == 0.0f) {
            z = false;
        } else {
            canvas.save();
            canvas.translate(0.0f, Emoji.emojiDrawingYOffset + AndroidUtilities.dp(20.0f * f));
            z = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            if (i >= emojiGroupedSpans.backgroundDrawingArray.size()) {
                break;
            }
            SpansChunk spansChunk = emojiGroupedSpans.backgroundDrawingArray.get(i);
            if (spansChunk.layout == layout) {
                spansChunk.draw(canvas, list, currentTimeMillis, f2, f3, f4, f5, colorFilter);
                break;
            }
            i++;
        }
        if (z) {
            canvas.restore();
        }
    }

    private static boolean isInsideSpoiler(Layout layout, int i, int i2) {
        if (layout != null && (layout.getText() instanceof Spanned)) {
            TextStyleSpan[] textStyleSpanArr = (TextStyleSpan[]) ((Spanned) layout.getText()).getSpans(Math.max(0, i), Math.min(layout.getText().length() - 1, i2), TextStyleSpan.class);
            for (int i3 = 0; textStyleSpanArr != null && i3 < textStyleSpanArr.length; i3++) {
                if (textStyleSpanArr[i3] != null && textStyleSpanArr[i3].isSpoiler()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static class AnimatedEmojiHolder implements InvalidateHolder {
        public float alpha;
        private ImageReceiver.BackgroundThreadDrawHolder[] backgroundDrawHolder = new ImageReceiver.BackgroundThreadDrawHolder[2];
        public AnimatedEmojiDrawable drawable;
        public android.graphics.Rect drawableBounds;
        public float drawingYOffset;
        public boolean insideSpoiler;
        private final boolean invalidateInParent;
        public Layout layout;
        public boolean skipDraw;
        public AnimatedEmojiSpan span;
        public SpansChunk spansChunk;
        public Drawable thumbDrawable;
        private final View view;

        public AnimatedEmojiHolder(View view, boolean z) {
            this.view = view;
            this.invalidateInParent = z;
        }

        public boolean outOfBounds(float f, float f2) {
            android.graphics.Rect rect = this.drawableBounds;
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
                ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr2 = this.backgroundDrawHolder;
                backgroundThreadDrawHolderArr2[i].overrideAlpha = this.alpha;
                backgroundThreadDrawHolderArr2[i].setBounds(this.drawableBounds);
                this.backgroundDrawHolder[i].time = j;
            }
        }

        public void releaseDrawInBackground(int i) {
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = this.backgroundDrawHolder;
            if (backgroundThreadDrawHolderArr[i] != null) {
                backgroundThreadDrawHolderArr[i].release();
            }
        }

        public void draw(Canvas canvas, long j, float f, float f2, float f3, ColorFilter colorFilter) {
            if ((f != 0.0f || f2 != 0.0f) && outOfBounds(f, f2)) {
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
                    if (extraScale != 1.0f || this.span.invert) {
                        canvas.save();
                        canvas.scale((this.span.invert ? -1 : 1) * extraScale, extraScale, this.drawableBounds.centerX(), this.drawableBounds.centerY());
                        this.thumbDrawable.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    this.thumbDrawable.draw(canvas);
                }
            } else if (animatedEmojiDrawable.getImageReceiver() != null) {
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
                if (this.invalidateInParent && view.getParent() != null) {
                    ((View) this.view.getParent()).invalidate();
                } else {
                    this.view.invalidate();
                }
            }
        }
    }

    public static EmojiGroupedSpans update(int i, View view, EmojiGroupedSpans emojiGroupedSpans, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i, view, emojiGroupedSpans, arrayList, false);
    }

    public static EmojiGroupedSpans update(int i, View view, EmojiGroupedSpans emojiGroupedSpans, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z) {
        return update(i, view, false, emojiGroupedSpans, arrayList, z);
    }

    public static EmojiGroupedSpans update(int i, View view, boolean z, EmojiGroupedSpans emojiGroupedSpans, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i, view, z, emojiGroupedSpans, arrayList, false);
    }

    public static EmojiGroupedSpans update(int i, View view, boolean z, EmojiGroupedSpans emojiGroupedSpans, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z2) {
        Layout[] layoutArr = new Layout[arrayList == null ? 0 : arrayList.size()];
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                layoutArr[i2] = arrayList.get(i2).textLayout.layout;
            }
        }
        return update(i, view, z, emojiGroupedSpans, z2, layoutArr);
    }

    public static EmojiGroupedSpans update(int i, View view, EmojiGroupedSpans emojiGroupedSpans, Layout... layoutArr) {
        return update(i, view, false, emojiGroupedSpans, layoutArr);
    }

    public static EmojiGroupedSpans update(int i, View view, boolean z, EmojiGroupedSpans emojiGroupedSpans, Layout... layoutArr) {
        return update(i, view, z, emojiGroupedSpans, false, layoutArr);
    }

    public static EmojiGroupedSpans update(int i, View view, boolean z, EmojiGroupedSpans emojiGroupedSpans, boolean z2, Layout... layoutArr) {
        boolean z3;
        int i2;
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        boolean z4;
        AnimatedEmojiHolder animatedEmojiHolder;
        int i3;
        int i4;
        EmojiGroupedSpans emojiGroupedSpans2 = emojiGroupedSpans;
        if (layoutArr == null || layoutArr.length <= 0) {
            if (emojiGroupedSpans2 != null) {
                emojiGroupedSpans2.holders.clear();
                emojiGroupedSpans.release();
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
                    AnimatedEmojiSpan animatedEmojiSpan = animatedEmojiSpanArr[i7];
                    if (animatedEmojiSpan == null) {
                        i3 = i6;
                    } else {
                        if (z2 && (layout.getText() instanceof Spannable)) {
                            int spanStart = spanned.getSpanStart(animatedEmojiSpan);
                            int spanEnd = spanned.getSpanEnd(animatedEmojiSpan);
                            Spannable spannable = (Spannable) spanned;
                            spannable.removeSpan(animatedEmojiSpan);
                            animatedEmojiSpan = cloneSpan(animatedEmojiSpan);
                            spannable.setSpan(animatedEmojiSpan, spanStart, spanEnd, 33);
                        }
                        if (emojiGroupedSpans2 == null) {
                            emojiGroupedSpans2 = new EmojiGroupedSpans();
                        }
                        int i8 = 0;
                        while (true) {
                            if (i8 >= emojiGroupedSpans2.holders.size()) {
                                animatedEmojiHolder = null;
                                break;
                            } else if (emojiGroupedSpans2.holders.get(i8).span == animatedEmojiSpan && emojiGroupedSpans2.holders.get(i8).layout == layout) {
                                animatedEmojiHolder = emojiGroupedSpans2.holders.get(i8);
                                break;
                            } else {
                                i8++;
                            }
                        }
                        if (animatedEmojiHolder == null) {
                            AnimatedEmojiHolder animatedEmojiHolder2 = new AnimatedEmojiHolder(view, z);
                            animatedEmojiHolder2.layout = layout;
                            if (animatedEmojiSpan.standard) {
                                i4 = 8;
                            } else {
                                i4 = animatedEmojiSpan.cacheType;
                                if (i4 < 0) {
                                    i4 = i;
                                }
                            }
                            if (animatedEmojiSpan.documentAbsolutePath != null) {
                                i3 = i6;
                                animatedEmojiHolder2.drawable = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, i4, animatedEmojiSpan.getDocumentId(), animatedEmojiSpan.documentAbsolutePath);
                            } else {
                                i3 = i6;
                                TLRPC$Document tLRPC$Document = animatedEmojiSpan.document;
                                if (tLRPC$Document != null) {
                                    animatedEmojiHolder2.drawable = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, i4, tLRPC$Document);
                                } else {
                                    long j = animatedEmojiSpan.documentId;
                                    if (j != 0) {
                                        animatedEmojiHolder2.drawable = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, i4, j, null);
                                    }
                                }
                            }
                            int i9 = animatedEmojiSpan.cacheType;
                            if ((i9 == 20 || i9 == 21) && !TextUtils.isEmpty(animatedEmojiSpan.emoji)) {
                                AnimatedEmojiDrawable animatedEmojiDrawable = animatedEmojiHolder2.drawable;
                                if (animatedEmojiDrawable != null) {
                                    animatedEmojiDrawable.setupEmojiThumb(animatedEmojiSpan.emoji);
                                } else {
                                    animatedEmojiHolder2.thumbDrawable = Emoji.getEmojiDrawable(animatedEmojiSpan.emoji);
                                }
                            }
                            animatedEmojiHolder2.insideSpoiler = isInsideSpoiler(layout, spanned.getSpanStart(animatedEmojiSpan), spanned.getSpanEnd(animatedEmojiSpan));
                            animatedEmojiHolder2.drawableBounds = new android.graphics.Rect();
                            animatedEmojiHolder2.span = animatedEmojiSpan;
                            emojiGroupedSpans2.add(layout, animatedEmojiHolder2);
                        } else {
                            i3 = i6;
                            animatedEmojiHolder.insideSpoiler = isInsideSpoiler(layout, spanned.getSpanStart(animatedEmojiSpan), spanned.getSpanEnd(animatedEmojiSpan));
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
                        AnimatedEmojiSpan animatedEmojiSpan2 = emojiGroupedSpans2.holders.get(i10).span;
                        for (int i11 = 0; animatedEmojiSpanArr != null && i11 < animatedEmojiSpanArr.length; i11++) {
                            if (animatedEmojiSpanArr[i11] == animatedEmojiSpan2) {
                                z4 = true;
                                break;
                            }
                        }
                        z4 = false;
                        if (!z4) {
                            emojiGroupedSpans2.remove(i10);
                            i10--;
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
                    if (i13 >= layoutArr.length) {
                        z3 = false;
                        break;
                    } else if (layoutArr[i13] == layout2) {
                        z3 = true;
                        break;
                    } else {
                        i13++;
                    }
                }
                if (!z3) {
                    emojiGroupedSpans2.remove(i12);
                    i12--;
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
        AnimatedEmojiDrawable make;
        boolean z;
        if (animatedEmojiSpanArr == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i3 = 0;
        while (i3 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i3);
            AnimatedEmojiDrawable animatedEmojiDrawable = longSparseArray.get(keyAt);
            if (animatedEmojiDrawable == null) {
                longSparseArray.remove(keyAt);
            } else {
                int i4 = 0;
                while (true) {
                    if (i4 >= animatedEmojiSpanArr.length) {
                        z = false;
                        break;
                    } else if (animatedEmojiSpanArr[i4] != null && animatedEmojiSpanArr[i4].getDocumentId() == keyAt) {
                        z = true;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (z) {
                    i3++;
                } else {
                    animatedEmojiDrawable.removeView(view);
                    longSparseArray.remove(keyAt);
                }
            }
            i3--;
            i3++;
        }
        for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
            if (animatedEmojiSpan != null && longSparseArray.get(animatedEmojiSpan.getDocumentId()) == null) {
                if (animatedEmojiSpan.standard) {
                    i2 = 8;
                } else {
                    i2 = animatedEmojiSpan.cacheType;
                    if (i2 < 0) {
                        i2 = i;
                    }
                }
                TLRPC$Document tLRPC$Document = animatedEmojiSpan.document;
                if (tLRPC$Document != null) {
                    make = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, i2, tLRPC$Document);
                } else {
                    make = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, i2, animatedEmojiSpan.documentId);
                }
                make.addView(view);
                longSparseArray.put(animatedEmojiSpan.getDocumentId(), make);
            }
        }
        return longSparseArray;
    }

    public static LongSparseArray<AnimatedEmojiDrawable> update(View view, ArrayList<AnimatedEmojiSpan> arrayList, LongSparseArray<AnimatedEmojiDrawable> longSparseArray) {
        return update(0, view, arrayList, longSparseArray);
    }

    public static LongSparseArray<AnimatedEmojiDrawable> update(int i, View view, ArrayList<AnimatedEmojiSpan> arrayList, LongSparseArray<AnimatedEmojiDrawable> longSparseArray) {
        int i2;
        boolean z;
        if (arrayList == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i3 = 0;
        while (i3 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i3);
            AnimatedEmojiDrawable animatedEmojiDrawable = longSparseArray.get(keyAt);
            if (animatedEmojiDrawable == null) {
                longSparseArray.remove(keyAt);
            } else {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        z = false;
                        break;
                    } else if (arrayList.get(i4) != null && arrayList.get(i4).getDocumentId() == keyAt) {
                        z = true;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (z) {
                    i3++;
                } else {
                    animatedEmojiDrawable.addView(view);
                    longSparseArray.remove(keyAt);
                }
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
                AnimatedEmojiDrawable make = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, i2, animatedEmojiSpan.documentId);
                make.addView(view);
                longSparseArray.put(animatedEmojiSpan.getDocumentId(), make);
            }
        }
        return longSparseArray;
    }

    public static void release(View view, LongSparseArray<AnimatedEmojiDrawable> longSparseArray) {
        if (longSparseArray == null) {
            return;
        }
        for (int i = 0; i < longSparseArray.size(); i++) {
            AnimatedEmojiDrawable valueAt = longSparseArray.valueAt(i);
            if (valueAt != null) {
                valueAt.removeView(view);
            }
        }
        longSparseArray.clear();
    }

    public static void release(View view, EmojiGroupedSpans emojiGroupedSpans) {
        if (emojiGroupedSpans == null) {
            return;
        }
        emojiGroupedSpans.release();
    }

    public static class EmojiGroupedSpans {
        public ArrayList<AnimatedEmojiHolder> holders = new ArrayList<>();
        HashMap<Layout, SpansChunk> groupedByLayout = new HashMap<>();
        ArrayList<SpansChunk> backgroundDrawingArray = new ArrayList<>();

        public void add(Layout layout, AnimatedEmojiHolder animatedEmojiHolder) {
            this.holders.add(animatedEmojiHolder);
            SpansChunk spansChunk = this.groupedByLayout.get(layout);
            if (spansChunk == null) {
                spansChunk = new SpansChunk(animatedEmojiHolder.view, layout, animatedEmojiHolder.invalidateInParent);
                this.groupedByLayout.put(layout, spansChunk);
                this.backgroundDrawingArray.add(spansChunk);
            }
            spansChunk.add(animatedEmojiHolder);
            AnimatedEmojiDrawable animatedEmojiDrawable = animatedEmojiHolder.drawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(animatedEmojiHolder);
            }
        }

        public void remove(int i) {
            AnimatedEmojiHolder remove = this.holders.remove(i);
            SpansChunk spansChunk = this.groupedByLayout.get(remove.layout);
            if (spansChunk != null) {
                spansChunk.remove(remove);
                if (spansChunk.holders.isEmpty()) {
                    this.groupedByLayout.remove(remove.layout);
                    this.backgroundDrawingArray.remove(spansChunk);
                }
                AnimatedEmojiDrawable animatedEmojiDrawable = remove.drawable;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.removeView(remove);
                    return;
                }
                return;
            }
            throw new RuntimeException("!!!");
        }

        public void release() {
            while (this.holders.size() > 0) {
                remove(0);
            }
        }

        public void clearPositions() {
            for (int i = 0; i < this.holders.size(); i++) {
                this.holders.get(i).span.spanDrawn = false;
            }
        }

        public void recordPositions(boolean z) {
            for (int i = 0; i < this.holders.size(); i++) {
                this.holders.get(i).span.recordPositions = z;
            }
        }

        public void replaceLayout(Layout layout, Layout layout2) {
            SpansChunk remove;
            if (layout2 == null || (remove = this.groupedByLayout.remove(layout2)) == null) {
                return;
            }
            remove.layout = layout;
            for (int i = 0; i < remove.holders.size(); i++) {
                remove.holders.get(i).layout = layout;
            }
            this.groupedByLayout.put(layout, remove);
        }
    }

    public static class SpansChunk {
        private boolean allowBackgroundRendering;
        DrawingInBackgroundThreadDrawable backgroundThreadDrawable;
        ArrayList<AnimatedEmojiHolder> holders = new ArrayList<>();
        Layout layout;
        final View view;

        public SpansChunk(View view, Layout layout, boolean z) {
            this.layout = layout;
            this.view = view;
            this.allowBackgroundRendering = z;
        }

        public void add(AnimatedEmojiHolder animatedEmojiHolder) {
            this.holders.add(animatedEmojiHolder);
            animatedEmojiHolder.spansChunk = this;
            checkBackgroundRendering();
        }

        public void remove(AnimatedEmojiHolder animatedEmojiHolder) {
            this.holders.remove(animatedEmojiHolder);
            animatedEmojiHolder.spansChunk = null;
            checkBackgroundRendering();
        }

        private void checkBackgroundRendering() {
            DrawingInBackgroundThreadDrawable drawingInBackgroundThreadDrawable;
            if (this.allowBackgroundRendering && this.holders.size() >= 10 && this.backgroundThreadDrawable == null && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD)) {
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
                        long currentTimeMillis = System.currentTimeMillis();
                        for (int i = 0; i < SpansChunk.this.holders.size(); i++) {
                            AnimatedEmojiHolder animatedEmojiHolder = SpansChunk.this.holders.get(i);
                            if (animatedEmojiHolder.span.spanDrawn) {
                                animatedEmojiHolder.draw(canvas, currentTimeMillis, 0.0f, 0.0f, f, null);
                            }
                        }
                    }

                    @Override
                    public void prepareDraw(long j) {
                        this.backgroundHolders.clear();
                        this.backgroundHolders.addAll(SpansChunk.this.holders);
                        int i = 0;
                        while (i < this.backgroundHolders.size()) {
                            AnimatedEmojiHolder animatedEmojiHolder = this.backgroundHolders.get(i);
                            if (!animatedEmojiHolder.span.spanDrawn) {
                                this.backgroundHolders.remove(i);
                                i--;
                            } else {
                                animatedEmojiHolder.prepareForBackgroundDraw(j, this.threadIndex);
                            }
                            i++;
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
                };
                this.backgroundThreadDrawable = drawingInBackgroundThreadDrawable2;
                drawingInBackgroundThreadDrawable2.padding = AndroidUtilities.dp(3.0f);
                this.backgroundThreadDrawable.onAttachToWindow();
            } else if (this.holders.size() >= 10 || (drawingInBackgroundThreadDrawable = this.backgroundThreadDrawable) == null) {
            } else {
                drawingInBackgroundThreadDrawable.onDetachFromWindow();
                this.backgroundThreadDrawable = null;
            }
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
                        float f8 = 1.0f;
                        if (list != null && !list.isEmpty() && animatedEmojiHolder.insideSpoiler) {
                            f8 = Math.max(0.0f, list.get(0).getRippleProgress());
                        }
                        animatedEmojiHolder.drawingYOffset = f3;
                        animatedEmojiHolder.alpha = f8;
                        if (this.backgroundThreadDrawable == null) {
                            animatedEmojiHolder.draw(canvas, j, f, f2, f4, colorFilter);
                        }
                    }
                }
            }
            DrawingInBackgroundThreadDrawable drawingInBackgroundThreadDrawable = this.backgroundThreadDrawable;
            if (drawingInBackgroundThreadDrawable != null) {
                drawingInBackgroundThreadDrawable.draw(canvas, j, this.layout.getWidth(), this.layout.getHeight() + AndroidUtilities.dp(2.0f), f4);
            }
        }
    }

    public static AnimatedEmojiSpan cloneSpan(AnimatedEmojiSpan animatedEmojiSpan) {
        AnimatedEmojiSpan animatedEmojiSpan2;
        TLRPC$Document tLRPC$Document = animatedEmojiSpan.document;
        if (tLRPC$Document != null) {
            animatedEmojiSpan2 = new AnimatedEmojiSpan(tLRPC$Document, animatedEmojiSpan.fontMetrics);
        } else {
            animatedEmojiSpan2 = new AnimatedEmojiSpan(animatedEmojiSpan.documentId, animatedEmojiSpan.scale, animatedEmojiSpan.fontMetrics);
        }
        animatedEmojiSpan2.fromEmojiKeyboard = animatedEmojiSpan.fromEmojiKeyboard;
        animatedEmojiSpan2.isAdded = animatedEmojiSpan.isAdded;
        animatedEmojiSpan2.isRemoved = animatedEmojiSpan.isRemoved;
        return animatedEmojiSpan2;
    }

    public static CharSequence cloneSpans(CharSequence charSequence) {
        return cloneSpans(charSequence, -1);
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
            if (characterStyleArr != null && characterStyleArr.length > 0) {
                AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned.getSpans(0, spanned.length(), AnimatedEmojiSpan.class);
                if (animatedEmojiSpanArr != null && animatedEmojiSpanArr.length <= 0) {
                    return charSequence;
                }
                charSequence = new SpannableString(spanned);
                for (int i2 = 0; i2 < characterStyleArr.length; i2++) {
                    if (characterStyleArr[i2] != null && (characterStyleArr[i2] instanceof AnimatedEmojiSpan)) {
                        int spanStart = spanned.getSpanStart(characterStyleArr[i2]);
                        int spanEnd = spanned.getSpanEnd(characterStyleArr[i2]);
                        AnimatedEmojiSpan animatedEmojiSpan = (AnimatedEmojiSpan) characterStyleArr[i2];
                        charSequence.removeSpan(animatedEmojiSpan);
                        AnimatedEmojiSpan cloneSpan = cloneSpan(animatedEmojiSpan);
                        if (i != -1) {
                            cloneSpan.cacheType = i;
                        }
                        charSequence.setSpan(cloneSpan, spanStart, spanEnd, 33);
                    }
                }
            }
            return charSequence;
        }
        return charSequence;
    }

    public static class TextViewEmojis extends TextView {
        EmojiGroupedSpans stack;

        public TextViewEmojis(Context context) {
            super(context);
        }

        @Override
        public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            super.setText(charSequence, bufferType);
            this.stack = AnimatedEmojiSpan.update(0, this, this.stack, getLayout());
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.stack = AnimatedEmojiSpan.update(0, this, this.stack, getLayout());
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.stack = AnimatedEmojiSpan.update(0, this, this.stack, getLayout());
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            AnimatedEmojiSpan.release(this, this.stack);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float paddingTop = ((getGravity() & 16) == 0 || getLayout() == null) ? 0.0f : getPaddingTop() + ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f);
            float paddingRight = LocaleController.isRTL ? getPaddingRight() : getPaddingLeft();
            if (paddingTop != 0.0f || paddingRight != 0.0f) {
                canvas.save();
                canvas.translate(paddingRight, paddingTop);
            }
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, getLayout(), this.stack, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            if (paddingTop == 0.0f && paddingRight == 0.0f) {
                return;
            }
            canvas.restore();
        }
    }
}
