package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class z10 extends tk0 {
    public org.telegram.messenger.u3 f32961c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.x20 f32963n;
    public final org.telegram.ui.a50 f32964r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f32962f = new ArrayList();
    public boolean f32965s = false;

    public z10(org.telegram.messenger.u3 u3Var, int i10, org.telegram.ui.a50 a50Var) {
        this.f32961c = u3Var;
        this.d = i10;
        this.f32964r = a50Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.x20 x20Var) {
        this.h = arrayList;
        this.f32963n = x20Var;
    }

    public final void F(org.telegram.ui.t20 t20Var, boolean z10) {
        this.f32965s = z10;
        for (int i10 = 0; i10 < t20Var.getChildCount(); i10++) {
            View childAt = t20Var.getChildAt(i10);
            if (childAt instanceof y10) {
                y10 y10Var = (y10) childAt;
                if (y10Var.getVideoParticipant() != null) {
                    y10Var.b(z10);
                }
            }
        }
    }

    public final void G(uk0 uk0Var, boolean z10) {
        if (this.f32961c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f32962f;
        if (z10) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            org.telegram.messenger.u3 u3Var = this.f32961c;
            if (!u3Var.f18361b.rtmp_stream) {
                arrayList2.addAll(u3Var.f18364g);
            }
            arrayList.clear();
            org.telegram.messenger.u3 u3Var2 = this.f32961c;
            if (!u3Var2.f18361b.rtmp_stream) {
                arrayList.addAll(u3Var2.f18363f);
            }
            s4.n.c(new v10(this, arrayList4, arrayList3), true).c(this);
            org.telegram.messenger.i0.a4(uk0Var);
            return;
        }
        arrayList2.clear();
        org.telegram.messenger.u3 u3Var3 = this.f32961c;
        if (!u3Var3.f18361b.rtmp_stream) {
            arrayList2.addAll(u3Var3.f18364g);
        }
        arrayList.clear();
        org.telegram.messenger.u3 u3Var4 = this.f32961c;
        if (!u3Var4.f18361b.rtmp_stream) {
            arrayList.addAll(u3Var4.f18363f);
        }
        f();
    }

    @Override
    public final int b() {
        return this.f32962f.size() + this.e.size();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        org.telegram.messenger.v3 v3Var;
        y10 y10Var = (y10) c1Var.f47909a;
        org.telegram.messenger.v3 v3Var2 = y10Var.f32690f;
        ArrayList arrayList = this.e;
        if (i10 < arrayList.size()) {
            v3Var = (org.telegram.messenger.v3) arrayList.get(i10);
            groupCallParticipant = ((org.telegram.messenger.v3) arrayList.get(i10)).f18588a;
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f32962f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i10 - arrayList.size());
                v3Var = null;
            } else {
                return;
            }
        }
        y10Var.e(v3Var, groupCallParticipant);
        if (v3Var2 != null && !v3Var2.equals(v3Var) && y10Var.K && y10Var.getRenderer() != null) {
            y10Var.b(false);
            if (v3Var != null) {
                y10Var.b(true);
            }
        } else if (y10Var.K) {
            if (y10Var.getRenderer() == null && v3Var != null && this.f32965s) {
                y10Var.b(true);
            } else if (y10Var.getRenderer() != null && v3Var == null) {
                y10Var.b(false);
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        return new s4.c1(new y10(this, viewGroup.getContext()));
    }
}
