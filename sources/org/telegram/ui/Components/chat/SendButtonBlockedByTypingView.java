package org.telegram.ui.Components.chat;

import android.content.Context;
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

public class SendButtonBlockedByTypingView extends View {
    private final BoolAnimator animatorStopAllowed;
    private final Paint paint;
    private final Theme.ResourcesProvider resourcesProvider;
    private final TypingDotsDrawable typingDotsDrawable;

    public SendButtonBlockedByTypingView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
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
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.typingDotsDrawable.start();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.typingDotsDrawable.stop();
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || (drawable == this.typingDotsDrawable && !this.animatorStopAllowed.getValue());
    }

    public void setStopAllowed(boolean z, boolean z2) {
        this.animatorStopAllowed.setValue(z, z2);
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        DrawableUtils.setBounds(this.typingDotsDrawable, i / 2.0f, i2 / 2.0f, 17);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        super.onDraw(canvas);
        this.paint.setColor(Theme.getColor(Theme.key_chat_messagePanelSend, this.resourcesProvider));
        canvas.drawCircle(width, height, AndroidUtilities.dp(19.0f), this.paint);
        float floatValue = this.animatorStopAllowed.getFloatValue();
        float f = 1.0f - floatValue;
        if (f > 0.0f) {
            DrawableUtils.drawWithScale(canvas, this.typingDotsDrawable, f * 1.35f);
            invalidate();
        }
        if (floatValue > 0.0f) {
            float fDp = AndroidUtilities.dp(6.666f) * floatValue;
            float fDp2 = AndroidUtilities.dp(2.666f) * floatValue;
            canvas.drawRoundRect(width - fDp, height - fDp, width + fDp, height + fDp, fDp2, fDp2, Theme.fillingPaint(-1));
        }
    }
}
