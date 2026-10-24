package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class b8 implements View.OnClickListener {
    public final int f35947a;
    public final Object f35948b;

    public b8(Object obj, int i10) {
        this.f35947a = i10;
        this.f35948b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35947a) {
            case 0:
                h8 h8Var = (h8) this.f35948b;
                k8 k8Var = h8Var.f37783x;
                if (h8Var.f37779n != null && k8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < h8Var.d; i12++) {
                        i8 i8Var = (i8) h8Var.f37779n.get(i12, null);
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
                org.telegram.ui.Components.oc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f35948b).getSwipeBack().b(true);
                return;
            case 2:
                if (((l71) this.f35948b).f39130a.getImageReceiver().getLottieAnimation() != null && !((l71) this.f35948b).f39130a.getImageReceiver().getLottieAnimation().f32607k0) {
                    ((l71) this.f35948b).f39130a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((l71) this.f35948b).f39130a.getImageReceiver().getLottieAnimation().H(false);
                    return;
                }
                return;
            default:
                ((xe1) this.f35948b).G0(true);
                return;
        }
    }
}
