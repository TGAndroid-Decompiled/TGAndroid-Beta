package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class a8 implements View.OnClickListener {
    public final int f45531a;
    public final Object f45532b;

    public a8(Object obj, int i7) {
        this.f45531a = i7;
        this.f45532b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45531a) {
            case 0:
                f8 f8Var = (f8) this.f45532b;
                i8 i8Var = f8Var.f47638y;
                if (f8Var.f47633n != null && i8Var.H) {
                    int i7 = -1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < f8Var.d; i11++) {
                        g8 g8Var = (g8) f8Var.f47633n.get(i11, null);
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
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f45532b).getSwipeBack().b(true);
                return;
            case 2:
                if (((b31) this.f45532b).f45766a.getImageReceiver().B() != null && !((b31) this.f45532b).f45766a.getImageReceiver().B().f38219l0) {
                    ((b31) this.f45532b).f45766a.getImageReceiver().B().N(0, false, false);
                    ((b31) this.f45532b).f45766a.getImageReceiver().B().H(false);
                    return;
                }
                return;
            case 3:
                vf.c.t((Context) this.f45532b, org.telegram.messenger.hd.N0(2131745012, null));
                return;
            default:
                ((y91) this.f45532b).L0(true);
                return;
        }
    }
}
