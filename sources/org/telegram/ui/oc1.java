package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class oc1 extends org.telegram.ui.Components.lm0 {
    public final Context f38615c;
    public org.telegram.ui.ActionBar.f6 d;
    public ArrayList e;
    public final ThemeActivity f38616f;

    public oc1(ThemeActivity themeActivity, Context context) {
        this.f38616f = themeActivity;
        this.f38615c = context;
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
        org.telegram.ui.ActionBar.f6 B0;
        if (this.f38616f.f32550f == 1) {
            B0 = org.telegram.ui.ActionBar.g6.J;
        } else {
            B0 = org.telegram.ui.ActionBar.g6.B0();
        }
        this.d = B0;
        this.e = new ArrayList(this.d.f19494b0);
        super.l();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.f44838a;
        int j10 = j(i10);
        if (j10 != 0) {
            if (j10 != 1) {
                return;
            }
            ec1 ec1Var = (ec1) view;
            org.telegram.ui.ActionBar.f6 f6Var = this.d;
            int i11 = ec1.f35253c;
            ec1Var.getClass();
            if (f6Var.W >= 8) {
                ec1Var.f35255b = new int[]{f6Var.l(6), f6Var.l(4), f6Var.l(7), f6Var.l(2), f6Var.l(0), f6Var.l(5), f6Var.l(3)};
                return;
            } else {
                ec1Var.f35255b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.e = (org.telegram.ui.ActionBar.e6) this.e.get(i10);
        innerAccentView.a(false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f38615c;
        if (i10 != 0) {
            return new s4.b1(new ec1(context));
        }
        return new s4.b1(new ThemeActivity.InnerAccentView(context));
    }
}
