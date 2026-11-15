package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class l10 extends tj0 {
    public org.telegram.messenger.r3 f36682c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.y10 f36685n;
    public final org.telegram.ui.c40 f36686r;
    public final ArrayList f36683e = new ArrayList();
    public final ArrayList f36684f = new ArrayList();
    public boolean f36687s = false;

    public l10(org.telegram.messenger.r3 r3Var, int i7, org.telegram.ui.c40 c40Var) {
        this.f36682c = r3Var;
        this.d = i7;
        this.f36686r = c40Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.y10 y10Var) {
        this.h = arrayList;
        this.f36685n = y10Var;
    }

    public final void F(org.telegram.ui.u10 u10Var, boolean z10) {
        this.f36687s = z10;
        for (int i7 = 0; i7 < u10Var.getChildCount(); i7++) {
            View childAt = u10Var.getChildAt(i7);
            if (childAt instanceof k10) {
                k10 k10Var = (k10) childAt;
                if (k10Var.getVideoParticipant() != null) {
                    k10Var.b(z10);
                }
            }
        }
    }

    public final void G(uj0 uj0Var, boolean z10) {
        if (this.f36682c == null) {
            return;
        }
        ArrayList arrayList = this.f36683e;
        ArrayList arrayList2 = this.f36684f;
        if (z10) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            org.telegram.messenger.r3 r3Var = this.f36682c;
            if (!r3Var.f26216b.rtmp_stream) {
                arrayList2.addAll(r3Var.f26220g);
            }
            arrayList.clear();
            org.telegram.messenger.r3 r3Var2 = this.f36682c;
            if (!r3Var2.f26216b.rtmp_stream) {
                arrayList.addAll(r3Var2.f26219f);
            }
            v4.o.c(new j10(this, arrayList4, arrayList3), true).c(this);
            org.telegram.messenger.g0.a4(uj0Var);
            return;
        }
        arrayList2.clear();
        org.telegram.messenger.r3 r3Var3 = this.f36682c;
        if (!r3Var3.f26216b.rtmp_stream) {
            arrayList2.addAll(r3Var3.f26220g);
        }
        arrayList.clear();
        org.telegram.messenger.r3 r3Var4 = this.f36682c;
        if (!r3Var4.f26216b.rtmp_stream) {
            arrayList.addAll(r3Var4.f26219f);
        }
        f();
    }

    @Override
    public final int b() {
        return this.f36684f.size() + this.f36683e.size();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        org.telegram.messenger.s3 s3Var;
        k10 k10Var = (k10) e1Var.f58535a;
        org.telegram.messenger.s3 s3Var2 = k10Var.f36219f;
        ArrayList arrayList = this.f36683e;
        if (i7 < arrayList.size()) {
            s3Var = (org.telegram.messenger.s3) arrayList.get(i7);
            groupCallParticipant = ((org.telegram.messenger.s3) arrayList.get(i7)).f26403a;
        } else {
            int size = i7 - arrayList.size();
            ArrayList arrayList2 = this.f36684f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i7 - arrayList.size());
                s3Var = null;
            } else {
                return;
            }
        }
        k10Var.e(s3Var, groupCallParticipant);
        if (s3Var2 != null && !s3Var2.equals(s3Var) && k10Var.L && k10Var.getRenderer() != null) {
            k10Var.b(false);
            if (s3Var != null) {
                k10Var.b(true);
            }
        } else if (k10Var.L) {
            if (k10Var.getRenderer() == null && s3Var != null && this.f36687s) {
                k10Var.b(true);
            } else if (k10Var.getRenderer() != null && s3Var == null) {
                k10Var.b(false);
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        return new v4.e1(new k10(this, viewGroup.getContext()));
    }
}
