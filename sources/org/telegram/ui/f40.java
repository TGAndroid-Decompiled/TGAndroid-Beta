package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class f40 extends org.telegram.ui.Components.tj0 {
    public org.telegram.messenger.r3 f46976c;
    public final int d;
    public ArrayList f46978f;
    public y10 h;
    public final c40 f46979n;
    public final ArrayList f46977e = new ArrayList();
    public boolean f46980r = false;

    public f40(org.telegram.messenger.r3 r3Var, int i7, c40 c40Var) {
        this.f46976c = r3Var;
        this.d = i7;
        this.f46979n = c40Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.r rVar, boolean z10) {
        if (z10 && rVar.getRenderer() == null) {
            rVar.setRenderer(org.telegram.ui.Components.voip.z.c(this.f46978f, this.h, null, null, rVar, rVar.getParticipant(), this.f46976c, this.f46979n));
        } else if (!z10 && rVar.getRenderer() != null) {
            rVar.getRenderer().setTabletGridView(null);
            rVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.uj0 uj0Var = this.f46979n.f45934m4;
        int size = this.f46977e.size();
        if (size <= 1) {
            return uj0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return uj0Var.getMeasuredHeight() / 2;
        }
        return (int) (uj0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, y10 y10Var) {
        this.f46978f = arrayList;
        this.h = y10Var;
    }

    public final void H(org.telegram.ui.Components.uj0 uj0Var, boolean z10, boolean z11) {
        this.f46980r = z10;
        if (z11) {
            for (int i7 = 0; i7 < uj0Var.getChildCount(); i7++) {
                View childAt = uj0Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Components.voip.r) {
                    org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) childAt;
                    if (rVar.getParticipant() != null) {
                        E(rVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.uj0 uj0Var, boolean z10) {
        if (this.f46976c == null) {
            return;
        }
        ArrayList arrayList = this.f46977e;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f46976c.f26219f);
            v4.o.c(new jg.g(this, arrayList2, 4), true).c(this);
            org.telegram.messenger.g0.a4(uj0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f46976c.f26219f);
        f();
    }

    @Override
    public final int b() {
        return this.f46977e.size();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) e1Var.f58535a;
        org.telegram.messenger.s3 participant = rVar.getParticipant();
        ArrayList arrayList = this.f46977e;
        org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) arrayList.get(i7);
        TLRPC.GroupCallParticipant groupCallParticipant = ((org.telegram.messenger.s3) arrayList.get(i7)).f26403a;
        int size = arrayList.size();
        int i10 = 6;
        if (size > 1 && size != 2 && (size != 3 || i7 == 0 || i7 == 1)) {
            i10 = 3;
        }
        rVar.f40886a = i10;
        rVar.f40887b = this;
        if (rVar.getMeasuredHeight() != F()) {
            rVar.requestLayout();
        }
        org.telegram.messenger.c.a(this.d);
        TLRPC.Peer peer = this.f46976c.J;
        rVar.d = s3Var;
        if (participant != null && !participant.equals(s3Var) && rVar.f40889e && rVar.getRenderer() != null) {
            E(rVar, false);
            E(rVar, true);
        } else if (rVar.getRenderer() != null) {
            rVar.getRenderer().j(true);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        return new v4.e1(new v30(this, viewGroup.getContext()));
    }
}
