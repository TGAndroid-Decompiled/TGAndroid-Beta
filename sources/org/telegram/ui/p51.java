package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
public final class p51 implements org.telegram.ui.Components.jk0, fe.e {
    public final s61 f40373a;

    public p51(s61 s61Var) {
        this.f40373a = s61Var;
    }

    @Override
    public boolean f(int i10, View view) {
        final s61 s61Var = this.f40373a;
        org.telegram.ui.ActionBar.x1[] x1VarArr = s61Var.f41246g0;
        x51 x51Var = s61Var.W;
        int i11 = x51Var.I;
        if (i10 >= i11 && i10 <= x51Var.J) {
            final org.telegram.messenger.kj kjVar = ((p61) s61Var.f41269y0.get(i10 - i11)).f40379b;
            if (!kjVar.x4()) {
                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(s61Var, view);
                H.c(2131232377, org.telegram.messenger.dd.L0(2131743575, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s61 s61Var2 = s61Var;
                                s61Var2.getClass();
                                s61Var2.presentFragment(new qh0(kjVar));
                                return;
                            default:
                                s61 s61Var3 = s61Var;
                                s61Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", s61Var3.f41238b);
                                bundle.putInt("message_id", kjVar.f1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                s61Var3.presentFragment(new un(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.c(2131232254, org.telegram.messenger.dd.L0(2131743576, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s61 s61Var2 = s61Var;
                                s61Var2.getClass();
                                s61Var2.presentFragment(new qh0(kjVar));
                                return;
                            default:
                                s61 s61Var3 = s61Var;
                                s61Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", s61Var3.f41238b);
                                bundle.putInt("message_id", kjVar.f1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                s61Var3.presentFragment(new un(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.W(s61Var.S.U0(view, false));
                H.Z();
                return true;
            }
        } else {
            int i12 = x51Var.U;
            if (i10 >= i12 && i10 <= x51Var.V) {
                ((l61) s61Var.Q.get(i10 - i12)).c(s61Var.f41236a, s61Var, x1VarArr, true);
                return true;
            }
            int i13 = x51Var.R;
            if (i10 >= i13 && i10 <= x51Var.S) {
                ((l61) s61Var.O.get(i10 - i13)).c(s61Var.f41236a, s61Var, x1VarArr, true);
                return true;
            }
            int i14 = x51Var.X;
            if (i10 >= i14 && i10 <= x51Var.Y) {
                ((l61) s61Var.P.get(i10 - i14)).c(s61Var.f41236a, s61Var, x1VarArr, true);
                return true;
            }
        }
        return false;
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        this.f40373a.t0();
    }

    @Override
    public void E(float f7, int i10) {
    }
}
