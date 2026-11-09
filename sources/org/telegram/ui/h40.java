package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class h40 extends org.telegram.ui.Components.pj0 {
    public org.telegram.messenger.r3 f46139c;
    public final int d;
    public ArrayList f46141f;
    public b20 h;
    public final e40 f46142n;
    public final ArrayList f46140e = new ArrayList();
    public boolean f46143r = false;

    public h40(org.telegram.messenger.r3 r3Var, int i7, e40 e40Var) {
        this.f46139c = r3Var;
        this.d = i7;
        this.f46142n = e40Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.r rVar, boolean z9) {
        if (z9 && rVar.getRenderer() == null) {
            rVar.setRenderer(org.telegram.ui.Components.voip.y.c(this.f46141f, this.h, null, null, rVar, rVar.getParticipant(), this.f46139c, this.f46142n));
        } else if (!z9 && rVar.getRenderer() != null) {
            rVar.getRenderer().setTabletGridView(null);
            rVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.qj0 qj0Var = this.f46142n.f45205e4;
        int size = this.f46140e.size();
        if (size <= 1) {
            return qj0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return qj0Var.getMeasuredHeight() / 2;
        }
        return (int) (qj0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, b20 b20Var) {
        this.f46141f = arrayList;
        this.h = b20Var;
    }

    public final void H(org.telegram.ui.Components.qj0 qj0Var, boolean z9, boolean z10) {
        this.f46143r = z9;
        if (z10) {
            for (int i7 = 0; i7 < qj0Var.getChildCount(); i7++) {
                View childAt = qj0Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Components.voip.r) {
                    org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) childAt;
                    if (rVar.getParticipant() != null) {
                        E(rVar, z9);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.qj0 qj0Var, boolean z9) {
        if (this.f46139c == null) {
            return;
        }
        ArrayList arrayList = this.f46140e;
        if (z9) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f46139c.f25225f);
            v4.o.c(new jg.h(this, arrayList2, 4), true).c(this);
            org.telegram.messenger.g0.b4(qj0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f46139c.f25225f);
        f();
    }

    @Override
    public final int b() {
        return this.f46140e.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) d1Var.f57056a;
        org.telegram.messenger.s3 participant = rVar.getParticipant();
        ArrayList arrayList = this.f46140e;
        org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) arrayList.get(i7);
        TLRPC.GroupCallParticipant groupCallParticipant = ((org.telegram.messenger.s3) arrayList.get(i7)).f25409a;
        int size = arrayList.size();
        int i10 = 6;
        if (size > 1 && size != 2 && (size != 3 || i7 == 0 || i7 == 1)) {
            i10 = 3;
        }
        rVar.f39579a = i10;
        rVar.f39580b = this;
        if (rVar.getMeasuredHeight() != F()) {
            rVar.requestLayout();
        }
        org.telegram.messenger.c.a(this.d);
        TLRPC.Peer peer = this.f46139c.J;
        rVar.d = s3Var;
        if (participant != null && !participant.equals(s3Var) && rVar.f39582e && rVar.getRenderer() != null) {
            E(rVar, false);
            E(rVar, true);
        } else if (rVar.getRenderer() != null) {
            rVar.getRenderer().j(true);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new v4.d1(new x30(this, viewGroup.getContext()));
    }
}
