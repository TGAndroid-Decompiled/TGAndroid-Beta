package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.LinkedList;
public final class lb implements o1.f {
    public final int f26638a;
    public final Object f26639b;
    public final Object f26640c;

    public lb(int i10, Object obj, Object obj2) {
        this.f26638a = i10;
        this.f26639b = obj;
        this.f26640c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        ViewGroup viewGroup;
        switch (this.f26638a) {
            case 0:
                fg fgVar = (fg) this.f26640c;
                ((nb) this.f26639b).setInOutOffset(0.0f);
                if (!z4) {
                    fgVar.run();
                    return;
                }
                return;
            case 1:
                li.r((li) this.f26639b, (lh.p6) this.f26640c);
                return;
            case 2:
                li liVar = (li) ((lh.k3) this.f26639b).d;
                liVar.f26748w0.setTranslationY(0.0f);
                liVar.f26748w0.k(liVar.f26706i2);
                viewGroup = ((org.telegram.ui.ActionBar.g3) liVar).containerView;
                viewGroup.invalidate();
                ((wg) this.f26640c).run();
                liVar.a2(0);
                return;
            case 3:
                wd0 wd0Var = (wd0) this.f26639b;
                ec0 ec0Var = (ec0) this.f26640c;
                LinkedList linkedList = wd0Var.J;
                wd0Var.I = null;
                ec0Var.D = null;
                ec0Var.z();
                if (!z4) {
                    ec0Var.h = 1.0f;
                    ec0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        wd0Var.K.poll();
                        return;
                    }
                    return;
                }
                return;
            default:
                rh.m3 m3Var = (rh.m3) this.f26639b;
                Runnable runnable = (Runnable) this.f26640c;
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
                        boolean z10 = m3Var.f43685s;
                        m3Var.f43685s = true;
                        m3Var.setOffsetY(f12);
                        m3Var.h = -1.0f;
                        m3Var.f43685s = z10;
                    }
                    m3Var.f43683n = -2.1474836E9f;
                    return;
                }
                return;
        }
    }
}
