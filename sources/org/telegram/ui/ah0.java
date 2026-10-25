package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ah0 extends s4.p {
    public int f37792b;
    public int f37793c;
    public int d;
    public int e;
    public int f37794f;
    public int f37795g;
    public int h;
    public final SparseIntArray f37796i = new SparseIntArray();
    public final SparseIntArray f37797j = new SparseIntArray();
    public final ArrayList f37798k = new ArrayList();
    public final ArrayList f37799l = new ArrayList();
    public final jh0 f37800m;

    public ah0(jh0 jh0Var) {
        this.f37800m = jh0Var;
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
        int i14 = this.f37793c;
        jh0 jh0Var = this.f37800m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f37794f)) && ((i11 >= (i13 = jh0Var.f40670y) && i11 < jh0Var.E) || (i11 >= jh0Var.H && i11 < jh0Var.I))) {
            if (i11 >= i13 && i11 < jh0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) jh0Var.f40654i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) jh0Var.f40655j0.get(i11 - jh0Var.H);
            }
            int i15 = this.f37793c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f37798k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f37799l.get(i10 - this.e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f37795g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = jh0Var.U) && i11 < jh0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f37796i.get(i10, -1);
        int i18 = this.f37797j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f37800m.X;
    }

    @Override
    public final int e() {
        return this.f37792b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        jh0 jh0Var = this.f37800m;
        g(1, jh0Var.f40663r, sparseIntArray);
        g(2, jh0Var.f40665s, sparseIntArray);
        g(3, jh0Var.v, sparseIntArray);
        g(4, jh0Var.f40668w, sparseIntArray);
        g(5, jh0Var.f40669x, sparseIntArray);
        g(6, jh0Var.L, sparseIntArray);
        g(7, jh0Var.N, sparseIntArray);
        g(8, jh0Var.O, sparseIntArray);
        g(9, jh0Var.Q, sparseIntArray);
        g(10, jh0Var.R, sparseIntArray);
        g(11, jh0Var.S, sparseIntArray);
        g(12, jh0Var.P, sparseIntArray);
        g(13, jh0Var.F, sparseIntArray);
    }
}
