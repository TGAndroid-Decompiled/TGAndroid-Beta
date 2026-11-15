package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class e61 extends org.telegram.ui.Components.tj0 {
    public final Context f46583c;
    public org.telegram.ui.ActionBar.i6 d;
    public ArrayList f46584e;
    public final ThemeActivity f46585f;

    public e61(ThemeActivity themeActivity, Context context) {
        this.f46585f = themeActivity;
        this.f46583c = context;
        f();
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override
    public final int b() {
        if (this.f46584e.isEmpty()) {
            return 0;
        }
        return this.f46584e.size() + 1;
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
        org.telegram.ui.ActionBar.i6 D0;
        if (this.f46585f.f43393f == 1) {
            D0 = org.telegram.ui.ActionBar.j6.J;
        } else {
            D0 = org.telegram.ui.ActionBar.j6.D0();
        }
        this.d = D0;
        this.f46584e = new ArrayList(this.d.f28703c0);
        super.f();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        View view = e1Var.f58535a;
        int d = d(i7);
        if (d != 0) {
            if (d != 1) {
                return;
            }
            v51 v51Var = (v51) view;
            org.telegram.ui.ActionBar.i6 i6Var = this.d;
            int i10 = v51.f52137c;
            v51Var.getClass();
            if (i6Var.X >= 8) {
                v51Var.f52139b = new int[]{i6Var.l(6), i6Var.l(4), i6Var.l(7), i6Var.l(2), i6Var.l(0), i6Var.l(5), i6Var.l(3)};
                return;
            } else {
                v51Var.f52139b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.f43423e = (org.telegram.ui.ActionBar.g6) this.f46584e.get(i7);
        innerAccentView.a(false);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        Context context = this.f46583c;
        if (i7 != 0) {
            return new v4.e1(new v51(context));
        }
        return new v4.e1(new ThemeActivity.InnerAccentView(context));
    }
}
