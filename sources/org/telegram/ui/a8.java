package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class a8 implements View.OnClickListener {
    public final int f45487a;
    public final Object f45488b;

    public a8(Object obj, int i7) {
        this.f45487a = i7;
        this.f45488b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45487a) {
            case 0:
                f8 f8Var = (f8) this.f45488b;
                i8 i8Var = f8Var.f47566y;
                if (f8Var.f47561n != null && i8Var.H) {
                    int i7 = -1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < f8Var.d; i11++) {
                        g8 g8Var = (g8) f8Var.f47561n.get(i11, null);
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
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f45488b).getSwipeBack().b(true);
                return;
            case 2:
                if (((a31) this.f45488b).f45443a.getImageReceiver().B() != null && !((a31) this.f45488b).f45443a.getImageReceiver().B().f37495l0) {
                    ((a31) this.f45488b).f45443a.getImageReceiver().B().N(0, false, false);
                    ((a31) this.f45488b).f45443a.getImageReceiver().B().H(false);
                    return;
                }
                return;
            case 3:
                vf.c.t((Context) this.f45488b, org.telegram.messenger.gd.M0(2131745020, null));
                return;
            default:
                ((y91) this.f45488b).L0(true);
                return;
        }
    }
}
