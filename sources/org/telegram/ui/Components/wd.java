package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
public final class wd extends pg {
    public final ChatActivityEnterView G;

    public wd(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.G = chatActivityEnterView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.G;
        Paint paint = chatActivityEnterView.f32326y2;
        super.onDraw(canvas);
        if (getTag() != null && chatActivityEnterView.X1 != null && !chatActivityEnterView.X0 && !this.f38299x && !org.telegram.messenger.si.b0(chatActivityEnterView.R).f26515v0[0].isEmpty() && paint != null) {
            canvas.drawCircle(org.telegram.messenger.g0.L(9.0f) + (getWidth() / 2), (getHeight() / 2) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f), paint);
        }
    }
}
