package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class ac1 extends org.telegram.ui.Components.vl0 {
    public final Context f32098c;
    public org.telegram.ui.ActionBar.g6 d;
    public ArrayList e;
    public final ThemeActivity f32099f;

    public ac1(ThemeActivity themeActivity, Context context) {
        this.f32099f = themeActivity;
        this.f32098c = context;
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
        org.telegram.ui.ActionBar.g6 A0;
        if (this.f32099f.f31844f == 1) {
            A0 = org.telegram.ui.ActionBar.h6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.h6.A0();
        }
        this.d = A0;
        this.e = new ArrayList(this.d.f18936b0);
        super.l();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.f42961a;
        int j3 = j(i10);
        if (j3 != 0) {
            if (j3 != 1) {
                return;
            }
            qb1 qb1Var = (qb1) view;
            org.telegram.ui.ActionBar.g6 g6Var = this.d;
            int i11 = qb1.f36850c;
            qb1Var.getClass();
            if (g6Var.W >= 8) {
                qb1Var.f36852b = new int[]{g6Var.l(6), g6Var.l(4), g6Var.l(7), g6Var.l(2), g6Var.l(0), g6Var.l(5), g6Var.l(3)};
                return;
            } else {
                qb1Var.f36852b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.e = (org.telegram.ui.ActionBar.f6) this.e.get(i10);
        innerAccentView.a(false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f32098c;
        if (i10 != 0) {
            return new s4.c1(new qb1(context));
        }
        return new s4.c1(new ThemeActivity.InnerAccentView(context));
    }
}
