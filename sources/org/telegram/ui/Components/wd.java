package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
public final class wd extends jg {
    public final ChatActivityEnterView F;

    public wd(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.F = chatActivityEnterView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.F;
        Paint paint = chatActivityEnterView.Q1;
        super.onDraw(canvas);
        if (getTag() != null && chatActivityEnterView.f31109p1 != null && !chatActivityEnterView.W0 && !this.f35009x && !org.telegram.messenger.ui.b0(chatActivityEnterView.Q).f25844u0[0].isEmpty() && paint != null) {
            canvas.drawCircle(org.telegram.messenger.g0.L(9.0f) + (getWidth() / 2), (getHeight() / 2) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f), paint);
        }
    }
}
