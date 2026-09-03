package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ih0 extends f2.q {
    public int f34932b;
    public int f34933c;
    public int d;
    public int e;
    public int f34934f;
    public int f34935g;
    public int h;
    public final SparseIntArray f34936i = new SparseIntArray();
    public final SparseIntArray f34937j = new SparseIntArray();
    public final ArrayList f34938k = new ArrayList();
    public final ArrayList f34939l = new ArrayList();
    public final rh0 f34940m;

    public ih0(rh0 rh0Var) {
        this.f34940m = rh0Var;
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
        int i14 = this.f34933c;
        rh0 rh0Var = this.f34940m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f34934f)) && ((i11 >= (i13 = rh0Var.f37867y) && i11 < rh0Var.B) || (i11 >= rh0Var.E && i11 < rh0Var.F))) {
            if (i11 >= i13 && i11 < rh0Var.B) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) rh0Var.f37851f0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) rh0Var.f37852g0.get(i11 - rh0Var.E);
            }
            int i15 = this.f34933c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f34938k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f34939l.get(i10 - this.e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f34935g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = rh0Var.R) && i11 < rh0Var.S) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f34936i.get(i10, -1);
        int i18 = this.f34937j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f34940m.U;
    }

    @Override
    public final int e() {
        return this.f34932b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        rh0 rh0Var = this.f34940m;
        g(1, rh0Var.f37863r, sparseIntArray);
        g(2, rh0Var.f37864s, sparseIntArray);
        g(3, rh0Var.v, sparseIntArray);
        g(4, rh0Var.f37865w, sparseIntArray);
        g(5, rh0Var.f37866x, sparseIntArray);
        g(6, rh0Var.I, sparseIntArray);
        g(7, rh0Var.K, sparseIntArray);
        g(8, rh0Var.L, sparseIntArray);
        g(9, rh0Var.N, sparseIntArray);
        g(10, rh0Var.O, sparseIntArray);
        g(11, rh0Var.P, sparseIntArray);
        g(12, rh0Var.M, sparseIntArray);
        g(13, rh0Var.C, sparseIntArray);
    }
}
