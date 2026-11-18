package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
public final class fe extends yg {
    public final ChatActivityEnterView G;

    public fe(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.G = chatActivityEnterView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        ChatActivityEnterView chatActivityEnterView = this.G;
        Paint paint = chatActivityEnterView.E2;
        float[] fArr = chatActivityEnterView.F6;
        float[] fArr2 = chatActivityEnterView.E6;
        int i7 = ChatActivityEnterView.f32538n7;
        if (chatActivityEnterView.m0()) {
            if (chatActivityEnterView.D6 == null) {
                mh0 mh0Var = new mh0(2131623977, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
                chatActivityEnterView.D6 = mh0Var;
                mh0Var.J(true);
                chatActivityEnterView.D6.f37499p0 = false;
                int C0 = chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.Vf);
                mh0 mh0Var2 = chatActivityEnterView.D6;
                mh0Var2.f37480a0 = true;
                mh0Var2.Q(C0, "Cup Grey");
                chatActivityEnterView.D6.Q(C0, "Box_Grey 2");
                chatActivityEnterView.D6.Q(C0, "Box Grey");
                chatActivityEnterView.D6.o();
                chatActivityEnterView.D6.R(this);
                chatActivityEnterView.D6.T(true, 0.0f);
            }
            mh0 mh0Var3 = chatActivityEnterView.D6;
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
            if (ChatActivityEnterView.h(chatActivityEnterView, chatActivityEnterView.Z1, fArr2) && ChatActivityEnterView.h(chatActivityEnterView, this, fArr)) {
                width = com.google.android.gms.internal.vision.e2.A(fArr2[0], fArr[0], f10, width);
            }
            float L = org.telegram.messenger.g0.L(14.0f) / f10;
            float L2 = org.telegram.messenger.g0.L(14.0f) / f11;
            mh0Var3.setBounds(Math.round(width - L), Math.round(height - L2), Math.round(width + L), Math.round(height + L2));
            mh0Var3.draw(canvas);
            return;
        }
        super.onDraw(canvas);
        if (getTag() != null && chatActivityEnterView.d2 != null && !chatActivityEnterView.X0 && !this.f42488x && !org.telegram.messenger.ri.d0(chatActivityEnterView.R).f26645v0[0].isEmpty() && paint != null) {
            canvas.drawCircle(org.telegram.messenger.g0.L(9.0f) + (getWidth() / 2), (getHeight() / 2) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f), paint);
        }
    }
}
