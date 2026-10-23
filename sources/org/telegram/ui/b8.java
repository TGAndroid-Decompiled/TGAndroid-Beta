package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class b8 implements View.OnClickListener {
    public final int f35958a;
    public final Object f35959b;

    public b8(Object obj, int i10) {
        this.f35958a = i10;
        this.f35959b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35958a) {
            case 0:
                h8 h8Var = (h8) this.f35959b;
                k8 k8Var = h8Var.f37780x;
                if (h8Var.f37776n != null && k8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < h8Var.d; i12++) {
                        i8 i8Var = (i8) h8Var.f37776n.get(i12, null);
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
                        k8Var.u0();
                        k8Var.o0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.qc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f35959b).getSwipeBack().b(true);
                return;
            case 2:
                if (((m71) this.f35959b).f39387a.getImageReceiver().getLottieAnimation() != null && !((m71) this.f35959b).f39387a.getImageReceiver().getLottieAnimation().f32946k0) {
                    ((m71) this.f35959b).f39387a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((m71) this.f35959b).f39387a.getImageReceiver().getLottieAnimation().H(false);
                    return;
                }
                return;
            default:
                ((ye1) this.f35959b).G0(true);
                return;
        }
    }
}
