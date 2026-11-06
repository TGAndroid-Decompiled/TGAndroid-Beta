package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class h10 extends oj0 {
    public org.telegram.messenger.r3 f34138c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.z10 f34141n;
    public final org.telegram.ui.c40 f34142r;
    public final ArrayList f34139e = new ArrayList();
    public final ArrayList f34140f = new ArrayList();
    public boolean f34143s = false;

    public h10(org.telegram.messenger.r3 r3Var, int i7, org.telegram.ui.c40 c40Var) {
        this.f34138c = r3Var;
        this.d = i7;
        this.f34142r = c40Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.z10 z10Var) {
        this.h = arrayList;
        this.f34141n = z10Var;
    }

    public final void F(org.telegram.ui.v10 v10Var, boolean z9) {
        this.f34143s = z9;
        for (int i7 = 0; i7 < v10Var.getChildCount(); i7++) {
            View childAt = v10Var.getChildAt(i7);
            if (childAt instanceof g10) {
                g10 g10Var = (g10) childAt;
                if (g10Var.getVideoParticipant() != null) {
                    g10Var.b(z9);
                }
            }
        }
    }

    public final void G(pj0 pj0Var, boolean z9) {
        if (this.f34138c == null) {
            return;
        }
        ArrayList arrayList = this.f34139e;
        ArrayList arrayList2 = this.f34140f;
        if (z9) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            org.telegram.messenger.r3 r3Var = this.f34138c;
            if (!r3Var.f25209b.rtmp_stream) {
                arrayList2.addAll(r3Var.f25213g);
            }
            arrayList.clear();
            org.telegram.messenger.r3 r3Var2 = this.f34138c;
            if (!r3Var2.f25209b.rtmp_stream) {
                arrayList.addAll(r3Var2.f25212f);
            }
            v4.o.c(new f10(this, arrayList4, arrayList3), true).c(this);
            org.telegram.messenger.g0.b4(pj0Var);
            return;
        }
        arrayList2.clear();
        org.telegram.messenger.r3 r3Var3 = this.f34138c;
        if (!r3Var3.f25209b.rtmp_stream) {
            arrayList2.addAll(r3Var3.f25213g);
        }
        arrayList.clear();
        org.telegram.messenger.r3 r3Var4 = this.f34138c;
        if (!r3Var4.f25209b.rtmp_stream) {
            arrayList.addAll(r3Var4.f25212f);
        }
        f();
    }

    @Override
    public final int b() {
        return this.f34140f.size() + this.f34139e.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        org.telegram.messenger.s3 s3Var;
        g10 g10Var = (g10) d1Var.f56951a;
        org.telegram.messenger.s3 s3Var2 = g10Var.f33758f;
        ArrayList arrayList = this.f34139e;
        if (i7 < arrayList.size()) {
            s3Var = (org.telegram.messenger.s3) arrayList.get(i7);
            groupCallParticipant = ((org.telegram.messenger.s3) arrayList.get(i7)).f25413a;
        } else {
            int size = i7 - arrayList.size();
            ArrayList arrayList2 = this.f34140f;
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
            if (g10Var.getRenderer() == null && s3Var != null && this.f34143s) {
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
