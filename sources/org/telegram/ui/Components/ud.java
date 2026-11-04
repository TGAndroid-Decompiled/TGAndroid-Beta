package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
public final class ud extends hg {
    public final ChatActivityEnterView G;

    public ud(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.G = chatActivityEnterView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.G;
        Paint paint = chatActivityEnterView.R1;
        super.onDraw(canvas);
        if (getTag() != null && chatActivityEnterView.f31180q1 != null && !chatActivityEnterView.X0 && !this.f34384x && !org.telegram.messenger.li.b0(chatActivityEnterView.R).f24055v0[0].isEmpty() && paint != null) {
            canvas.drawCircle(org.telegram.messenger.g0.L(9.0f) + (getWidth() / 2), (getHeight() / 2) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f), paint);
        }
    }
}
