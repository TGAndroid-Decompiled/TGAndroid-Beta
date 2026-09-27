package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o00 extends og.b {
    public final q00 d;

    public o00(q00 q00Var) {
        this.d = q00Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f43008f;
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
        return this.d.f36595d0.size();
    }

    @Override
    public final int j(int i10) {
        return ((v00) this.d.f36595d0.get(i10)).f15754a;
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
        int i12 = c1Var.f43008f;
        View view = c1Var.f43005a;
        ArrayList arrayList = this.d.f36595d0;
        v00 v00Var = (v00) arrayList.get(i10);
        int i13 = i10 + 1;
        if (i13 < arrayList.size() && (i11 = ((v00) arrayList.get(i13)).f15754a) != 3 && i11 != 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 7) {
            ((x00) view).e(v00Var.f38404m, z10);
        } else if (i12 != 6 && i12 != 3) {
            if (i12 != 0 && i12 == 8) {
                l00 l00Var = (l00) view;
                l00Var.f35211a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
                if (l00Var.f35213c != z10) {
                    l00Var.f35213c = z10;
                    l00Var.setWillNotDraw(!z10);
                }
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i12 == 6) {
                e9Var.setFixedSize(0);
                e9Var.setText(v00Var.d);
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
        q00 q00Var = this.d;
        if (i10 == 8) {
            e9Var = new l00(q00Var.getContext());
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19128h5, false));
        } else if (i10 == 7) {
            Context context = q00Var.getContext();
            i11 = ((org.telegram.ui.ActionBar.g3) q00Var).currentAccount;
            e9Var = new n00(this, context, i11, q00Var.X.f15826id);
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19128h5, false));
        } else if (i10 != 6 && i10 != 3) {
            e9Var = new p00(q00Var, q00Var.getContext());
        } else {
            e9Var = new org.telegram.ui.Cells.e9(q00Var.getContext());
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19001a7, false));
        }
        return new s4.c1(e9Var);
    }
}
