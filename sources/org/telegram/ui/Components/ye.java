package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class ye extends fh {
    public final Rect f33090x;
    public final ChatActivityEnterView f33091y;

    public ye(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.f33091y = chatActivityEnterView;
        this.f33090x = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable;
        ChatActivityEnterView chatActivityEnterView = this.f33091y;
        if (chatActivityEnterView.f23619a1) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f33090x;
            rect.set(0, 0, measuredWidth, measuredHeight);
            rect.inset(AndroidUtilities.dp(7.5f), AndroidUtilities.dp(7.5f));
            if (getCurrentState() == dh.f25354b) {
                drawable = chatActivityEnterView.f23717q4;
            } else {
                drawable = chatActivityEnterView.f23712p4;
            }
            drawable.setBounds(rect);
            drawable.draw(canvas);
            return;
        }
        super.draw(canvas);
    }
}
