package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class i10 extends oj0 {
    public org.telegram.messenger.r3 f34498c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.z10 f34501n;
    public final org.telegram.ui.c40 f34502r;
    public final ArrayList f34499e = new ArrayList();
    public final ArrayList f34500f = new ArrayList();
    public boolean f34503s = false;

    public i10(org.telegram.messenger.r3 r3Var, int i7, org.telegram.ui.c40 c40Var) {
        this.f34498c = r3Var;
        this.d = i7;
        this.f34502r = c40Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.z10 z10Var) {
        this.h = arrayList;
        this.f34501n = z10Var;
    }

    public final void F(org.telegram.ui.v10 v10Var, boolean z9) {
        this.f34503s = z9;
        for (int i7 = 0; i7 < v10Var.getChildCount(); i7++) {
            View childAt = v10Var.getChildAt(i7);
            if (childAt instanceof h10) {
                h10 h10Var = (h10) childAt;
                if (h10Var.getVideoParticipant() != null) {
                    h10Var.b(z9);
                }
            }
        }
    }

    public final void G(pj0 pj0Var, boolean z9) {
        if (this.f34498c == null) {
            return;
        }
        ArrayList arrayList = this.f34499e;
        ArrayList arrayList2 = this.f34500f;
        if (z9) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            org.telegram.messenger.r3 r3Var = this.f34498c;
            if (!r3Var.f25222b.rtmp_stream) {
                arrayList2.addAll(r3Var.f25226g);
            }
            arrayList.clear();
            org.telegram.messenger.r3 r3Var2 = this.f34498c;
            if (!r3Var2.f25222b.rtmp_stream) {
                arrayList.addAll(r3Var2.f25225f);
            }
            v4.o.c(new g10(this, arrayList4, arrayList3), true).c(this);
            org.telegram.messenger.g0.b4(pj0Var);
            return;
        }
        arrayList2.clear();
        org.telegram.messenger.r3 r3Var3 = this.f34498c;
        if (!r3Var3.f25222b.rtmp_stream) {
            arrayList2.addAll(r3Var3.f25226g);
        }
        arrayList.clear();
        org.telegram.messenger.r3 r3Var4 = this.f34498c;
        if (!r3Var4.f25222b.rtmp_stream) {
            arrayList.addAll(r3Var4.f25225f);
        }
        f();
    }

    @Override
    public final int b() {
        return this.f34500f.size() + this.f34499e.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        org.telegram.messenger.s3 s3Var;
        h10 h10Var = (h10) d1Var.f57044a;
        org.telegram.messenger.s3 s3Var2 = h10Var.f34074f;
        ArrayList arrayList = this.f34499e;
        if (i7 < arrayList.size()) {
            s3Var = (org.telegram.messenger.s3) arrayList.get(i7);
            groupCallParticipant = ((org.telegram.messenger.s3) arrayList.get(i7)).f25409a;
        } else {
            int size = i7 - arrayList.size();
            ArrayList arrayList2 = this.f34500f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i7 - arrayList.size());
                s3Var = null;
            } else {
                return;
            }
        }
        h10Var.e(s3Var, groupCallParticipant);
        if (s3Var2 != null && !s3Var2.equals(s3Var) && h10Var.K && h10Var.getRenderer() != null) {
            h10Var.b(false);
            if (s3Var != null) {
                h10Var.b(true);
            }
        } else if (h10Var.K) {
            if (h10Var.getRenderer() == null && s3Var != null && this.f34503s) {
                h10Var.b(true);
            } else if (h10Var.getRenderer() != null && s3Var == null) {
                h10Var.b(false);
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new v4.d1(new h10(this, viewGroup.getContext()));
    }
}
