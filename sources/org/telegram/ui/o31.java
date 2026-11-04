package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
public final class o31 implements org.telegram.ui.Components.hj0, qe.b {
    public final r41 f48179a;

    public o31(r41 r41Var) {
        this.f48179a = r41Var;
    }

    @Override
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        this.f48179a.t0();
    }

    @Override
    public boolean f(int i3, View view) {
        final r41 r41Var = this.f48179a;
        org.telegram.ui.ActionBar.s1[] s1VarArr = r41Var.f49075h0;
        w31 w31Var = r41Var.X;
        int i10 = w31Var.J;
        if (i3 >= i10 && i3 <= w31Var.K) {
            final org.telegram.messenger.zi ziVar = ((o41) r41Var.f49098z0.get(i3 - i10)).f48186b;
            if (!ziVar.y4()) {
                org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(r41Var, view);
                H.c(2131232378, org.telegram.messenger.bd.M0(2131743559, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r41 r41Var2 = r41Var;
                                r41Var2.getClass();
                                r41Var2.presentFragment(new dg0(ziVar));
                                return;
                            default:
                                r41 r41Var3 = r41Var;
                                r41Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", r41Var3.f49065b);
                                bundle.putInt("message_id", ziVar.f1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                r41Var3.presentFragment(new wm(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.c(2131232255, org.telegram.messenger.bd.M0(2131743560, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r41 r41Var2 = r41Var;
                                r41Var2.getClass();
                                r41Var2.presentFragment(new dg0(ziVar));
                                return;
                            default:
                                r41 r41Var3 = r41Var;
                                r41Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", r41Var3.f49065b);
                                bundle.putInt("message_id", ziVar.f1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                r41Var3.presentFragment(new wm(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.W(r41Var.T.U0(view, false));
                H.Z();
                return true;
            }
        } else {
            int i11 = w31Var.V;
            if (i3 >= i11 && i3 <= w31Var.W) {
                ((k41) r41Var.R.get(i3 - i11)).c(r41Var.f49063a, r41Var, s1VarArr, true);
                return true;
            }
            int i12 = w31Var.S;
            if (i3 >= i12 && i3 <= w31Var.T) {
                ((k41) r41Var.P.get(i3 - i12)).c(r41Var.f49063a, r41Var, s1VarArr, true);
                return true;
            }
            int i13 = w31Var.Y;
            if (i3 >= i13 && i3 <= w31Var.Z) {
                ((k41) r41Var.Q.get(i3 - i13)).c(r41Var.f49063a, r41Var, s1VarArr, true);
                return true;
            }
        }
        return false;
    }

    @Override
    public void F(float f10, int i3) {
    }
}
