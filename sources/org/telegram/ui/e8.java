package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class e8 implements View.OnClickListener {
    public final int f39016a;
    public final Object f39017b;

    public e8(Object obj, int i10) {
        this.f39016a = i10;
        this.f39017b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39016a) {
            case 0:
                k8 k8Var = (k8) this.f39017b;
                n8 n8Var = k8Var.f40822x;
                if (k8Var.f40818n != null && n8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < k8Var.d; i12++) {
                        l8 l8Var = (l8) k8Var.f40818n.get(i12, null);
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
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f39017b).getSwipeBack().b(true);
                return;
            case 2:
                if (((o71) this.f39017b).f42111a.getImageReceiver().getLottieAnimation() != null && !((o71) this.f39017b).f42111a.getImageReceiver().getLottieAnimation().f34746k0) {
                    ((o71) this.f39017b).f42111a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((o71) this.f39017b).f42111a.getImageReceiver().getLottieAnimation().H(false);
                    return;
                }
                return;
            default:
                ((af1) this.f39017b).H0(true);
                return;
        }
    }
}
