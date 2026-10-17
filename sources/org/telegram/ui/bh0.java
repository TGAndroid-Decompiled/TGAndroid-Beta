package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bh0 extends s4.o {
    public int f35678b;
    public int f35679c;
    public int d;
    public int e;
    public int f35680f;
    public int f35681g;
    public int h;
    public final SparseIntArray f35682i = new SparseIntArray();
    public final SparseIntArray f35683j = new SparseIntArray();
    public final ArrayList f35684k = new ArrayList();
    public final ArrayList f35685l = new ArrayList();
    public final kh0 f35686m;

    public bh0(kh0 kh0Var) {
        this.f35686m = kh0Var;
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
        int i14 = this.f35679c;
        kh0 kh0Var = this.f35686m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f35680f)) && ((i11 >= (i13 = kh0Var.f38554y) && i11 < kh0Var.E) || (i11 >= kh0Var.H && i11 < kh0Var.I))) {
            if (i11 >= i13 && i11 < kh0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) kh0Var.f38538i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) kh0Var.f38539j0.get(i11 - kh0Var.H);
            }
            int i15 = this.f35679c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f35684k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f35685l.get(i10 - this.e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f35681g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = kh0Var.U) && i11 < kh0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f35682i.get(i10, -1);
        int i18 = this.f35683j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f35686m.X;
    }

    @Override
    public final int e() {
        return this.f35678b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        kh0 kh0Var = this.f35686m;
        g(1, kh0Var.f38547r, sparseIntArray);
        g(2, kh0Var.f38549s, sparseIntArray);
        g(3, kh0Var.v, sparseIntArray);
        g(4, kh0Var.f38552w, sparseIntArray);
        g(5, kh0Var.f38553x, sparseIntArray);
        g(6, kh0Var.L, sparseIntArray);
        g(7, kh0Var.N, sparseIntArray);
        g(8, kh0Var.O, sparseIntArray);
        g(9, kh0Var.Q, sparseIntArray);
        g(10, kh0Var.R, sparseIntArray);
        g(11, kh0Var.S, sparseIntArray);
        g(12, kh0Var.P, sparseIntArray);
        g(13, kh0Var.F, sparseIntArray);
    }
}
