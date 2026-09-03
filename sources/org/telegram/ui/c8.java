package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class c8 implements View.OnClickListener {
    public final int f33037a;
    public final Object f33038b;

    public c8(Object obj, int i10) {
        this.f33037a = i10;
        this.f33038b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33037a) {
            case 0:
                i8 i8Var = (i8) this.f33038b;
                l8 l8Var = i8Var.f34836x;
                if (i8Var.f34832n != null && l8Var.D) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < i8Var.d; i12++) {
                        j8 j8Var = (j8) i8Var.f34832n.get(i12, null);
                        if (j8Var != null) {
                            if (i10 == -1) {
                                i10 = j8Var.h;
                            }
                            i11 = j8Var.h;
                        }
                    }
                    if (i10 >= 0 && i11 >= 0) {
                        l8Var.M = i10;
                        l8Var.N = i11;
                        l8Var.t0();
                        l8Var.o0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.ic.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f33038b).getSwipeBack().b(true);
                return;
            case 2:
                if (((j81) this.f33038b).f35118a.getImageReceiver().getLottieAnimation() != null && !((j81) this.f33038b).f35118a.getImageReceiver().getLottieAnimation().f25164i0) {
                    ((j81) this.f33038b).f35118a.getImageReceiver().getLottieAnimation().L(0, false, false);
                    ((j81) this.f33038b).f35118a.getImageReceiver().getLottieAnimation().F(false);
                    return;
                }
                return;
            default:
                ((sf1) this.f33038b).H0(true);
                return;
        }
    }
}
