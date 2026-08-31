package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class a8 implements View.OnClickListener {
    public final int f35058a;
    public final Object f35059b;

    public a8(Object obj, int i10) {
        this.f35058a = i10;
        this.f35059b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35058a) {
            case 0:
                g8 g8Var = (g8) this.f35059b;
                j8 j8Var = g8Var.f37119x;
                if (g8Var.f37115n != null && j8Var.D) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < g8Var.d; i12++) {
                        h8 h8Var = (h8) g8Var.f37115n.get(i12, null);
                        if (h8Var != null) {
                            if (i10 == -1) {
                                i10 = h8Var.h;
                            }
                            i11 = h8Var.h;
                        }
                    }
                    if (i10 >= 0 && i11 >= 0) {
                        j8Var.M = i10;
                        j8Var.N = i11;
                        j8Var.t0();
                        j8Var.o0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.ic.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f35059b).getSwipeBack().b(true);
                return;
            case 2:
                if (((c81) this.f35059b).f35710a.getImageReceiver().getLottieAnimation() != null && !((c81) this.f35059b).f35710a.getImageReceiver().getLottieAnimation().f27823i0) {
                    ((c81) this.f35059b).f35710a.getImageReceiver().getLottieAnimation().L(0, false, false);
                    ((c81) this.f35059b).f35710a.getImageReceiver().getLottieAnimation().F(false);
                    return;
                }
                return;
            default:
                ((mf1) this.f35059b).H0(true);
                return;
        }
    }
}
