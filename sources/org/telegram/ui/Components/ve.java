package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class ve extends ah {
    public final Rect f33639x;
    public final ChatActivityEnterView f33640y;

    public ve(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.f33640y = chatActivityEnterView;
        this.f33639x = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable;
        ChatActivityEnterView chatActivityEnterView = this.f33640y;
        if (chatActivityEnterView.f25846a1) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f33639x;
            rect.set(0, 0, measuredWidth, measuredHeight);
            rect.inset(AndroidUtilities.dp(7.5f), AndroidUtilities.dp(7.5f));
            if (getCurrentState() == yg.f35039b) {
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
