package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class a8 implements View.OnClickListener {
    public final int f43681a;
    public final Object f43682b;

    public a8(Object obj, int i3) {
        this.f43681a = i3;
        this.f43682b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43681a) {
            case 0:
                f8 f8Var = (f8) this.f43682b;
                i8 i8Var = f8Var.f45185y;
                if (f8Var.f45180n != null && i8Var.H) {
                    int i3 = -1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < f8Var.d; i11++) {
                        g8 g8Var = (g8) f8Var.f45180n.get(i11, null);
                        if (g8Var != null) {
                            if (i3 == -1) {
                                i3 = g8Var.h;
                            }
                            i10 = g8Var.h;
                        }
                    }
                    if (i3 >= 0 && i10 >= 0) {
                        i8Var.Q = i3;
                        i8Var.R = i10;
                        i8Var.B0();
                        i8Var.u0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.ac.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f43682b).getSwipeBack().b(true);
                return;
            case 2:
                if (((p21) this.f43682b).f48425a.getImageReceiver().B() != null && !((p21) this.f43682b).f48425a.getImageReceiver().B().f32734l0) {
                    ((p21) this.f43682b).f48425a.getImageReceiver().B().N(0, false, false);
                    ((p21) this.f43682b).f48425a.getImageReceiver().B().H(false);
                    return;
                }
                return;
            case 3:
                sf.c.t((Context) this.f43682b, org.telegram.messenger.bd.M0(2131745265, null));
                return;
            default:
                ((m91) this.f43682b).L0(true);
                return;
        }
    }
}
