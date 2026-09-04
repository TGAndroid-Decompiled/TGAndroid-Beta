package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p00 extends pg.b {
    public final r00 d;

    public p00(r00 r00Var) {
        this.d = r00Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f45742f;
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
        return this.d.f40029d0.size();
    }

    @Override
    public final int j(int i10) {
        return ((w00) this.d.f40029d0.get(i10)).f44071a;
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
        int i12 = c1Var.f45742f;
        View view = c1Var.f45738a;
        ArrayList arrayList = this.d.f40029d0;
        w00 w00Var = (w00) arrayList.get(i10);
        int i13 = i10 + 1;
        if (i13 < arrayList.size() && (i11 = ((w00) arrayList.get(i13)).f44071a) != 3 && i11 != 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 7) {
            ((y00) view).e(w00Var.f41740m, z10);
        } else if (i12 != 6 && i12 != 3) {
            if (i12 != 0 && i12 == 8) {
                m00 m00Var = (m00) view;
                m00Var.f38530a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
                if (m00Var.f38532c != z10) {
                    m00Var.f38532c = z10;
                    m00Var.setWillNotDraw(!z10);
                }
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i12 == 6) {
                e9Var.setFixedSize(0);
                e9Var.setText(w00Var.d);
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
        r00 r00Var = this.d;
        if (i10 == 8) {
            e9Var = new m00(r00Var.getContext());
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20734h5, false));
        } else if (i10 == 7) {
            Context context = r00Var.getContext();
            i11 = ((org.telegram.ui.ActionBar.f3) r00Var).currentAccount;
            e9Var = new o00(this, context, i11, r00Var.X.f17080id);
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20734h5, false));
        } else if (i10 != 6 && i10 != 3) {
            e9Var = new q00(r00Var, r00Var.getContext());
        } else {
            e9Var = new org.telegram.ui.Cells.e9(r00Var.getContext());
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false));
        }
        return new s4.c1(e9Var);
    }
}
