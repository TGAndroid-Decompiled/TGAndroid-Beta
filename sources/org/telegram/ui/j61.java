package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class j61 extends org.telegram.ui.Components.oj0 {
    public final Context f46831c;
    public org.telegram.ui.ActionBar.l6 d;
    public ArrayList f46832e;
    public final ThemeActivity f46833f;

    public j61(ThemeActivity themeActivity, Context context) {
        this.f46833f = themeActivity;
        this.f46831c = context;
        f();
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        if (this.f46832e.isEmpty()) {
            return 0;
        }
        return this.f46832e.size() + 1;
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
        if (this.f46833f.f42018f == 1) {
            D0 = org.telegram.ui.ActionBar.m6.J;
        } else {
            D0 = org.telegram.ui.ActionBar.m6.D0();
        }
        this.d = D0;
        this.f46832e = new ArrayList(this.d.f27768b0);
        super.f();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        View view = d1Var.f57052a;
        int d = d(i7);
        if (d != 0) {
            if (d != 1) {
                return;
            }
            a61 a61Var = (a61) view;
            org.telegram.ui.ActionBar.l6 l6Var = this.d;
            int i10 = a61.f43586c;
            a61Var.getClass();
            if (l6Var.W >= 8) {
                a61Var.f43588b = new int[]{l6Var.l(6), l6Var.l(4), l6Var.l(7), l6Var.l(2), l6Var.l(0), l6Var.l(5), l6Var.l(3)};
                return;
            } else {
                a61Var.f43588b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.f42048e = (org.telegram.ui.ActionBar.j6) this.f46832e.get(i7);
        innerAccentView.a(false);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        Context context = this.f46831c;
        if (i7 != 0) {
            return new v4.d1(new a61(context));
        }
        return new v4.d1(new ThemeActivity.InnerAccentView(context));
    }
}
