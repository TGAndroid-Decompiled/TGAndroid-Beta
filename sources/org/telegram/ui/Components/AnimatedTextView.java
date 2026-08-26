package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.GroupCallUserCell$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.AnimatedTextView.AnimatedTextDrawable.Part;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda37;

public class AnimatedTextView extends View {
    public boolean adaptWidth;
    public Drawable backgroundDrawable;
    public final AnimatedTextDrawable drawable;
    public boolean first;
    public boolean hideBackgroundIfEmpty;
    public int lastMaxWidth;
    public int maxWidth;
    public boolean toSetMoveDown;
    public CharSequence toSetText;

    public class AnimatedTextDrawable extends Drawable {
        public boolean allowCancel;
        public int alpha;
        public long animateDuration;
        public CubicBezierInterpolator animateInterpolator;
        public float animateWave;
        public ValueAnimator animator;
        public final Rect bounds;
        public boolean centerY;
        public ValueAnimator colorAnimator;
        public float currentHeight;
        public Part[] currentParts;
        public CharSequence currentText;
        public float currentWidth;
        public boolean ellipsizeByGradient;
        public LinearGradient ellipsizeGradient;
        public Matrix ellipsizeGradientMatrix;
        public Paint ellipsizePaint;
        public int emojiCacheType;
        public int emojiColor;
        public ColorFilter emojiColorFilter;
        public boolean enforceByLetter;
        public int gravity;
        public boolean ignoreRTL;
        public boolean includeFontPadding;
        public boolean isRTL;
        public float moveAmplitude;
        public boolean moveDown;
        public float oldHeight;
        public Part[] oldParts;
        public CharSequence oldText;
        public float oldWidth;
        public Bulletin$2$$ExternalSyntheticLambda1 onAnimationFinishListener;
        public int overrideFullWidth;
        public boolean preserveIndex;
        public float rightPadding;
        public float scaleAmplitude;
        public int shadowColor;
        public float shadowDy;
        public float shadowRadius;
        public boolean shadowed;
        public boolean splitByWords;
        public boolean startFromEnd;
        public float t;
        public final TextPaint textPaint;
        public CharSequence toSetText;
        public boolean toSetTextMoveDown;
        public boolean updateAll;
        public Runnable widthUpdatedListener;

        public final class Part {
            public final AnimatedEmojiSpan.EmojiGroupedSpans emoji;
            public final StaticLayout layout;
            public final float left;
            public final float offset;
            public final int toOppositeIndex;
            public final float width;

            public Part(StaticLayout staticLayout, float f, int i) {
                this.layout = staticLayout;
                this.toOppositeIndex = i;
                this.offset = f;
                float lineWidth = 0.0f;
                this.left = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineLeft(0);
                if (staticLayout != null && staticLayout.getLineCount() > 0) {
                    lineWidth = staticLayout.getLineWidth(0);
                }
                this.width = lineWidth;
                if (AnimatedTextDrawable.this.getCallback() instanceof View) {
                    this.emoji = AnimatedEmojiSpan.update(AnimatedTextDrawable.this.emojiCacheType, (View) AnimatedTextDrawable.this.getCallback(), this.emoji, staticLayout);
                }
            }

            public final void detach() {
                AnimatedTextDrawable animatedTextDrawable = AnimatedTextDrawable.this;
                if (animatedTextDrawable.getCallback() instanceof View) {
                    AnimatedEmojiSpan.release((View) animatedTextDrawable.getCallback(), this.emoji);
                }
            }
        }

        public interface RegionCallback {
            void run(CharSequence charSequence);
        }

        public final class WordSequence implements CharSequence {
            public final int length;
            public final CharSequence[] words;

            public WordSequence(CharSequence charSequence) {
                if (charSequence == null) {
                    this.words = new CharSequence[0];
                    this.length = 0;
                    return;
                }
                this.length = charSequence.length();
                int i = 0;
                for (int i2 = 0; i2 < this.length; i2++) {
                    if (charSequence.charAt(i2) == ' ') {
                        i++;
                    }
                }
                this.words = new CharSequence[i + 1];
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int i6 = this.length;
                    if (i3 > i6) {
                        return;
                    }
                    if (i3 == i6 || charSequence.charAt(i3) == ' ') {
                        int i7 = i4 + 1;
                        this.words[i4] = charSequence.subSequence(i5, (i3 < this.length ? 1 : 0) + i3);
                        i5 = i3 + 1;
                        i4 = i7;
                    }
                    i3++;
                }
            }

            @Override
            public final char charAt(int i) {
                int i2 = 0;
                while (true) {
                    CharSequence[] charSequenceArr = this.words;
                    if (i2 >= charSequenceArr.length) {
                        return (char) 0;
                    }
                    if (i < charSequenceArr[i2].length()) {
                        return charSequenceArr[i2].charAt(i);
                    }
                    i -= charSequenceArr[i2].length();
                    i2++;
                }
            }

            @Override
            public final IntStream chars() {
                return j$.util.stream.IntStream.Wrapper.convert(chars());
            }

            @Override
            public final IntStream codePoints() {
                return j$.util.stream.IntStream.Wrapper.convert(codePoints());
            }

            @Override
            public final int length() {
                return this.words.length;
            }

            @Override
            public final CharSequence subSequence(int i, int i2) {
                return TextUtils.concat((CharSequence[]) Arrays.copyOfRange(this.words, i, i2));
            }

            @Override
            public final String toString() {
                StringBuilder sb = new StringBuilder();
                int i = 0;
                while (true) {
                    CharSequence[] charSequenceArr = this.words;
                    if (i >= charSequenceArr.length) {
                        return sb.toString();
                    }
                    sb.append(charSequenceArr[i]);
                    i++;
                }
            }

            @Override
            public final j$.util.stream.IntStream chars() {
                if (Build.VERSION.SDK_INT >= 24) {
                    return j$.util.stream.IntStream.VivifiedWrapper.convert(TextUtils.concat(this.words).chars());
                }
                return null;
            }

            @Override
            public final j$.util.stream.IntStream codePoints() {
                if (Build.VERSION.SDK_INT >= 24) {
                    return j$.util.stream.IntStream.VivifiedWrapper.convert(TextUtils.concat(this.words).codePoints());
                }
                return null;
            }
        }

        public AnimatedTextDrawable() {
            this(false, true, true, false);
        }

        public static boolean partEquals(int i, int i2, CharSequence charSequence, CharSequence charSequence2) {
            CharSequence charSequence3;
            if (!(charSequence instanceof WordSequence) || !(charSequence2 instanceof WordSequence)) {
                return charSequence.charAt(i) == charSequence2.charAt(i2);
            }
            WordSequence wordSequence = (WordSequence) charSequence;
            CharSequence charSequence4 = null;
            if (i >= 0) {
                CharSequence[] charSequenceArr = wordSequence.words;
                if (i >= charSequenceArr.length) {
                    charSequence3 = null;
                } else {
                    charSequence3 = charSequenceArr[i];
                }
            } else {
                charSequence3 = null;
            }
            WordSequence wordSequence2 = (WordSequence) charSequence2;
            if (i2 >= 0) {
                CharSequence[] charSequenceArr2 = wordSequence2.words;
                if (i2 < charSequenceArr2.length) {
                    charSequence4 = charSequenceArr2[i2];
                }
            }
            if (charSequence3 == null && charSequence4 == null) {
                return true;
            }
            return charSequence3 != null && charSequence3.equals(charSequence4);
        }

        public final void applyAlphaInternal(float f) {
            TextPaint textPaint = this.textPaint;
            textPaint.setAlpha((int) (this.alpha * f));
            if (this.shadowed) {
                textPaint.setShadowLayer(this.shadowRadius, 0.0f, this.shadowDy, Theme.multAlpha(f, this.shadowColor));
            }
        }

        public final void cancelAnimation() {
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }

        public final void clearOldParts() {
            if (this.oldParts != null) {
                int i = 0;
                while (true) {
                    Part[] partArr = this.oldParts;
                    if (i >= partArr.length) {
                        break;
                    }
                    partArr[i].detach();
                    i++;
                }
            }
            this.oldParts = null;
        }

        @Override
        public final void draw(Canvas canvas) {
            int i;
            Part part;
            float f;
            boolean z;
            float fM;
            int i2;
            float f2;
            float f3;
            TextPaint textPaint;
            TextPaint textPaint2;
            float f4;
            float f5;
            float fM2;
            float f6;
            Canvas canvas2 = canvas;
            boolean z2 = this.ellipsizeByGradient;
            Rect rect = this.bounds;
            if (z2) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(rect);
                rectF.right -= this.rightPadding;
                canvas2.saveLayerAlpha(rectF, 255, 31);
            }
            canvas2.save();
            canvas2.translate(rect.left, rect.top);
            int iWidth = rect.width();
            int iHeight = rect.height();
            float f7 = 1.0f;
            if (this.currentParts == null || this.oldParts == null) {
                if (this.centerY) {
                    canvas2.translate(0.0f, (iHeight - this.currentHeight) / 2.0f);
                }
                if (this.currentParts != null) {
                    applyAlphaInternal(1.0f);
                    i = 0;
                    while (i < this.currentParts.length) {
                        canvas2.save();
                        part = this.currentParts[i];
                        f = part.offset;
                        z = this.isRTL;
                        if (z && !this.ignoreRTL) {
                            f = this.currentWidth - (f + part.width);
                        }
                        fM = f - part.left;
                        i2 = this.gravity;
                        if ((i2 | (-4)) != -1) {
                            if ((i2 | (-6)) == -1) {
                                f2 = iWidth;
                                f3 = this.currentWidth;
                            } else if ((i2 | (-2)) == -1) {
                                fM = ImageReceiver$$ExternalSyntheticOutline0.m(iWidth, this.currentWidth, 2.0f, fM);
                            } else if (z && !this.ignoreRTL) {
                                f2 = iWidth;
                                f3 = this.currentWidth;
                            }
                            fM += f2 - f3;
                        }
                        canvas2.translate(fM, 0.0f);
                        part.layout.draw(canvas2);
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, part.layout, part.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, AnimatedTextDrawable.this.emojiColorFilter);
                        canvas.restore();
                        i++;
                        canvas2 = canvas;
                    }
                }
            } else {
                float f8 = this.t;
                if (f8 != 1.0f) {
                    float fLerp = AndroidUtilities.lerp(this.oldWidth, this.currentWidth, f8);
                    float fLerp2 = AndroidUtilities.lerp(this.oldHeight, this.currentHeight, this.t);
                    if (this.centerY) {
                        canvas2.translate(0.0f, (iHeight - fLerp2) / 2.0f);
                    }
                    int i3 = 0;
                    while (true) {
                        Part[] partArr = this.currentParts;
                        int length = partArr.length;
                        textPaint = this.textPaint;
                        if (i3 >= length) {
                            break;
                        }
                        Part part2 = partArr[i3];
                        int i4 = part2.toOppositeIndex;
                        boolean z3 = this.isRTL;
                        float f9 = part2.width;
                        float f10 = part2.offset;
                        if (z3 && !this.ignoreRTL) {
                            f10 = this.currentWidth - (f10 + f9);
                        }
                        float fCascade = this.t;
                        float f11 = this.animateWave;
                        if (f11 > 0.0f) {
                            fCascade = AndroidUtilities.cascade(fCascade, i3, partArr.length, f11);
                        }
                        float f12 = part2.left;
                        if (i4 >= 0) {
                            Part part3 = this.oldParts[i4];
                            float f13 = part3.offset;
                            if (this.isRTL && !this.ignoreRTL) {
                                f13 = this.oldWidth - (f13 + part3.width);
                            }
                            fM2 = AndroidUtilities.lerp(f13 - part3.left, f10 - f12, this.t);
                            applyAlphaInternal(f7);
                            f6 = 0.0f;
                        } else {
                            fM2 = f10 - f12;
                            f6 = (f7 - fCascade) * (-textPaint.getTextSize()) * this.moveAmplitude * (this.moveDown ? 1.0f : -1.0f);
                            applyAlphaInternal(fCascade);
                        }
                        canvas2.save();
                        float f14 = i4 >= 0 ? fLerp : this.currentWidth;
                        int i5 = this.gravity;
                        if ((i5 | (-4)) != -1) {
                            if ((i5 | (-6)) == -1) {
                                fM2 += iWidth - f14;
                            } else if ((i5 | (-2)) == -1) {
                                fM2 = ImageReceiver$$ExternalSyntheticOutline0.m(iWidth, f14, 2.0f, fM2);
                            } else if (this.isRTL && !this.ignoreRTL) {
                                fM2 += iWidth - f14;
                            }
                        }
                        canvas2.translate(fM2, f6);
                        StaticLayout staticLayout = part2.layout;
                        if (i4 < 0) {
                            float f15 = this.scaleAmplitude;
                            if (f15 > 0.0f) {
                                float fLerp3 = AndroidUtilities.lerp(f7 - f15, f7, this.t);
                                canvas2.scale(fLerp3, fLerp3, f9 / 2.0f, staticLayout.getHeight() / 2.0f);
                            }
                        }
                        float f16 = i4 >= 0 ? 1.0f : this.t;
                        staticLayout.draw(canvas2);
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, part2.layout, part2.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, f16, AnimatedTextDrawable.this.emojiColorFilter);
                        canvas2.restore();
                        i3++;
                        f7 = 1.0f;
                    }
                    int i6 = 0;
                    while (true) {
                        Part[] partArr2 = this.oldParts;
                        if (i6 >= partArr2.length) {
                            break;
                        }
                        Part part4 = partArr2[i6];
                        if (part4.toOppositeIndex >= 0) {
                            textPaint2 = textPaint;
                        } else {
                            float fCascade2 = this.t;
                            float f17 = this.animateWave;
                            if (f17 > 0.0f) {
                                fCascade2 = AndroidUtilities.cascade(fCascade2, i6, partArr2.length, f17);
                            }
                            float textSize = textPaint.getTextSize() * this.moveAmplitude * fCascade2 * (this.moveDown ? 1.0f : -1.0f);
                            float f18 = 1.0f - fCascade2;
                            applyAlphaInternal(f18);
                            canvas2.save();
                            boolean z4 = this.isRTL;
                            float f19 = part4.width;
                            float f20 = part4.offset;
                            if (z4 && !this.ignoreRTL) {
                                f20 = this.oldWidth - (f20 + f19);
                            }
                            float fM3 = f20 - part4.left;
                            int i7 = this.gravity;
                            if ((i7 | (-4)) != -1) {
                                if ((i7 | (-6)) == -1) {
                                    f4 = iWidth;
                                    f5 = this.oldWidth;
                                } else if ((i7 | (-2)) == -1) {
                                    fM3 = ImageReceiver$$ExternalSyntheticOutline0.m(iWidth, this.oldWidth, 2.0f, fM3);
                                } else if (z4 && !this.ignoreRTL) {
                                    f4 = iWidth;
                                    f5 = this.oldWidth;
                                }
                                fM3 += f4 - f5;
                            }
                            canvas2.translate(fM3, textSize);
                            float f21 = this.scaleAmplitude;
                            StaticLayout staticLayout2 = part4.layout;
                            if (f21 > 0.0f) {
                                float fLerp4 = AndroidUtilities.lerp(1.0f, 1.0f - f21, this.t);
                                canvas2.scale(fLerp4, fLerp4, f19 / 2.0f, staticLayout2.getHeight() / 2.0f);
                            }
                            staticLayout2.draw(canvas2);
                            textPaint2 = textPaint;
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, part4.layout, part4.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, f18, AnimatedTextDrawable.this.emojiColorFilter);
                            canvas2.restore();
                        }
                        i6++;
                        textPaint = textPaint2;
                    }
                } else {
                    if (this.centerY) {
                        canvas2.translate(0.0f, (iHeight - this.currentHeight) / 2.0f);
                    }
                    if (this.currentParts != null) {
                        applyAlphaInternal(1.0f);
                        i = 0;
                        while (i < this.currentParts.length) {
                            canvas2.save();
                            part = this.currentParts[i];
                            f = part.offset;
                            z = this.isRTL;
                            if (z) {
                                f = this.currentWidth - (f + part.width);
                            }
                            fM = f - part.left;
                            i2 = this.gravity;
                            if ((i2 | (-4)) != -1) {
                                if ((i2 | (-6)) == -1) {
                                    f2 = iWidth;
                                    f3 = this.currentWidth;
                                } else if ((i2 | (-2)) == -1) {
                                    fM = ImageReceiver$$ExternalSyntheticOutline0.m(iWidth, this.currentWidth, 2.0f, fM);
                                } else if (z) {
                                    f2 = iWidth;
                                    f3 = this.currentWidth;
                                }
                                fM += f2 - f3;
                            }
                            canvas2.translate(fM, 0.0f);
                            part.layout.draw(canvas2);
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, part.layout, part.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, AnimatedTextDrawable.this.emojiColorFilter);
                            canvas.restore();
                            i++;
                            canvas2 = canvas;
                        }
                    }
                }
            }
            canvas.restore();
            if (this.ellipsizeByGradient) {
                float fDp = AndroidUtilities.dp(16.0f);
                if (this.ellipsizeGradient == null) {
                    this.ellipsizeGradient = new LinearGradient(0.0f, 0.0f, fDp, 0.0f, new int[]{16711680, -65536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.ellipsizeGradientMatrix = new Matrix();
                    Paint paint = new Paint(1);
                    this.ellipsizePaint = paint;
                    paint.setShader(this.ellipsizeGradient);
                    this.ellipsizePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                }
                this.ellipsizeGradientMatrix.reset();
                this.ellipsizeGradientMatrix.postTranslate((rect.right - this.rightPadding) - fDp, 0.0f);
                this.ellipsizeGradient.setLocalMatrix(this.ellipsizeGradientMatrix);
                float f22 = rect.right - this.rightPadding;
                canvas.drawRect(f22 - fDp, rect.top, AndroidUtilities.dp(1.0f) + f22, rect.bottom, this.ellipsizePaint);
                canvas.restore();
            }
        }

        public final float getCurrentWidth() {
            return (this.currentParts == null || this.oldParts == null) ? this.currentWidth : AndroidUtilities.lerp(this.oldWidth, this.currentWidth, this.t);
        }

        @Override
        public final Rect getDirtyBounds() {
            return this.bounds;
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        public final boolean isAnimating() {
            ValueAnimator valueAnimator = this.animator;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        public final float isNotEmpty() {
            CharSequence charSequence = this.oldText;
            float f = 0.0f;
            float f2 = (charSequence == null || charSequence.length() <= 0) ? 0.0f : 1.0f;
            CharSequence charSequence2 = this.currentText;
            if (charSequence2 != null && charSequence2.length() > 0) {
                f = 1.0f;
            }
            return AndroidUtilities.lerp(f2, f, this.oldText != null ? this.t : 1.0f);
        }

        public final StaticLayout makeLayout(int i, CharSequence charSequence) {
            if (i <= 0) {
                Point point = AndroidUtilities.displaySize;
                i = Math.min(point.x, point.y);
            }
            int i2 = i;
            int i3 = Build.VERSION.SDK_INT;
            TextPaint textPaint = this.textPaint;
            if (i3 < 23) {
                return new StaticLayout(charSequence, 0, charSequence.length(), textPaint, i2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, this.includeFontPadding, TextUtils.TruncateAt.END, i2);
            }
            StaticLayout.Builder lineSpacing = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i2).setMaxLines(1).setLineSpacing(0.0f, 1.0f);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout.Builder alignment2 = lineSpacing.setAlignment(Layout.Alignment.ALIGN_NORMAL);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            return alignment2.setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i2).setIncludePad(this.includeFontPadding).build();
        }

        public final void part(RegionCallback regionCallback, CharSequence charSequence, int i, int i2) {
            if (!this.enforceByLetter || charSequence.length() <= 1) {
                regionCallback.run(charSequence);
                return;
            }
            int i3 = 0;
            while (i3 < charSequence.length()) {
                int i4 = i3 + 1;
                regionCallback.run(charSequence.subSequence(i3, i4));
                i3 = i4;
            }
        }

        @Override
        public final void setAlpha(int i) {
            this.alpha = i;
        }

        @Override
        public final void setBounds(Rect rect) {
            super.setBounds(rect);
            this.bounds.set(rect);
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
            this.textPaint.setColorFilter(colorFilter);
        }

        public final void setHacks(boolean z, boolean z2) {
            this.splitByWords = z;
            this.preserveIndex = true;
            this.startFromEnd = z2;
            this.enforceByLetter = false;
        }

        public final void setShadowLayer(float f, float f2, int i) {
            this.shadowed = true;
            TextPaint textPaint = this.textPaint;
            this.shadowRadius = f;
            this.shadowDy = f2;
            this.shadowColor = i;
            textPaint.setShadowLayer(f, 0.0f, f2, i);
        }

        public final void setText(CharSequence charSequence, boolean z, boolean z2) {
            int i;
            final int i2 = 1;
            final int i3 = 0;
            boolean z3 = (this.currentText == null || charSequence == null) ? false : z;
            CharSequence charSequence2 = charSequence == null ? "" : charSequence;
            int iWidth = this.overrideFullWidth;
            if (iWidth <= 0) {
                iWidth = this.bounds.width();
            }
            if (!z3) {
                ValueAnimator valueAnimator = this.animator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.animator = null;
                this.toSetText = null;
                this.toSetTextMoveDown = false;
                this.t = 0.0f;
                if (!charSequence2.equals(this.currentText)) {
                    if (this.oldParts != null) {
                        int i4 = 0;
                        while (true) {
                            Part[] partArr = this.oldParts;
                            if (i4 >= partArr.length) {
                                break;
                            }
                            partArr[i4].detach();
                            i4++;
                        }
                    }
                    this.oldParts = null;
                    this.currentParts = new Part[]{new Part(makeLayout(iWidth, charSequence2), 0.0f, -1)};
                    this.currentText = charSequence2;
                    Part part = this.currentParts[0];
                    this.currentWidth = part.width;
                    this.currentHeight = part.layout.getHeight();
                    this.isRTL = AndroidUtilities.isRTL(this.currentText);
                }
                clearOldParts();
                this.oldText = null;
                this.oldWidth = 0.0f;
                this.oldHeight = 0.0f;
                invalidateSelf();
                Runnable runnable = this.widthUpdatedListener;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            if (TextUtils.equals(charSequence2, this.currentText)) {
                return;
            }
            if (this.allowCancel) {
                ValueAnimator valueAnimator2 = this.animator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.animator = null;
                }
            } else if (isAnimating()) {
                this.toSetText = charSequence2;
                this.toSetTextMoveDown = z2;
                return;
            }
            this.oldText = this.currentText;
            this.currentText = charSequence2;
            final ArrayList arrayList = new ArrayList();
            final int i5 = iWidth;
            final ArrayList arrayList2 = new ArrayList();
            this.currentHeight = 0.0f;
            this.currentWidth = 0.0f;
            this.oldHeight = 0.0f;
            this.oldWidth = 0.0f;
            this.isRTL = AndroidUtilities.isRTL(this.currentText);
            VoIPFragment$$ExternalSyntheticLambda37 voIPFragment$$ExternalSyntheticLambda37 = new VoIPFragment$$ExternalSyntheticLambda37(this, i5, arrayList2, arrayList, 3);
            RegionCallback regionCallback = new RegionCallback(this) {
                public final AnimatedTextView.AnimatedTextDrawable f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(CharSequence charSequence3) {
                    switch (i3) {
                        case 0:
                            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.f$0;
                            StaticLayout staticLayoutMakeLayout = animatedTextDrawable.makeLayout(i5 - ((int) Math.ceil(animatedTextDrawable.currentWidth)), charSequence3);
                            AnimatedTextView.AnimatedTextDrawable.Part part2 = animatedTextDrawable.new Part(staticLayoutMakeLayout, animatedTextDrawable.currentWidth, -1);
                            arrayList.add(part2);
                            animatedTextDrawable.currentWidth += part2.width;
                            animatedTextDrawable.currentHeight = Math.max(animatedTextDrawable.currentHeight, staticLayoutMakeLayout.getHeight());
                            break;
                        default:
                            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.f$0;
                            StaticLayout staticLayoutMakeLayout2 = animatedTextDrawable2.makeLayout(i5 - ((int) Math.ceil(animatedTextDrawable2.oldWidth)), charSequence3);
                            AnimatedTextView.AnimatedTextDrawable.Part part3 = animatedTextDrawable2.new Part(staticLayoutMakeLayout2, animatedTextDrawable2.oldWidth, -1);
                            arrayList.add(part3);
                            animatedTextDrawable2.oldWidth += part3.width;
                            animatedTextDrawable2.oldHeight = Math.max(animatedTextDrawable2.oldHeight, staticLayoutMakeLayout2.getHeight());
                            break;
                    }
                }
            };
            RegionCallback regionCallback2 = new RegionCallback(this) {
                public final AnimatedTextView.AnimatedTextDrawable f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(CharSequence charSequence3) {
                    switch (i2) {
                        case 0:
                            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.f$0;
                            StaticLayout staticLayoutMakeLayout = animatedTextDrawable.makeLayout(i5 - ((int) Math.ceil(animatedTextDrawable.currentWidth)), charSequence3);
                            AnimatedTextView.AnimatedTextDrawable.Part part2 = animatedTextDrawable.new Part(staticLayoutMakeLayout, animatedTextDrawable.currentWidth, -1);
                            arrayList2.add(part2);
                            animatedTextDrawable.currentWidth += part2.width;
                            animatedTextDrawable.currentHeight = Math.max(animatedTextDrawable.currentHeight, staticLayoutMakeLayout.getHeight());
                            break;
                        default:
                            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.f$0;
                            StaticLayout staticLayoutMakeLayout2 = animatedTextDrawable2.makeLayout(i5 - ((int) Math.ceil(animatedTextDrawable2.oldWidth)), charSequence3);
                            AnimatedTextView.AnimatedTextDrawable.Part part3 = animatedTextDrawable2.new Part(staticLayoutMakeLayout2, animatedTextDrawable2.oldWidth, -1);
                            arrayList2.add(part3);
                            animatedTextDrawable2.oldWidth += part3.width;
                            animatedTextDrawable2.oldHeight = Math.max(animatedTextDrawable2.oldHeight, staticLayoutMakeLayout2.getHeight());
                            break;
                    }
                }
            };
            CharSequence wordSequence = this.splitByWords ? new WordSequence(this.oldText) : this.oldText;
            CharSequence wordSequence2 = this.splitByWords ? new WordSequence(this.currentText) : this.currentText;
            if (this.updateAll) {
                part(regionCallback2, wordSequence, 0, wordSequence.length());
                part(regionCallback, wordSequence2, 0, wordSequence2.length());
            } else if (this.preserveIndex) {
                int iMin = Math.min(wordSequence2.length(), wordSequence.length());
                if (this.startFromEnd) {
                    ArrayList arrayList3 = new ArrayList();
                    boolean z4 = true;
                    boolean z5 = true;
                    int i6 = 0;
                    for (int i7 = 0; i7 <= iMin; i7++) {
                        int length = (wordSequence2.length() - i7) - 1;
                        int length2 = (wordSequence.length() - i7) - 1;
                        boolean z6 = length >= 0 && length2 >= 0 && partEquals(length, length2, wordSequence2, wordSequence);
                        if (z4 != z6 || i7 == iMin) {
                            int i8 = i7 - i6;
                            if (i8 > 0) {
                                if (arrayList3.size() != 0) {
                                    z4 = z5;
                                }
                                arrayList3.add(Integer.valueOf(i8));
                                z5 = z4;
                            }
                            i6 = i7;
                            z4 = z6;
                        }
                    }
                    int length3 = wordSequence2.length() - iMin;
                    int length4 = wordSequence.length() - iMin;
                    if (length3 > 0) {
                        part(regionCallback, wordSequence2.subSequence(0, length3), 0, length3);
                    }
                    if (length4 > 0) {
                        part(regionCallback2, wordSequence.subSequence(0, length4), 0, length4);
                    }
                    int size = arrayList3.size() - 1;
                    while (size >= 0) {
                        int iIntValue = ((Integer) arrayList3.get(size)).intValue();
                        if ((size % 2 == 0) == z5) {
                            i = size;
                            if (wordSequence2.length() > wordSequence.length()) {
                                voIPFragment$$ExternalSyntheticLambda37.run(wordSequence2.subSequence(length3, length3 + iIntValue));
                            } else {
                                voIPFragment$$ExternalSyntheticLambda37.run(wordSequence.subSequence(length4, length4 + iIntValue));
                            }
                        } else {
                            i = size;
                            int i9 = length3 + iIntValue;
                            part(regionCallback, wordSequence2.subSequence(length3, i9), length3, i9);
                            int i10 = length4 + iIntValue;
                            part(regionCallback2, wordSequence.subSequence(length4, i10), length4, i10);
                        }
                        length3 += iIntValue;
                        length4 += iIntValue;
                        size = i - 1;
                    }
                } else {
                    int i11 = 0;
                    int i12 = 0;
                    boolean z7 = true;
                    while (i11 <= iMin) {
                        boolean z8 = i11 < iMin && partEquals(i11, i11, wordSequence2, wordSequence);
                        if (z7 != z8 || i11 == iMin) {
                            if (i11 - i12 > 0) {
                                if (z7) {
                                    part(voIPFragment$$ExternalSyntheticLambda37, wordSequence2.subSequence(i12, i11), i12, i11);
                                } else {
                                    part(regionCallback, wordSequence2.subSequence(i12, i11), i12, i11);
                                    part(regionCallback2, wordSequence.subSequence(i12, i11), i12, i11);
                                }
                            }
                            i12 = i11;
                            z7 = z8;
                        }
                        i11++;
                    }
                    if (wordSequence2.length() - iMin > 0) {
                        part(regionCallback, wordSequence2.subSequence(iMin, wordSequence2.length()), iMin, wordSequence2.length());
                    }
                    if (wordSequence.length() - iMin > 0) {
                        part(regionCallback2, wordSequence.subSequence(iMin, wordSequence.length()), iMin, wordSequence.length());
                    }
                }
            } else {
                int iMin2 = Math.min(wordSequence2.length(), wordSequence.length());
                int length5 = 0;
                int length6 = 0;
                int i13 = 0;
                int i14 = 0;
                boolean z9 = true;
                while (length5 <= iMin2) {
                    boolean z10 = length5 < iMin2 && partEquals(length5, length6, wordSequence2, wordSequence);
                    if (z9 != z10 || length5 == iMin2) {
                        if (length5 == iMin2) {
                            length5 = wordSequence2.length();
                            length6 = wordSequence.length();
                        }
                        int i15 = length5 - i13;
                        boolean z11 = z9;
                        int i16 = length6 - i14;
                        if (i15 > 0 || i16 > 0) {
                            if (i15 == i16 && z11) {
                                voIPFragment$$ExternalSyntheticLambda37.run(wordSequence2.subSequence(i13, length5));
                            } else {
                                if (i15 > 0) {
                                    part(regionCallback, wordSequence2.subSequence(i13, length5), i13, length5);
                                }
                                if (i16 > 0) {
                                    part(regionCallback2, wordSequence.subSequence(i14, length6), i14, length6);
                                }
                            }
                        }
                        i13 = length5;
                        i14 = length6;
                        z9 = z10;
                    }
                    if (z10) {
                        length6++;
                    }
                    length5++;
                    iMin2 = iMin2;
                }
            }
            if (this.oldParts != null) {
                int i17 = 0;
                while (true) {
                    Part[] partArr2 = this.oldParts;
                    if (i17 >= partArr2.length) {
                        break;
                    }
                    partArr2[i17].detach();
                    i17++;
                }
            }
            this.oldParts = null;
            Part[] partArr3 = this.currentParts;
            if (partArr3 == null || partArr3.length != arrayList.size()) {
                this.currentParts = new Part[arrayList.size()];
            }
            arrayList.toArray(this.currentParts);
            clearOldParts();
            Part[] partArr4 = this.oldParts;
            if (partArr4 == null || partArr4.length != arrayList2.size()) {
                this.oldParts = new Part[arrayList2.size()];
            }
            arrayList2.toArray(this.oldParts);
            ValueAnimator valueAnimator3 = this.animator;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            this.moveDown = z2;
            this.t = 0.0f;
            this.animator = ValueAnimator.ofFloat(0.0f, 1.0f);
            Runnable runnable2 = this.widthUpdatedListener;
            if (runnable2 != null) {
                runnable2.run();
            }
            this.animator.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 18));
            this.animator.addListener(new CheckBox.AnonymousClass1(this, 7));
            this.animator.setStartDelay(0L);
            this.animator.setDuration(this.animateDuration);
            this.animator.setInterpolator(this.animateInterpolator);
            this.animator.start();
        }

        public final void setTextColor(int i, boolean z) {
            int i2 = 2;
            ValueAnimator valueAnimator = this.colorAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.colorAnimator = null;
            }
            TextPaint textPaint = this.textPaint;
            if (!z) {
                textPaint.setColor(i);
                this.alpha = Color.alpha(i);
                return;
            }
            int color = textPaint.getColor();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.colorAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new GroupCallUserCell$$ExternalSyntheticLambda0(this, color, i, 1));
            this.colorAnimator.addListener(new ArticleViewer.AnonymousClass3(this, i, i2));
            this.colorAnimator.setDuration(240L);
            this.colorAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.colorAnimator.start();
        }

        public final void setTextSize(float f) {
            TextPaint textPaint = this.textPaint;
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(f);
            if (Math.abs(textSize - f) > 0.5f) {
                int iWidth = this.overrideFullWidth;
                if (iWidth <= 0) {
                    iWidth = this.bounds.width();
                }
                int i = 0;
                if (this.currentParts != null) {
                    this.currentWidth = 0.0f;
                    this.currentHeight = 0.0f;
                    int i2 = 0;
                    while (true) {
                        Part[] partArr = this.currentParts;
                        if (i2 >= partArr.length) {
                            break;
                        }
                        StaticLayout staticLayoutMakeLayout = makeLayout(iWidth - ((int) Math.ceil(Math.min(this.currentWidth, this.oldWidth))), partArr[i2].layout.getText());
                        Part[] partArr2 = this.currentParts;
                        Part part = partArr2[i2];
                        partArr2[i2] = new Part(staticLayoutMakeLayout, part.offset, part.toOppositeIndex);
                        float f2 = this.currentWidth;
                        Part part2 = this.currentParts[i2];
                        this.currentWidth = f2 + part2.width;
                        this.currentHeight = Math.max(this.currentHeight, part2.layout.getHeight());
                        i2++;
                    }
                }
                if (this.oldParts != null) {
                    this.oldWidth = 0.0f;
                    this.oldHeight = 0.0f;
                    while (true) {
                        Part[] partArr3 = this.oldParts;
                        if (i >= partArr3.length) {
                            break;
                        }
                        StaticLayout staticLayoutMakeLayout2 = makeLayout(iWidth - ((int) Math.ceil(Math.min(this.currentWidth, this.oldWidth))), partArr3[i].layout.getText());
                        Part[] partArr4 = this.oldParts;
                        Part part3 = partArr4[i];
                        partArr4[i] = new Part(staticLayoutMakeLayout2, part3.offset, part3.toOppositeIndex);
                        float f3 = this.oldWidth;
                        Part part4 = this.oldParts[i];
                        this.oldWidth = f3 + part4.width;
                        this.oldHeight = Math.max(this.oldHeight, part4.layout.getHeight());
                        i++;
                    }
                }
                invalidateSelf();
            }
        }

        public AnimatedTextDrawable(boolean z, boolean z2, boolean z3, boolean z4) {
            this.textPaint = new TextPaint(1);
            this.gravity = 0;
            this.isRTL = false;
            this.emojiCacheType = 0;
            this.t = 0.0f;
            this.moveDown = true;
            this.animateDuration = 320L;
            this.animateInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.animateWave = -1.0f;
            this.moveAmplitude = 0.3f;
            this.scaleAmplitude = 0.0f;
            this.alpha = 255;
            this.bounds = new Rect();
            this.includeFontPadding = true;
            this.centerY = true;
            this.shadowed = false;
            this.splitByWords = z;
            this.preserveIndex = z2;
            this.startFromEnd = z3;
            this.enforceByLetter = z4;
        }

        public final void setBounds(RectF rectF) {
            int i = (int) rectF.left;
            int i2 = (int) rectF.top;
            int i3 = (int) rectF.right;
            int i4 = (int) rectF.bottom;
            super.setBounds(i, i2, i3, i4);
            this.bounds.set(i, i2, i3, i4);
        }

        @Override
        public final void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4);
            this.bounds.set(i, i2, i3, i4);
        }

        public final void setBounds(float f, float f2, float f3, float f4) {
            int i = (int) f;
            int i2 = (int) f2;
            int i3 = (int) f3;
            int i4 = (int) f4;
            super.setBounds(i, i2, i3, i4);
            this.bounds.set(i, i2, i3, i4);
        }
    }

    public AnimatedTextView(Context context, boolean z, boolean z2, boolean z3) {
        super(context);
        this.adaptWidth = true;
        this.first = true;
        AnimatedTextDrawable animatedTextDrawable = new AnimatedTextDrawable(z, z2, z3, false);
        this.drawable = animatedTextDrawable;
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.onAnimationFinishListener = new Bulletin$2$$ExternalSyntheticLambda1(this, 1);
    }

    public AnimatedTextDrawable getDrawable() {
        return this.drawable;
    }

    public TextPaint getPaint() {
        return this.drawable.textPaint;
    }

    public float getRightPadding() {
        return this.drawable.rightPadding;
    }

    public Drawable getSizeableBackground() {
        return this.backgroundDrawable;
    }

    public CharSequence getText() {
        return this.drawable.currentText;
    }

    public int getTextColor() {
        return this.drawable.textPaint.getColor();
    }

    public int getTextHeight() {
        return getPaint().getFontMetricsInt().descent - getPaint().getFontMetricsInt().ascent;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable = this.backgroundDrawable;
        AnimatedTextDrawable animatedTextDrawable = this.drawable;
        if (drawable != null && (!this.hideBackgroundIfEmpty || animatedTextDrawable.isNotEmpty() > 0.0f)) {
            int currentWidth = (int) (animatedTextDrawable.getCurrentWidth() + getPaddingLeft() + getPaddingRight());
            if ((animatedTextDrawable.gravity & 7) == 5) {
                this.backgroundDrawable.setBounds(getWidth() - currentWidth, 0, getWidth(), getHeight());
            } else {
                this.backgroundDrawable.setBounds(0, 0, currentWidth, getHeight());
            }
            this.backgroundDrawable.draw(canvas);
        }
        animatedTextDrawable.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        animatedTextDrawable.draw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(getText());
    }

    @Override
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.maxWidth;
        if (i3 > 0) {
            size = Math.min(size, i3);
        }
        int i4 = this.lastMaxWidth;
        AnimatedTextDrawable animatedTextDrawable = this.drawable;
        if (i4 != size && getLayoutParams().width != 0) {
            animatedTextDrawable.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            animatedTextDrawable.setText(animatedTextDrawable.currentText, false, true);
        }
        this.lastMaxWidth = size;
        if (this.adaptWidth && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(Math.max(animatedTextDrawable.currentWidth, animatedTextDrawable.oldWidth)));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z) {
        this.drawable.allowCancel = z;
    }

    public final void setAnimationProperties(CubicBezierInterpolator cubicBezierInterpolator) {
        AnimatedTextDrawable animatedTextDrawable = this.drawable;
        animatedTextDrawable.moveAmplitude = 0.4f;
        animatedTextDrawable.animateDuration = 320L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
    }

    public void setEllipsizeByGradient(boolean z) {
        AnimatedTextDrawable animatedTextDrawable = this.drawable;
        animatedTextDrawable.ellipsizeByGradient = z;
        animatedTextDrawable.invalidateSelf();
    }

    public void setEmojiCacheType(int i) {
        this.drawable.emojiCacheType = i;
    }

    public void setEmojiColor(int i) {
        AnimatedTextDrawable animatedTextDrawable = this.drawable;
        if (animatedTextDrawable.emojiColor != i) {
            animatedTextDrawable.emojiColor = i;
            animatedTextDrawable.emojiColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.drawable.emojiColorFilter = colorFilter;
        invalidate();
    }

    public void setGravity(int i) {
        this.drawable.gravity = i;
    }

    public void setHideBackgroundIfEmpty(boolean z) {
        this.hideBackgroundIfEmpty = z;
    }

    public void setIgnoreRTL(boolean z) {
        this.drawable.ignoreRTL = z;
    }

    public void setIncludeFontPadding(boolean z) {
        this.drawable.includeFontPadding = z;
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.drawable.widthUpdatedListener = runnable;
    }

    public void setRightPadding(float f) {
        AnimatedTextDrawable animatedTextDrawable = this.drawable;
        animatedTextDrawable.rightPadding = f;
        animatedTextDrawable.invalidateSelf();
    }

    public void setScaleProperty(float f) {
        this.drawable.scaleAmplitude = f;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.backgroundDrawable = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        setText(charSequence, true, true);
    }

    public void setTextColor(int i) {
        AnimatedTextDrawable animatedTextDrawable = this.drawable;
        animatedTextDrawable.textPaint.setColor(i);
        animatedTextDrawable.alpha = Color.alpha(i);
        invalidate();
    }

    public void setTextSize(float f) {
        this.drawable.setTextSize(f);
    }

    public void setTypeface(Typeface typeface) {
        this.drawable.textPaint.setTypeface(typeface);
    }

    public final void setText(CharSequence charSequence, boolean z, boolean z2) {
        boolean z3 = !this.first && z;
        this.first = false;
        AnimatedTextDrawable animatedTextDrawable = this.drawable;
        if (z3 && !TextUtils.equals(charSequence, animatedTextDrawable.currentText)) {
            if (animatedTextDrawable.allowCancel) {
                ValueAnimator valueAnimator = animatedTextDrawable.animator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    animatedTextDrawable.animator = null;
                }
            } else if (animatedTextDrawable.isAnimating()) {
                this.toSetText = charSequence;
                this.toSetMoveDown = z2;
                return;
            }
        }
        int iMax = (int) Math.max(animatedTextDrawable.currentWidth, animatedTextDrawable.oldWidth);
        animatedTextDrawable.setBounds(getPaddingLeft(), getPaddingTop(), this.lastMaxWidth - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        animatedTextDrawable.setText(charSequence, z3, z2);
        float f = iMax;
        if (f < Math.max(animatedTextDrawable.currentWidth, animatedTextDrawable.oldWidth) || !(z3 || f == Math.max(animatedTextDrawable.currentWidth, animatedTextDrawable.oldWidth))) {
            requestLayout();
        }
    }
}
