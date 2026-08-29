package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class pe extends tg {
    public final Rect f31654x;
    public final ChatActivityEnterView f31655y;

    public pe(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.f31655y = chatActivityEnterView;
        this.f31654x = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable;
        ChatActivityEnterView chatActivityEnterView = this.f31655y;
        if (chatActivityEnterView.W0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f31654x;
            rect.set(0, 0, measuredWidth, measuredHeight);
            rect.inset(AndroidUtilities.dp(7.5f), AndroidUtilities.dp(7.5f));
            if (getCurrentState() == rg.f32294b) {
                drawable = chatActivityEnterView.J3;
            } else {
                drawable = chatActivityEnterView.I3;
            }
            drawable.setBounds(rect);
            drawable.draw(canvas);
            return;
        }
        super.draw(canvas);
    }
}
