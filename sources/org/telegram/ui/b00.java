package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class b00 extends xf.b {
    public final d00 d;

    public b00(d00 d00Var) {
        this.d = d00Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 8 || i10 == 7;
    }

    public final f2.q0 F() {
        return this.d.d.getAdapter();
    }

    @Override
    public final int h() {
        return this.d.Z.size();
    }

    @Override
    public final int j(int i10) {
        return ((h00) this.d.Z.get(i10)).f49413a;
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
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        ArrayList arrayList = this.d.Z;
        h00 h00Var = (h00) arrayList.get(i10);
        int i13 = i10 + 1;
        boolean z10 = (i13 >= arrayList.size() || (i11 = ((h00) arrayList.get(i13)).f49413a) == 3 || i11 == 6) ? false : true;
        if (i12 == 7) {
            ((j00) view).e(h00Var.f38651m, z10);
            return;
        }
        if (i12 == 6 || i12 == 3) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (i12 == 6) {
                x8Var.setFixedSize(0);
                x8Var.setText(h00Var.d);
                return;
            } else {
                x8Var.setFixedSize(12);
                x8Var.setText("");
                return;
            }
        }
        if (i12 != 0 && i12 == 8) {
            yz yzVar = (yz) view;
            yzVar.f44971a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
            if (yzVar.f44973c != z10) {
                yzVar.f44973c = z10;
                yzVar.setWillNotDraw(!z10);
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View x8Var;
        d00 d00Var = this.d;
        if (i10 == 8) {
            x8Var = new yz(d00Var.getContext());
            x8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
        } else if (i10 == 7) {
            x8Var = new a00(this, d00Var.getContext(), ((org.telegram.ui.ActionBar.e3) d00Var).currentAccount, d00Var.T.f19622id);
            x8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
        } else if (i10 == 6 || i10 == 3) {
            x8Var = new org.telegram.ui.Cells.x8(d00Var.getContext());
            x8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        } else {
            x8Var = new c00(d00Var, d00Var.getContext());
        }
        return new org.telegram.ui.Components.lk0(x8Var);
    }
}
