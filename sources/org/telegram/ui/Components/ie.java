package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

public final class ie extends mg {

    public final Rect f29339x;

    public final ChatActivityEnterView f29340y;

    public ie(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.f29340y = chatActivityEnterView;
        this.f29339x = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.f29340y;
        if (!chatActivityEnterView.W0) {
            super.draw(canvas);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Rect rect = this.f29339x;
        rect.set(0, 0, measuredWidth, measuredHeight);
        rect.inset(AndroidUtilities.dp(7.5f), AndroidUtilities.dp(7.5f));
        Drawable drawable = getCurrentState() == kg.f30098b ? chatActivityEnterView.J3 : chatActivityEnterView.I3;
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }
}
