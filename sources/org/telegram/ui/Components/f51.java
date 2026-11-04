package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;
public final class f51 implements Runnable {
    public final int f33711a;
    public final Object f33712b;

    public f51(Object obj, int i3) {
        this.f33711a = i3;
        this.f33712b = obj;
    }

    @Override
    public final void run() {
        switch (this.f33711a) {
            case 0:
                m51 m51Var = (m51) this.f33712b;
                k2.i0 i0Var = m51Var.d;
                if (i0Var != null) {
                    TextureView textureView = m51Var.f36017n;
                    i0Var.F1();
                    if (textureView != null && textureView == i0Var.X) {
                        i0Var.F1();
                        i0Var.s1();
                        i0Var.x1(null);
                        i0Var.q1(0, 0);
                    }
                    m51Var.d.z1(m51Var.f36017n);
                    ArrayList arrayList = m51Var.O;
                    if (arrayList != null) {
                        m51Var.k0(arrayList, m51Var.P);
                    } else if (m51Var.V) {
                        m51Var.l0(m51Var.R, m51Var.T, m51Var.S, m51Var.U);
                    } else {
                        m51Var.j0(m51Var.R, m51Var.T);
                    }
                    m51Var.h0();
                    return;
                }
                return;
            case 1:
                m51 m51Var2 = (m51) ((mi.c6) this.f33712b).f19553f;
                m51Var2.f36005b0.removeCallbacksAndMessages(null);
                m51Var2.L.r(false, null);
                return;
            case 2:
                ((o51) this.f33712b).f36724g = false;
                return;
            case 3:
                ((d71) ((s30) ((org.telegram.ui.ActionBar.g1) this.f33712b).f27516b).f37895b).f33016w.b();
                return;
            default:
                ((z61) this.f33712b).d(false, true);
                return;
        }
    }
}
