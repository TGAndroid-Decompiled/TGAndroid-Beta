package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
public final class rd extends fg {
    public final ChatActivityEnterView F;

    public rd(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.F = chatActivityEnterView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.F;
        Paint paint = chatActivityEnterView.Q1;
        super.onDraw(canvas);
        if (getTag() != null && chatActivityEnterView.f23766p1 != null && !chatActivityEnterView.W0 && !this.f26156x && !org.telegram.messenger.vi.b0(chatActivityEnterView.Q).f18678u0[0].isEmpty() && paint != null) {
            canvas.drawCircle(org.telegram.messenger.i0.L(9.0f) + (getWidth() / 2), (getHeight() / 2) - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(5.0f), paint);
        }
    }
}
