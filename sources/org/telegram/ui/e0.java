package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class e0 extends c79 {
    public final Context c;
    public znb d;
    public ArrayList e;
    public final ThemeActivity f;

    public e0(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        f();
    }

    @Override
    public final boolean D(f89 f89Var) {
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
        znb B0;
        if (this.f.f == 1) {
            B0 = aob.J;
        } else {
            B0 = aob.B0();
        }
        this.d = B0;
        this.e = new ArrayList(this.d.c0);
        super.f();
    }

    @Override
    public final void t(f89 f89Var, int i) {
        View view = f89Var.a;
        int d = d(i);
        if (d != 0) {
            if (d != 1) {
                return;
            }
            mob mobVar = (mob) view;
            znb znbVar = this.d;
            int i2 = mob.c;
            mobVar.getClass();
            if (znbVar.X >= 8) {
                mobVar.b = new int[]{znbVar.j(6), znbVar.j(4), znbVar.j(7), znbVar.j(2), znbVar.j(0), znbVar.j(5), znbVar.j(3)};
                return;
            } else {
                mobVar.b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.e = (ynb) this.e.get(i);
        innerAccentView.a(false);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        if (i != 0) {
            return new f89(new mob(context));
        }
        return new f89(new ThemeActivity.InnerAccentView(context));
    }
}
