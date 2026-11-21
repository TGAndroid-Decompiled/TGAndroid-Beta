package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class i61 extends org.telegram.ui.Components.dk0 {
    public final Context f48584c;
    public org.telegram.ui.ActionBar.l6 d;
    public ArrayList f48585e;
    public final ThemeActivity f48586f;

    public i61(ThemeActivity themeActivity, Context context) {
        this.f48586f = themeActivity;
        this.f48584c = context;
        f();
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final int b() {
        if (this.f48585e.isEmpty()) {
            return 0;
        }
        return this.f48585e.size() + 1;
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
        org.telegram.ui.ActionBar.l6 D0;
        if (this.f48586f.f43880f == 1) {
            D0 = org.telegram.ui.ActionBar.m6.J;
        } else {
            D0 = org.telegram.ui.ActionBar.m6.D0();
        }
        this.d = D0;
        this.f48585e = new ArrayList(this.d.f29234c0);
        super.f();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        View view = f1Var.f59161a;
        int d = d(i7);
        if (d != 0) {
            if (d != 1) {
                return;
            }
            z51 z51Var = (z51) view;
            org.telegram.ui.ActionBar.l6 l6Var = this.d;
            int i10 = z51.f54441c;
            z51Var.getClass();
            if (l6Var.X >= 8) {
                z51Var.f54443b = new int[]{l6Var.l(6), l6Var.l(4), l6Var.l(7), l6Var.l(2), l6Var.l(0), l6Var.l(5), l6Var.l(3)};
                return;
            } else {
                z51Var.f54443b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.f43910e = (org.telegram.ui.ActionBar.j6) this.f48585e.get(i7);
        innerAccentView.a(false);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        Context context = this.f48584c;
        if (i7 != 0) {
            return new v4.f1(new z51(context));
        }
        return new v4.f1(new ThemeActivity.InnerAccentView(context));
    }
}
