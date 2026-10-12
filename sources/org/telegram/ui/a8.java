package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class a8 implements View.OnClickListener {
    public final int f35720a;
    public final Object f35721b;

    public a8(Object obj, int i10) {
        this.f35720a = i10;
        this.f35721b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35720a) {
            case 0:
                g8 g8Var = (g8) this.f35721b;
                j8 j8Var = g8Var.f37976x;
                if (g8Var.f37972n != null && j8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < g8Var.d; i12++) {
                        h8 h8Var = (h8) g8Var.f37972n.get(i12, null);
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
                org.telegram.ui.Components.sc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f35721b).getSwipeBack().b(true);
                return;
            case 2:
                if (((x81) this.f35721b).f43831a.getImageReceiver().getLottieAnimation() != null && !((x81) this.f35721b).f43831a.getImageReceiver().getLottieAnimation().f26115k0) {
                    ((x81) this.f35721b).f43831a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((x81) this.f35721b).f43831a.getImageReceiver().getLottieAnimation().H(false);
                    return;
                }
                return;
            default:
                ((hg1) this.f35721b).H0(true);
                return;
        }
    }
}
