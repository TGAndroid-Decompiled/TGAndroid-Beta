package org.telegram.ui;

import android.view.WindowManager;
public final class a0 implements Runnable {
    public final int f43507a;
    public final g4 f43508b;

    public a0(g4 g4Var, int i7) {
        this.f43507a = i7;
        this.f43508b = g4Var;
    }

    @Override
    public final void run() {
        float f10;
        switch (this.f43507a) {
            case 0:
                g4 g4Var = this.f43508b;
                try {
                    if (g4Var.f45888f0.getParent() != null) {
                        ((WindowManager) g4Var.L.getSystemService("window")).removeView(g4Var.f45888f0);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                g4 g4Var2 = this.f43508b;
                k0 k0Var = g4Var2.f45889g0;
                if (k0Var != null && g4Var2.f45888f0 != null) {
                    k0Var.setLayerType(0, null);
                    g4Var2.Z = 0;
                    org.telegram.messenger.g0.v1(g4Var2.L.getCurrentFocus());
                    return;
                }
                return;
            case 2:
                this.f43508b.d0();
                return;
            case 3:
                g4 g4Var3 = this.f43508b;
                float currentProgress = 0.7f - g4Var3.f45890h0.f51173d0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f10 = 0.01f;
                    } else {
                        f10 = 0.02f;
                    }
                    org.telegram.ui.Components.i70 i70Var = g4Var3.f45890h0.f51173d0;
                    i70Var.a(true, i70Var.getCurrentProgress() + f10);
                    org.telegram.messenger.g0.i3(g4Var3.f45892j0, 100L);
                    return;
                }
                return;
            case 4:
                org.telegram.messenger.g0.h3(new a0(this.f43508b, 2));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new a0(this.f43508b, 2));
                return;
            case 6:
                this.f43508b.K.a(true);
                return;
            case 7:
                this.f43508b.K.a(true);
                return;
            case 8:
                this.f43508b.a0();
                return;
            case 9:
                this.f43508b.f0();
                return;
            case 10:
                g4 g4Var4 = this.f43508b;
                k0 k0Var2 = g4Var4.f45889g0;
                if (k0Var2 != null) {
                    k0Var2.setLayerType(0, null);
                    g4Var4.Z = 0;
                    g4Var4.K();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != 0) {
                    ?? obj = new Object();
                    obj.f27408a = true;
                    T.showAsSheet(new org.telegram.ui.web.o1(new q(this.f43508b, 3)), obj);
                    return;
                }
                return;
        }
    }
}
