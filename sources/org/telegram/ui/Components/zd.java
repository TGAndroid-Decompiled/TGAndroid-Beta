package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class zd extends fg {
    public final Rect F;
    public final ChatActivityEnterView G;

    public zd(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.G = chatActivityEnterView;
        this.F = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable;
        ChatActivityEnterView chatActivityEnterView = this.G;
        if (chatActivityEnterView.f23675a1) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.F;
            rect.set(0, 0, measuredWidth, measuredHeight);
            rect.inset(org.telegram.messenger.i0.L(7.5f), org.telegram.messenger.i0.L(7.5f));
            if (getCurrentState() == dg.f25406b) {
                drawable = chatActivityEnterView.O3;
            } else {
                drawable = chatActivityEnterView.N3;
            }
            drawable.setBounds(rect);
            drawable.draw(canvas);
            return;
        }
        super.draw(canvas);
    }
}
