package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class dc1 extends org.telegram.ui.Components.yl0 {
    public final Context f35741c;
    public org.telegram.ui.ActionBar.h6 d;
    public ArrayList f35742e;
    public final ThemeActivity f35743f;

    public dc1(ThemeActivity themeActivity, Context context) {
        this.f35743f = themeActivity;
        this.f35741c = context;
        l();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f35742e.isEmpty()) {
            return 0;
        }
        return this.f35742e.size() + 1;
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
        if (this.f35743f.f34529f == 1) {
            A0 = org.telegram.ui.ActionBar.i6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.i6.A0();
        }
        this.d = A0;
        this.f35742e = new ArrayList(this.d.f20691b0);
        super.l();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.f46524a;
        int j3 = j(i10);
        if (j3 != 0) {
            if (j3 != 1) {
                return;
            }
            tb1 tb1Var = (tb1) view;
            org.telegram.ui.ActionBar.h6 h6Var = this.d;
            int i11 = tb1.f40780c;
            tb1Var.getClass();
            if (h6Var.W >= 8) {
                tb1Var.f40782b = new int[]{h6Var.l(6), h6Var.l(4), h6Var.l(7), h6Var.l(2), h6Var.l(0), h6Var.l(5), h6Var.l(3)};
                return;
            } else {
                tb1Var.f40782b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.f34559e = (org.telegram.ui.ActionBar.f6) this.f35742e.get(i10);
        innerAccentView.a(false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f35741c;
        if (i10 != 0) {
            return new s4.c1(new tb1(context));
        }
        return new s4.c1(new ThemeActivity.InnerAccentView(context));
    }
}
