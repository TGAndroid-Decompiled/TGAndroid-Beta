package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gh0 extends f2.q {
    public int f34621b;
    public int f34622c;
    public int d;
    public int e;
    public int f34623f;
    public int f34624g;
    public int h;
    public final SparseIntArray f34625i = new SparseIntArray();
    public final SparseIntArray f34626j = new SparseIntArray();
    public final ArrayList f34627k = new ArrayList();
    public final ArrayList f34628l = new ArrayList();
    public final ph0 f34629m;

    public gh0(ph0 ph0Var) {
        this.f34629m = ph0Var;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12;
        int i13;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2;
        int i14 = this.f34622c;
        ph0 ph0Var = this.f34629m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f34623f)) && ((i11 >= (i13 = ph0Var.f37342y) && i11 < ph0Var.B) || (i11 >= ph0Var.E && i11 < ph0Var.F))) {
            if (i11 >= i13 && i11 < ph0Var.B) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ph0Var.f37326f0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ph0Var.f37327g0.get(i11 - ph0Var.E);
            }
            int i15 = this.f34622c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f34627k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f34628l.get(i10 - this.e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f34624g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = ph0Var.R) && i11 < ph0Var.S) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f34625i.get(i10, -1);
        int i18 = this.f34626j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f34629m.U;
    }

    @Override
    public final int e() {
        return this.f34621b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        ph0 ph0Var = this.f34629m;
        g(1, ph0Var.f37338r, sparseIntArray);
        g(2, ph0Var.f37339s, sparseIntArray);
        g(3, ph0Var.v, sparseIntArray);
        g(4, ph0Var.f37340w, sparseIntArray);
        g(5, ph0Var.f37341x, sparseIntArray);
        g(6, ph0Var.I, sparseIntArray);
        g(7, ph0Var.K, sparseIntArray);
        g(8, ph0Var.L, sparseIntArray);
        g(9, ph0Var.N, sparseIntArray);
        g(10, ph0Var.O, sparseIntArray);
        g(11, ph0Var.P, sparseIntArray);
        g(12, ph0Var.M, sparseIntArray);
        g(13, ph0Var.C, sparseIntArray);
    }
}
