package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class db1 extends org.telegram.ui.Components.lm0 {
    public final Context f38825c;
    public org.telegram.ui.ActionBar.x6 d;
    public ArrayList e;
    public final ThemeActivity f38826f;

    public db1(ThemeActivity themeActivity, Context context) {
        this.f38826f = themeActivity;
        this.f38825c = context;
        l();
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
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
        org.telegram.ui.ActionBar.x6 C0;
        if (this.f38826f.f36271f == 1) {
            C0 = org.telegram.ui.ActionBar.y6.J;
        } else {
            C0 = org.telegram.ui.ActionBar.y6.C0();
        }
        this.d = C0;
        this.e = new ArrayList(this.d.f23254b0);
        super.l();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        View view = e1Var.f47738a;
        int j10 = j(i10);
        if (j10 != 0) {
            if (j10 != 1) {
                return;
            }
            ta1 ta1Var = (ta1) view;
            org.telegram.ui.ActionBar.x6 x6Var = this.d;
            int i11 = ta1.f43719c;
            ta1Var.getClass();
            if (x6Var.W >= 8) {
                ta1Var.f43721b = new int[]{x6Var.l(6), x6Var.l(4), x6Var.l(7), x6Var.l(2), x6Var.l(0), x6Var.l(5), x6Var.l(3)};
                return;
            } else {
                ta1Var.f43721b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.e = (org.telegram.ui.ActionBar.w6) this.e.get(i10);
        innerAccentView.a(false);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f38825c;
        if (i10 != 0) {
            return new s4.e1(new ta1(context));
        }
        return new s4.e1(new ThemeActivity.InnerAccentView(context));
    }
}
