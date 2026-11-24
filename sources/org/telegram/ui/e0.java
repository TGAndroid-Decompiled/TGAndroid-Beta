package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class e0 extends n39 {
    public final Context c;
    public akb d;
    public ArrayList e;
    public final ThemeActivity f;

    public e0(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        f();
    }

    @Override
    public final boolean D(s49 s49Var) {
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
        akb B0;
        if (this.f.f == 1) {
            B0 = bkb.J;
        } else {
            B0 = bkb.B0();
        }
        this.d = B0;
        this.e = new ArrayList(this.d.c0);
        super.f();
    }

    @Override
    public final void t(s49 s49Var, int i) {
        View view = s49Var.a;
        int d = d(i);
        if (d != 0) {
            if (d != 1) {
                return;
            }
            nkb nkbVar = (nkb) view;
            akb akbVar = this.d;
            int i2 = nkb.c;
            nkbVar.getClass();
            if (akbVar.X >= 8) {
                nkbVar.b = new int[]{akbVar.j(6), akbVar.j(4), akbVar.j(7), akbVar.j(2), akbVar.j(0), akbVar.j(5), akbVar.j(3)};
                return;
            } else {
                nkbVar.b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.e = (zjb) this.e.get(i);
        innerAccentView.a(false);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        if (i != 0) {
            return new s49(new nkb(context));
        }
        return new s49(new ThemeActivity.InnerAccentView(context));
    }
}
