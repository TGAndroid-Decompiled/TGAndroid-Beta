package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class me extends qg {
    public final Rect f27005x;
    public final ChatActivityEnterView f27006y;

    public me(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.f27006y = chatActivityEnterView;
        this.f27005x = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable;
        ChatActivityEnterView chatActivityEnterView = this.f27006y;
        if (chatActivityEnterView.X0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f27005x;
            rect.set(0, 0, measuredWidth, measuredHeight);
            rect.inset(AndroidUtilities.dp(7.5f), AndroidUtilities.dp(7.5f));
            if (getCurrentState() == og.f27562b) {
                drawable = chatActivityEnterView.K3;
            } else {
                drawable = chatActivityEnterView.J3;
            }
            drawable.setBounds(rect);
            drawable.draw(canvas);
            return;
        }
        super.draw(canvas);
    }
}
