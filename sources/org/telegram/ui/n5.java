package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class n5 extends View {
    public final int f39697a = 0;
    public final org.telegram.ui.Components.kp f39698b;

    public n5(Context context) {
        super(context);
        this.f39698b = new org.telegram.ui.Components.kp(org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f39697a) {
            case 0:
                int width = getWidth();
                int height = getHeight();
                org.telegram.ui.Components.kp kpVar = this.f39698b;
                kpVar.setBounds(0, 0, width, height);
                kpVar.b(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21095m5, false));
                kpVar.setAlpha(255);
                kpVar.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
            default:
                int L = org.telegram.messenger.i0.L(1.0f);
                org.telegram.ui.Components.kp kpVar2 = this.f39698b;
                kpVar2.setBounds(L, L, (getWidth() - L) - L, (getHeight() - L) - L);
                kpVar2.draw(canvas);
                invalidate();
                return;
        }
    }

    public n5(Activity activity) {
        super(activity);
        this.f39698b = new org.telegram.ui.Components.kp(org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21095m5, false));
    }
}
