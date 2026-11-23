package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class b8 implements View.OnClickListener {
    public final int f45979a;
    public final Object f45980b;

    public b8(Object obj, int i7) {
        this.f45979a = i7;
        this.f45980b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45979a) {
            case 0:
                g8 g8Var = (g8) this.f45980b;
                j8 j8Var = g8Var.f48168y;
                if (g8Var.f48163n != null && j8Var.H) {
                    int i7 = -1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < g8Var.d; i11++) {
                        h8 h8Var = (h8) g8Var.f48163n.get(i11, null);
                        if (h8Var != null) {
                            if (i7 == -1) {
                                i7 = h8Var.h;
                            }
                            i10 = h8Var.h;
                        }
                    }
                    if (i7 >= 0 && i10 >= 0) {
                        j8Var.Q = i7;
                        j8Var.R = i10;
                        j8Var.B0();
                        j8Var.u0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.fc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f45980b).getSwipeBack().b(true);
                return;
            case 2:
                if (((z21) this.f45980b).f54502a.getImageReceiver().C() != null && !((z21) this.f45980b).f54502a.getImageReceiver().C().f37814l0) {
                    ((z21) this.f45980b).f54502a.getImageReceiver().C().N(0, false, false);
                    ((z21) this.f45980b).f54502a.getImageReceiver().C().H(false);
                    return;
                }
                return;
            case 3:
                vf.c.t((Context) this.f45980b, org.telegram.messenger.gd.N0(2131745014, null));
                return;
            default:
                ((w91) this.f45980b).L0(true);
                return;
        }
    }
}
