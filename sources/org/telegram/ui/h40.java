package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class h40 extends org.telegram.ui.Components.dk0 {
    public org.telegram.messenger.t3 f48421c;
    public final int d;
    public ArrayList f48423f;
    public a20 h;
    public final e40 f48424n;
    public final ArrayList f48422e = new ArrayList();
    public boolean f48425r = false;

    public h40(org.telegram.messenger.t3 t3Var, int i7, e40 e40Var) {
        this.f48421c = t3Var;
        this.d = i7;
        this.f48424n = e40Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.s sVar, boolean z10) {
        if (z10 && sVar.getRenderer() == null) {
            sVar.setRenderer(org.telegram.ui.Components.voip.z.c(this.f48423f, this.h, null, null, sVar, sVar.getParticipant(), this.f48421c, this.f48424n));
        } else if (!z10 && sVar.getRenderer() != null) {
            sVar.getRenderer().setTabletGridView(null);
            sVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.ek0 ek0Var = this.f48424n.f47370m4;
        int size = this.f48422e.size();
        if (size <= 1) {
            return ek0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return ek0Var.getMeasuredHeight() / 2;
        }
        return (int) (ek0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, a20 a20Var) {
        this.f48423f = arrayList;
        this.h = a20Var;
    }

    public final void H(org.telegram.ui.Components.ek0 ek0Var, boolean z10, boolean z11) {
        this.f48425r = z10;
        if (z11) {
            for (int i7 = 0; i7 < ek0Var.getChildCount(); i7++) {
                View childAt = ek0Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Components.voip.s) {
                    org.telegram.ui.Components.voip.s sVar = (org.telegram.ui.Components.voip.s) childAt;
                    if (sVar.getParticipant() != null) {
                        E(sVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.ek0 ek0Var, boolean z10) {
        if (this.f48421c == null) {
            return;
        }
        ArrayList arrayList = this.f48422e;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f48421c.f27037f);
            v4.p.c(new jg.g(this, arrayList2, 4), true).c(this);
            org.telegram.messenger.g0.Z3(ek0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f48421c.f27037f);
        f();
    }

    @Override
    public final int b() {
        return this.f48422e.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.ui.Components.voip.s sVar = (org.telegram.ui.Components.voip.s) f1Var.f59245a;
        org.telegram.messenger.u3 participant = sVar.getParticipant();
        ArrayList arrayList = this.f48422e;
        org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) arrayList.get(i7);
        TLRPC.GroupCallParticipant groupCallParticipant = ((org.telegram.messenger.u3) arrayList.get(i7)).f27215a;
        int size = arrayList.size();
        int i10 = 6;
        if (size > 1 && size != 2 && (size != 3 || i7 == 0 || i7 == 1)) {
            i10 = 3;
        }
        sVar.f41205a = i10;
        sVar.f41206b = this;
        if (sVar.getMeasuredHeight() != F()) {
            sVar.requestLayout();
        }
        org.telegram.messenger.c.a(this.d);
        TLRPC.Peer peer = this.f48421c.J;
        sVar.d = u3Var;
        if (participant != null && !participant.equals(u3Var) && sVar.f41208e && sVar.getRenderer() != null) {
            E(sVar, false);
            E(sVar, true);
        } else if (sVar.getRenderer() != null) {
            sVar.getRenderer().j(true);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new v4.f1(new x30(this, viewGroup.getContext()));
    }
}
