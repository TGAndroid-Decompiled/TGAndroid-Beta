package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class bb1 extends org.telegram.ui.Components.lm0 {
    public final Context f36010c;
    public org.telegram.ui.ActionBar.j6 d;
    public ArrayList e;
    public final ThemeActivity f36011f;

    public bb1(ThemeActivity themeActivity, Context context) {
        this.f36011f = themeActivity;
        this.f36010c = context;
        l();
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
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
        org.telegram.ui.ActionBar.j6 C0;
        if (this.f36011f.f34206f == 1) {
            C0 = org.telegram.ui.ActionBar.k6.J;
        } else {
            C0 = org.telegram.ui.ActionBar.k6.C0();
        }
        this.d = C0;
        this.e = new ArrayList(this.d.f21022b0);
        super.l();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.f46343a;
        int j10 = j(i10);
        if (j10 != 0) {
            if (j10 != 1) {
                return;
            }
            ra1 ra1Var = (ra1) view;
            org.telegram.ui.ActionBar.j6 j6Var = this.d;
            int i11 = ra1.f41073c;
            ra1Var.getClass();
            if (j6Var.W >= 8) {
                ra1Var.f41075b = new int[]{j6Var.l(6), j6Var.l(4), j6Var.l(7), j6Var.l(2), j6Var.l(0), j6Var.l(5), j6Var.l(3)};
                return;
            } else {
                ra1Var.f41075b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.e = (org.telegram.ui.ActionBar.i6) this.e.get(i10);
        innerAccentView.a(false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f36010c;
        if (i10 != 0) {
            return new s4.b1(new ra1(context));
        }
        return new s4.b1(new ThemeActivity.InnerAccentView(context));
    }
}
