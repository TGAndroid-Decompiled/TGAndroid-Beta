package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class c8 implements View.OnClickListener {
    public final int f34754a;
    public final Object f34755b;

    public c8(Object obj, int i10) {
        this.f34754a = i10;
        this.f34755b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34754a) {
            case 0:
                i8 i8Var = (i8) this.f34755b;
                l8 l8Var = i8Var.f37064x;
                if (i8Var.f37060n != null && l8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < i8Var.d; i12++) {
                        j8 j8Var = (j8) i8Var.f37060n.get(i12, null);
                        if (j8Var != null) {
                            if (i10 == -1) {
                                i10 = j8Var.h;
                            }
                            i11 = j8Var.h;
                        }
                    }
                    if (i10 >= 0 && i11 >= 0) {
                        l8Var.P = i10;
                        l8Var.Q = i11;
                        l8Var.t0();
                        l8Var.o0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.sc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f34755b).getSwipeBack().b(true);
                return;
            case 2:
                if (((b91) this.f34755b).f34465a.getImageReceiver().getLottieAnimation() != null && !((b91) this.f34755b).f34465a.getImageReceiver().getLottieAnimation().f31615k0) {
                    ((b91) this.f34755b).f34465a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((b91) this.f34755b).f34465a.getImageReceiver().getLottieAnimation().H(false);
                    return;
                }
                return;
            default:
                ((lg1) this.f34755b).H0(true);
                return;
        }
    }
}
