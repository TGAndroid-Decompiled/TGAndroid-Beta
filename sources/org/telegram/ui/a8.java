package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class a8 implements View.OnClickListener {
    public final int f31760a;
    public final Object f31761b;

    public a8(Object obj, int i10) {
        this.f31760a = i10;
        this.f31761b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31760a) {
            case 0:
                g8 g8Var = (g8) this.f31761b;
                j8 j8Var = g8Var.f33909x;
                if (g8Var.f33905n != null && j8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < g8Var.d; i12++) {
                        h8 h8Var = (h8) g8Var.f33905n.get(i12, null);
                        if (h8Var != null) {
                            if (i10 == -1) {
                                i10 = h8Var.h;
                            }
                            i11 = h8Var.h;
                        }
                    }
                    if (i10 >= 0 && i11 >= 0) {
                        j8Var.P = i10;
                        j8Var.Q = i11;
                        j8Var.t0();
                        j8Var.o0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.oc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f31761b).getSwipeBack().b(true);
                return;
            case 2:
                if (((s81) this.f31761b).f37420a.getImageReceiver().getLottieAnimation() != null && !((s81) this.f31761b).f37420a.getImageReceiver().getLottieAnimation().f30235k0) {
                    ((s81) this.f31761b).f37420a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((s81) this.f31761b).f37420a.getImageReceiver().getLottieAnimation().H(false);
                    return;
                }
                return;
            default:
                ((fg1) this.f31761b).H0(true);
                return;
        }
    }
}
