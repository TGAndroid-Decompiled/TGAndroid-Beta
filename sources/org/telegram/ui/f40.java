package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class f40 extends org.telegram.ui.Components.oj0 {
    public org.telegram.messenger.r3 f45471c;
    public final int d;
    public ArrayList f45473f;
    public z10 h;
    public final c40 f45474n;
    public final ArrayList f45472e = new ArrayList();
    public boolean f45475r = false;

    public f40(org.telegram.messenger.r3 r3Var, int i7, c40 c40Var) {
        this.f45471c = r3Var;
        this.d = i7;
        this.f45474n = c40Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.r rVar, boolean z9) {
        if (z9 && rVar.getRenderer() == null) {
            rVar.setRenderer(org.telegram.ui.Components.voip.y.c(this.f45473f, this.h, null, null, rVar, rVar.getParticipant(), this.f45471c, this.f45474n));
        } else if (!z9 && rVar.getRenderer() != null) {
            rVar.getRenderer().setTabletGridView(null);
            rVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.pj0 pj0Var = this.f45474n.f44542e4;
        int size = this.f45472e.size();
        if (size <= 1) {
            return pj0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return pj0Var.getMeasuredHeight() / 2;
        }
        return (int) (pj0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, z10 z10Var) {
        this.f45473f = arrayList;
        this.h = z10Var;
    }

    public final void H(org.telegram.ui.Components.pj0 pj0Var, boolean z9, boolean z10) {
        this.f45475r = z9;
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
        if (this.f45471c == null) {
            return;
        }
        ArrayList arrayList = this.f45472e;
        if (z9) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f45471c.f25204f);
            v4.o.c(new jg.h(this, arrayList2, 4), true).c(this);
            org.telegram.messenger.g0.b4(pj0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f45471c.f25204f);
        f();
    }

    @Override
    public final int b() {
        return this.f45472e.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) d1Var.f56927a;
        org.telegram.messenger.s3 participant = rVar.getParticipant();
        ArrayList arrayList = this.f45472e;
        org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) arrayList.get(i7);
        TLRPC.GroupCallParticipant groupCallParticipant = ((org.telegram.messenger.s3) arrayList.get(i7)).f25405a;
        int size = arrayList.size();
        int i10 = 6;
        if (size > 1 && size != 2 && (size != 3 || i7 == 0 || i7 == 1)) {
            i10 = 3;
        }
        rVar.f39437a = i10;
        rVar.f39438b = this;
        if (rVar.getMeasuredHeight() != F()) {
            rVar.requestLayout();
        }
        org.telegram.messenger.c.a(this.d);
        TLRPC.Peer peer = this.f45471c.J;
        rVar.d = s3Var;
        if (participant != null && !participant.equals(s3Var) && rVar.f39440e && rVar.getRenderer() != null) {
            E(rVar, false);
            E(rVar, true);
        } else if (rVar.getRenderer() != null) {
            rVar.getRenderer().j(true);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new v4.d1(new v30(this, viewGroup.getContext()));
    }
}
