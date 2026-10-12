package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class ye extends fh {
    public final Rect f33091x;
    public final ChatActivityEnterView f33092y;

    public ye(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.f33092y = chatActivityEnterView;
        this.f33091x = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable;
        ChatActivityEnterView chatActivityEnterView = this.f33092y;
        if (chatActivityEnterView.f23618a1) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f33091x;
            rect.set(0, 0, measuredWidth, measuredHeight);
            rect.inset(AndroidUtilities.dp(7.5f), AndroidUtilities.dp(7.5f));
            if (getCurrentState() == dh.f25362b) {
                drawable = chatActivityEnterView.f23716q4;
            } else {
                drawable = chatActivityEnterView.f23711p4;
            }
            drawable.setBounds(rect);
            drawable.draw(canvas);
            return;
        }
        super.draw(canvas);
    }
}
