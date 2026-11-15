package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class fo extends org.telegram.ui.Components.tj0 {
    public final go f47173c;

    public fo(go goVar) {
        this.f47173c = goVar;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f47173c.f47497i3.O.size() + 2;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (i7 <= this.f47173c.f47497i3.O.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        go goVar = this.f47173c;
        ho hoVar = goVar.f47497i3;
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        if (i10 != 0) {
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 == 2) {
                    ((org.telegram.ui.Cells.y8) view).setText(org.telegram.messenger.hd.M0(2131743643, null));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) hoVar.O.get(i7 - 1);
            ia iaVar = (ia) view;
            if (iaVar.I) {
                hoVar.P = null;
            }
            if (i7 >= hoVar.O.size()) {
                z10 = false;
            }
            iaVar.a(tL_username, z10, false, 0L);
            if (tL_username != null && tL_username.editable) {
                hoVar.P = iaVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, n4Var, goVar.f40069o2);
        n4Var.setText(org.telegram.messenger.hd.M0(2131743644, null));
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        go goVar = this.f47173c;
        org.telegram.ui.ActionBar.e6 e6Var = goVar.f40069o2;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return null;
                }
                return new v4.e1(new org.telegram.ui.Cells.y8(12, goVar.getContext(), e6Var));
            }
            return new v4.e1(new da(this, goVar.getContext(), e6Var));
        }
        return new v4.e1(new org.telegram.ui.Cells.n4(goVar.getContext(), e6Var));
    }
}
