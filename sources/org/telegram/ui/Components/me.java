package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class me extends qg {
    public final Rect f29016x;
    public final ChatActivityEnterView f29017y;

    public me(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.f29017y = chatActivityEnterView;
        this.f29016x = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable;
        ChatActivityEnterView chatActivityEnterView = this.f29017y;
        if (chatActivityEnterView.X0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f29016x;
            rect.set(0, 0, measuredWidth, measuredHeight);
            rect.inset(AndroidUtilities.dp(7.5f), AndroidUtilities.dp(7.5f));
            if (getCurrentState() == og.f29748b) {
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
