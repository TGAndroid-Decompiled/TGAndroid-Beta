package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class bh0 extends f2.q {

    public int f36823b;

    public int f36824c;
    public int d;

    public int f36825e;

    public int f36826f;

    public int f36827g;
    public int h;

    public final SparseIntArray f36828i = new SparseIntArray();

    public final SparseIntArray f36829j = new SparseIntArray();

    public final ArrayList f36830k = new ArrayList();

    public final ArrayList f36831l = new ArrayList();

    public final kh0 f36832m;

    public bh0(kh0 kh0Var) {
        this.f36832m = kh0Var;
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
        int i14 = this.f36824c;
        kh0 kh0Var = this.f36832m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.f36825e && i10 < this.f36826f)) && ((i11 >= (i13 = kh0Var.f39761y) && i11 < kh0Var.A) || (i11 >= kh0Var.D && i11 < kh0Var.E))) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (i11 < i13 || i11 >= kh0Var.A) ? (TLRPC.TL_chatInviteExported) kh0Var.f39746f0.get(i11 - kh0Var.D) : (TLRPC.TL_chatInviteExported) kh0Var.f39744e0.get(i11 - i13);
            int i15 = this.f36824c;
            return ((i10 < i15 || i10 >= this.d) ? (TLRPC.TL_chatInviteExported) this.f36831l.get(i10 - this.f36825e) : (TLRPC.TL_chatInviteExported) this.f36830k.get(i10 - i15)).link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f36827g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = kh0Var.Q) && i11 < kh0Var.R) {
            return i10 - i16 == i11 - i12;
        }
        int i17 = this.f36828i.get(i10, -1);
        return i17 >= 0 && i17 == this.f36829j.get(i11, -1);
    }

    @Override
    public final int d() {
        return this.f36832m.T;
    }

    @Override
    public final int e() {
        return this.f36823b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        kh0 kh0Var = this.f36832m;
        g(1, kh0Var.f39757r, sparseIntArray);
        g(2, kh0Var.f39758s, sparseIntArray);
        g(3, kh0Var.v, sparseIntArray);
        g(4, kh0Var.f39759w, sparseIntArray);
        g(5, kh0Var.f39760x, sparseIntArray);
        g(6, kh0Var.H, sparseIntArray);
        g(7, kh0Var.J, sparseIntArray);
        g(8, kh0Var.K, sparseIntArray);
        g(9, kh0Var.M, sparseIntArray);
        g(10, kh0Var.N, sparseIntArray);
        g(11, kh0Var.O, sparseIntArray);
        g(12, kh0Var.L, sparseIntArray);
        g(13, kh0Var.B, sparseIntArray);
    }
}
