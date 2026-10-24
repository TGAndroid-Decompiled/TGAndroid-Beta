package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class b00 extends pg.b {
    public final d00 d;

    public b00(d00 d00Var) {
        this.d = d00Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46345f;
        if (i10 != 8 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final s4.g0 F() {
        return this.d.d.getAdapter();
    }

    @Override
    public final int h() {
        return this.d.f36438e0.size();
    }

    @Override
    public final int j(int i10) {
        return ((h00) this.d.f36438e0.get(i10)).f44712a;
    }

    @Override
    public final void l() {
        F().l();
    }

    @Override
    public final void m(int i10) {
        F().m(i10 + 1);
    }

    @Override
    public final void p(int i10, int i11) {
        F().p(i10 + 1, i11);
    }

    @Override
    public final void q(int i10, int i11) {
        F().q(i10 + 1, i11);
    }

    @Override
    public final void r(int i10, int i11, Object obj) {
        F().r(i10 + 1, i11, obj);
    }

    @Override
    public final void s(int i10, int i11) {
        F().s(i10 + 1, i11);
    }

    @Override
    public final void t(int i10, int i11) {
        F().t(i10 + 1, i11);
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        int i11;
        int i12 = b1Var.f46345f;
        View view = b1Var.f46342a;
        ArrayList arrayList = this.d.f36438e0;
        h00 h00Var = (h00) arrayList.get(i10);
        int i13 = i10 + 1;
        if (i13 < arrayList.size() && (i11 = ((h00) arrayList.get(i13)).f44712a) != 3 && i11 != 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 7) {
            ((j00) view).e(h00Var.f37707m, z10);
        } else if (i12 != 6 && i12 != 3) {
            if (i12 != 0 && i12 == 8) {
                yz yzVar = (yz) view;
                yzVar.f43977a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
                if (yzVar.f43979c != z10) {
                    yzVar.f43979c = z10;
                    yzVar.setWillNotDraw(!z10);
                }
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i12 == 6) {
                e9Var.setFixedSize(0);
                e9Var.setText(h00Var.d);
                return;
            }
            e9Var.setFixedSize(12);
            e9Var.setText("");
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View e9Var;
        int i11;
        d00 d00Var = this.d;
        if (i10 == 8) {
            e9Var = new yz(d00Var.getContext());
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21255h5, e9Var, null);
        } else if (i10 == 7) {
            Context context = d00Var.getContext();
            i11 = ((org.telegram.ui.ActionBar.h3) d00Var).currentAccount;
            e9Var = new a00(this, context, i11, d00Var.Y.f17862id);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21255h5, e9Var, null);
        } else if (i10 != 6 && i10 != 3) {
            e9Var = new c00(d00Var, d00Var.getContext());
        } else {
            e9Var = new org.telegram.ui.Cells.e9(d00Var.getContext());
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, e9Var, null);
        }
        return new s4.b1(e9Var);
    }
}
