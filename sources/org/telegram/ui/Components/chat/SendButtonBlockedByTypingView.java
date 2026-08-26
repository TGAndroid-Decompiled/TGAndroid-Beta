package org.telegram.ui.Components.chat;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.TypingDotsDrawable;

public final class SendButtonBlockedByTypingView extends View {
    public final BoolAnimator animatorStopAllowed;
    public final Paint paint;
    public final Theme.ResourcesProvider resourcesProvider;
    public final TypingDotsDrawable typingDotsDrawable;

    public SendButtonBlockedByTypingView(Activity activity, Theme.ResourcesProvider resourcesProvider) {
        super(activity);
        this.animatorStopAllowed = new BoolAnimator(this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L);
        this.paint = new Paint(1);
        this.resourcesProvider = resourcesProvider;
        TypingDotsDrawable typingDotsDrawable = new TypingDotsDrawable(true);
        this.typingDotsDrawable = typingDotsDrawable;
        typingDotsDrawable.setCallback(this);
        typingDotsDrawable.setColor(-1);
        typingDotsDrawable.setIgnoreAnimationLocks();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.typingDotsDrawable.start();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.typingDotsDrawable.stop();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        super.onDraw(canvas);
        Paint paint = this.paint;
        paint.setColor(Theme.getColor(Theme.key_chat_messagePanelSend, this.resourcesProvider));
        canvas.drawCircle(width, height, AndroidUtilities.dp(19.0f), paint);
        float f = this.animatorStopAllowed.floatValue;
        float f2 = 1.0f - f;
        if (f2 > 0.0f) {
            DrawableUtils.drawWithScale(canvas, this.typingDotsDrawable, f2 * 1.35f);
            invalidate();
        }
        if (f > 0.0f) {
            float fDp = AndroidUtilities.dp(6.666f) * f;
            float fDp2 = AndroidUtilities.dp(2.666f) * f;
            canvas.drawRoundRect(width - fDp, height - fDp, width + fDp, height + fDp, fDp2, fDp2, Theme.fillingPaint(-1));
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        DrawableUtils.setBounds(this.typingDotsDrawable, i / 2.0f, i2 / 2.0f, 17);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        return drawable == this.typingDotsDrawable && !this.animatorStopAllowed.value;
    }
}
