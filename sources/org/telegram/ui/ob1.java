package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class ob1 extends org.telegram.ui.Components.sl0 {
    public final Context f39714c;
    public org.telegram.ui.ActionBar.j6 d;
    public ArrayList f39715e;
    public final ThemeActivity f39716f;

    public ob1(ThemeActivity themeActivity, Context context) {
        this.f39716f = themeActivity;
        this.f39714c = context;
        l();
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f39715e.isEmpty()) {
            return 0;
        }
        return this.f39715e.size() + 1;
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
        org.telegram.ui.ActionBar.j6 A0;
        if (this.f39716f.f34879f == 1) {
            A0 = org.telegram.ui.ActionBar.k6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.k6.A0();
        }
        this.d = A0;
        this.f39715e = new ArrayList(this.d.Y);
        super.l();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        View view = m1Var.f5875a;
        int j10 = j(i10);
        if (j10 != 0) {
            if (j10 != 1) {
                return;
            }
            eb1 eb1Var = (eb1) view;
            org.telegram.ui.ActionBar.j6 j6Var = this.d;
            int i11 = eb1.f36460c;
            eb1Var.getClass();
            if (j6Var.T >= 8) {
                eb1Var.f36462b = new int[]{j6Var.l(6), j6Var.l(4), j6Var.l(7), j6Var.l(2), j6Var.l(0), j6Var.l(5), j6Var.l(3)};
                return;
            } else {
                eb1Var.f36462b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.f34909e = (org.telegram.ui.ActionBar.i6) this.f39715e.get(i10);
        innerAccentView.a(false);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f39714c;
        if (i10 != 0) {
            return new f2.m1(new eb1(context));
        }
        return new f2.m1(new ThemeActivity.InnerAccentView(context));
    }
}
