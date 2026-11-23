package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class l00 implements org.telegram.ui.ActionBar.l0, te.i, org.telegram.ui.ActionBar.q1, kt0 {
    public final FragmentContextView f36965a;

    public l00(FragmentContextView fragmentContextView) {
        this.f36965a = fragmentContextView;
    }

    @Override
    public void c(org.telegram.messenger.pd pdVar) {
        float[] fArr = FragmentContextView.X0;
        this.f36965a.k(pdVar);
    }

    @Override
    public void g(te.j jVar) {
        FragmentContextView fragmentContextView = this.f36965a;
        te.j jVar2 = fragmentContextView.V0;
        float f10 = 1.0f - jVar2.f57804a.d.f57795c.f57805a;
        fragmentContextView.d.setAlpha(f10);
        fragmentContextView.d.setScaleX(org.telegram.messenger.g0.T1(0.7f, 1.0f, f10));
        fragmentContextView.d.setScaleY(org.telegram.messenger.g0.T1(0.7f, 1.0f, f10));
        Iterator it = jVar2.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.f57788a;
            float T1 = org.telegram.messenger.g0.T1(0.7f, 1.0f, c10);
            nh.c cVar = ((w00) obj).f41465b;
            cVar.setAlpha(eVar.c());
            cVar.setScaleX(T1);
            cVar.setScaleY(T1);
        }
    }

    @Override
    public void h(int i7) {
        float[] fArr = FragmentContextView.X0;
        if (i7 >= 0) {
            float[] fArr2 = FragmentContextView.X0;
            if (i7 < 6) {
                MediaController B = MediaController.B();
                FragmentContextView fragmentContextView = this.f36965a;
                float C = B.C(fragmentContextView.f33053a0);
                float f10 = fArr2[i7];
                MediaController.B().m0(fragmentContextView.f33053a0, f10);
                if (C != f10) {
                    fragmentContextView.l(C, f10, false);
                }
            }
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        FragmentContextView fragmentContextView = this.f36965a;
        org.telegram.ui.ActionBar.g2 g2Var = fragmentContextView.h;
        if (g2Var instanceof org.telegram.ui.bx) {
            for (int i10 = 0; i10 < 4; i10++) {
                Utilities.d.c(new org.telegram.messenger.hd(org.telegram.messenger.qd.f(i10), 6));
            }
            return;
        }
        org.telegram.messenger.qd.f(g2Var.getCurrentAccount()).k(fragmentContextView.f33069n.a());
    }

    @Override
    public void a() {
    }
}
