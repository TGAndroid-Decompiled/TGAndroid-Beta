package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class a8 implements View.OnClickListener {
    public final int f32483a;
    public final Object f32484b;

    public a8(Object obj, int i10) {
        this.f32483a = i10;
        this.f32484b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32483a) {
            case 0:
                g8 g8Var = (g8) this.f32484b;
                j8 j8Var = g8Var.f34478x;
                if (g8Var.f34474n != null && j8Var.D) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < g8Var.d; i12++) {
                        h8 h8Var = (h8) g8Var.f34474n.get(i12, null);
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
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f32484b).getSwipeBack().b(true);
                return;
            case 2:
                if (((b81) this.f32484b).f32843a.getImageReceiver().getLottieAnimation() != null && !((b81) this.f32484b).f32843a.getImageReceiver().getLottieAnimation().f25158i0) {
                    ((b81) this.f32484b).f32843a.getImageReceiver().getLottieAnimation().L(0, false, false);
                    ((b81) this.f32484b).f32843a.getImageReceiver().getLottieAnimation().F(false);
                    return;
                }
                return;
            default:
                ((kf1) this.f32484b).H0(true);
                return;
        }
    }
}
