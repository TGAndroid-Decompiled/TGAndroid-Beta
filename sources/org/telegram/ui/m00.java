package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m00 extends cg.c {
    public final o00 d;

    public m00(o00 o00Var) {
        this.d = o00Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 8 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final f2.p0 F() {
        return this.d.d.getAdapter();
    }

    @Override
    public final int h() {
        return this.d.f39490a0.size();
    }

    @Override
    public final int j(int i10) {
        return ((s00) this.d.f39490a0.get(i10)).f2505a;
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
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        int i11;
        int i12 = m1Var.f5879f;
        View view = m1Var.f5875a;
        ArrayList arrayList = this.d.f39490a0;
        s00 s00Var = (s00) arrayList.get(i10);
        int i13 = i10 + 1;
        if (i13 < arrayList.size() && (i11 = ((s00) arrayList.get(i13)).f2505a) != 3 && i11 != 6) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i12 == 7) {
            ((u00) view).e(s00Var.f40980m, z4);
        } else if (i12 != 6 && i12 != 3) {
            if (i12 != 0 && i12 == 8) {
                j00 j00Var = (j00) view;
                j00Var.f37812a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
                if (j00Var.f37814c != z4) {
                    j00Var.f37814c = z4;
                    j00Var.setWillNotDraw(!z4);
                }
            }
        } else {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i12 == 6) {
                a9Var.setFixedSize(0);
                a9Var.setText(s00Var.d);
                return;
            }
            a9Var.setFixedSize(12);
            a9Var.setText("");
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View a9Var;
        int i11;
        o00 o00Var = this.d;
        if (i10 == 8) {
            a9Var = new j00(o00Var.getContext());
            a9Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21733h5, false));
        } else if (i10 == 7) {
            Context context = o00Var.getContext();
            i11 = ((org.telegram.ui.ActionBar.h3) o00Var).currentAccount;
            a9Var = new l00(this, context, i11, o00Var.U.f18057id);
            a9Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21733h5, false));
        } else if (i10 != 6 && i10 != 3) {
            a9Var = new n00(o00Var, o00Var.getContext());
        } else {
            a9Var = new org.telegram.ui.Cells.a9(o00Var.getContext());
            a9Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false));
        }
        return new f2.m1(a9Var);
    }
}
