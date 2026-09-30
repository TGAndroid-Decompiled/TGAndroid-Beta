package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class xe extends ch {
    public final Rect f30235x;
    public final ChatActivityEnterView f30236y;

    public xe(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.f30236y = chatActivityEnterView;
        this.f30235x = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable;
        ChatActivityEnterView chatActivityEnterView = this.f30236y;
        if (chatActivityEnterView.f21977a1) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f30235x;
            rect.set(0, 0, measuredWidth, measuredHeight);
            rect.inset(AndroidUtilities.dp(7.5f), AndroidUtilities.dp(7.5f));
            if (getCurrentState() == ah.f22626b) {
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
