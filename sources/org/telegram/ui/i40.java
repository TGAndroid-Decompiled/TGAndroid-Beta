package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class i40 extends org.telegram.ui.Components.dk0 {
    public org.telegram.messenger.t3 f48572c;
    public final int d;
    public ArrayList f48574f;
    public b20 h;
    public final f40 f48575n;
    public final ArrayList f48573e = new ArrayList();
    public boolean f48576r = false;

    public i40(org.telegram.messenger.t3 t3Var, int i7, f40 f40Var) {
        this.f48572c = t3Var;
        this.d = i7;
        this.f48575n = f40Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.r rVar, boolean z10) {
        if (z10 && rVar.getRenderer() == null) {
            rVar.setRenderer(org.telegram.ui.Components.voip.y.c(this.f48574f, this.h, null, null, rVar, rVar.getParticipant(), this.f48572c, this.f48575n));
        } else if (!z10 && rVar.getRenderer() != null) {
            rVar.getRenderer().setTabletGridView(null);
            rVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.ek0 ek0Var = this.f48575n.f47520m4;
        int size = this.f48573e.size();
        if (size <= 1) {
            return ek0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return ek0Var.getMeasuredHeight() / 2;
        }
        return (int) (ek0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, b20 b20Var) {
        this.f48574f = arrayList;
        this.h = b20Var;
    }

    public final void H(org.telegram.ui.Components.ek0 ek0Var, boolean z10, boolean z11) {
        this.f48576r = z10;
        if (z11) {
            for (int i7 = 0; i7 < ek0Var.getChildCount(); i7++) {
                View childAt = ek0Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Components.voip.r) {
                    org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) childAt;
                    if (rVar.getParticipant() != null) {
                        E(rVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.ek0 ek0Var, boolean z10) {
        if (this.f48572c == null) {
            return;
        }
        ArrayList arrayList = this.f48573e;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f48572c.f26953f);
            v4.o.c(new jg.g(this, arrayList2, 4), true).c(this);
            org.telegram.messenger.g0.Z3(ek0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f48572c.f26953f);
        f();
    }

    @Override
    public final int b() {
        return this.f48573e.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) f1Var.f59165a;
        org.telegram.messenger.u3 participant = rVar.getParticipant();
        ArrayList arrayList = this.f48573e;
        org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) arrayList.get(i7);
        TLRPC.GroupCallParticipant groupCallParticipant = ((org.telegram.messenger.u3) arrayList.get(i7)).f27155a;
        int size = arrayList.size();
        int i10 = 6;
        if (size > 1 && size != 2 && (size != 3 || i7 == 0 || i7 == 1)) {
            i10 = 3;
        }
        rVar.f41309a = i10;
        rVar.f41310b = this;
        if (rVar.getMeasuredHeight() != F()) {
            rVar.requestLayout();
        }
        org.telegram.messenger.c.a(this.d);
        TLRPC.Peer peer = this.f48572c.J;
        rVar.d = u3Var;
        if (participant != null && !participant.equals(u3Var) && rVar.f41312e && rVar.getRenderer() != null) {
            E(rVar, false);
            E(rVar, true);
        } else if (rVar.getRenderer() != null) {
            rVar.getRenderer().j(true);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new v4.f1(new y30(this, viewGroup.getContext()));
    }
}
