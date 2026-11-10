package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class go extends org.telegram.ui.Components.oj0 {
    public final ho f46137c;

    public go(ho hoVar) {
        this.f46137c = hoVar;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57056f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f46137c.f46402h3.N.size() + 2;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (i7 <= this.f46137c.f46402h3.N.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        ho hoVar = this.f46137c;
        io ioVar = hoVar.f46402h3;
        int i10 = d1Var.f57056f;
        View view = d1Var.f57052a;
        if (i10 != 0) {
            boolean z9 = true;
            if (i10 != 1) {
                if (i10 == 2) {
                    ((org.telegram.ui.Cells.z8) view).setText(org.telegram.messenger.id.M0(2131743643, null));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) ioVar.N.get(i7 - 1);
            ia iaVar = (ia) view;
            if (iaVar.H) {
                ioVar.O = null;
            }
            if (i7 >= ioVar.N.size()) {
                z9 = false;
            }
            iaVar.a(tL_username, z9, false, 0L);
            if (tL_username != null && tL_username.editable) {
                ioVar.O = iaVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, n4Var, hoVar.f36980n2);
        n4Var.setText(org.telegram.messenger.id.M0(2131743644, null));
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        ho hoVar = this.f46137c;
        org.telegram.ui.ActionBar.h6 h6Var = hoVar.f36980n2;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return null;
                }
                return new v4.d1(new org.telegram.ui.Cells.z8(12, hoVar.getContext(), h6Var));
            }
            return new v4.d1(new da(this, hoVar.getContext(), h6Var));
        }
        return new v4.d1(new org.telegram.ui.Cells.n4(hoVar.getContext(), h6Var));
    }
}
