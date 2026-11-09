package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class i61 extends org.telegram.ui.Components.pj0 {
    public final Context f46476c;
    public org.telegram.ui.ActionBar.k6 d;
    public ArrayList f46477e;
    public final ThemeActivity f46478f;

    public i61(ThemeActivity themeActivity, Context context) {
        this.f46478f = themeActivity;
        this.f46476c = context;
        f();
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        if (this.f46477e.isEmpty()) {
            return 0;
        }
        return this.f46477e.size() + 1;
    }

    @Override
    public final int d(int i7) {
        if (i7 == b() - 1) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void f() {
        org.telegram.ui.ActionBar.k6 D0;
        if (this.f46478f.f42027f == 1) {
            D0 = org.telegram.ui.ActionBar.l6.J;
        } else {
            D0 = org.telegram.ui.ActionBar.l6.D0();
        }
        this.d = D0;
        this.f46477e = new ArrayList(this.d.f27739b0);
        super.f();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        View view = d1Var.f57056a;
        int d = d(i7);
        if (d != 0) {
            if (d != 1) {
                return;
            }
            z51 z51Var = (z51) view;
            org.telegram.ui.ActionBar.k6 k6Var = this.d;
            int i10 = z51.f52443c;
            z51Var.getClass();
            if (k6Var.W >= 8) {
                z51Var.f52445b = new int[]{k6Var.l(6), k6Var.l(4), k6Var.l(7), k6Var.l(2), k6Var.l(0), k6Var.l(5), k6Var.l(3)};
                return;
            } else {
                z51Var.f52445b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.f42057e = (org.telegram.ui.ActionBar.i6) this.f46477e.get(i7);
        innerAccentView.a(false);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        Context context = this.f46476c;
        if (i7 != 0) {
            return new v4.d1(new z51(context));
        }
        return new v4.d1(new ThemeActivity.InnerAccentView(context));
    }
}
