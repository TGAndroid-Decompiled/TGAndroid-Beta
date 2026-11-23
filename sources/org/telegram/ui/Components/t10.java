package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class t10 extends dk0 {
    public org.telegram.messenger.t3 f39775c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.a20 f39778n;
    public final org.telegram.ui.e40 f39779r;
    public final ArrayList f39776e = new ArrayList();
    public final ArrayList f39777f = new ArrayList();
    public boolean f39780s = false;

    public t10(org.telegram.messenger.t3 t3Var, int i7, org.telegram.ui.e40 e40Var) {
        this.f39775c = t3Var;
        this.d = i7;
        this.f39779r = e40Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.a20 a20Var) {
        this.h = arrayList;
        this.f39778n = a20Var;
    }

    public final void F(org.telegram.ui.w10 w10Var, boolean z10) {
        this.f39780s = z10;
        for (int i7 = 0; i7 < w10Var.getChildCount(); i7++) {
            View childAt = w10Var.getChildAt(i7);
            if (childAt instanceof s10) {
                s10 s10Var = (s10) childAt;
                if (s10Var.getVideoParticipant() != null) {
                    s10Var.b(z10);
                }
            }
        }
    }

    public final void G(ek0 ek0Var, boolean z10) {
        if (this.f39775c == null) {
            return;
        }
        ArrayList arrayList = this.f39776e;
        ArrayList arrayList2 = this.f39777f;
        if (z10) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            org.telegram.messenger.t3 t3Var = this.f39775c;
            if (!t3Var.f27034b.rtmp_stream) {
                arrayList2.addAll(t3Var.f27038g);
            }
            arrayList.clear();
            org.telegram.messenger.t3 t3Var2 = this.f39775c;
            if (!t3Var2.f27034b.rtmp_stream) {
                arrayList.addAll(t3Var2.f27037f);
            }
            v4.p.c(new r10(this, arrayList4, arrayList3), true).c(this);
            org.telegram.messenger.g0.Z3(ek0Var);
            return;
        }
        arrayList2.clear();
        org.telegram.messenger.t3 t3Var3 = this.f39775c;
        if (!t3Var3.f27034b.rtmp_stream) {
            arrayList2.addAll(t3Var3.f27038g);
        }
        arrayList.clear();
        org.telegram.messenger.t3 t3Var4 = this.f39775c;
        if (!t3Var4.f27034b.rtmp_stream) {
            arrayList.addAll(t3Var4.f27037f);
        }
        f();
    }

    @Override
    public final int b() {
        return this.f39777f.size() + this.f39776e.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        org.telegram.messenger.u3 u3Var;
        s10 s10Var = (s10) f1Var.f59245a;
        org.telegram.messenger.u3 u3Var2 = s10Var.f39457f;
        ArrayList arrayList = this.f39776e;
        if (i7 < arrayList.size()) {
            u3Var = (org.telegram.messenger.u3) arrayList.get(i7);
            groupCallParticipant = ((org.telegram.messenger.u3) arrayList.get(i7)).f27215a;
        } else {
            int size = i7 - arrayList.size();
            ArrayList arrayList2 = this.f39777f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i7 - arrayList.size());
                u3Var = null;
            } else {
                return;
            }
        }
        s10Var.e(u3Var, groupCallParticipant);
        if (u3Var2 != null && !u3Var2.equals(u3Var) && s10Var.L && s10Var.getRenderer() != null) {
            s10Var.b(false);
            if (u3Var != null) {
                s10Var.b(true);
            }
        } else if (s10Var.L) {
            if (s10Var.getRenderer() == null && u3Var != null && this.f39780s) {
                s10Var.b(true);
            } else if (s10Var.getRenderer() != null && u3Var == null) {
                s10Var.b(false);
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new v4.f1(new s10(this, viewGroup.getContext()));
    }
}
