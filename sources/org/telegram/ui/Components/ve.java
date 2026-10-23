package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class ve extends ah {
    public final Rect f31228x;
    public final ChatActivityEnterView f31229y;

    public ve(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.f31229y = chatActivityEnterView;
        this.f31228x = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable;
        ChatActivityEnterView chatActivityEnterView = this.f31229y;
        if (chatActivityEnterView.f23915a1) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f31228x;
            rect.set(0, 0, measuredWidth, measuredHeight);
            rect.inset(AndroidUtilities.dp(7.5f), AndroidUtilities.dp(7.5f));
            if (getCurrentState() == yg.f32651b) {
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
