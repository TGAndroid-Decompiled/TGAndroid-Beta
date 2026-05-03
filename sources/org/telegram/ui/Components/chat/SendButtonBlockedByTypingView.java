package org.telegram.ui.Components.chat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.TypingDotsDrawable;

public class SendButtonBlockedByTypingView extends View {
    private final Paint paint;
    private final Theme.ResourcesProvider resourcesProvider;
    private final TypingDotsDrawable typingDotsDrawable;

    public SendButtonBlockedByTypingView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
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
        return super.verifyDrawable(drawable) || drawable == this.typingDotsDrawable;
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        DrawableUtils.setBounds(this.typingDotsDrawable, i / 2.0f, i2 / 2.0f, 17);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.paint.setColor(Theme.getColor(Theme.key_chat_messagePanelSend, this.resourcesProvider));
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(19.0f), this.paint);
        DrawableUtils.drawWithScale(canvas, this.typingDotsDrawable, 1.35f);
        invalidate();
    }
}
