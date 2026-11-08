package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class h61 extends org.telegram.ui.Components.oj0 {
    public final Context f46228c;
    public org.telegram.ui.ActionBar.j6 d;
    public ArrayList f46229e;
    public final ThemeActivity f46230f;

    public h61(ThemeActivity themeActivity, Context context) {
        this.f46230f = themeActivity;
        this.f46228c = context;
        f();
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        if (this.f46229e.isEmpty()) {
            return 0;
        }
        return this.f46229e.size() + 1;
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
        org.telegram.ui.ActionBar.j6 D0;
        if (this.f46230f.f42020f == 1) {
            D0 = org.telegram.ui.ActionBar.k6.J;
        } else {
            D0 = org.telegram.ui.ActionBar.k6.D0();
        }
        this.d = D0;
        this.f46229e = new ArrayList(this.d.f27632b0);
        super.f();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        View view = d1Var.f57043a;
        int d = d(i7);
        if (d != 0) {
            if (d != 1) {
                return;
            }
            y51 y51Var = (y51) view;
            org.telegram.ui.ActionBar.j6 j6Var = this.d;
            int i10 = y51.f52089c;
            y51Var.getClass();
            if (j6Var.W >= 8) {
                y51Var.f52091b = new int[]{j6Var.l(6), j6Var.l(4), j6Var.l(7), j6Var.l(2), j6Var.l(0), j6Var.l(5), j6Var.l(3)};
                return;
            } else {
                y51Var.f52091b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.f42050e = (org.telegram.ui.ActionBar.h6) this.f46229e.get(i7);
        innerAccentView.a(false);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        Context context = this.f46228c;
        if (i7 != 0) {
            return new v4.d1(new y51(context));
        }
        return new v4.d1(new ThemeActivity.InnerAccentView(context));
    }
}
