package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class me extends qg {
    public final Rect f30800x;
    public final ChatActivityEnterView f30801y;

    public me(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.f30801y = chatActivityEnterView;
        this.f30800x = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable;
        ChatActivityEnterView chatActivityEnterView = this.f30801y;
        if (chatActivityEnterView.W0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f30800x;
            rect.set(0, 0, measuredWidth, measuredHeight);
            rect.inset(AndroidUtilities.dp(7.5f), AndroidUtilities.dp(7.5f));
            if (getCurrentState() == og.f31381b) {
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
