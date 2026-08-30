package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.LinkedList;
public final class lb implements o1.f {
    public final int f26609a;
    public final Object f26610b;
    public final Object f26611c;

    public lb(int i10, Object obj, Object obj2) {
        this.f26609a = i10;
        this.f26610b = obj;
        this.f26611c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        ViewGroup viewGroup;
        switch (this.f26609a) {
            case 0:
                fg fgVar = (fg) this.f26611c;
                ((nb) this.f26610b).setInOutOffset(0.0f);
                if (!z4) {
                    fgVar.run();
                    return;
                }
                return;
            case 1:
                li.r((li) this.f26610b, (lh.p6) this.f26611c);
                return;
            case 2:
                li liVar = (li) ((lh.k3) this.f26610b).d;
                liVar.f26752w0.setTranslationY(0.0f);
                liVar.f26752w0.k(liVar.f26710i2);
                viewGroup = ((org.telegram.ui.ActionBar.g3) liVar).containerView;
                viewGroup.invalidate();
                ((wg) this.f26611c).run();
                liVar.a2(0);
                return;
            case 3:
                vd0 vd0Var = (vd0) this.f26610b;
                dc0 dc0Var = (dc0) this.f26611c;
                LinkedList linkedList = vd0Var.J;
                vd0Var.I = null;
                dc0Var.D = null;
                dc0Var.z();
                if (!z4) {
                    dc0Var.h = 1.0f;
                    dc0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        vd0Var.K.poll();
                        return;
                    }
                    return;
                }
                return;
            default:
                rh.n3 n3Var = (rh.n3) this.f26610b;
                Runnable runnable = (Runnable) this.f26611c;
                if (hVar == n3Var.D) {
                    n3Var.D = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = n3Var.B;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f12 = n3Var.h;
                    if (f12 != -1.0f) {
                        boolean z10 = n3Var.f43633s;
                        n3Var.f43633s = true;
                        n3Var.setOffsetY(f12);
                        n3Var.h = -1.0f;
                        n3Var.f43633s = z10;
                    }
                    n3Var.f43631n = -2.1474836E9f;
                    return;
                }
                return;
        }
    }
}
