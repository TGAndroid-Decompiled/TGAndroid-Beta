package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class e8 implements View.OnClickListener {
    public final int f39019a;
    public final Object f39020b;

    public e8(Object obj, int i10) {
        this.f39019a = i10;
        this.f39020b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39019a) {
            case 0:
                k8 k8Var = (k8) this.f39020b;
                n8 n8Var = k8Var.f40825x;
                if (k8Var.f40821n != null && n8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < k8Var.d; i12++) {
                        l8 l8Var = (l8) k8Var.f40821n.get(i12, null);
                        if (l8Var != null) {
                            if (i10 == -1) {
                                i10 = l8Var.h;
                            }
                            i11 = l8Var.h;
                        }
                    }
                    if (i10 >= 0 && i11 >= 0) {
                        n8Var.P = i10;
                        n8Var.Q = i11;
                        n8Var.x0();
                        n8Var.q0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.qc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f39020b).getSwipeBack().b(true);
                return;
            case 2:
                if (((o71) this.f39020b).f42114a.getImageReceiver().getLottieAnimation() != null && !((o71) this.f39020b).f42114a.getImageReceiver().getLottieAnimation().f34749k0) {
                    ((o71) this.f39020b).f42114a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((o71) this.f39020b).f42114a.getImageReceiver().getLottieAnimation().H(false);
                    return;
                }
                return;
            default:
                ((af1) this.f39020b).H0(true);
                return;
        }
    }
}
