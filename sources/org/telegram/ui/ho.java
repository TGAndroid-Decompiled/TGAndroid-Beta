package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class ho extends org.telegram.ui.Components.bk0 {
    public final io f48457c;

    public ho(io ioVar) {
        this.f48457c = ioVar;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59127f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f48457c.f48772i3.O.size() + 2;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (i7 <= this.f48457c.f48772i3.O.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        io ioVar = this.f48457c;
        jo joVar = ioVar.f48772i3;
        int i10 = f1Var.f59127f;
        View view = f1Var.f59123a;
        if (i10 != 0) {
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 == 2) {
                    ((org.telegram.ui.Cells.a9) view).setText(org.telegram.messenger.gd.M0(2131743406, null));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) joVar.O.get(i7 - 1);
            ia iaVar = (ia) view;
            if (iaVar.I) {
                joVar.P = null;
            }
            if (i7 >= joVar.O.size()) {
                z10 = false;
            }
            iaVar.a(tL_username, z10, false, 0L);
            if (tL_username != null && tL_username.editable) {
                joVar.P = iaVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, o4Var, ioVar.f34074o2);
        o4Var.setText(org.telegram.messenger.gd.M0(2131743407, null));
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        io ioVar = this.f48457c;
        org.telegram.ui.ActionBar.i6 i6Var = ioVar.f34074o2;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return null;
                }
                return new v4.f1(new org.telegram.ui.Cells.a9(12, ioVar.getContext(), i6Var));
            }
            return new v4.f1(new da(this, ioVar.getContext(), i6Var));
        }
        return new v4.f1(new org.telegram.ui.Cells.o4(ioVar.getContext(), i6Var));
    }
}
