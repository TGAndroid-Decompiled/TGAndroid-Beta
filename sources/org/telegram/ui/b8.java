package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class b8 implements View.OnClickListener {
    public final int f35586a;
    public final Object f35587b;

    public b8(Object obj, int i10) {
        this.f35586a = i10;
        this.f35587b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35586a) {
            case 0:
                h8 h8Var = (h8) this.f35587b;
                k8 k8Var = h8Var.f37458x;
                if (h8Var.f37454n != null && k8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < h8Var.d; i12++) {
                        i8 i8Var = (i8) h8Var.f37454n.get(i12, null);
                        if (i8Var != null) {
                            if (i10 == -1) {
                                i10 = i8Var.h;
                            }
                            i11 = i8Var.h;
                        }
                    }
                    if (i10 >= 0 && i11 >= 0) {
                        k8Var.P = i10;
                        k8Var.Q = i11;
                        k8Var.t0();
                        k8Var.o0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.qc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f35587b).getSwipeBack().b(true);
                return;
            case 2:
                if (((k71) this.f35587b).f38410a.getImageReceiver().getLottieAnimation() != null && !((k71) this.f35587b).f38410a.getImageReceiver().getLottieAnimation().f31014k0) {
                    ((k71) this.f35587b).f38410a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((k71) this.f35587b).f38410a.getImageReceiver().getLottieAnimation().H(false);
                    return;
                }
                return;
            default:
                ((te1) this.f35587b).H0(true);
                return;
        }
    }
}
