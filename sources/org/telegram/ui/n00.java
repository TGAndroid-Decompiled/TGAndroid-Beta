package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n00 extends bg.c {
    public final p00 d;

    public n00(p00 p00Var) {
        this.d = p00Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 != 8 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final f2.o0 F() {
        return this.d.d.getAdapter();
    }

    @Override
    public final int h() {
        return this.d.f36912a0.size();
    }

    @Override
    public final int j(int i10) {
        return ((t00) this.d.f36912a0.get(i10)).f1830a;
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
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        int i11;
        int i12 = l1Var.f5777f;
        View view = l1Var.f5774a;
        ArrayList arrayList = this.d.f36912a0;
        t00 t00Var = (t00) arrayList.get(i10);
        int i13 = i10 + 1;
        if (i13 < arrayList.size() && (i11 = ((t00) arrayList.get(i13)).f1830a) != 3 && i11 != 6) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i12 == 7) {
            ((v00) view).e(t00Var.f38350m, z4);
        } else if (i12 != 6 && i12 != 3) {
            if (i12 != 0 && i12 == 8) {
                k00 k00Var = (k00) view;
                k00Var.f35395a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
                if (k00Var.f35397c != z4) {
                    k00Var.f35397c = z4;
                    k00Var.setWillNotDraw(!z4);
                }
            }
        } else {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i12 == 6) {
                z8Var.setFixedSize(0);
                z8Var.setText(t00Var.d);
                return;
            }
            z8Var.setFixedSize(12);
            z8Var.setText("");
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View z8Var;
        int i11;
        p00 p00Var = this.d;
        if (i10 == 8) {
            z8Var = new k00(p00Var.getContext());
            z8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19952h5, false));
        } else if (i10 == 7) {
            Context context = p00Var.getContext();
            i11 = ((org.telegram.ui.ActionBar.g3) p00Var).currentAccount;
            z8Var = new m00(this, context, i11, p00Var.U.f16649id);
            z8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19952h5, false));
        } else if (i10 != 6 && i10 != 3) {
            z8Var = new o00(p00Var, p00Var.getContext());
        } else {
            z8Var = new org.telegram.ui.Cells.z8(p00Var.getContext());
            z8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
        }
        return new f2.l1(z8Var);
    }
}
