package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class a8 implements View.OnClickListener {
    public final int f44956a;
    public final Object f44957b;

    public a8(Object obj, int i7) {
        this.f44956a = i7;
        this.f44957b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44956a) {
            case 0:
                f8 f8Var = (f8) this.f44957b;
                i8 i8Var = f8Var.f47042y;
                if (f8Var.f47037n != null && i8Var.H) {
                    int i7 = -1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < f8Var.d; i11++) {
                        g8 g8Var = (g8) f8Var.f47037n.get(i11, null);
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
                org.telegram.ui.Components.xb.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f44957b).getSwipeBack().b(true);
                return;
            case 2:
                if (((w21) this.f44957b).f52371a.getImageReceiver().B() != null && !((w21) this.f44957b).f52371a.getImageReceiver().B().f33588l0) {
                    ((w21) this.f44957b).f52371a.getImageReceiver().B().N(0, false, false);
                    ((w21) this.f44957b).f52371a.getImageReceiver().B().H(false);
                    return;
                }
                return;
            case 3:
                vf.c.t((Context) this.f44957b, org.telegram.messenger.hd.M0(2131745255, null));
                return;
            default:
                ((u91) this.f44957b).L0(true);
                return;
        }
    }
}
