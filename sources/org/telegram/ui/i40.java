package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class i40 extends org.telegram.ui.Components.oj0 {
    public org.telegram.messenger.r3 f46479c;
    public final int d;
    public ArrayList f46481f;
    public c20 h;
    public final f40 f46482n;
    public final ArrayList f46480e = new ArrayList();
    public boolean f46483r = false;

    public i40(org.telegram.messenger.r3 r3Var, int i7, f40 f40Var) {
        this.f46479c = r3Var;
        this.d = i7;
        this.f46482n = f40Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.r rVar, boolean z9) {
        if (z9 && rVar.getRenderer() == null) {
            rVar.setRenderer(org.telegram.ui.Components.voip.y.c(this.f46481f, this.h, null, null, rVar, rVar.getParticipant(), this.f46479c, this.f46482n));
        } else if (!z9 && rVar.getRenderer() != null) {
            rVar.getRenderer().setTabletGridView(null);
            rVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.pj0 pj0Var = this.f46482n.f45533h4;
        int size = this.f46480e.size();
        if (size <= 1) {
            return pj0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return pj0Var.getMeasuredHeight() / 2;
        }
        return (int) (pj0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, c20 c20Var) {
        this.f46481f = arrayList;
        this.h = c20Var;
    }

    public final void H(org.telegram.ui.Components.pj0 pj0Var, boolean z9, boolean z10) {
        this.f46483r = z9;
        if (z10) {
            for (int i7 = 0; i7 < pj0Var.getChildCount(); i7++) {
                View childAt = pj0Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Components.voip.r) {
                    org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) childAt;
                    if (rVar.getParticipant() != null) {
                        E(rVar, z9);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.pj0 pj0Var, boolean z9) {
        if (this.f46479c == null) {
            return;
        }
        ArrayList arrayList = this.f46480e;
        if (z9) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f46479c.f25229f);
            v4.o.c(new jg.h(this, arrayList2, 4), true).c(this);
            org.telegram.messenger.g0.b4(pj0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f46479c.f25229f);
        f();
    }

    @Override
    public final int b() {
        return this.f46480e.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) d1Var.f57052a;
        org.telegram.messenger.s3 participant = rVar.getParticipant();
        ArrayList arrayList = this.f46480e;
        org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) arrayList.get(i7);
        TLRPC.GroupCallParticipant groupCallParticipant = ((org.telegram.messenger.s3) arrayList.get(i7)).f25413a;
        int size = arrayList.size();
        int i10 = 6;
        if (size > 1 && size != 2 && (size != 3 || i7 == 0 || i7 == 1)) {
            i10 = 3;
        }
        rVar.f39499a = i10;
        rVar.f39500b = this;
        if (rVar.getMeasuredHeight() != F()) {
            rVar.requestLayout();
        }
        org.telegram.messenger.c.a(this.d);
        TLRPC.Peer peer = this.f46479c.J;
        rVar.d = s3Var;
        if (participant != null && !participant.equals(s3Var) && rVar.f39502e && rVar.getRenderer() != null) {
            E(rVar, false);
            E(rVar, true);
        } else if (rVar.getRenderer() != null) {
            rVar.getRenderer().j(true);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new v4.d1(new y30(this, viewGroup.getContext()));
    }
}
