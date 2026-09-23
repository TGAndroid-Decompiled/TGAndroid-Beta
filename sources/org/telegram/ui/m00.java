package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m00 extends og.b {
    public final o00 d;

    public m00(o00 o00Var) {
        this.d = o00Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42630f;
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
        return this.d.f35654d0.size();
    }

    @Override
    public final int j(int i10) {
        return ((t00) this.d.f35654d0.get(i10)).f15508a;
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
        int i12 = c1Var.f42630f;
        View view = c1Var.f42627a;
        ArrayList arrayList = this.d.f35654d0;
        t00 t00Var = (t00) arrayList.get(i10);
        int i13 = i10 + 1;
        if (i13 < arrayList.size() && (i11 = ((t00) arrayList.get(i13)).f15508a) != 3 && i11 != 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 7) {
            ((v00) view).e(t00Var.f37484m, z10);
        } else if (i12 != 6 && i12 != 3) {
            if (i12 != 0 && i12 == 8) {
                j00 j00Var = (j00) view;
                j00Var.f34294a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
                if (j00Var.f34296c != z10) {
                    j00Var.f34296c = z10;
                    j00Var.setWillNotDraw(!z10);
                }
            }
        } else {
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            if (i12 == 6) {
                f9Var.setFixedSize(0);
                f9Var.setText(t00Var.d);
                return;
            }
            f9Var.setFixedSize(12);
            f9Var.setText("");
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View f9Var;
        int i11;
        o00 o00Var = this.d;
        if (i10 == 8) {
            f9Var = new j00(o00Var.getContext());
            f9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18859h5, false));
        } else if (i10 == 7) {
            Context context = o00Var.getContext();
            i11 = ((org.telegram.ui.ActionBar.f3) o00Var).currentAccount;
            f9Var = new l00(this, context, i11, o00Var.X.f15577id);
            f9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18859h5, false));
        } else if (i10 != 6 && i10 != 3) {
            f9Var = new n00(o00Var, o00Var.getContext());
        } else {
            f9Var = new org.telegram.ui.Cells.f9(o00Var.getContext());
            f9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18733a7, false));
        }
        return new s4.c1(f9Var);
    }
}
