package org.telegram.ui;

import android.view.View;
public final class mm extends c8.ma {
    public org.telegram.messenger.gj f49252a;
    public int f49253b = 0;
    public boolean f49254c = true;
    public int d = 0;
    public int f49255e;
    public boolean f49256f;
    public int f49257g;
    public final an h;

    public mm(an anVar) {
        this.h = anVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.gj gjVar = this.f49252a;
        an anVar = this.h;
        if (gjVar != null) {
            anVar.D0.T();
            int indexOf = anVar.L6.indexOf(this.f49252a) + anVar.D0.K;
            if (indexOf >= 0) {
                anVar.C0.i1(indexOf, (int) ((this.f49255e + this.f49257g) - anVar.O9), this.f49256f);
            }
        } else {
            anVar.D0.T();
            anVar.C0.i1(this.f49253b, this.d, this.f49254c);
        }
        this.f49252a = null;
        anVar.B3 = true;
        anVar.Gd(false);
        org.telegram.messenger.g0.h3(new bh(this, 9));
    }

    @Override
    public final void c() {
        an anVar = this.h;
        anVar.f45184ea = anVar.getNotificationCenter().q(an.f45114rd, anVar.f45184ea, true);
        yj yjVar = anVar.Sa;
        if (yjVar.f46469n) {
            yjVar.d();
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
