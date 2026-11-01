package org.telegram.ui;

import android.view.View;
public final class gn extends w7.d6 {
    public org.telegram.messenger.kj f37527a;
    public int f37528b = 0;
    public boolean f37529c = true;
    public int d = 0;
    public int e;
    public boolean f37530f;
    public int f37531g;
    public final un h;

    public gn(un unVar) {
        this.h = unVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.kj kjVar = this.f37527a;
        un unVar = this.h;
        if (kjVar != null) {
            unVar.C0.T();
            int indexOf = unVar.K6.indexOf(this.f37527a) + unVar.C0.J;
            if (indexOf >= 0) {
                unVar.B0.i1(indexOf, (int) ((this.e + this.f37531g) - unVar.L9), this.f37530f);
            }
        } else {
            unVar.C0.T();
            unVar.B0.i1(this.f37528b, this.d, this.f37529c);
        }
        this.f37527a = null;
        unVar.A3 = true;
        unVar.xd(false);
        org.telegram.messenger.i0.g3(new rh(this, 10));
    }

    @Override
    public final void c() {
        un unVar = this.h;
        unVar.f42013ba = unVar.getNotificationCenter().q(un.f41985hd, unVar.f42013ba, true);
        uk ukVar = unVar.Pa;
        if (ukVar.f40600n) {
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
