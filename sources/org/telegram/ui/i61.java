package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class i61 extends org.telegram.ui.Components.bk0 {
    public final Context f48590c;
    public org.telegram.ui.ActionBar.m6 d;
    public ArrayList f48591e;
    public final ThemeActivity f48592f;

    public i61(ThemeActivity themeActivity, Context context) {
        this.f48592f = themeActivity;
        this.f48590c = context;
        f();
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final int b() {
        if (this.f48591e.isEmpty()) {
            return 0;
        }
        return this.f48591e.size() + 1;
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
        org.telegram.ui.ActionBar.m6 D0;
        if (this.f48592f.f43839f == 1) {
            D0 = org.telegram.ui.ActionBar.n6.J;
        } else {
            D0 = org.telegram.ui.ActionBar.n6.D0();
        }
        this.d = D0;
        this.f48591e = new ArrayList(this.d.f29254c0);
        super.f();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        View view = f1Var.f59122a;
        int d = d(i7);
        if (d != 0) {
            if (d != 1) {
                return;
            }
            z51 z51Var = (z51) view;
            org.telegram.ui.ActionBar.m6 m6Var = this.d;
            int i10 = z51.f54438c;
            z51Var.getClass();
            if (m6Var.X >= 8) {
                z51Var.f54440b = new int[]{m6Var.l(6), m6Var.l(4), m6Var.l(7), m6Var.l(2), m6Var.l(0), m6Var.l(5), m6Var.l(3)};
                return;
            } else {
                z51Var.f54440b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.f43869e = (org.telegram.ui.ActionBar.k6) this.f48591e.get(i7);
        innerAccentView.a(false);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        Context context = this.f48590c;
        if (i7 != 0) {
            return new v4.f1(new z51(context));
        }
        return new v4.f1(new ThemeActivity.InnerAccentView(context));
    }
}
