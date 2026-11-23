package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
public final class ge extends zg {
    public final ChatActivityEnterView G;

    public ge(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.G = chatActivityEnterView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        ChatActivityEnterView chatActivityEnterView = this.G;
        Paint paint = chatActivityEnterView.G2;
        float[] fArr = chatActivityEnterView.H6;
        float[] fArr2 = chatActivityEnterView.G6;
        int i7 = ChatActivityEnterView.f32633s7;
        if (chatActivityEnterView.o0()) {
            if (chatActivityEnterView.F6 == null) {
                nh0 nh0Var = new nh0(2131623977, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
                chatActivityEnterView.F6 = nh0Var;
                nh0Var.J(true);
                chatActivityEnterView.F6.f37818p0 = false;
                int G0 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.n6.Vf);
                nh0 nh0Var2 = chatActivityEnterView.F6;
                nh0Var2.f37799a0 = true;
                nh0Var2.Q(G0, "Cup Grey");
                chatActivityEnterView.F6.Q(G0, "Box_Grey 2");
                chatActivityEnterView.F6.Q(G0, "Box Grey");
                chatActivityEnterView.F6.o();
                chatActivityEnterView.F6.R(this);
                chatActivityEnterView.F6.T(true, 0.0f);
            }
            nh0 nh0Var3 = chatActivityEnterView.F6;
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            float f11 = 1.0f;
            if (getScaleX() != 0.0f) {
                f10 = getScaleX();
            } else {
                f10 = 1.0f;
            }
            if (getScaleY() != 0.0f) {
                f11 = getScaleY();
            }
            if (ChatActivityEnterView.h(chatActivityEnterView, chatActivityEnterView.f32646b2, fArr2) && ChatActivityEnterView.h(chatActivityEnterView, this, fArr)) {
                width = com.google.android.gms.internal.vision.e2.A(fArr2[0], fArr[0], f10, width);
            }
            float L = org.telegram.messenger.g0.L(14.0f) / f10;
            float L2 = org.telegram.messenger.g0.L(14.0f) / f11;
            nh0Var3.setBounds(Math.round(width - L), Math.round(height - L2), Math.round(width + L), Math.round(height + L2));
            nh0Var3.draw(canvas);
            return;
        }
        super.onDraw(canvas);
        if (getTag() != null && chatActivityEnterView.f32680f2 != null && !chatActivityEnterView.X0 && !this.f42850x && !org.telegram.messenger.ri.d0(chatActivityEnterView.R).f26744v0[0].isEmpty() && paint != null) {
            canvas.drawCircle(org.telegram.messenger.g0.L(9.0f) + (getWidth() / 2), (getHeight() / 2) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f), paint);
        }
    }
}
