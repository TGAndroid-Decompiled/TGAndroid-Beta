package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
public final class a41 implements org.telegram.ui.Components.dj0, te.b {
    public final e51 f43559a;

    public a41(e51 e51Var) {
        this.f43559a = e51Var;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.f43559a.t0();
    }

    @Override
    public boolean c(int i7, View view) {
        final e51 e51Var = this.f43559a;
        org.telegram.ui.ActionBar.u1[] u1VarArr = e51Var.f45149g0;
        i41 i41Var = e51Var.W;
        int i10 = i41Var.I;
        if (i7 >= i10 && i7 <= i41Var.J) {
            final org.telegram.messenger.ij ijVar = ((b51) e51Var.f45172y0.get(i7 - i10)).f43931b;
            if (!ijVar.x4()) {
                org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(e51Var, view);
                H.c(2131232378, org.telegram.messenger.id.M0(2131743549, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                e51 e51Var2 = e51Var;
                                e51Var2.getClass();
                                e51Var2.presentFragment(new mg0(ijVar));
                                return;
                            default:
                                e51 e51Var3 = e51Var;
                                e51Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", e51Var3.f45140b);
                                bundle.putInt("message_id", ijVar.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                e51Var3.presentFragment(new cn(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.c(2131232255, org.telegram.messenger.id.M0(2131743550, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                e51 e51Var2 = e51Var;
                                e51Var2.getClass();
                                e51Var2.presentFragment(new mg0(ijVar));
                                return;
                            default:
                                e51 e51Var3 = e51Var;
                                e51Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", e51Var3.f45140b);
                                bundle.putInt("message_id", ijVar.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                e51Var3.presentFragment(new cn(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.W(e51Var.S.U0(view, false));
                H.Z();
                return true;
            }
        } else {
            int i11 = i41Var.U;
            if (i7 >= i11 && i7 <= i41Var.V) {
                ((x41) e51Var.Q.get(i7 - i11)).c(e51Var.f45138a, e51Var, u1VarArr, true);
                return true;
            }
            int i12 = i41Var.R;
            if (i7 >= i12 && i7 <= i41Var.S) {
                ((x41) e51Var.O.get(i7 - i12)).c(e51Var.f45138a, e51Var, u1VarArr, true);
                return true;
            }
            int i13 = i41Var.X;
            if (i7 >= i13 && i7 <= i41Var.Y) {
                ((x41) e51Var.P.get(i7 - i13)).c(e51Var.f45138a, e51Var, u1VarArr, true);
                return true;
            }
        }
        return false;
    }

    @Override
    public void F(float f10, int i7) {
    }
}
