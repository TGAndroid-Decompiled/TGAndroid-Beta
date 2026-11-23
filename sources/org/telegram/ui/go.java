package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class go extends org.telegram.ui.Components.dk0 {
    public final ho f48090c;

    public go(ho hoVar) {
        this.f48090c = hoVar;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f59115f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f48090c.f48471i3.O.size() + 2;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (i7 <= this.f48090c.f48471i3.O.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        ho hoVar = this.f48090c;
        io ioVar = hoVar.f48471i3;
        int i10 = e1Var.f59115f;
        View view = e1Var.f59111a;
        if (i10 != 0) {
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 == 2) {
                    ((org.telegram.ui.Cells.a9) view).setText(org.telegram.messenger.hd.N0(2131743400, null));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) ioVar.O.get(i7 - 1);
            ia iaVar = (ia) view;
            if (iaVar.I) {
                ioVar.P = null;
            }
            if (i7 >= ioVar.O.size()) {
                z10 = false;
            }
            iaVar.a(tL_username, z10, false, 0L);
            if (tL_username != null && tL_username.editable) {
                ioVar.P = iaVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, o4Var, hoVar.f34859o2);
        o4Var.setText(org.telegram.messenger.hd.N0(2131743401, null));
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        ho hoVar = this.f48090c;
        org.telegram.ui.ActionBar.h6 h6Var = hoVar.f34859o2;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return null;
                }
                return new v4.e1(new org.telegram.ui.Cells.a9(12, hoVar.getContext(), h6Var));
            }
            return new v4.e1(new da(this, hoVar.getContext(), h6Var));
        }
        return new v4.e1(new org.telegram.ui.Cells.o4(hoVar.getContext(), h6Var));
    }
}
