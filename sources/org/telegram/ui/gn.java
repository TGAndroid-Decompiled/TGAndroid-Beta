package org.telegram.ui;

import android.view.View;
public final class gn extends w7.d6 {
    public org.telegram.messenger.jj f37597a;
    public int f37598b = 0;
    public boolean f37599c = true;
    public int d = 0;
    public int e;
    public boolean f37600f;
    public int f37601g;
    public final un h;

    public gn(un unVar) {
        this.h = unVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.jj jjVar = this.f37597a;
        un unVar = this.h;
        if (jjVar != null) {
            unVar.C0.T();
            int indexOf = unVar.K6.indexOf(this.f37597a) + unVar.C0.J;
            if (indexOf >= 0) {
                unVar.B0.i1(indexOf, (int) ((this.e + this.f37601g) - unVar.L9), this.f37600f);
            }
        } else {
            unVar.C0.T();
            unVar.B0.i1(this.f37598b, this.d, this.f37599c);
        }
        this.f37597a = null;
        unVar.A3 = true;
        unVar.sd(false);
        org.telegram.messenger.i0.g3(new rh(this, 10));
    }

    @Override
    public final void c() {
        un unVar = this.h;
        unVar.f42202ba = unVar.getNotificationCenter().q(un.f42175gd, unVar.f42202ba, true);
        uk ukVar = unVar.Pa;
        if (ukVar.f41053n) {
            ukVar.d();
        }
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.setDelegate(null);
            q1Var.setResourcesProvider(null);
        }
    }
}
