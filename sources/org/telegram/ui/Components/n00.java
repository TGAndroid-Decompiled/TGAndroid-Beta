package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class n00 implements org.telegram.ui.ActionBar.l0, te.i, org.telegram.ui.ActionBar.q1, lt0 {
    public final FragmentContextView f37707a;

    public n00(FragmentContextView fragmentContextView) {
        this.f37707a = fragmentContextView;
    }

    @Override
    public void b(org.telegram.messenger.qd qdVar) {
        float[] fArr = FragmentContextView.X0;
        this.f37707a.k(qdVar);
    }

    @Override
    public void f(te.j jVar) {
        FragmentContextView fragmentContextView = this.f37707a;
        te.j jVar2 = fragmentContextView.V0;
        float f10 = 1.0f - jVar2.f57725a.d.f57716c.f57726a;
        fragmentContextView.d.setAlpha(f10);
        fragmentContextView.d.setScaleX(org.telegram.messenger.g0.T1(0.7f, 1.0f, f10));
        fragmentContextView.d.setScaleY(org.telegram.messenger.g0.T1(0.7f, 1.0f, f10));
        Iterator it = jVar2.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.f57709a;
            float T1 = org.telegram.messenger.g0.T1(0.7f, 1.0f, c10);
            nh.c cVar = ((y00) obj).f42296b;
            cVar.setAlpha(eVar.c());
            cVar.setScaleX(T1);
            cVar.setScaleY(T1);
        }
    }

    @Override
    public void g(int i7) {
        float[] fArr = FragmentContextView.X0;
        if (i7 >= 0) {
            float[] fArr2 = FragmentContextView.X0;
            if (i7 < 6) {
                MediaController B = MediaController.B();
                FragmentContextView fragmentContextView = this.f37707a;
                float C = B.C(fragmentContextView.f32989a0);
                float f10 = fArr2[i7];
                MediaController.B().m0(fragmentContextView.f32989a0, f10);
                if (C != f10) {
                    fragmentContextView.l(C, f10, false);
                }
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        FragmentContextView fragmentContextView = this.f37707a;
        org.telegram.ui.ActionBar.g2 g2Var = fragmentContextView.h;
        if (g2Var instanceof org.telegram.ui.cx) {
            for (int i10 = 0; i10 < 4; i10++) {
                Utilities.d.c(new org.telegram.messenger.id(org.telegram.messenger.rd.f(i10), 6));
            }
            return;
        }
        org.telegram.messenger.rd.f(g2Var.getCurrentAccount()).k(fragmentContextView.f33005n.a());
    }

    @Override
    public void a() {
    }
}
