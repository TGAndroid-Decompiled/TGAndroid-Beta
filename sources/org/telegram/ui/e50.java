package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e50 extends org.telegram.ui.Components.sk0 {
    public org.telegram.messenger.u3 f36927c;
    public final int d;
    public ArrayList f36928f;
    public y20 h;
    public final b50 f36929n;
    public final ArrayList e = new ArrayList();
    public boolean f36930r = false;

    public e50(org.telegram.messenger.u3 u3Var, int i10, b50 b50Var) {
        this.f36927c = u3Var;
        this.d = i10;
        this.f36929n = b50Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.k kVar, boolean z10) {
        if (z10 && kVar.getRenderer() == null) {
            kVar.setRenderer(org.telegram.ui.Components.voip.r.c(this.f36928f, this.h, null, null, kVar, kVar.getParticipant(), this.f36927c, this.f36929n));
        } else if (!z10 && kVar.getRenderer() != null) {
            kVar.getRenderer().setTabletGridView(null);
            kVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.tk0 tk0Var = this.f36929n.f36012e4;
        int size = this.e.size();
        if (size <= 1) {
            return tk0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return tk0Var.getMeasuredHeight() / 2;
        }
        return (int) (tk0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, y20 y20Var) {
        this.f36928f = arrayList;
        this.h = y20Var;
    }

    public final void H(org.telegram.ui.Components.tk0 tk0Var, boolean z10, boolean z11) {
        this.f36930r = z10;
        if (z11) {
            for (int i10 = 0; i10 < tk0Var.getChildCount(); i10++) {
                View childAt = tk0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.k) {
                    org.telegram.ui.Components.voip.k kVar = (org.telegram.ui.Components.voip.k) childAt;
                    if (kVar.getParticipant() != null) {
                        E(kVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.tk0 tk0Var, boolean z10) {
        if (this.f36927c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f36927c.f18230f);
            s4.n.c(new hg.a(this, arrayList2, 3), true).c(this);
            org.telegram.messenger.i0.a4(tk0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f36927c.f18230f);
        f();
    }

    @Override
    public final int b() {
        return this.e.size();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        org.telegram.ui.Components.voip.k kVar = (org.telegram.ui.Components.voip.k) c1Var.f47898a;
        org.telegram.messenger.v3 participant = kVar.getParticipant();
        ArrayList arrayList = this.e;
        org.telegram.messenger.v3 v3Var = (org.telegram.messenger.v3) arrayList.get(i10);
        TLRPC.GroupCallParticipant groupCallParticipant = ((org.telegram.messenger.v3) arrayList.get(i10)).f18477a;
        int size = arrayList.size();
        int i11 = 6;
        if (size > 1 && size != 2 && (size != 3 || i10 == 0 || i10 == 1)) {
            i11 = 3;
        }
        kVar.f31498a = i11;
        kVar.f31499b = this;
        if (kVar.getMeasuredHeight() != F()) {
            kVar.requestLayout();
        }
        org.telegram.messenger.c.a(this.d);
        TLRPC.Peer peer = this.f36927c.J;
        kVar.d = v3Var;
        if (participant != null && !participant.equals(v3Var) && kVar.e && kVar.getRenderer() != null) {
            E(kVar, false);
            E(kVar, true);
        } else if (kVar.getRenderer() != null) {
            kVar.getRenderer().j(true);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        return new s4.c1(new u40(this, viewGroup.getContext()));
    }
}
