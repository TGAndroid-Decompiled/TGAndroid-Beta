package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class ic1 extends org.telegram.ui.Components.kl0 {
    public final Context f34602c;
    public org.telegram.ui.ActionBar.h6 d;
    public ArrayList e;
    public final ThemeActivity f34603f;

    public ic1(ThemeActivity themeActivity, Context context) {
        this.f34603f = themeActivity;
        this.f34602c = context;
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
        org.telegram.ui.ActionBar.h6 A0;
        if (this.f34603f.f31554f == 1) {
            A0 = org.telegram.ui.ActionBar.i6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.i6.A0();
        }
        this.d = A0;
        this.e = new ArrayList(this.d.f18730b0);
        super.l();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.f42671a;
        int j3 = j(i10);
        if (j3 != 0) {
            if (j3 != 1) {
                return;
            }
            yb1 yb1Var = (yb1) view;
            org.telegram.ui.ActionBar.h6 h6Var = this.d;
            int i11 = yb1.f39801c;
            yb1Var.getClass();
            if (h6Var.W >= 8) {
                yb1Var.f39803b = new int[]{h6Var.l(6), h6Var.l(4), h6Var.l(7), h6Var.l(2), h6Var.l(0), h6Var.l(5), h6Var.l(3)};
                return;
            } else {
                yb1Var.f39803b = new int[7];
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
        Context context = this.f34602c;
        if (i10 != 0) {
            return new s4.c1(new yb1(context));
        }
        return new s4.c1(new ThemeActivity.InnerAccentView(context));
    }
}
