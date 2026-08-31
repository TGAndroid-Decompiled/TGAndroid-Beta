package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.LinkedList;
public final class lb implements o1.f {
    public final int f28682a;
    public final Object f28683b;
    public final Object f28684c;

    public lb(int i10, Object obj, Object obj2) {
        this.f28682a = i10;
        this.f28683b = obj;
        this.f28684c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        ViewGroup viewGroup;
        switch (this.f28682a) {
            case 0:
                fg fgVar = (fg) this.f28684c;
                ((nb) this.f28683b).setInOutOffset(0.0f);
                if (!z4) {
                    fgVar.run();
                    return;
                }
                return;
            case 1:
                mi.r((mi) this.f28683b, (mh.p6) this.f28684c);
                return;
            case 2:
                mi miVar = (mi) ((mh.k3) this.f28683b).d;
                miVar.f29104w0.setTranslationY(0.0f);
                miVar.f29104w0.k(miVar.f29062i2);
                viewGroup = ((org.telegram.ui.ActionBar.h3) miVar).containerView;
                viewGroup.invalidate();
                ((wg) this.f28684c).run();
                miVar.a2(0);
                return;
            case 3:
                xd0 xd0Var = (xd0) this.f28683b;
                fc0 fc0Var = (fc0) this.f28684c;
                LinkedList linkedList = xd0Var.J;
                xd0Var.I = null;
                fc0Var.D = null;
                fc0Var.z();
                if (!z4) {
                    fc0Var.h = 1.0f;
                    fc0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        xd0Var.K.poll();
                        return;
                    }
                    return;
                }
                return;
            default:
                sh.m3 m3Var = (sh.m3) this.f28683b;
                Runnable runnable = (Runnable) this.f28684c;
                if (hVar == m3Var.D) {
                    m3Var.D = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = m3Var.B;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f12 = m3Var.h;
                    if (f12 != -1.0f) {
                        boolean z10 = m3Var.f47534s;
                        m3Var.f47534s = true;
                        m3Var.setOffsetY(f12);
                        m3Var.h = -1.0f;
                        m3Var.f47534s = z10;
                    }
                    m3Var.f47532n = -2.1474836E9f;
                    return;
                }
                return;
        }
    }
}
