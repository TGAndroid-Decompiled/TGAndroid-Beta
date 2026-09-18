package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class hc1 extends org.telegram.ui.Components.vl0 {
    public final Context f34120c;
    public org.telegram.ui.ActionBar.i6 d;
    public ArrayList e;
    public final ThemeActivity f34121f;

    public hc1(ThemeActivity themeActivity, Context context) {
        this.f34121f = themeActivity;
        this.f34120c = context;
        l();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
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
        org.telegram.ui.ActionBar.i6 A0;
        if (this.f34121f.f31801f == 1) {
            A0 = org.telegram.ui.ActionBar.j6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.j6.A0();
        }
        this.d = A0;
        this.e = new ArrayList(this.d.f18944b0);
        super.l();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.f42929a;
        int j3 = j(i10);
        if (j3 != 0) {
            if (j3 != 1) {
                return;
            }
            xb1 xb1Var = (xb1) view;
            org.telegram.ui.ActionBar.i6 i6Var = this.d;
            int i11 = xb1.f39427c;
            xb1Var.getClass();
            if (i6Var.W >= 8) {
                xb1Var.f39429b = new int[]{i6Var.l(6), i6Var.l(4), i6Var.l(7), i6Var.l(2), i6Var.l(0), i6Var.l(5), i6Var.l(3)};
                return;
            } else {
                xb1Var.f39429b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.e = (org.telegram.ui.ActionBar.g6) this.e.get(i10);
        innerAccentView.a(false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f34120c;
        if (i10 != 0) {
            return new s4.c1(new xb1(context));
        }
        return new s4.c1(new ThemeActivity.InnerAccentView(context));
    }
}
