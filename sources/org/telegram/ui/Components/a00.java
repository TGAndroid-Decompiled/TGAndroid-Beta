package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class a00 implements org.telegram.ui.ActionBar.m0, te.i, org.telegram.ui.ActionBar.r1, zs0 {
    public final FragmentContextView f31621a;

    public a00(FragmentContextView fragmentContextView) {
        this.f31621a = fragmentContextView;
    }

    @Override
    public void d(org.telegram.messenger.rd rdVar) {
        float[] fArr = FragmentContextView.W0;
        this.f31621a.k(rdVar);
    }

    @Override
    public void f(te.j jVar) {
        FragmentContextView fragmentContextView = this.f31621a;
        te.j jVar2 = fragmentContextView.U0;
        float f10 = 1.0f - jVar2.f55419a.d.f55410c.f55420a;
        fragmentContextView.d.setAlpha(f10);
        fragmentContextView.d.setScaleX(org.telegram.messenger.g0.T1(0.7f, 1.0f, f10));
        fragmentContextView.d.setScaleY(org.telegram.messenger.g0.T1(0.7f, 1.0f, f10));
        Iterator it = jVar2.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.f55403a;
            float T1 = org.telegram.messenger.g0.T1(0.7f, 1.0f, c10);
            nh.c cVar = ((l00) obj).f35456b;
            cVar.setAlpha(eVar.c());
            cVar.setScaleX(T1);
            cVar.setScaleY(T1);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        FragmentContextView fragmentContextView = this.f31621a;
        org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
        if (f2Var instanceof org.telegram.ui.ww) {
            for (int i10 = 0; i10 < 4; i10++) {
                Utilities.d.c(new org.telegram.messenger.id(org.telegram.messenger.sd.f(i10), 6));
            }
            return;
        }
        org.telegram.messenger.sd.f(f2Var.getCurrentAccount()).k(fragmentContextView.f31390n.a());
    }

    @Override
    public void i(int i7) {
        float[] fArr = FragmentContextView.W0;
        if (i7 >= 0) {
            float[] fArr2 = FragmentContextView.W0;
            if (i7 < 6) {
                MediaController B = MediaController.B();
                FragmentContextView fragmentContextView = this.f31621a;
                float C = B.C(fragmentContextView.W);
                float f10 = fArr2[i7];
                MediaController.B().m0(fragmentContextView.W, f10);
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
