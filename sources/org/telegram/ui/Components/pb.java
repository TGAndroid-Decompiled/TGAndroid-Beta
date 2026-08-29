package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.LinkedList;
public final class pb implements o1.g {
    public final int f31630a;
    public final Object f31631b;
    public final Object f31632c;

    public pb(int i10, Object obj, Object obj2) {
        this.f31630a = i10;
        this.f31631b = obj;
        this.f31632c = obj2;
    }

    @Override
    public final void a(o1.i iVar, boolean z10, float f9, float f10) {
        ViewGroup viewGroup;
        switch (this.f31630a) {
            case 0:
                ig igVar = (ig) this.f31632c;
                ((rb) this.f31631b).setInOutOffset(0.0f);
                if (!z10) {
                    igVar.run();
                    return;
                }
                return;
            case 1:
                ni.r((ni) this.f31631b, (g) this.f31632c);
                return;
            case 2:
                ni niVar = (ni) ((jh.l3) this.f31631b).d;
                niVar.f31054v0.setTranslationY(0.0f);
                niVar.f31054v0.k(niVar.f31013h2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) niVar).containerView;
                viewGroup.invalidate();
                ((zg) this.f31632c).run();
                niVar.a2(0);
                return;
            case 3:
                nd0 nd0Var = (nd0) this.f31631b;
                yb0 yb0Var = (yb0) this.f31632c;
                LinkedList linkedList = nd0Var.I;
                nd0Var.H = null;
                yb0Var.D = null;
                yb0Var.z();
                if (!z10) {
                    yb0Var.h = 1.0f;
                    yb0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        nd0Var.J.poll();
                        return;
                    }
                    return;
                }
                return;
            default:
                ph.m3 m3Var = (ph.m3) this.f31631b;
                Runnable runnable = (Runnable) this.f31632c;
                if (iVar == m3Var.C) {
                    m3Var.C = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = m3Var.A;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f11 = m3Var.h;
                    if (f11 != -1.0f) {
                        boolean z11 = m3Var.f45909s;
                        m3Var.f45909s = true;
                        m3Var.setOffsetY(f11);
                        m3Var.h = -1.0f;
                        m3Var.f45909s = z11;
                    }
                    m3Var.f45907n = -2.1474836E9f;
                    return;
                }
                return;
        }
    }
}
