package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class we extends bh {
    public final Rect f29932x;
    public final ChatActivityEnterView f29933y;

    public we(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.f29933y = chatActivityEnterView;
        this.f29932x = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable;
        ChatActivityEnterView chatActivityEnterView = this.f29933y;
        if (chatActivityEnterView.f21958a1) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f29932x;
            rect.set(0, 0, measuredWidth, measuredHeight);
            rect.inset(AndroidUtilities.dp(7.5f), AndroidUtilities.dp(7.5f));
            if (getCurrentState() == zg.f30916b) {
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
