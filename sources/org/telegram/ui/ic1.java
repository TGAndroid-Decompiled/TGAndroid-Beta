package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class ic1 extends org.telegram.ui.Components.rm0 {
    public final Context f38657c;
    public org.telegram.ui.ActionBar.g6 d;
    public ArrayList f38658e;
    public final ThemeActivity f38659f;

    public ic1(ThemeActivity themeActivity, Context context) {
        this.f38659f = themeActivity;
        this.f38657c = context;
        l();
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f38658e.isEmpty()) {
            return 0;
        }
        return this.f38658e.size() + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == h() - 1) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.g6 B0;
        if (this.f38659f.f34566f == 1) {
            B0 = org.telegram.ui.ActionBar.h6.J;
        } else {
            B0 = org.telegram.ui.ActionBar.h6.B0();
        }
        this.d = B0;
        this.f38658e = new ArrayList(this.d.f20658b0);
        super.l();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        View view = d1Var.f47748a;
        int j3 = j(i10);
        if (j3 != 0) {
            if (j3 != 1) {
                return;
            }
            yb1 yb1Var = (yb1) view;
            org.telegram.ui.ActionBar.g6 g6Var = this.d;
            int i11 = yb1.f44306c;
            yb1Var.getClass();
            if (g6Var.W >= 8) {
                yb1Var.f44308b = new int[]{g6Var.l(6), g6Var.l(4), g6Var.l(7), g6Var.l(2), g6Var.l(0), g6Var.l(5), g6Var.l(3)};
                return;
            } else {
                yb1Var.f44308b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.f34596e = (org.telegram.ui.ActionBar.f6) this.f38658e.get(i10);
        innerAccentView.a(false);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f38657c;
        if (i10 != 0) {
            return new s4.d1(new yb1(context));
        }
        return new s4.d1(new ThemeActivity.InnerAccentView(context));
    }
}
