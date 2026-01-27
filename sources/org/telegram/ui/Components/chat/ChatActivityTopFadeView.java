package org.telegram.ui.Components.chat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

public class ChatActivityTopFadeView extends View {
    private Drawable drawable;
    private int fadeHeight;

    public ChatActivityTopFadeView(Context context) {
        super(context);
    }

    public void setFadeDrawable(Drawable drawable) {
        this.drawable = drawable;
        checkBounds();
        invalidate();
    }

    public void setFadeHeight(int i) {
        if (this.fadeHeight != i) {
            this.fadeHeight = i;
            checkBounds();
            invalidate();
        }
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        checkBounds();
    }

    private void checkBounds() {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, getMeasuredWidth(), this.fadeHeight);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }
}
