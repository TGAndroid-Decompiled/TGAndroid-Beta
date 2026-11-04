package org.telegram.ui;

import android.view.WindowManager;
public final class b0 implements Runnable {
    public final int f43863a;
    public final i4 f43864b;

    public b0(i4 i4Var, int i3) {
        this.f43863a = i3;
        this.f43864b = i4Var;
    }

    @Override
    public final void run() {
        float f10;
        switch (this.f43863a) {
            case 0:
                i4 i4Var = this.f43864b;
                try {
                    if (i4Var.f46086g0.getParent() != null) {
                        ((WindowManager) i4Var.M.getSystemService("window")).removeView(i4Var.f46086g0);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                i4 i4Var2 = this.f43864b;
                l0 l0Var = i4Var2.f46087h0;
                if (l0Var != null && i4Var2.f46086g0 != null) {
                    l0Var.setLayerType(0, null);
                    i4Var2.f46077a0 = 0;
                    org.telegram.messenger.g0.v1(i4Var2.M.getCurrentFocus());
                    return;
                }
                return;
            case 2:
                this.f43864b.d0();
                return;
            case 3:
                i4 i4Var3 = this.f43864b;
                float currentProgress = 0.7f - i4Var3.f46088i0.f50878e0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f10 = 0.01f;
                    } else {
                        f10 = 0.02f;
                    }
                    org.telegram.ui.Components.d70 d70Var = i4Var3.f46088i0.f50878e0;
                    d70Var.a(true, d70Var.getCurrentProgress() + f10);
                    org.telegram.messenger.g0.i3(i4Var3.f46090k0, 100L);
                    return;
                }
                return;
            case 4:
                org.telegram.messenger.g0.h3(new b0(this.f43864b, 2));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new b0(this.f43864b, 2));
                return;
            case 6:
                this.f43864b.L.a(true);
                return;
            case 7:
                this.f43864b.L.a(true);
                return;
            case 8:
                this.f43864b.a0();
                return;
            case 9:
                this.f43864b.f0();
                return;
            case 10:
                i4 i4Var4 = this.f43864b;
                l0 l0Var2 = i4Var4.f46087h0;
                if (l0Var2 != null) {
                    l0Var2.setLayerType(0, null);
                    i4Var4.f46077a0 = 0;
                    i4Var4.K();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != 0) {
                    ?? obj = new Object();
                    obj.f27395a = true;
                    T.showAsSheet(new org.telegram.ui.web.m1(new q(this.f43864b, 3)), obj);
                    return;
                }
                return;
        }
    }
}
