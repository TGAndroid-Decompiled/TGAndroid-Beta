package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class jc1 extends org.telegram.ui.Components.pm0 {
    public final Context f38911c;
    public org.telegram.ui.ActionBar.h6 d;
    public ArrayList f38912e;
    public final ThemeActivity f38913f;

    public jc1(ThemeActivity themeActivity, Context context) {
        this.f38913f = themeActivity;
        this.f38911c = context;
        l();
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f38912e.isEmpty()) {
            return 0;
        }
        return this.f38912e.size() + 1;
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
        org.telegram.ui.ActionBar.h6 B0;
        if (this.f38913f.f34538f == 1) {
            B0 = org.telegram.ui.ActionBar.i6.J;
        } else {
            B0 = org.telegram.ui.ActionBar.i6.B0();
        }
        this.d = B0;
        this.f38912e = new ArrayList(this.d.f20706b0);
        super.l();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        View view = d1Var.f47658a;
        int j3 = j(i10);
        if (j3 != 0) {
            if (j3 != 1) {
                return;
            }
            zb1 zb1Var = (zb1) view;
            org.telegram.ui.ActionBar.h6 h6Var = this.d;
            int i11 = zb1.f44536c;
            zb1Var.getClass();
            if (h6Var.W >= 8) {
                zb1Var.f44538b = new int[]{h6Var.l(6), h6Var.l(4), h6Var.l(7), h6Var.l(2), h6Var.l(0), h6Var.l(5), h6Var.l(3)};
                return;
            } else {
                zb1Var.f44538b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.f34568e = (org.telegram.ui.ActionBar.g6) this.f38912e.get(i10);
        innerAccentView.a(false);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f38911c;
        if (i10 != 0) {
            return new s4.d1(new zb1(context));
        }
        return new s4.d1(new ThemeActivity.InnerAccentView(context));
    }
}
