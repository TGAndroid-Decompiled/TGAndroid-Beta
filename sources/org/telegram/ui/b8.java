package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class b8 implements View.OnClickListener {
    public final int f32277a;
    public final Object f32278b;

    public b8(Object obj, int i10) {
        this.f32277a = i10;
        this.f32278b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32277a) {
            case 0:
                h8 h8Var = (h8) this.f32278b;
                k8 k8Var = h8Var.f34159x;
                if (h8Var.f34155n != null && k8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < h8Var.d; i12++) {
                        i8 i8Var = (i8) h8Var.f34155n.get(i12, null);
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
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f32278b).getSwipeBack().b(true);
                return;
            case 2:
                if (((n81) this.f32278b).f35848a.getImageReceiver().getLottieAnimation() != null && !((n81) this.f32278b).f35848a.getImageReceiver().getLottieAnimation().f25759k0) {
                    ((n81) this.f32278b).f35848a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((n81) this.f32278b).f35848a.getImageReceiver().getLottieAnimation().H(false);
                    return;
                }
                return;
            default:
                ((wf1) this.f32278b).H0(true);
                return;
        }
    }
}
