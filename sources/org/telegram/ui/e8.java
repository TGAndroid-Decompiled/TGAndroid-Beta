package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class e8 implements View.OnClickListener {
    public final int f38776a;
    public final Object f38777b;

    public e8(Object obj, int i10) {
        this.f38776a = i10;
        this.f38777b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38776a) {
            case 0:
                k8 k8Var = (k8) this.f38777b;
                n8 n8Var = k8Var.f40685x;
                if (k8Var.f40681n != null && n8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < k8Var.d; i12++) {
                        l8 l8Var = (l8) k8Var.f40681n.get(i12, null);
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
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f38777b).getSwipeBack().b(true);
                return;
            case 2:
                if (((q71) this.f38777b).f42627a.getImageReceiver().getLottieAnimation() != null && !((q71) this.f38777b).f42627a.getImageReceiver().getLottieAnimation().f35080k0) {
                    ((q71) this.f38777b).f42627a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((q71) this.f38777b).f42627a.getImageReceiver().getLottieAnimation().H(false);
                    return;
                }
                return;
            default:
                ((cf1) this.f38777b).H0(true);
                return;
        }
    }
}
