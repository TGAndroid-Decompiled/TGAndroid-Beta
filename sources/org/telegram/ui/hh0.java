package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hh0 extends f2.q {
    public int f37498b;
    public int f37499c;
    public int d;
    public int f37500e;
    public int f37501f;
    public int f37502g;
    public int h;
    public final SparseIntArray f37503i = new SparseIntArray();
    public final SparseIntArray f37504j = new SparseIntArray();
    public final ArrayList f37505k = new ArrayList();
    public final ArrayList f37506l = new ArrayList();
    public final qh0 f37507m;

    public hh0(qh0 qh0Var) {
        this.f37507m = qh0Var;
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
        int i14 = this.f37499c;
        qh0 qh0Var = this.f37507m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.f37500e && i10 < this.f37501f)) && ((i11 >= (i13 = qh0Var.f40526y) && i11 < qh0Var.B) || (i11 >= qh0Var.E && i11 < qh0Var.F))) {
            if (i11 >= i13 && i11 < qh0Var.B) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) qh0Var.f40510f0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) qh0Var.f40511g0.get(i11 - qh0Var.E);
            }
            int i15 = this.f37499c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f37505k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f37506l.get(i10 - this.f37500e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f37502g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = qh0Var.R) && i11 < qh0Var.S) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f37503i.get(i10, -1);
        int i18 = this.f37504j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f37507m.U;
    }

    @Override
    public final int e() {
        return this.f37498b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        qh0 qh0Var = this.f37507m;
        g(1, qh0Var.f40522r, sparseIntArray);
        g(2, qh0Var.f40523s, sparseIntArray);
        g(3, qh0Var.v, sparseIntArray);
        g(4, qh0Var.f40524w, sparseIntArray);
        g(5, qh0Var.f40525x, sparseIntArray);
        g(6, qh0Var.I, sparseIntArray);
        g(7, qh0Var.K, sparseIntArray);
        g(8, qh0Var.L, sparseIntArray);
        g(9, qh0Var.N, sparseIntArray);
        g(10, qh0Var.O, sparseIntArray);
        g(11, qh0Var.P, sparseIntArray);
        g(12, qh0Var.M, sparseIntArray);
        g(13, qh0Var.C, sparseIntArray);
    }
}
