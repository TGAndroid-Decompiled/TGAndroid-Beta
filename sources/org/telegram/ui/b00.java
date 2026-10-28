package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class b00 extends qg.b {
    public final d00 d;

    public b00(d00 d00Var) {
        this.d = d00Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        if (i10 != 8 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final s4.h0 F() {
        return this.d.d.getAdapter();
    }

    @Override
    public final int h() {
        return this.d.f38485e0.size();
    }

    @Override
    public final int j(int i10) {
        return ((h00) this.d.f38485e0.get(i10)).f47075a;
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
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        int i11;
        int i12 = e1Var.f47776f;
        View view = e1Var.f47773a;
        ArrayList arrayList = this.d.f38485e0;
        h00 h00Var = (h00) arrayList.get(i10);
        int i13 = i10 + 1;
        if (i13 < arrayList.size() && (i11 = ((h00) arrayList.get(i13)).f47075a) != 3 && i11 != 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 7) {
            ((j00) view).e(h00Var.f39744m, z10);
        } else if (i12 != 6 && i12 != 3) {
            if (i12 != 0 && i12 == 8) {
                yz yzVar = (yz) view;
                yzVar.f46105a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
                if (yzVar.f46107c != z10) {
                    yzVar.f46107c = z10;
                    yzVar.setWillNotDraw(!z10);
                }
            }
        } else {
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            if (i12 == 6) {
                i9Var.setFixedSize(0);
                i9Var.setText(h00Var.d);
                return;
            }
            i9Var.setFixedSize(12);
            i9Var.setText("");
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View i9Var;
        int i11;
        d00 d00Var = this.d;
        if (i10 == 8) {
            i9Var = new yz(d00Var.getContext());
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23428h5, i9Var, null);
        } else if (i10 == 7) {
            Context context = d00Var.getContext();
            i11 = ((org.telegram.ui.ActionBar.k3) d00Var).currentAccount;
            i9Var = new a00(this, context, i11, d00Var.Y.f19548id);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23428h5, i9Var, null);
        } else if (i10 != 6 && i10 != 3) {
            i9Var = new c00(d00Var, d00Var.getContext());
        } else {
            i9Var = new org.telegram.ui.Cells.i9(d00Var.getContext());
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23300a7, i9Var, null);
        }
        return new s4.e1(i9Var);
    }
}
