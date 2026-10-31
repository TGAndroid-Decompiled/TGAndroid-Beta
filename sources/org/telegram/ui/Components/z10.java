package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class z10 extends sk0 {
    public org.telegram.messenger.u3 f32868c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.y20 f32870n;
    public final org.telegram.ui.b50 f32871r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f32869f = new ArrayList();
    public boolean f32872s = false;

    public z10(org.telegram.messenger.u3 u3Var, int i10, org.telegram.ui.b50 b50Var) {
        this.f32868c = u3Var;
        this.d = i10;
        this.f32871r = b50Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.y20 y20Var) {
        this.h = arrayList;
        this.f32870n = y20Var;
    }

    public final void F(org.telegram.ui.u20 u20Var, boolean z10) {
        this.f32872s = z10;
        for (int i10 = 0; i10 < u20Var.getChildCount(); i10++) {
            View childAt = u20Var.getChildAt(i10);
            if (childAt instanceof y10) {
                y10 y10Var = (y10) childAt;
                if (y10Var.getVideoParticipant() != null) {
                    y10Var.b(z10);
                }
            }
        }
    }

    public final void G(tk0 tk0Var, boolean z10) {
        if (this.f32868c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f32869f;
        if (z10) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            org.telegram.messenger.u3 u3Var = this.f32868c;
            if (!u3Var.f18228b.rtmp_stream) {
                arrayList2.addAll(u3Var.f18231g);
            }
            arrayList.clear();
            org.telegram.messenger.u3 u3Var2 = this.f32868c;
            if (!u3Var2.f18228b.rtmp_stream) {
                arrayList.addAll(u3Var2.f18230f);
            }
            s4.n.c(new v10(this, arrayList4, arrayList3), true).c(this);
            org.telegram.messenger.i0.a4(tk0Var);
            return;
        }
        arrayList2.clear();
        org.telegram.messenger.u3 u3Var3 = this.f32868c;
        if (!u3Var3.f18228b.rtmp_stream) {
            arrayList2.addAll(u3Var3.f18231g);
        }
        arrayList.clear();
        org.telegram.messenger.u3 u3Var4 = this.f32868c;
        if (!u3Var4.f18228b.rtmp_stream) {
            arrayList.addAll(u3Var4.f18230f);
        }
        f();
    }

    @Override
    public final int b() {
        return this.f32869f.size() + this.e.size();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        org.telegram.messenger.v3 v3Var;
        y10 y10Var = (y10) c1Var.f47898a;
        org.telegram.messenger.v3 v3Var2 = y10Var.f32599f;
        ArrayList arrayList = this.e;
        if (i10 < arrayList.size()) {
            v3Var = (org.telegram.messenger.v3) arrayList.get(i10);
            groupCallParticipant = ((org.telegram.messenger.v3) arrayList.get(i10)).f18477a;
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f32869f;
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
            if (y10Var.getRenderer() == null && v3Var != null && this.f32872s) {
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
