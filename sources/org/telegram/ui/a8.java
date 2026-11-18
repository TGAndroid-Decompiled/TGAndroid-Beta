package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class a8 implements View.OnClickListener {
    public final int f45492a;
    public final Object f45493b;

    public a8(Object obj, int i7) {
        this.f45492a = i7;
        this.f45493b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45492a) {
            case 0:
                f8 f8Var = (f8) this.f45493b;
                i8 i8Var = f8Var.f47608y;
                if (f8Var.f47603n != null && i8Var.H) {
                    int i7 = -1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < f8Var.d; i11++) {
                        g8 g8Var = (g8) f8Var.f47603n.get(i11, null);
                        if (g8Var != null) {
                            if (i7 == -1) {
                                i7 = g8Var.h;
                            }
                            i10 = g8Var.h;
                        }
                    }
                    if (i7 >= 0 && i10 >= 0) {
                        i8Var.Q = i7;
                        i8Var.R = i10;
                        i8Var.B0();
                        i8Var.u0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.gc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f45493b).getSwipeBack().b(true);
                return;
            case 2:
                if (((a31) this.f45493b).f45443a.getImageReceiver().B() != null && !((a31) this.f45493b).f45443a.getImageReceiver().B().f37495l0) {
                    ((a31) this.f45493b).f45443a.getImageReceiver().B().N(0, false, false);
                    ((a31) this.f45493b).f45443a.getImageReceiver().B().H(false);
                    return;
                }
                return;
            case 3:
                vf.c.t((Context) this.f45493b, org.telegram.messenger.gd.M0(2131745020, null));
                return;
            default:
                ((y91) this.f45493b).L0(true);
                return;
        }
    }
}
