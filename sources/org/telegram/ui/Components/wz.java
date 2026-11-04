package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class wz implements org.telegram.ui.ActionBar.l0, qe.i, org.telegram.ui.ActionBar.p1, ys0 {
    public final FragmentContextView f40172a;

    public wz(FragmentContextView fragmentContextView) {
        this.f40172a = fragmentContextView;
    }

    @Override
    public void b(qe.j jVar) {
        FragmentContextView fragmentContextView = this.f40172a;
        qe.j jVar2 = fragmentContextView.V0;
        float f10 = 1.0f - jVar2.f53865a.d.f53856c.f53866a;
        fragmentContextView.d.setAlpha(f10);
        fragmentContextView.d.setScaleX(org.telegram.messenger.g0.T1(0.7f, 1.0f, f10));
        fragmentContextView.d.setScaleY(org.telegram.messenger.g0.T1(0.7f, 1.0f, f10));
        Iterator it = jVar2.iterator();
        while (it.hasNext()) {
            qe.e eVar = (qe.e) it.next();
            float c2 = eVar.c();
            Object obj = eVar.f53849a;
            float T1 = org.telegram.messenger.g0.T1(0.7f, 1.0f, c2);
            oh.c cVar = ((h00) obj).f34252b;
            cVar.setAlpha(eVar.c());
            cVar.setScaleX(T1);
            cVar.setScaleY(T1);
        }
    }

    @Override
    public void c(org.telegram.messenger.kd kdVar) {
        float[] fArr = FragmentContextView.X0;
        this.f40172a.k(kdVar);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        FragmentContextView fragmentContextView = this.f40172a;
        org.telegram.ui.ActionBar.d2 d2Var = fragmentContextView.h;
        if (d2Var instanceof org.telegram.ui.uw) {
            for (int i10 = 0; i10 < 4; i10++) {
                Utilities.d.c(new org.telegram.messenger.cd(org.telegram.messenger.ld.f(i10), 6));
            }
            return;
        }
        org.telegram.messenger.ld.f(d2Var.getCurrentAccount()).k(fragmentContextView.f31465n.a());
    }

    @Override
    public void i(int i3) {
        float[] fArr = FragmentContextView.X0;
        if (i3 >= 0) {
            float[] fArr2 = FragmentContextView.X0;
            if (i3 < 6) {
                MediaController B = MediaController.B();
                FragmentContextView fragmentContextView = this.f40172a;
                float C = B.C(fragmentContextView.f31449a0);
                float f10 = fArr2[i3];
                MediaController.B().m0(fragmentContextView.f31449a0, f10);
                if (C != f10) {
                    fragmentContextView.l(C, f10, false);
                }
            }
        }
    }

    @Override
    public void a() {
    }
}
