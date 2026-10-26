package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ah0 extends s4.p {
    public int f37795b;
    public int f37796c;
    public int d;
    public int e;
    public int f37797f;
    public int f37798g;
    public int h;
    public final SparseIntArray f37799i = new SparseIntArray();
    public final SparseIntArray f37800j = new SparseIntArray();
    public final ArrayList f37801k = new ArrayList();
    public final ArrayList f37802l = new ArrayList();
    public final jh0 f37803m;

    public ah0(jh0 jh0Var) {
        this.f37803m = jh0Var;
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
        int i14 = this.f37796c;
        jh0 jh0Var = this.f37803m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f37797f)) && ((i11 >= (i13 = jh0Var.f40673y) && i11 < jh0Var.E) || (i11 >= jh0Var.H && i11 < jh0Var.I))) {
            if (i11 >= i13 && i11 < jh0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) jh0Var.f40657i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) jh0Var.f40658j0.get(i11 - jh0Var.H);
            }
            int i15 = this.f37796c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f37801k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f37802l.get(i10 - this.e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f37798g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = jh0Var.U) && i11 < jh0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f37799i.get(i10, -1);
        int i18 = this.f37800j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f37803m.X;
    }

    @Override
    public final int e() {
        return this.f37795b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        jh0 jh0Var = this.f37803m;
        g(1, jh0Var.f40666r, sparseIntArray);
        g(2, jh0Var.f40668s, sparseIntArray);
        g(3, jh0Var.v, sparseIntArray);
        g(4, jh0Var.f40671w, sparseIntArray);
        g(5, jh0Var.f40672x, sparseIntArray);
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
