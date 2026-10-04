package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class dc1 extends org.telegram.ui.Components.yl0 {
    public final Context f35746c;
    public org.telegram.ui.ActionBar.h6 d;
    public ArrayList f35747e;
    public final ThemeActivity f35748f;

    public dc1(ThemeActivity themeActivity, Context context) {
        this.f35748f = themeActivity;
        this.f35746c = context;
        l();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f35747e.isEmpty()) {
            return 0;
        }
        return this.f35747e.size() + 1;
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
        org.telegram.ui.ActionBar.h6 A0;
        if (this.f35748f.f34535f == 1) {
            A0 = org.telegram.ui.ActionBar.i6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.i6.A0();
        }
        this.d = A0;
        this.f35747e = new ArrayList(this.d.f20695b0);
        super.l();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.f46531a;
        int j3 = j(i10);
        if (j3 != 0) {
            if (j3 != 1) {
                return;
            }
            tb1 tb1Var = (tb1) view;
            org.telegram.ui.ActionBar.h6 h6Var = this.d;
            int i11 = tb1.f40786c;
            tb1Var.getClass();
            if (h6Var.W >= 8) {
                tb1Var.f40788b = new int[]{h6Var.l(6), h6Var.l(4), h6Var.l(7), h6Var.l(2), h6Var.l(0), h6Var.l(5), h6Var.l(3)};
                return;
            } else {
                tb1Var.f40788b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.f34565e = (org.telegram.ui.ActionBar.f6) this.f35747e.get(i10);
        innerAccentView.a(false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f35746c;
        if (i10 != 0) {
            return new s4.c1(new tb1(context));
        }
        return new s4.c1(new ThemeActivity.InnerAccentView(context));
    }
}
