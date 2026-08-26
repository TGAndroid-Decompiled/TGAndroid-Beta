package org.telegram.ui.Stories;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.blur3.StrokeDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda18;

public final class CommentButton extends FrameLayout {
    public final ImageView arrowImage;
    public final Paint backgroundPaint;
    public final Paint clearPaint;
    public boolean collapsed;
    public ValueAnimator countAnimator;
    public float countScale;
    public final AnimatedTextView.AnimatedTextDrawable countText;
    public int lastCount;

    public CommentButton(Context context, BlurredBackgroundColorProviderThemed blurredBackgroundColorProviderThemed) {
        super(context);
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        Paint paint2 = new Paint(1);
        this.clearPaint = paint2;
        this.countScale = 1.0f;
        ScaleStateListAnimator.apply(this, 0.1f, 1.5f);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
        this.countText = animatedTextDrawable;
        TextPaint textPaint = animatedTextDrawable.textPaint;
        textPaint.setColor(-9866632);
        animatedTextDrawable.alpha = Color.alpha(-9866632);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(9.0f));
        animatedTextDrawable.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        animatedTextDrawable.allowCancel = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        FrameLayout frameLayout = new FrameLayout(context);
        StrokeDrawable strokeDrawable = new StrokeDrawable();
        strokeDrawable.colorProvider = blurredBackgroundColorProviderThemed;
        Paint paint3 = strokeDrawable.paintStrokeTop;
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        Paint paint4 = strokeDrawable.paintStrokeBottom;
        paint4.setStyle(style);
        BlurredBackgroundColorProviderThemed blurredBackgroundColorProviderThemed2 = strokeDrawable.colorProvider;
        if (blurredBackgroundColorProviderThemed2 != null) {
            strokeDrawable.strokeColorTop = Theme.multAlpha(strokeDrawable.alpha, blurredBackgroundColorProviderThemed2.getStrokeColorTop());
            strokeDrawable.strokeColorBottom = Theme.multAlpha(strokeDrawable.alpha, strokeDrawable.colorProvider.getStrokeColorBottom());
            paint3.setColor(strokeDrawable.strokeColorTop);
            paint3.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
            paint4.setColor(strokeDrawable.strokeColorBottom);
            paint4.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
        }
        strokeDrawable.paintFill.setColor(-14670806);
        strokeDrawable.invalidateSelf();
        strokeDrawable.padding = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(strokeDrawable);
        addView(frameLayout, LayoutHelper.createFrame(40, 40, 17));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_comments);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView, LayoutHelper.createFrame(20, 20, 17));
        ImageView imageView2 = new ImageView(context);
        this.arrowImage = imageView2;
        imageView2.setImageResource(R.drawable.menu_comments_arrow);
        imageView2.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView2, LayoutHelper.createFrame(20, 20, 17));
        imageView2.setPivotX(AndroidUtilities.dp(10.27f));
        imageView2.setPivotY(AndroidUtilities.dp(9.58f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        float f = this.countScale;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.countText;
        float fIsNotEmpty = animatedTextDrawable.isNotEmpty() * f;
        float fMax = Math.max(AndroidUtilities.dp(12.0f), animatedTextDrawable.getCurrentWidth() + AndroidUtilities.dp(6.0f));
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getWidth() - fMax, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
        canvas.scale(fIsNotEmpty, fIsNotEmpty, rectF.centerX(), rectF.centerY());
        rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.clearPaint);
        rectF.set(getWidth() - fMax, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.backgroundPaint);
        canvas.translate(((fMax - animatedTextDrawable.getCurrentWidth()) / 2.0f) + rectF.left, AndroidUtilities.dp(7.0f));
        animatedTextDrawable.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public final void setCollapsed(boolean z, boolean z2) {
        if (z2 && this.collapsed == z) {
            return;
        }
        this.collapsed = z;
        ImageView imageView = this.arrowImage;
        if (z2) {
            OKLCH.m(imageView.animate().rotation(z ? 0.0f : 180.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 420L);
        } else {
            imageView.setRotation(z ? 0.0f : 180.0f);
        }
    }

    public void setCount(int i) {
        this.countText.setText(i <= 0 ? "" : LocaleController.formatNumber(i, ','), true, true);
        if (this.lastCount != i) {
            ValueAnimator valueAnimator = this.countAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.countAnimator = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.countAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda18(this, 19));
            this.countAnimator.addListener(new PhotoViewer.AnonymousClass78.AnonymousClass1(this, 17));
            this.countAnimator.setInterpolator(new OvershootInterpolator(2.5f));
            this.countAnimator.setDuration(200L);
            this.countAnimator.start();
            this.lastCount = i;
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.countText || super.verifyDrawable(drawable);
    }
}
