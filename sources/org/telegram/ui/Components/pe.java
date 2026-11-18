package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class pe extends yg {
    public final Rect G;
    public final ChatActivityEnterView H;

    public pe(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.H = chatActivityEnterView;
        this.G = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.l1) {
            if (chatActivityEnterView.n1 == null) {
                chatActivityEnterView.n1 = getResources().getDrawable(2131231501).mutate();
                chatActivityEnterView.n1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            int L = org.telegram.messenger.g0.L(12.0f);
            chatActivityEnterView.n1.setBounds(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
            chatActivityEnterView.n1.draw(canvas);
        } else if (chatActivityEnterView.f32550b1) {
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            Rect rect = this.G;
            rect.set(0, 0, measuredWidth2, measuredHeight2);
            rect.inset(org.telegram.messenger.g0.L(7.5f), org.telegram.messenger.g0.L(7.5f));
            if (getCurrentState() == wg.f41709b) {
                drawable = chatActivityEnterView.C4;
            } else {
                drawable = chatActivityEnterView.B4;
            }
            drawable.setBounds(rect);
            drawable.draw(canvas);
        } else {
            super.draw(canvas);
        }
    }
}
