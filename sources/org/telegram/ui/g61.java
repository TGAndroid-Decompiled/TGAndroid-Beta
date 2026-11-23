package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class g61 extends org.telegram.ui.Components.dk0 {
    public final Context f48118c;
    public org.telegram.ui.ActionBar.m6 d;
    public ArrayList f48119e;
    public final ThemeActivity f48120f;

    public g61(ThemeActivity themeActivity, Context context) {
        this.f48120f = themeActivity;
        this.f48118c = context;
        f();
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final int b() {
        if (this.f48119e.isEmpty()) {
            return 0;
        }
        return this.f48119e.size() + 1;
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
        if (this.f48120f.f43965f == 1) {
            D0 = org.telegram.ui.ActionBar.n6.J;
        } else {
            D0 = org.telegram.ui.ActionBar.n6.D0();
        }
        this.d = D0;
        this.f48119e = new ArrayList(this.d.f29325c0);
        super.f();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        View view = f1Var.f59245a;
        int d = d(i7);
        if (d != 0) {
            if (d != 1) {
                return;
            }
            x51 x51Var = (x51) view;
            org.telegram.ui.ActionBar.m6 m6Var = this.d;
            int i10 = x51.f53861c;
            x51Var.getClass();
            if (m6Var.X >= 8) {
                x51Var.f53863b = new int[]{m6Var.l(6), m6Var.l(4), m6Var.l(7), m6Var.l(2), m6Var.l(0), m6Var.l(5), m6Var.l(3)};
                return;
            } else {
                x51Var.f53863b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.f43995e = (org.telegram.ui.ActionBar.k6) this.f48119e.get(i7);
        innerAccentView.a(false);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        Context context = this.f48118c;
        if (i7 != 0) {
            return new v4.f1(new x51(context));
        }
        return new v4.f1(new ThemeActivity.InnerAccentView(context));
    }
}
