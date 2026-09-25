package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l00 extends og.b {
    public final n00 d;

    public l00(n00 n00Var) {
        this.d = n00Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42964f;
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
        return this.d.f35719d0.size();
    }

    @Override
    public final int j(int i10) {
        return ((s00) this.d.f35719d0.get(i10)).f15715a;
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
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        int i11;
        int i12 = c1Var.f42964f;
        View view = c1Var.f42961a;
        ArrayList arrayList = this.d.f35719d0;
        s00 s00Var = (s00) arrayList.get(i10);
        int i13 = i10 + 1;
        if (i13 < arrayList.size() && (i11 = ((s00) arrayList.get(i13)).f15715a) != 3 && i11 != 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 7) {
            ((u00) view).e(s00Var.f37563m, z10);
        } else if (i12 != 6 && i12 != 3) {
            if (i12 != 0 && i12 == 8) {
                i00 i00Var = (i00) view;
                i00Var.f34336a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
                if (i00Var.f34338c != z10) {
                    i00Var.f34338c = z10;
                    i00Var.setWillNotDraw(!z10);
                }
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i12 == 6) {
                e9Var.setFixedSize(0);
                e9Var.setText(s00Var.d);
                return;
            }
            e9Var.setFixedSize(12);
            e9Var.setText("");
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View e9Var;
        int i11;
        n00 n00Var = this.d;
        if (i10 == 8) {
            e9Var = new i00(n00Var.getContext());
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19130h5, false));
        } else if (i10 == 7) {
            Context context = n00Var.getContext();
            i11 = ((org.telegram.ui.ActionBar.e3) n00Var).currentAccount;
            e9Var = new k00(this, context, i11, n00Var.X.f15832id);
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19130h5, false));
        } else if (i10 != 6 && i10 != 3) {
            e9Var = new m00(n00Var, n00Var.getContext());
        } else {
            e9Var = new org.telegram.ui.Cells.e9(n00Var.getContext());
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19004a7, false));
        }
        return new s4.c1(e9Var);
    }
}
