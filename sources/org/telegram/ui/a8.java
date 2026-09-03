package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class a8 implements View.OnClickListener {
    public final int f35056a;
    public final Object f35057b;

    public a8(Object obj, int i10) {
        this.f35056a = i10;
        this.f35057b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35056a) {
            case 0:
                g8 g8Var = (g8) this.f35057b;
                j8 j8Var = g8Var.f37021x;
                if (g8Var.f37017n != null && j8Var.D) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < g8Var.d; i12++) {
                        h8 h8Var = (h8) g8Var.f37017n.get(i12, null);
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
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f35057b).getSwipeBack().b(true);
                return;
            case 2:
                if (((i81) this.f35057b).f37574a.getImageReceiver().getLottieAnimation() != null && !((i81) this.f35057b).f37574a.getImageReceiver().getLottieAnimation().f27530i0) {
                    ((i81) this.f35057b).f37574a.getImageReceiver().getLottieAnimation().L(0, false, false);
                    ((i81) this.f35057b).f37574a.getImageReceiver().getLottieAnimation().F(false);
                    return;
                }
                return;
            default:
                ((sf1) this.f35057b).H0(true);
                return;
        }
    }
}
