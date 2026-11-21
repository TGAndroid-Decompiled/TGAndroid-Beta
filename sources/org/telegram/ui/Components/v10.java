package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class v10 extends dk0 {
    public org.telegram.messenger.t3 f40635c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.b20 f40638n;
    public final org.telegram.ui.f40 f40639r;
    public final ArrayList f40636e = new ArrayList();
    public final ArrayList f40637f = new ArrayList();
    public boolean f40640s = false;

    public v10(org.telegram.messenger.t3 t3Var, int i7, org.telegram.ui.f40 f40Var) {
        this.f40635c = t3Var;
        this.d = i7;
        this.f40639r = f40Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.b20 b20Var) {
        this.h = arrayList;
        this.f40638n = b20Var;
    }

    public final void F(org.telegram.ui.x10 x10Var, boolean z10) {
        this.f40640s = z10;
        for (int i7 = 0; i7 < x10Var.getChildCount(); i7++) {
            View childAt = x10Var.getChildAt(i7);
            if (childAt instanceof u10) {
                u10 u10Var = (u10) childAt;
                if (u10Var.getVideoParticipant() != null) {
                    u10Var.b(z10);
                }
            }
        }
    }

    public final void G(ek0 ek0Var, boolean z10) {
        if (this.f40635c == null) {
            return;
        }
        ArrayList arrayList = this.f40636e;
        ArrayList arrayList2 = this.f40637f;
        if (z10) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            org.telegram.messenger.t3 t3Var = this.f40635c;
            if (!t3Var.f26963b.rtmp_stream) {
                arrayList2.addAll(t3Var.f26967g);
            }
            arrayList.clear();
            org.telegram.messenger.t3 t3Var2 = this.f40635c;
            if (!t3Var2.f26963b.rtmp_stream) {
                arrayList.addAll(t3Var2.f26966f);
            }
            v4.o.c(new t10(this, arrayList4, arrayList3), true).c(this);
            org.telegram.messenger.g0.Z3(ek0Var);
            return;
        }
        arrayList2.clear();
        org.telegram.messenger.t3 t3Var3 = this.f40635c;
        if (!t3Var3.f26963b.rtmp_stream) {
            arrayList2.addAll(t3Var3.f26967g);
        }
        arrayList.clear();
        org.telegram.messenger.t3 t3Var4 = this.f40635c;
        if (!t3Var4.f26963b.rtmp_stream) {
            arrayList.addAll(t3Var4.f26966f);
        }
        f();
    }

    @Override
    public final int b() {
        return this.f40637f.size() + this.f40636e.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        org.telegram.messenger.u3 u3Var;
        u10 u10Var = (u10) f1Var.f59161a;
        org.telegram.messenger.u3 u3Var2 = u10Var.f40203f;
        ArrayList arrayList = this.f40636e;
        if (i7 < arrayList.size()) {
            u3Var = (org.telegram.messenger.u3) arrayList.get(i7);
            groupCallParticipant = ((org.telegram.messenger.u3) arrayList.get(i7)).f27145a;
        } else {
            int size = i7 - arrayList.size();
            ArrayList arrayList2 = this.f40637f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i7 - arrayList.size());
                u3Var = null;
            } else {
                return;
            }
        }
        u10Var.e(u3Var, groupCallParticipant);
        if (u3Var2 != null && !u3Var2.equals(u3Var) && u10Var.L && u10Var.getRenderer() != null) {
            u10Var.b(false);
            if (u3Var != null) {
                u10Var.b(true);
            }
        } else if (u10Var.L) {
            if (u10Var.getRenderer() == null && u3Var != null && this.f40640s) {
                u10Var.b(true);
            } else if (u10Var.getRenderer() != null && u3Var == null) {
                u10Var.b(false);
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new v4.f1(new u10(this, viewGroup.getContext()));
    }
}
