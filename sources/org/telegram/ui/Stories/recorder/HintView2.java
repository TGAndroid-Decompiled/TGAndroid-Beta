package org.telegram.ui.Stories.recorder;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ReplacementSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda127;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda4;
import org.telegram.ui.WebviewActivity;

public class HintView2 extends View {
    public float arrowHalfWidth;
    public float arrowHeight;
    public float arrowX;
    public float arrowY;
    public final Paint backgroundPaint;
    public final ButtonBounce bounce;
    public ValueAnimator bounceAnimator;
    public float bounceT;
    public final RectF bounds;
    public final Rect boundsWithArrow;
    public boolean closeButton;
    public Drawable closeButtonDrawable;
    public float closeButtonMargin;
    public Paint cutSelectorPaint;
    public int direction;
    public long duration;
    public AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans;
    public boolean firstDraw;
    public boolean flicker;
    public final RectF flickerBounds;
    public Paint flickerFillPaint;
    public LinearGradient flickerGradient;
    public Matrix flickerGradientMatrix;
    public long flickerStart;
    public LinearGradient flickerStrokeGradient;
    public Paint flickerStrokePaint;
    public Path flickerStrokePath;
    public float flickerStrokePathExtrude;
    public boolean hideByTouch;
    public final PhotoViewer$$ExternalSyntheticLambda127 hideRunnable;
    public RLottieDrawable icon;
    public int iconHeight;
    public boolean iconLeft;
    public int iconMargin;
    public float iconTy;
    public int iconWidth;
    public final RectF innerPadding;
    public float joint;
    public float jointTranslate;
    public final LinkSpanDrawable.LinkCollector links;
    public boolean multiline;
    public Runnable onHidden;
    public final RectF oval;
    public final Path path;
    public float pathLastHeight;
    public float pathLastWidth;
    public boolean pathSet;
    public LinkSpanDrawable pressedLink;
    public boolean repeatedBounce;
    public boolean roundWithCornerEffect;
    public float rounding;
    public BaseCell.RippleDrawableSafe selectorDrawable;
    public int shadowColor;
    public float shadowDy;
    public float shadowRadius;
    public final AnimatedFloat show;
    public boolean shown;
    public final AnimatedTextView.AnimatedTextDrawable textDrawable;
    public StaticLayout textLayout;
    public Layout.Alignment textLayoutAlignment;
    public float textLayoutHeight;
    public float textLayoutLeft;
    public float textLayoutWidth;
    public int textMaxWidth;
    public final TextPaint textPaint;
    public CharSequence textToSet;
    public float textX;
    public float textY;
    public final boolean useAlpha;
    public boolean useScale;

    public HintView2(Context context, int i) {
        super(context);
        this.joint = 0.5f;
        this.jointTranslate = 0.0f;
        this.duration = 3500L;
        this.useScale = true;
        this.useAlpha = true;
        this.textMaxWidth = -1;
        this.roundWithCornerEffect = true;
        this.rounding = AndroidUtilities.dp(8.0f);
        this.innerPadding = new RectF(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(7.0f));
        this.closeButtonMargin = AndroidUtilities.dp(2.0f);
        this.arrowHalfWidth = AndroidUtilities.dp(7.0f);
        this.arrowHeight = AndroidUtilities.dp(6.0f);
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.textLayoutAlignment = Layout.Alignment.ALIGN_NORMAL;
        this.links = new LinkSpanDrawable.LinkCollector();
        this.hideByTouch = true;
        this.repeatedBounce = true;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.show = new AnimatedFloat(350L, this, cubicBezierInterpolator);
        this.iconMargin = AndroidUtilities.dp(2.0f);
        this.hideRunnable = new PhotoViewer$$ExternalSyntheticLambda127(this, 3);
        this.bounceT = 1.0f;
        this.bounce = new ButtonBounce(this, 2.0f, 5.0f);
        this.boundsWithArrow = new Rect();
        this.bounds = new RectF();
        this.flickerBounds = new RectF();
        this.path = new Path();
        this.firstDraw = true;
        this.oval = new RectF();
        this.direction = i;
        paint.setColor(-433575896);
        paint.setPathEffect(new CornerPathEffect(this.rounding));
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, false, false);
        this.textDrawable = animatedTextDrawable;
        animatedTextDrawable.moveAmplitude = 0.4f;
        animatedTextDrawable.animateDuration = 320L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.setTextSize(AndroidUtilities.dpf2(14.0f));
        textPaint.setTextSize(AndroidUtilities.dpf2(14.0f));
        animatedTextDrawable.textPaint.setColor(-1);
        animatedTextDrawable.alpha = Color.alpha(-1);
        textPaint.setColor(-1);
    }

    public static int cutInFancyHalf(CharSequence charSequence, TextPaint textPaint) {
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return Integer.MAX_VALUE;
        }
        int length = charSequence.length() / 2;
        float f = 0.0f;
        float fMeasureCorrectly = 0.0f;
        float fMeasureCorrectly2 = 0.0f;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = -1;
        while (i < 10) {
            while (length > 0 && length < charSequence.length() && charSequence.charAt(length) != ' ') {
                length += i2;
            }
            fMeasureCorrectly = measureCorrectly(charSequence.subSequence(0, length), textPaint);
            fMeasureCorrectly2 = measureCorrectly(AndroidUtilities.getTrimmedString(charSequence.subSequence(length, charSequence.length())), textPaint);
            if (fMeasureCorrectly == f && fMeasureCorrectly2 == f2) {
                break;
            }
            if (fMeasureCorrectly < fMeasureCorrectly2) {
                length++;
                i2 = 1;
            } else {
                length--;
                i2 = -1;
            }
            if (length <= 0 || length >= charSequence.length()) {
                break;
            }
            i++;
            f = fMeasureCorrectly;
            f2 = fMeasureCorrectly2;
        }
        return (int) Math.ceil(Math.max(fMeasureCorrectly, fMeasureCorrectly2));
    }

    public static CharSequence cutInFancyHalfText(CharSequence charSequence, TextPaint textPaint) {
        int i;
        int i2;
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return charSequence;
        }
        int length = charSequence.length() / 2;
        int i3 = length;
        float f = 0.0f;
        float f2 = Float.MAX_VALUE;
        int i4 = 0;
        int i5 = -1;
        while (i4 < 10) {
            i3 = length;
            while (i3 > 0 && i3 < charSequence.length() && charSequence.charAt(i3) != ' ') {
                i3 += i5;
            }
            float fMeasureCorrectly = measureCorrectly(charSequence.subSequence(0, i3), textPaint);
            float fMeasureCorrectly2 = measureCorrectly(AndroidUtilities.getTrimmedString(charSequence.subSequence(i3, charSequence.length())), textPaint);
            if (fMeasureCorrectly == f && fMeasureCorrectly2 == f2) {
                break;
            }
            if (fMeasureCorrectly < fMeasureCorrectly2) {
                i = i3 + 1;
                i2 = 1;
            } else {
                i = i3 - 1;
                i2 = -1;
            }
            if (i <= 0 || i >= charSequence.length()) {
                return charSequence;
            }
            i4++;
            int i6 = i;
            f = fMeasureCorrectly;
            length = i6;
            i5 = i2;
            f2 = fMeasureCorrectly2;
        }
        return TextUtils.concat(AndroidUtilities.getTrimmedString(charSequence.subSequence(0, i3)), "\n", AndroidUtilities.getTrimmedString(charSequence.subSequence(i3, charSequence.length())));
    }

    private int getTextMaxWidth() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        RectF rectF = this.innerPadding;
        int iMin = measuredWidth - ((int) (rectF.left + rectF.right));
        int i = this.textMaxWidth;
        if (i > 0) {
            iMin = Math.min(i, iMin);
        }
        return Math.max(0, iMin);
    }

    public static float measureCorrectly(CharSequence charSequence, TextPaint textPaint) {
        float fMeasureText = 0.0f;
        if (charSequence == null) {
            return 0.0f;
        }
        if (!(charSequence instanceof Spanned)) {
            return textPaint.measureText(charSequence.toString());
        }
        Spanned spanned = (Spanned) charSequence;
        TypefaceSpan[] typefaceSpanArr = (TypefaceSpan[]) spanned.getSpans(0, charSequence.length(), TypefaceSpan.class);
        ReplacementSpan[] replacementSpanArr = (ReplacementSpan[]) spanned.getSpans(0, charSequence.length(), ReplacementSpan.class);
        int i = 0;
        int iMax = 0;
        TextPaint textPaint2 = textPaint;
        while (i < replacementSpanArr.length) {
            ReplacementSpan replacementSpan = replacementSpanArr[i];
            int spanStart = spanned.getSpanStart(replacementSpan);
            int spanEnd = spanned.getSpanEnd(replacementSpan);
            CharSequence charSequence2 = charSequence;
            TextPaint textPaint3 = textPaint2;
            iMax = (int) (Math.max(0.0f, replacementSpan.getSize(textPaint3, charSequence2, spanStart, spanEnd, textPaint2.getFontMetricsInt()) - textPaint3.measureText(spanned, spanStart, spanEnd)) + iMax);
            i++;
            textPaint2 = textPaint3;
            charSequence = charSequence2;
        }
        CharSequence charSequence3 = charSequence;
        TextPaint textPaint4 = textPaint2;
        if (typefaceSpanArr == null || typefaceSpanArr.length == 0) {
            return textPaint4.measureText(charSequence3.toString()) + iMax;
        }
        int iMax2 = 0;
        for (int i2 = 0; i2 < typefaceSpanArr.length; i2++) {
            int spanStart2 = spanned.getSpanStart(typefaceSpanArr[i2]);
            int spanEnd2 = spanned.getSpanEnd(typefaceSpanArr[i2]);
            int iMax3 = Math.max(iMax2, spanStart2);
            if (iMax3 - iMax2 > 0) {
                fMeasureText += textPaint4.measureText(spanned, iMax2, iMax3);
            }
            iMax2 = Math.max(iMax3, spanEnd2);
            if (iMax2 - iMax3 > 0) {
                Typeface typeface = textPaint4.getTypeface();
                textPaint4.setTypeface(typefaceSpanArr[i2].typeface);
                float fMeasureText2 = textPaint4.measureText(spanned, iMax3, iMax2) + fMeasureText;
                textPaint4.setTypeface(typeface);
                fMeasureText = fMeasureText2;
            }
        }
        int iMax4 = Math.max(iMax2, charSequence3.length());
        if (iMax4 - iMax2 > 0) {
            fMeasureText += textPaint4.measureText(spanned, iMax2, iMax4);
        }
        return fMeasureText + iMax;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        RectF rectF;
        float f;
        float f2;
        HintView2 hintView2;
        float f3;
        Canvas canvas2;
        if (this.multiline && this.textLayout == null) {
            return;
        }
        float f4 = this.show.set(this.shown && !this.firstDraw);
        if (this.firstDraw) {
            this.firstDraw = false;
            invalidate();
        }
        if (f4 <= 0.0f) {
            return;
        }
        boolean z = this.multiline;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.textDrawable;
        float currentWidth = z ? this.textLayoutWidth : animatedTextDrawable.getCurrentWidth();
        float fMax = this.multiline ? this.textLayoutHeight : animatedTextDrawable.currentHeight;
        if (this.closeButton) {
            if (this.closeButtonDrawable == null) {
                Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                this.closeButtonDrawable = drawableMutate;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
            }
            currentWidth += this.closeButtonMargin + this.closeButtonDrawable.getIntrinsicWidth();
            fMax = Math.max(this.closeButtonDrawable.getIntrinsicHeight(), fMax);
        }
        if (this.icon != null) {
            currentWidth += this.iconWidth + this.iconMargin;
            fMax = Math.max(this.iconHeight, fMax);
        }
        float f5 = currentWidth;
        RectF rectF2 = this.innerPadding;
        float f6 = rectF2.left + f5 + rectF2.right;
        float f7 = rectF2.top + fMax + rectF2.bottom;
        boolean z2 = this.pathSet;
        RectF rectF3 = this.bounds;
        if (!z2 || Math.abs(f6 - this.pathLastWidth) > 0.1f || Math.abs(f7 - this.pathLastHeight) > 0.1f) {
            Path path = this.path;
            this.pathLastWidth = f6;
            this.pathLastHeight = f7;
            fillPath(path, f6, f7, 0.0f, rectF3, this.boundsWithArrow);
            rectF = rectF3;
            if (this.flicker) {
                fillPath(this.flickerStrokePath, f6, f7, this.flickerStrokePathExtrude, this.flickerBounds, null);
            }
        } else {
            rectF = rectF3;
        }
        float f8 = this.useAlpha ? f4 : 1.0f;
        canvas.save();
        if (f4 < 1.0f && this.useScale) {
            float fLerp = AndroidUtilities.lerp(0.75f, 1.0f, f4);
            canvas.scale(fLerp, fLerp, this.arrowX, this.arrowY);
        }
        float scale = this.bounce.getScale(0.025f);
        if (scale != 1.0f) {
            canvas.scale(scale, scale, this.arrowX, this.arrowY);
        }
        if (this.bounceT != 1.0f) {
            int i = this.direction;
            if (i == 3 || i == 1) {
                canvas.translate(0.0f, (this.bounceT - 1.0f) * Math.max(i == 3 ? getPaddingBottom() : getPaddingTop(), AndroidUtilities.dp(24.0f)) * (this.direction != 1 ? 1 : -1));
            } else {
                canvas.translate((this.bounceT - 1.0f) * Math.max(i == 0 ? getPaddingLeft() : getPaddingRight(), AndroidUtilities.dp(24.0f)) * (this.direction != 0 ? 1 : -1), 0.0f);
            }
        }
        RectF rectF4 = AndroidUtilities.rectTmp;
        rectF4.set(rectF);
        float f9 = -this.arrowHeight;
        rectF4.inset(f9, f9);
        drawBgPath(canvas, f8);
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectorDrawable;
        if (rippleDrawableSafe != null) {
            rippleDrawableSafe.setAlpha((int) (f8 * 255.0f));
            this.selectorDrawable.setBounds(this.boundsWithArrow);
            this.selectorDrawable.draw(canvas);
        }
        float f10 = ((rectF.top + rectF2.top) + (rectF.bottom - rectF2.bottom)) / 2.0f;
        RLottieDrawable rLottieDrawable = this.icon;
        if (rLottieDrawable != null) {
            if (this.iconLeft) {
                float f11 = (rectF2.left / 2.0f) + rectF.left + 0.0f;
                float f12 = this.iconTy + f10;
                f = 255.0f;
                float f13 = this.iconHeight / 2.0f;
                rLottieDrawable.setBounds((int) f11, (int) (f12 - f13), (int) (f11 + this.iconWidth), (int) (f13 + f12));
                f2 = this.iconWidth + this.iconMargin + 0.0f;
            } else {
                f = 255.0f;
                float f14 = (rectF.right + 0.0f) - (rectF2.right / 2.0f);
                int i2 = (int) (f14 - this.iconWidth);
                float f15 = this.iconTy + f10;
                float f16 = this.iconHeight / 2.0f;
                rLottieDrawable.setBounds(i2, (int) (f15 - f16), (int) f14, (int) (f16 + f15));
                f2 = 0.0f;
            }
            this.icon.setAlpha((int) (f8 * f));
            this.icon.draw(canvas);
        } else {
            f = 255.0f;
            f2 = 0.0f;
        }
        if (this.multiline) {
            f3 = f8;
            hintView2 = this;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), Math.max(getHeight(), f7), (int) (f8 * f), 31);
            float f17 = ((f2 + rectF.left) + rectF2.left) - hintView2.textLayoutLeft;
            hintView2.textX = f17;
            float f18 = f10 - (hintView2.textLayoutHeight / 2.0f);
            hintView2.textY = f18;
            canvas2.translate(f17, f18);
            if (hintView2.links.draw(canvas2)) {
                hintView2.invalidate();
            }
            hintView2.textLayout.draw(canvas2);
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, hintView2.textLayout, hintView2.emojiGroupedSpans, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2.restore();
        } else {
            hintView2 = this;
            f3 = f8;
            canvas2 = canvas;
            CharSequence charSequence = hintView2.textToSet;
            if (charSequence != null) {
                animatedTextDrawable.setText(charSequence, hintView2.shown, true);
                hintView2.textToSet = null;
            }
            float f19 = rectF.left;
            float f20 = rectF2.left;
            float f21 = hintView2.textLayoutHeight / 2.0f;
            animatedTextDrawable.setBounds((int) (f2 + f19 + f20), (int) (f10 - f21), (int) (f19 + f20 + f5), (int) (f21 + f10));
            animatedTextDrawable.alpha = (int) (f3 * f);
            animatedTextDrawable.draw(canvas2);
        }
        if (hintView2.closeButton) {
            if (hintView2.closeButtonDrawable == null) {
                Drawable drawableMutate2 = hintView2.getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                hintView2.closeButtonDrawable = drawableMutate2;
                drawableMutate2.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
            }
            hintView2.closeButtonDrawable.setAlpha((int) (f3 * f));
            Drawable drawable = hintView2.closeButtonDrawable;
            drawable.setBounds((int) ((rectF.right - (rectF2.right * 0.66f)) - drawable.getIntrinsicWidth()), (int) (rectF.centerY() - (hintView2.closeButtonDrawable.getIntrinsicHeight() / 2.0f)), (int) (rectF.right - (rectF2.right * 0.66f)), (int) ((hintView2.closeButtonDrawable.getIntrinsicHeight() / 2.0f) + rectF.centerY()));
            hintView2.closeButtonDrawable.draw(canvas2);
        }
        canvas2.restore();
    }

    public void drawBgPath(Canvas canvas, float f) {
        int i = this.shadowColor;
        Paint paint = this.backgroundPaint;
        if (i != 0) {
            paint.setShadowLayer(this.shadowRadius, 0.0f, this.shadowDy, Theme.multAlpha(f, i));
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f));
        Path path = this.path;
        canvas.drawPath(path, paint);
        paint.setAlpha(alpha);
        if (this.flicker) {
            int iDp = AndroidUtilities.dp(64.0f);
            float fCurrentTimeMillis = (((this.pathLastWidth * 4.0f) + (iDp * 2)) * (((System.currentTimeMillis() - this.flickerStart) % 4000) / 4000.0f)) + (-iDp);
            this.flickerGradientMatrix.reset();
            this.flickerGradientMatrix.postTranslate(this.bounds.left + fCurrentTimeMillis, 0.0f);
            this.flickerGradient.setLocalMatrix(this.flickerGradientMatrix);
            this.flickerStrokeGradient.setLocalMatrix(this.flickerGradientMatrix);
            canvas.drawPath(path, this.flickerFillPaint);
            canvas.drawPath(this.flickerStrokePath, this.flickerStrokePaint);
            invalidate();
        }
    }

    public final void fillPath(Path path, float f, float f2, float f3, RectF rectF, Rect rect) {
        float fClamp;
        float f4 = f / 2.0f;
        float f5 = f2 / 2.0f;
        float fMin = Math.min(this.rounding, Math.min(f4, f5));
        int i = this.direction;
        if (i == 1 || i == 3) {
            float fClamp2 = Utilities.clamp(AndroidUtilities.lerp(getPaddingLeft(), getMeasuredWidth() - getPaddingRight(), this.joint) + this.jointTranslate, getMeasuredWidth() - getPaddingRight(), getPaddingLeft());
            float fMin2 = Math.min(Math.max(getPaddingLeft(), fClamp2 - f4) + f, getMeasuredWidth() - getPaddingRight());
            float f6 = fMin2 - f;
            float f7 = this.arrowHalfWidth;
            float fClamp3 = Utilities.clamp(fClamp2, (fMin2 - fMin) - f7, f6 + fMin + f7);
            if (this.direction == 1) {
                rectF.set(f6, getPaddingTop() + this.arrowHeight, fMin2, getPaddingTop() + this.arrowHeight + f2);
            } else {
                rectF.set(f6, ((getMeasuredHeight() - this.arrowHeight) - getPaddingBottom()) - f2, fMin2, (getMeasuredHeight() - this.arrowHeight) - getPaddingBottom());
            }
            fClamp = fClamp3;
        } else {
            float fClamp4 = Utilities.clamp(AndroidUtilities.lerp(getPaddingTop(), getMeasuredHeight() - getPaddingBottom(), this.joint) + this.jointTranslate, getMeasuredHeight() - getPaddingBottom(), getPaddingTop());
            float fMin3 = Math.min(Math.max(getPaddingTop(), fClamp4 - f5) + f2, getMeasuredHeight() - getPaddingBottom());
            float f8 = fMin3 - f2;
            float f9 = this.arrowHalfWidth;
            fClamp = Utilities.clamp(fClamp4, (fMin3 - fMin) - f9, f8 + fMin + f9);
            if (this.direction == 0) {
                rectF.set(getPaddingLeft() + this.arrowHeight, f8, getPaddingLeft() + this.arrowHeight + f, fMin3);
            } else {
                rectF.set(((getMeasuredWidth() - getPaddingRight()) - this.arrowHeight) - f, f8, (getMeasuredWidth() - getPaddingRight()) - this.arrowHeight, fMin3);
            }
        }
        float f10 = -f3;
        rectF.inset(f10, f10);
        if (rect != null) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        path.rewind();
        boolean z = this.roundWithCornerEffect;
        RectF rectF2 = this.oval;
        if (z) {
            path.moveTo(rectF.left, rectF.bottom);
        } else {
            float f11 = rectF.left;
            float f12 = rectF.bottom;
            float f13 = fMin * 2.0f;
            rectF2.set(f11, f12 - f13, f13 + f11, f12);
            path.arcTo(rectF2, 90.0f, 90.0f);
        }
        if (this.direction == 0) {
            path.lineTo(rectF.left, this.arrowHalfWidth + fClamp + AndroidUtilities.dp(2.0f));
            path.lineTo(rectF.left, this.arrowHalfWidth + fClamp);
            path.lineTo(rectF.left - this.arrowHeight, AndroidUtilities.dp(1.0f) + fClamp);
            float f14 = rectF.left - this.arrowHeight;
            this.arrowX = f14;
            this.arrowY = fClamp;
            path.lineTo(f14, fClamp - AndroidUtilities.dp(1.0f));
            path.lineTo(rectF.left, fClamp - this.arrowHalfWidth);
            path.lineTo(rectF.left, (fClamp - this.arrowHalfWidth) - AndroidUtilities.dp(2.0f));
            if (rect != null) {
                rect.left = (int) (rect.left - this.arrowHeight);
            }
        }
        if (this.roundWithCornerEffect) {
            path.lineTo(rectF.left, rectF.top);
        } else {
            float f15 = rectF.left;
            float f16 = rectF.top;
            float f17 = fMin * 2.0f;
            rectF2.set(f15, f16, f15 + f17, f17 + f16);
            path.arcTo(rectF2, 180.0f, 90.0f);
        }
        if (this.direction == 1) {
            path.lineTo((fClamp - this.arrowHalfWidth) - AndroidUtilities.dp(2.0f), rectF.top);
            path.lineTo(fClamp - this.arrowHalfWidth, rectF.top);
            path.lineTo(fClamp - AndroidUtilities.dp(1.0f), rectF.top - this.arrowHeight);
            this.arrowX = fClamp;
            this.arrowY = rectF.top - this.arrowHeight;
            path.lineTo(AndroidUtilities.dp(1.0f) + fClamp, rectF.top - this.arrowHeight);
            path.lineTo(this.arrowHalfWidth + fClamp, rectF.top);
            path.lineTo(this.arrowHalfWidth + fClamp + AndroidUtilities.dp(2.0f), rectF.top);
            if (rect != null) {
                rect.top = (int) (rect.top - this.arrowHeight);
            }
        }
        if (this.roundWithCornerEffect) {
            path.lineTo(rectF.right, rectF.top);
        } else {
            float f18 = rectF.right;
            float f19 = fMin * 2.0f;
            float f20 = rectF.top;
            rectF2.set(f18 - f19, f20, f18, f19 + f20);
            path.arcTo(rectF2, 270.0f, 90.0f);
        }
        if (this.direction == 2) {
            path.lineTo(rectF.right, (fClamp - this.arrowHalfWidth) - AndroidUtilities.dp(2.0f));
            path.lineTo(rectF.right, fClamp - this.arrowHalfWidth);
            path.lineTo(rectF.right + this.arrowHeight, fClamp - AndroidUtilities.dp(1.0f));
            float f21 = rectF.right + this.arrowHeight;
            this.arrowX = f21;
            this.arrowY = fClamp;
            path.lineTo(f21, AndroidUtilities.dp(1.0f) + fClamp);
            path.lineTo(rectF.right, this.arrowHalfWidth + fClamp);
            path.lineTo(rectF.right, this.arrowHalfWidth + fClamp + AndroidUtilities.dp(2.0f));
            if (rect != null) {
                rect.right = (int) (rect.right + this.arrowHeight);
            }
        }
        if (this.roundWithCornerEffect) {
            path.lineTo(rectF.right, rectF.bottom);
        } else {
            float f22 = rectF.right;
            float f23 = fMin * 2.0f;
            float f24 = rectF.bottom;
            rectF2.set(f22 - f23, f24 - f23, f22, f24);
            path.arcTo(rectF2, 0.0f, 90.0f);
        }
        if (this.direction == 3) {
            path.lineTo(this.arrowHalfWidth + fClamp + AndroidUtilities.dp(2.0f), rectF.bottom);
            path.lineTo(this.arrowHalfWidth + fClamp, rectF.bottom);
            path.lineTo(AndroidUtilities.dp(1.0f) + fClamp, rectF.bottom + this.arrowHeight);
            this.arrowX = fClamp;
            this.arrowY = rectF.bottom + this.arrowHeight;
            path.lineTo(fClamp - AndroidUtilities.dp(1.0f), rectF.bottom + this.arrowHeight);
            path.lineTo(fClamp - this.arrowHalfWidth, rectF.bottom);
            path.lineTo((fClamp - this.arrowHalfWidth) - AndroidUtilities.dp(2.0f), rectF.bottom);
            if (rect != null) {
                rect.bottom = (int) (rect.bottom + this.arrowHeight);
            }
        }
        path.close();
        this.pathSet = true;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.textToSet;
        if (charSequence != null) {
            return charSequence;
        }
        if (!this.multiline) {
            return this.textDrawable.currentText;
        }
        StaticLayout staticLayout = this.textLayout;
        if (staticLayout != null) {
            return staticLayout.getText();
        }
        return null;
    }

    public TextPaint getTextPaint() {
        return this.multiline ? this.textPaint : this.textDrawable.textPaint;
    }

    public final void hide(boolean z) {
        AndroidUtilities.cancelRunOnUIThread(this.hideRunnable);
        Runnable runnable = this.onHidden;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        this.shown = false;
        AnimatedFloat animatedFloat = this.show;
        if (!z) {
            animatedFloat.getClass();
            animatedFloat.set(0.0f, false);
        }
        invalidate();
        Runnable runnable2 = this.onHidden;
        if (runnable2 != null) {
            AndroidUtilities.runOnUIThread(runnable2, (long) (animatedFloat.value * animatedFloat.transitionDuration));
        }
        this.links.clear(true);
    }

    public final void makeLayout(int i, CharSequence charSequence) {
        this.textLayout = new StaticLayout(charSequence, this.textPaint, i, this.textLayoutAlignment, 1.0f, 0.0f, false);
        float fMin = i;
        float fMax = 0.0f;
        for (int i2 = 0; i2 < this.textLayout.getLineCount(); i2++) {
            fMin = Math.min(fMin, this.textLayout.getLineLeft(i2));
            fMax = Math.max(fMax, this.textLayout.getLineRight(i2));
        }
        this.textLayoutWidth = Math.max(0.0f, fMax - fMin);
        this.textLayoutHeight = this.textLayout.getHeight();
        this.textLayoutLeft = fMin;
        this.emojiGroupedSpans = AnimatedEmojiSpan.update(0, this, this.emojiGroupedSpans, this.textLayout);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatedEmojiSpan.release(this, this.emojiGroupedSpans);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        this.pathSet = false;
        int textMaxWidth = getTextMaxWidth();
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.textDrawable;
        animatedTextDrawable.overrideFullWidth = textMaxWidth;
        if (this.multiline) {
            CharSequence text = this.textToSet;
            if (text == null) {
                StaticLayout staticLayout = this.textLayout;
                if (staticLayout == null) {
                    return;
                } else {
                    text = staticLayout.getText();
                }
            }
            StaticLayout staticLayout2 = this.textLayout;
            if (staticLayout2 == null || staticLayout2.getWidth() != textMaxWidth) {
                makeLayout(textMaxWidth, text);
            }
        } else {
            CharSequence charSequence = this.textToSet;
            if (charSequence != null) {
                animatedTextDrawable.setText(charSequence, false, true);
            }
        }
        this.textToSet = null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        CharacterStyle characterStyle;
        if ((this.hideByTouch || hasOnClickListeners()) && this.shown) {
            if (this.textLayout != null) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                StaticLayout staticLayout = this.textLayout;
                if (staticLayout == null) {
                    clickableSpan = null;
                } else {
                    int i = (int) (x - this.textX);
                    int i2 = (int) (y - this.textY);
                    int lineForVertical = staticLayout.getLineForVertical(i2);
                    float f = i;
                    int offsetForHorizontal = this.textLayout.getOffsetForHorizontal(lineForVertical, f);
                    float lineLeft = this.textLayout.getLineLeft(lineForVertical);
                    if (lineLeft > f || this.textLayout.getLineWidth(lineForVertical) + lineLeft < f || i2 < 0 || i2 > this.textLayout.getHeight()) {
                        clickableSpan = null;
                    } else {
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(this.textLayout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length == 0 || AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                            clickableSpan = null;
                        } else {
                            clickableSpan = clickableSpanArr[0];
                        }
                    }
                }
                PhotoViewer$$ExternalSyntheticLambda127 photoViewer$$ExternalSyntheticLambda127 = this.hideRunnable;
                LinkSpanDrawable.LinkCollector linkCollector = this.links;
                if (clickableSpan != null && motionEvent.getAction() == 0) {
                    LinkSpanDrawable linkSpanDrawable = new LinkSpanDrawable(clickableSpan, null, motionEvent.getX(), motionEvent.getY());
                    this.pressedLink = linkSpanDrawable;
                    linkCollector.addLink(linkSpanDrawable, null);
                    SpannableString spannableString = new SpannableString(this.textLayout.getText());
                    int spanStart = spannableString.getSpanStart(this.pressedLink.mSpan);
                    int spanEnd = spannableString.getSpanEnd(this.pressedLink.mSpan);
                    LinkPath linkPathObtainNewPath = this.pressedLink.obtainNewPath();
                    linkPathObtainNewPath.setCurrentLayout(this.textLayout, spanStart, 0.0f, 0.0f);
                    this.textLayout.getSelectionPath(spanStart, spanEnd, linkPathObtainNewPath);
                    invalidate();
                    AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda127(this, linkSpanDrawable, clickableSpan), ViewConfiguration.getLongPressTimeout());
                    AndroidUtilities.cancelRunOnUIThread(photoViewer$$ExternalSyntheticLambda127);
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    linkCollector.clear(true);
                    invalidate();
                    AndroidUtilities.cancelRunOnUIThread(photoViewer$$ExternalSyntheticLambda127);
                    long j = this.duration;
                    if (j > 0) {
                        AndroidUtilities.runOnUIThread(photoViewer$$ExternalSyntheticLambda127, j);
                    }
                    LinkSpanDrawable linkSpanDrawable2 = this.pressedLink;
                    if (linkSpanDrawable2 != null && (characterStyle = linkSpanDrawable2.mSpan) == clickableSpan) {
                        if (characterStyle != null) {
                            ((ClickableSpan) characterStyle).onClick(this);
                        }
                        this.pressedLink = null;
                        return true;
                    }
                    this.pressedLink = null;
                }
                if (motionEvent.getAction() == 3) {
                    linkCollector.clear(true);
                    invalidate();
                    AndroidUtilities.cancelRunOnUIThread(photoViewer$$ExternalSyntheticLambda127);
                    long j2 = this.duration;
                    if (j2 > 0) {
                        AndroidUtilities.runOnUIThread(photoViewer$$ExternalSyntheticLambda127, j2);
                    }
                    this.pressedLink = null;
                }
            }
            if (this.pressedLink == null) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                int action = motionEvent.getAction();
                ButtonBounce buttonBounce = this.bounce;
                if (action == 0 && this.bounds.contains(motionEvent.getX() - 0.0f, motionEvent.getY() - 0.0f)) {
                    buttonBounce.setPressed(true);
                    BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectorDrawable;
                    if (rippleDrawableSafe != null) {
                        rippleDrawableSafe.setHotspot(x2, y2);
                        this.selectorDrawable.setState(new int[]{16842919, 16842910});
                        return true;
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (hasOnClickListeners()) {
                        performClick();
                    } else if (this.hideByTouch) {
                        hide(true);
                    }
                    buttonBounce.setPressed(false);
                    BaseCell.RippleDrawableSafe rippleDrawableSafe2 = this.selectorDrawable;
                    if (rippleDrawableSafe2 != null) {
                        rippleDrawableSafe2.setState(new int[0]);
                        return true;
                    }
                } else if (motionEvent.getAction() == 3) {
                    buttonBounce.setPressed(false);
                    BaseCell.RippleDrawableSafe rippleDrawableSafe3 = this.selectorDrawable;
                    if (rippleDrawableSafe3 != null) {
                        rippleDrawableSafe3.setState(new int[0]);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void setCloseButton() {
        this.closeButton = true;
        if (this.multiline) {
            return;
        }
        this.innerPadding.set(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.closeButton ? 15.0f : 11.0f), AndroidUtilities.dp(7.0f));
    }

    public final void setIcon(RLottieDrawable rLottieDrawable) {
        RLottieDrawable rLottieDrawable2 = this.icon;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.setCallback(null);
        }
        this.icon = rLottieDrawable;
        rLottieDrawable.setCallback(this);
        RLottieDrawable rLottieDrawable3 = this.icon;
        if (rLottieDrawable3 != null) {
            this.duration = Math.max(this.duration, rLottieDrawable3.getDuration());
        }
        RLottieDrawable rLottieDrawable4 = this.icon;
        this.iconWidth = rLottieDrawable4.width;
        this.iconHeight = rLottieDrawable4.height;
        this.iconLeft = true;
    }

    public final void setInnerPadding(float f, float f2, float f3, float f4) {
        this.innerPadding.set(AndroidUtilities.dpf2(f), AndroidUtilities.dpf2(f2), AndroidUtilities.dpf2(f3), AndroidUtilities.dpf2(f4));
    }

    public final void setJoint(float f, float f2) {
        if (Math.abs(this.joint - f) >= 1.0f || Math.abs(this.jointTranslate - AndroidUtilities.dp(f2)) >= 1.0f) {
            this.pathSet = false;
            invalidate();
        }
        this.joint = f;
        this.jointTranslate = AndroidUtilities.dp(f2);
    }

    public final void setJointPx(float f, float f2) {
        if (Math.abs(this.joint - f) >= 1.0f || Math.abs(this.jointTranslate - f2) >= 1.0f) {
            this.pathSet = false;
            invalidate();
        }
        this.joint = f;
        this.jointTranslate = f2;
    }

    public final void setMaxWidth() {
        this.textMaxWidth = AndroidUtilities.dp(165.0f);
    }

    public final void setMaxWidthPx(int i) {
        this.textMaxWidth = i;
    }

    public final void setMultilineText(boolean z) {
        this.multiline = z;
        RectF rectF = this.innerPadding;
        if (z) {
            rectF.set(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f));
            this.closeButtonMargin = AndroidUtilities.dp(6.0f);
        } else {
            rectF.set(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.closeButton ? 15.0f : 11.0f), AndroidUtilities.dp(7.0f));
            this.closeButtonMargin = AndroidUtilities.dp(2.0f);
        }
    }

    public final void setRounding(float f) {
        this.rounding = AndroidUtilities.dp(f);
        this.backgroundPaint.setPathEffect(this.roundWithCornerEffect ? new CornerPathEffect(this.rounding) : null);
        Paint paint = this.cutSelectorPaint;
        if (paint != null) {
            paint.setPathEffect(this.roundWithCornerEffect ? new CornerPathEffect(this.rounding) : null);
        }
    }

    public final void setText(CharSequence charSequence) {
        if (getMeasuredWidth() < 0) {
            this.textToSet = charSequence;
        } else if (this.multiline) {
            makeLayout(getTextMaxWidth(), charSequence);
        } else {
            this.textDrawable.setText(charSequence, false, true);
        }
    }

    public final void show() {
        int i = 1;
        if (this.shown && this.repeatedBounce) {
            ValueAnimator valueAnimator = this.bounceAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.bounceAnimator = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.bounceAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda4(this, 9));
            this.bounceAnimator.addListener(new WebviewActivity.AnonymousClass3.AnonymousClass1(this, i));
            this.bounceAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_BACK);
            this.bounceAnimator.setDuration(300L);
            this.bounceAnimator.start();
        }
        AndroidUtilities.makeAccessibilityAnnouncement(getText());
        this.shown = true;
        invalidate();
        PhotoViewer$$ExternalSyntheticLambda127 photoViewer$$ExternalSyntheticLambda127 = this.hideRunnable;
        AndroidUtilities.cancelRunOnUIThread(photoViewer$$ExternalSyntheticLambda127);
        long j = this.duration;
        if (j > 0) {
            AndroidUtilities.runOnUIThread(photoViewer$$ExternalSyntheticLambda127, j);
        }
        Runnable runnable = this.onHidden;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.textDrawable || drawable == this.selectorDrawable || drawable == this.icon || super.verifyDrawable(drawable);
    }
}
