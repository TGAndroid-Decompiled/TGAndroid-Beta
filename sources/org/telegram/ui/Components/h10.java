package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class h10 extends oj0 {
    public org.telegram.messenger.r3 f34118c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.c20 f34121n;
    public final org.telegram.ui.f40 f34122r;
    public final ArrayList f34119e = new ArrayList();
    public final ArrayList f34120f = new ArrayList();
    public boolean f34123s = false;

    public h10(org.telegram.messenger.r3 r3Var, int i7, org.telegram.ui.f40 f40Var) {
        this.f34118c = r3Var;
        this.d = i7;
        this.f34122r = f40Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.c20 c20Var) {
        this.h = arrayList;
        this.f34121n = c20Var;
    }

    public final void F(org.telegram.ui.y10 y10Var, boolean z9) {
        this.f34123s = z9;
        for (int i7 = 0; i7 < y10Var.getChildCount(); i7++) {
            View childAt = y10Var.getChildAt(i7);
            if (childAt instanceof g10) {
                g10 g10Var = (g10) childAt;
                if (g10Var.getVideoParticipant() != null) {
                    g10Var.b(z9);
                }
            }
        }
    }

    public final void G(pj0 pj0Var, boolean z9) {
        if (this.f34118c == null) {
            return;
        }
        ArrayList arrayList = this.f34119e;
        ArrayList arrayList2 = this.f34120f;
        if (z9) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            org.telegram.messenger.r3 r3Var = this.f34118c;
            if (!r3Var.f25226b.rtmp_stream) {
                arrayList2.addAll(r3Var.f25230g);
            }
            arrayList.clear();
            org.telegram.messenger.r3 r3Var2 = this.f34118c;
            if (!r3Var2.f25226b.rtmp_stream) {
                arrayList.addAll(r3Var2.f25229f);
            }
            v4.o.c(new f10(this, arrayList4, arrayList3), true).c(this);
            org.telegram.messenger.g0.b4(pj0Var);
            return;
        }
        arrayList2.clear();
        org.telegram.messenger.r3 r3Var3 = this.f34118c;
        if (!r3Var3.f25226b.rtmp_stream) {
            arrayList2.addAll(r3Var3.f25230g);
        }
        arrayList.clear();
        org.telegram.messenger.r3 r3Var4 = this.f34118c;
        if (!r3Var4.f25226b.rtmp_stream) {
            arrayList.addAll(r3Var4.f25229f);
        }
        f();
    }

    @Override
    public final int b() {
        return this.f34120f.size() + this.f34119e.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        org.telegram.messenger.s3 s3Var;
        g10 g10Var = (g10) d1Var.f57052a;
        org.telegram.messenger.s3 s3Var2 = g10Var.f33737f;
        ArrayList arrayList = this.f34119e;
        if (i7 < arrayList.size()) {
            s3Var = (org.telegram.messenger.s3) arrayList.get(i7);
            groupCallParticipant = ((org.telegram.messenger.s3) arrayList.get(i7)).f25413a;
        } else {
            int size = i7 - arrayList.size();
            ArrayList arrayList2 = this.f34120f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i7 - arrayList.size());
                s3Var = null;
            } else {
                return;
            }
        }
        g10Var.e(s3Var, groupCallParticipant);
        if (s3Var2 != null && !s3Var2.equals(s3Var) && g10Var.K && g10Var.getRenderer() != null) {
            g10Var.b(false);
            if (s3Var != null) {
                g10Var.b(true);
            }
        } else if (g10Var.K) {
            if (g10Var.getRenderer() == null && s3Var != null && this.f34123s) {
                g10Var.b(true);
            } else if (g10Var.getRenderer() != null && s3Var == null) {
                g10Var.b(false);
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new v4.d1(new g10(this, viewGroup.getContext()));
    }
}
