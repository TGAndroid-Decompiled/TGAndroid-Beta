package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class aw0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final int f35792a;
    public final bw0 f35793b;

    public aw0(bw0 bw0Var, int i10) {
        this.f35792a = i10;
        this.f35793b = bw0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f35792a) {
            case 0:
                this.f35793b.Y();
                return;
            default:
                this.f35793b.finishFragment();
                return;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        bw0 bw0Var = this.f35793b;
        bw0Var.getClass();
        if (((org.telegram.ui.Components.m61) obj).d == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z10 = !w8Var.e.h;
            bw0Var.f36187s = z10;
            w8Var.setChecked(z10);
            bw0Var.d.Z2.N(true);
            bw0Var.V(true);
        }
    }
}
