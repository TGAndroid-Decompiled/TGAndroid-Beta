package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
public final class vd extends ig {
    public final ChatActivityEnterView F;

    public vd(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.F = chatActivityEnterView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.F;
        Paint paint = chatActivityEnterView.Q1;
        super.onDraw(canvas);
        if (getTag() != null && chatActivityEnterView.f31120p1 != null && !chatActivityEnterView.W0 && !this.f34618x && !org.telegram.messenger.ui.b0(chatActivityEnterView.Q).f25848u0[0].isEmpty() && paint != null) {
            canvas.drawCircle(org.telegram.messenger.g0.L(9.0f) + (getWidth() / 2), (getHeight() / 2) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f), paint);
        }
    }
}
