package org.telegram.ui.Components.chat.layouts;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable;

public class ChatActivityFadeView extends View {
    private BlurredBackgroundWithFadeDrawable fadeDrawableBottom;
    private BlurredBackgroundWithFadeDrawable fadeDrawableTop;
    private int fadeZoneBottom;
    private int fadeZoneTop;

    public ChatActivityFadeView(Context context) {
        super(context);
    }

    public void setup(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        BlurredBackgroundWithFadeDrawable blurredBackgroundWithFadeDrawable = new BlurredBackgroundWithFadeDrawable(blurredBackgroundDrawableViewFactory.create(this));
        this.fadeDrawableTop = blurredBackgroundWithFadeDrawable;
        blurredBackgroundWithFadeDrawable.setFadeHeight(-AndroidUtilities.dp(30.0f), true);
        BlurredBackgroundWithFadeDrawable blurredBackgroundWithFadeDrawable2 = new BlurredBackgroundWithFadeDrawable(blurredBackgroundDrawableViewFactory.create(this));
        this.fadeDrawableBottom = blurredBackgroundWithFadeDrawable2;
        blurredBackgroundWithFadeDrawable2.setFadeHeight(AndroidUtilities.dp(30.0f), true);
    }

    public void setFadeHeightTop(int i) {
        this.fadeDrawableTop.setFadeHeight(-i, true);
    }

    public void setFadeHeightBottom(int i) {
        this.fadeDrawableBottom.setFadeHeight(i, true);
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        checkBounds();
    }

    public void setFadeZoneTop(int i) {
        if (this.fadeZoneTop != i) {
            this.fadeZoneTop = i;
            checkBounds();
            invalidate();
        }
    }

    public void setFadeZoneBottom(int i) {
        if (this.fadeZoneBottom != i) {
            this.fadeZoneBottom = i;
            checkBounds();
            invalidate();
        }
    }

    private void checkBounds() {
        this.fadeDrawableTop.setBounds(0, 0, getMeasuredWidth(), this.fadeZoneTop);
        this.fadeDrawableBottom.setBounds(0, getMeasuredHeight() - this.fadeZoneBottom, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.fadeDrawableTop.draw(canvas);
        this.fadeDrawableBottom.draw(canvas);
    }
}
