package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e10 extends sj0 {
    public org.telegram.messenger.r3 f33264c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.u10 f33267n;
    public final org.telegram.ui.x30 f33268r;
    public final ArrayList f33265e = new ArrayList();
    public final ArrayList f33266f = new ArrayList();
    public boolean f33269s = false;

    public e10(org.telegram.messenger.r3 r3Var, int i3, org.telegram.ui.x30 x30Var) {
        this.f33264c = r3Var;
        this.d = i3;
        this.f33268r = x30Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.u10 u10Var) {
        this.h = arrayList;
        this.f33267n = u10Var;
    }

    public final void F(org.telegram.ui.q10 q10Var, boolean z10) {
        this.f33269s = z10;
        for (int i3 = 0; i3 < q10Var.getChildCount(); i3++) {
            View childAt = q10Var.getChildAt(i3);
            if (childAt instanceof d10) {
                d10 d10Var = (d10) childAt;
                if (d10Var.getVideoParticipant() != null) {
                    d10Var.b(z10);
                }
            }
        }
    }

    public final void G(tj0 tj0Var, boolean z10) {
        if (this.f33264c == null) {
            return;
        }
        ArrayList arrayList = this.f33265e;
        ArrayList arrayList2 = this.f33266f;
        if (z10) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            org.telegram.messenger.r3 r3Var = this.f33264c;
            if (!r3Var.f25049b.rtmp_stream) {
                arrayList2.addAll(r3Var.f25053g);
            }
            arrayList.clear();
            org.telegram.messenger.r3 r3Var2 = this.f33264c;
            if (!r3Var2.f25049b.rtmp_stream) {
                arrayList.addAll(r3Var2.f25052f);
            }
            u4.o.c(new c10(this, arrayList4, arrayList3), true).c(this);
            org.telegram.messenger.g0.b4(tj0Var);
            return;
        }
        arrayList2.clear();
        org.telegram.messenger.r3 r3Var3 = this.f33264c;
        if (!r3Var3.f25049b.rtmp_stream) {
            arrayList2.addAll(r3Var3.f25053g);
        }
        arrayList.clear();
        org.telegram.messenger.r3 r3Var4 = this.f33264c;
        if (!r3Var4.f25049b.rtmp_stream) {
            arrayList.addAll(r3Var4.f25052f);
        }
        f();
    }

    @Override
    public final int b() {
        return this.f33266f.size() + this.f33265e.size();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        org.telegram.messenger.s3 s3Var;
        d10 d10Var = (d10) d1Var.f55540a;
        org.telegram.messenger.s3 s3Var2 = d10Var.f32896f;
        ArrayList arrayList = this.f33265e;
        if (i3 < arrayList.size()) {
            s3Var = (org.telegram.messenger.s3) arrayList.get(i3);
            groupCallParticipant = ((org.telegram.messenger.s3) arrayList.get(i3)).f25270a;
        } else {
            int size = i3 - arrayList.size();
            ArrayList arrayList2 = this.f33266f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i3 - arrayList.size());
                s3Var = null;
            } else {
                return;
            }
        }
        d10Var.e(s3Var, groupCallParticipant);
        if (s3Var2 != null && !s3Var2.equals(s3Var) && d10Var.L && d10Var.getRenderer() != null) {
            d10Var.b(false);
            if (s3Var != null) {
                d10Var.b(true);
            }
        } else if (d10Var.L) {
            if (d10Var.getRenderer() == null && s3Var != null && this.f33269s) {
                d10Var.b(true);
            } else if (d10Var.getRenderer() != null && s3Var == null) {
                d10Var.b(false);
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        return new u4.d1(new d10(this, viewGroup.getContext()));
    }
}
