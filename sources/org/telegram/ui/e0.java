package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class e0 extends q59 {
    public final Context c;
    public bmb d;
    public ArrayList e;
    public final ThemeActivity f;

    public e0(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        f();
    }

    @Override
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override
    public final int b() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override
    public final int d(int i) {
        if (i == b() - 1) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void f() {
        bmb B0;
        if (this.f.f == 1) {
            B0 = cmb.J;
        } else {
            B0 = cmb.B0();
        }
        this.d = B0;
        this.e = new ArrayList(this.d.c0);
        super.f();
    }

    @Override
    public final void t(u69 u69Var, int i) {
        View view = u69Var.a;
        int d = d(i);
        if (d != 0) {
            if (d != 1) {
                return;
            }
            omb ombVar = (omb) view;
            bmb bmbVar = this.d;
            int i2 = omb.c;
            ombVar.getClass();
            if (bmbVar.X >= 8) {
                ombVar.b = new int[]{bmbVar.j(6), bmbVar.j(4), bmbVar.j(7), bmbVar.j(2), bmbVar.j(0), bmbVar.j(5), bmbVar.j(3)};
                return;
            } else {
                ombVar.b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.e = (amb) this.e.get(i);
        innerAccentView.a(false);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        if (i != 0) {
            return new u69(new omb(context));
        }
        return new u69(new ThemeActivity.InnerAccentView(context));
    }
}
