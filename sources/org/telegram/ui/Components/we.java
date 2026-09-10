package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class we extends dh {
    public final Rect f28757x;
    public final ChatActivityEnterView f28758y;

    public we(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.f28758y = chatActivityEnterView;
        this.f28757x = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable;
        ChatActivityEnterView chatActivityEnterView = this.f28758y;
        if (chatActivityEnterView.f20819a1) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f28757x;
            rect.set(0, 0, measuredWidth, measuredHeight);
            rect.inset(AndroidUtilities.dp(7.5f), AndroidUtilities.dp(7.5f));
            if (getCurrentState() == bh.f21830b) {
                drawable = chatActivityEnterView.N3;
            } else {
                drawable = chatActivityEnterView.M3;
            }
            drawable.setBounds(rect);
            drawable.draw(canvas);
            return;
        }
        super.draw(canvas);
    }
}
