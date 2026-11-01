package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class o00 implements org.telegram.ui.ActionBar.o0, fe.l, org.telegram.ui.ActionBar.u1, du0 {
    public final FragmentContextView f28995a;

    public o00(FragmentContextView fragmentContextView) {
        this.f28995a = fragmentContextView;
    }

    @Override
    public void b(fe.m mVar) {
        FragmentContextView fragmentContextView = this.f28995a;
        fe.m mVar2 = fragmentContextView.U0;
        float f7 = 1.0f - mVar2.f7048a.d.f7041c.f7049a;
        fragmentContextView.d.setAlpha(f7);
        fragmentContextView.d.setScaleX(org.telegram.messenger.i0.T1(0.7f, 1.0f, f7));
        fragmentContextView.d.setScaleY(org.telegram.messenger.i0.T1(0.7f, 1.0f, f7));
        Iterator it = mVar2.iterator();
        while (it.hasNext()) {
            fe.h hVar = (fe.h) it.next();
            float c10 = hVar.c();
            Object obj = hVar.f7035a;
            float T1 = org.telegram.messenger.i0.T1(0.7f, 1.0f, c10);
            dh.d dVar = ((a10) obj).f24265b;
            dVar.setAlpha(hVar.c());
            dVar.setScaleX(T1);
            dVar.setScaleY(T1);
        }
    }

    @Override
    public void d(org.telegram.messenger.nd ndVar) {
        float[] fArr = FragmentContextView.W0;
        this.f28995a.k(ndVar);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        FragmentContextView fragmentContextView = this.f28995a;
        org.telegram.ui.ActionBar.k2 k2Var = fragmentContextView.h;
        if (k2Var instanceof org.telegram.ui.zx) {
            for (int i11 = 0; i11 < 4; i11++) {
                Utilities.d.c(new org.telegram.messenger.fd(org.telegram.messenger.od.f(i11), 6));
            }
            return;
        }
        org.telegram.messenger.od.f(k2Var.getCurrentAccount()).k(fragmentContextView.f24047n.a());
    }

    @Override
    public void k(int i10) {
        float[] fArr = FragmentContextView.W0;
        if (i10 >= 0) {
            float[] fArr2 = FragmentContextView.W0;
            if (i10 < 6) {
                MediaController B = MediaController.B();
                FragmentContextView fragmentContextView = this.f28995a;
                float C = B.C(fragmentContextView.W);
                float f7 = fArr2[i10];
                MediaController.B().m0(fragmentContextView.W, f7);
                if (C != f7) {
                    fragmentContextView.l(C, f7, false);
                }
            }
        }
    }

    @Override
    public void a() {
    }
}
