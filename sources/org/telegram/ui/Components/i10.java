package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class i10 extends pj0 {
    public org.telegram.messenger.r3 f34514c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.b20 f34517n;
    public final org.telegram.ui.e40 f34518r;
    public final ArrayList f34515e = new ArrayList();
    public final ArrayList f34516f = new ArrayList();
    public boolean f34519s = false;

    public i10(org.telegram.messenger.r3 r3Var, int i7, org.telegram.ui.e40 e40Var) {
        this.f34514c = r3Var;
        this.d = i7;
        this.f34518r = e40Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.b20 b20Var) {
        this.h = arrayList;
        this.f34517n = b20Var;
    }

    public final void F(org.telegram.ui.x10 x10Var, boolean z9) {
        this.f34519s = z9;
        for (int i7 = 0; i7 < x10Var.getChildCount(); i7++) {
            View childAt = x10Var.getChildAt(i7);
            if (childAt instanceof h10) {
                h10 h10Var = (h10) childAt;
                if (h10Var.getVideoParticipant() != null) {
                    h10Var.b(z9);
                }
            }
        }
    }

    public final void G(qj0 qj0Var, boolean z9) {
        if (this.f34514c == null) {
            return;
        }
        ArrayList arrayList = this.f34515e;
        ArrayList arrayList2 = this.f34516f;
        if (z9) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            org.telegram.messenger.r3 r3Var = this.f34514c;
            if (!r3Var.f25222b.rtmp_stream) {
                arrayList2.addAll(r3Var.f25226g);
            }
            arrayList.clear();
            org.telegram.messenger.r3 r3Var2 = this.f34514c;
            if (!r3Var2.f25222b.rtmp_stream) {
                arrayList.addAll(r3Var2.f25225f);
            }
            v4.o.c(new g10(this, arrayList4, arrayList3), true).c(this);
            org.telegram.messenger.g0.b4(qj0Var);
            return;
        }
        arrayList2.clear();
        org.telegram.messenger.r3 r3Var3 = this.f34514c;
        if (!r3Var3.f25222b.rtmp_stream) {
            arrayList2.addAll(r3Var3.f25226g);
        }
        arrayList.clear();
        org.telegram.messenger.r3 r3Var4 = this.f34514c;
        if (!r3Var4.f25222b.rtmp_stream) {
            arrayList.addAll(r3Var4.f25225f);
        }
        f();
    }

    @Override
    public final int b() {
        return this.f34516f.size() + this.f34515e.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        org.telegram.messenger.s3 s3Var;
        h10 h10Var = (h10) d1Var.f57056a;
        org.telegram.messenger.s3 s3Var2 = h10Var.f34143f;
        ArrayList arrayList = this.f34515e;
        if (i7 < arrayList.size()) {
            s3Var = (org.telegram.messenger.s3) arrayList.get(i7);
            groupCallParticipant = ((org.telegram.messenger.s3) arrayList.get(i7)).f25409a;
        } else {
            int size = i7 - arrayList.size();
            ArrayList arrayList2 = this.f34516f;
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
            if (h10Var.getRenderer() == null && s3Var != null && this.f34519s) {
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
