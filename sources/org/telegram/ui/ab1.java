package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class ab1 extends org.telegram.ui.Components.il0 {
    public final Context f36502c;
    public org.telegram.ui.ActionBar.f6 d;
    public ArrayList f36503e;
    public final ThemeActivity f36504f;

    public ab1(ThemeActivity themeActivity, Context context) {
        this.f36504f = themeActivity;
        this.f36502c = context;
        l();
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f36503e.isEmpty()) {
            return 0;
        }
        return this.f36503e.size() + 1;
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
        org.telegram.ui.ActionBar.f6 A0;
        if (this.f36504f.f36299f == 1) {
            A0 = org.telegram.ui.ActionBar.g6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.g6.A0();
        }
        this.d = A0;
        this.f36503e = new ArrayList(this.d.X);
        super.l();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        View view = n1Var.f6432a;
        int j10 = j(i10);
        if (j10 != 0) {
            if (j10 != 1) {
                return;
            }
            qa1 qa1Var = (qa1) view;
            org.telegram.ui.ActionBar.f6 f6Var = this.d;
            int i11 = qa1.f41610c;
            qa1Var.getClass();
            if (f6Var.S >= 8) {
                qa1Var.f41612b = new int[]{f6Var.l(6), f6Var.l(4), f6Var.l(7), f6Var.l(2), f6Var.l(0), f6Var.l(5), f6Var.l(3)};
                return;
            } else {
                qa1Var.f41612b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.f36329e = (org.telegram.ui.ActionBar.e6) this.f36503e.get(i10);
        innerAccentView.a(false);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f36502c;
        if (i10 != 0) {
            return new f2.n1(new qa1(context));
        }
        return new f2.n1(new ThemeActivity.InnerAccentView(context));
    }
}
