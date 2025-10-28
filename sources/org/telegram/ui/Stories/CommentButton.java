package org.telegram.ui.Stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.blur3.StrokeDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;

public class CommentButton extends FrameLayout {
    private final ImageView arrowImage;
    private final Paint backgroundPaint;
    private final Paint clearPaint;
    private boolean collapsed;
    private final ImageView commentImage;
    private ValueAnimator countAnimator;
    private float countScale;
    private final AnimatedTextView.AnimatedTextDrawable countText;
    private int lastCount;
    private final FrameLayout layout;

    public CommentButton(Context context, BlurredBackgroundColorProvider blurredBackgroundColorProvider) {
        super(context);
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        Paint paint2 = new Paint(1);
        this.clearPaint = paint2;
        this.countScale = 1.0f;
        ScaleStateListAnimator.apply(this);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.countText = animatedTextDrawable;
        animatedTextDrawable.setTextColor(-9866632);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(9.0f));
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        animatedTextDrawable.setAllowCancel(true);
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        FrameLayout frameLayout = new FrameLayout(context);
        this.layout = frameLayout;
        StrokeDrawable strokeDrawable = new StrokeDrawable();
        strokeDrawable.setColorProvider(blurredBackgroundColorProvider);
        strokeDrawable.setBackgroundColor(-14670806);
        strokeDrawable.setPadding(AndroidUtilities.dp(1.0f));
        frameLayout.setBackground(strokeDrawable);
        addView(frameLayout, LayoutHelper.createFrame(40, 40, 17));
        ImageView imageView = new ImageView(context);
        this.commentImage = imageView;
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
    protected void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        float isNotEmpty = this.countScale * this.countText.isNotEmpty();
        float max = Math.max(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f) + this.countText.getCurrentWidth());
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
        canvas.scale(isNotEmpty, isNotEmpty, rectF.centerX(), rectF.centerY());
        rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.clearPaint);
        rectF.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.backgroundPaint);
        canvas.translate(rectF.left + ((max - this.countText.getCurrentWidth()) / 2.0f), AndroidUtilities.dp(7.0f));
        this.countText.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public void setCollapsed(boolean z, boolean z2) {
        if (z2 && this.collapsed == z) {
            return;
        }
        this.collapsed = z;
        if (z2) {
            this.arrowImage.animate().rotation(z ? 0.0f : 180.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(420L).start();
        } else {
            this.arrowImage.setRotation(z ? 0.0f : 180.0f);
        }
    }

    public void setCount(int i) {
        this.countText.setText(i <= 0 ? "" : LocaleController.formatNumber(i, ','));
        if (this.lastCount != i) {
            animateBounce();
            this.lastCount = i;
        }
        invalidate();
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.countText || super.verifyDrawable(drawable);
    }

    private void animateBounce() {
        ValueAnimator valueAnimator = this.countAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.countAnimator = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.countAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                CommentButton.this.lambda$animateBounce$0(valueAnimator2);
            }
        });
        this.countAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                CommentButton.this.countScale = 1.0f;
                CommentButton.this.invalidate();
            }
        });
        this.countAnimator.setInterpolator(new OvershootInterpolator(2.5f));
        this.countAnimator.setDuration(200L);
        this.countAnimator.start();
    }

    public void lambda$animateBounce$0(ValueAnimator valueAnimator) {
        this.countScale = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        invalidate();
    }
}
