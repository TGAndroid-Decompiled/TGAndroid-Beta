package org.telegram.ui;

import android.view.View;
public final class im extends b8.of {
    public org.telegram.messenger.zi f46297a;
    public int f46298b = 0;
    public boolean f46299c = true;
    public int d = 0;
    public int f46300e;
    public boolean f46301f;
    public int f46302g;
    public final wm h;

    public im(wm wmVar) {
        this.h = wmVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.zi ziVar = this.f46297a;
        wm wmVar = this.h;
        if (ziVar != null) {
            wmVar.D0.T();
            int indexOf = wmVar.L6.indexOf(this.f46297a) + wmVar.D0.K;
            if (indexOf >= 0) {
                wmVar.C0.i1(indexOf, (int) ((this.f46300e + this.f46302g) - wmVar.M9), this.f46301f);
            }
        } else {
            wmVar.D0.T();
            wmVar.C0.i1(this.f46298b, this.d, this.f46299c);
        }
        this.f46297a = null;
        wmVar.B3 = true;
        wmVar.Cd(false);
        org.telegram.messenger.g0.h3(new xg(this, 9));
    }

    @Override
    public final void c() {
        wm wmVar = this.h;
        wmVar.f51275ca = wmVar.getNotificationCenter().q(wm.f51233pd, wmVar.f51275ca, true);
        uj ujVar = wmVar.Qa;
        if (ujVar.f50591n) {
            ujVar.d();
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
