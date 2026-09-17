package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class we extends bh {
    public final Rect f32249x;
    public final ChatActivityEnterView f32250y;

    public we(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.f32250y = chatActivityEnterView;
        this.f32249x = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable;
        ChatActivityEnterView chatActivityEnterView = this.f32250y;
        if (chatActivityEnterView.f23665a1) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f32249x;
            rect.set(0, 0, measuredWidth, measuredHeight);
            rect.inset(AndroidUtilities.dp(7.5f), AndroidUtilities.dp(7.5f));
            if (getCurrentState() == zg.f33151b) {
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
