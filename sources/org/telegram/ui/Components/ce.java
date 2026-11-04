package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class ce extends hg {
    public final Rect G;
    public final ChatActivityEnterView H;

    public ce(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.H = chatActivityEnterView;
        this.G = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f31092b1) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.G;
            rect.set(0, 0, measuredWidth, measuredHeight);
            rect.inset(org.telegram.messenger.g0.L(7.5f), org.telegram.messenger.g0.L(7.5f));
            if (getCurrentState() == fg.f33791b) {
                drawable = chatActivityEnterView.P3;
            } else {
                drawable = chatActivityEnterView.O3;
            }
            drawable.setBounds(rect);
            drawable.draw(canvas);
            return;
        }
        super.draw(canvas);
    }
}
