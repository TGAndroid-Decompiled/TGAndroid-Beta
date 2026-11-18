package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class s10 extends bk0 {
    public org.telegram.messenger.t3 f39442c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.b20 f39445n;
    public final org.telegram.ui.f40 f39446r;
    public final ArrayList f39443e = new ArrayList();
    public final ArrayList f39444f = new ArrayList();
    public boolean f39447s = false;

    public s10(org.telegram.messenger.t3 t3Var, int i7, org.telegram.ui.f40 f40Var) {
        this.f39442c = t3Var;
        this.d = i7;
        this.f39446r = f40Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.b20 b20Var) {
        this.h = arrayList;
        this.f39445n = b20Var;
    }

    public final void F(org.telegram.ui.x10 x10Var, boolean z10) {
        this.f39447s = z10;
        for (int i7 = 0; i7 < x10Var.getChildCount(); i7++) {
            View childAt = x10Var.getChildAt(i7);
            if (childAt instanceof r10) {
                r10 r10Var = (r10) childAt;
                if (r10Var.getVideoParticipant() != null) {
                    r10Var.b(z10);
                }
            }
        }
    }

    public final void G(ck0 ck0Var, boolean z10) {
        if (this.f39442c == null) {
            return;
        }
        ArrayList arrayList = this.f39443e;
        ArrayList arrayList2 = this.f39444f;
        if (z10) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            org.telegram.messenger.t3 t3Var = this.f39442c;
            if (!t3Var.f26935b.rtmp_stream) {
                arrayList2.addAll(t3Var.f26939g);
            }
            arrayList.clear();
            org.telegram.messenger.t3 t3Var2 = this.f39442c;
            if (!t3Var2.f26935b.rtmp_stream) {
                arrayList.addAll(t3Var2.f26938f);
            }
            v4.o.c(new q10(this, arrayList4, arrayList3), true).c(this);
            org.telegram.messenger.g0.Z3(ck0Var);
            return;
        }
        arrayList2.clear();
        org.telegram.messenger.t3 t3Var3 = this.f39442c;
        if (!t3Var3.f26935b.rtmp_stream) {
            arrayList2.addAll(t3Var3.f26939g);
        }
        arrayList.clear();
        org.telegram.messenger.t3 t3Var4 = this.f39442c;
        if (!t3Var4.f26935b.rtmp_stream) {
            arrayList.addAll(t3Var4.f26938f);
        }
        f();
    }

    @Override
    public final int b() {
        return this.f39444f.size() + this.f39443e.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        org.telegram.messenger.u3 u3Var;
        r10 r10Var = (r10) f1Var.f59123a;
        org.telegram.messenger.u3 u3Var2 = r10Var.f38975f;
        ArrayList arrayList = this.f39443e;
        if (i7 < arrayList.size()) {
            u3Var = (org.telegram.messenger.u3) arrayList.get(i7);
            groupCallParticipant = ((org.telegram.messenger.u3) arrayList.get(i7)).f27117a;
        } else {
            int size = i7 - arrayList.size();
            ArrayList arrayList2 = this.f39444f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i7 - arrayList.size());
                u3Var = null;
            } else {
                return;
            }
        }
        r10Var.e(u3Var, groupCallParticipant);
        if (u3Var2 != null && !u3Var2.equals(u3Var) && r10Var.L && r10Var.getRenderer() != null) {
            r10Var.b(false);
            if (u3Var != null) {
                r10Var.b(true);
            }
        } else if (r10Var.L) {
            if (r10Var.getRenderer() == null && u3Var != null && this.f39447s) {
                r10Var.b(true);
            } else if (r10Var.getRenderer() != null && u3Var == null) {
                r10Var.b(false);
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new v4.f1(new r10(this, viewGroup.getContext()));
    }
}
