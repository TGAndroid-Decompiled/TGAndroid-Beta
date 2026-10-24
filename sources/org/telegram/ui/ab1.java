package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class ab1 extends org.telegram.ui.Components.km0 {
    public final Context f35723c;
    public org.telegram.ui.ActionBar.j6 d;
    public ArrayList e;
    public final ThemeActivity f35724f;

    public ab1(ThemeActivity themeActivity, Context context) {
        this.f35724f = themeActivity;
        this.f35723c = context;
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
        if (this.f35724f.f34208f == 1) {
            C0 = org.telegram.ui.ActionBar.k6.J;
        } else {
            C0 = org.telegram.ui.ActionBar.k6.C0();
        }
        this.d = C0;
        this.e = new ArrayList(this.d.f21023b0);
        super.l();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.f46342a;
        int j10 = j(i10);
        if (j10 != 0) {
            if (j10 != 1) {
                return;
            }
            qa1 qa1Var = (qa1) view;
            org.telegram.ui.ActionBar.j6 j6Var = this.d;
            int i11 = qa1.f40756c;
            qa1Var.getClass();
            if (j6Var.W >= 8) {
                qa1Var.f40758b = new int[]{j6Var.l(6), j6Var.l(4), j6Var.l(7), j6Var.l(2), j6Var.l(0), j6Var.l(5), j6Var.l(3)};
                return;
            } else {
                qa1Var.f40758b = new int[7];
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
        Context context = this.f35723c;
        if (i10 != 0) {
            return new s4.b1(new qa1(context));
        }
        return new s4.b1(new ThemeActivity.InnerAccentView(context));
    }
}
