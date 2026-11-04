package org.telegram.ui;

import android.view.View;
public final class jb extends b8.of {
    public org.telegram.messenger.zi f46586a;
    public int f46587b = 0;
    public boolean f46588c = true;
    public int d = 0;
    public int f46589e;
    public final kb f46590f;

    public jb(kb kbVar) {
        this.f46590f = kbVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.zi ziVar = this.f46586a;
        kb kbVar = this.f46590f;
        if (ziVar != null) {
            int indexOf = kbVar.f46876p0.indexOf(ziVar) + kbVar.F.f45890f;
            if (indexOf >= 0) {
                kbVar.f46889y.i1(indexOf, this.f46589e, false);
            }
        } else {
            kbVar.f46889y.i1(this.f46587b, this.d, this.f46588c);
        }
        this.f46586a = null;
        kbVar.W = true;
        kbVar.i1();
        org.telegram.messenger.g0.h3(new xp0(this, 21));
    }

    @Override
    public final void c() {
        kb kbVar = this.f46590f;
        kbVar.L0 = kbVar.getNotificationCenter().q(kb.S0, kbVar.L0, true);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            this.f46590f.h.add((org.telegram.ui.Cells.q1) view);
        }
    }
}
