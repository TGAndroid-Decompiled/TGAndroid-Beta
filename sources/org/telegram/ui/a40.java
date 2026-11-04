package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a40 extends org.telegram.ui.Components.sj0 {
    public org.telegram.messenger.r3 f43588c;
    public final int d;
    public ArrayList f43590f;
    public u10 h;
    public final x30 f43591n;
    public final ArrayList f43589e = new ArrayList();
    public boolean f43592r = false;

    public a40(org.telegram.messenger.r3 r3Var, int i3, x30 x30Var) {
        this.f43588c = r3Var;
        this.d = i3;
        this.f43591n = x30Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.k kVar, boolean z10) {
        if (z10 && kVar.getRenderer() == null) {
            kVar.setRenderer(org.telegram.ui.Components.voip.r.c(this.f43590f, this.h, null, null, kVar, kVar.getParticipant(), this.f43588c, this.f43591n));
        } else if (!z10 && kVar.getRenderer() != null) {
            kVar.getRenderer().setTabletGridView(null);
            kVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.tj0 tj0Var = this.f43591n.f51737f4;
        int size = this.f43589e.size();
        if (size <= 1) {
            return tj0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return tj0Var.getMeasuredHeight() / 2;
        }
        return (int) (tj0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, u10 u10Var) {
        this.f43590f = arrayList;
        this.h = u10Var;
    }

    public final void H(org.telegram.ui.Components.tj0 tj0Var, boolean z10, boolean z11) {
        this.f43592r = z10;
        if (z11) {
            for (int i3 = 0; i3 < tj0Var.getChildCount(); i3++) {
                View childAt = tj0Var.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Components.voip.k) {
                    org.telegram.ui.Components.voip.k kVar = (org.telegram.ui.Components.voip.k) childAt;
                    if (kVar.getParticipant() != null) {
                        E(kVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.tj0 tj0Var, boolean z10) {
        if (this.f43588c == null) {
            return;
        }
        ArrayList arrayList = this.f43589e;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f43588c.f25052f);
            u4.o.c(new kg.g(this, arrayList2, 4), true).c(this);
            org.telegram.messenger.g0.b4(tj0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f43588c.f25052f);
        f();
    }

    @Override
    public final int b() {
        return this.f43589e.size();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        org.telegram.ui.Components.voip.k kVar = (org.telegram.ui.Components.voip.k) d1Var.f55540a;
        org.telegram.messenger.s3 participant = kVar.getParticipant();
        ArrayList arrayList = this.f43589e;
        org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) arrayList.get(i3);
        TLRPC.GroupCallParticipant groupCallParticipant = ((org.telegram.messenger.s3) arrayList.get(i3)).f25270a;
        int size = arrayList.size();
        int i10 = 6;
        if (size > 1 && size != 2 && (size != 3 || i3 == 0 || i3 == 1)) {
            i10 = 3;
        }
        kVar.f39433a = i10;
        kVar.f39434b = this;
        if (kVar.getMeasuredHeight() != F()) {
            kVar.requestLayout();
        }
        org.telegram.messenger.c.a(this.d);
        TLRPC.Peer peer = this.f43588c.J;
        kVar.d = s3Var;
        if (participant != null && !participant.equals(s3Var) && kVar.f39436e && kVar.getRenderer() != null) {
            E(kVar, false);
            E(kVar, true);
        } else if (kVar.getRenderer() != null) {
            kVar.getRenderer().j(true);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        return new u4.d1(new q30(this, viewGroup.getContext()));
    }
}
