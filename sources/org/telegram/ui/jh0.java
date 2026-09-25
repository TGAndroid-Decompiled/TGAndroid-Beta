package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jh0 extends s4.o {
    public int f34806b;
    public int f34807c;
    public int d;
    public int e;
    public int f34808f;
    public int f34809g;
    public int h;
    public final SparseIntArray f34810i = new SparseIntArray();
    public final SparseIntArray f34811j = new SparseIntArray();
    public final ArrayList f34812k = new ArrayList();
    public final ArrayList f34813l = new ArrayList();
    public final sh0 f34814m;

    public jh0(sh0 sh0Var) {
        this.f34814m = sh0Var;
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
        int i14 = this.f34807c;
        sh0 sh0Var = this.f34814m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f34808f)) && ((i11 >= (i13 = sh0Var.f37797y) && i11 < sh0Var.E) || (i11 >= sh0Var.H && i11 < sh0Var.I))) {
            if (i11 >= i13 && i11 < sh0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) sh0Var.f37781i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) sh0Var.f37782j0.get(i11 - sh0Var.H);
            }
            int i15 = this.f34807c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f34812k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f34813l.get(i10 - this.e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f34809g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = sh0Var.U) && i11 < sh0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f34810i.get(i10, -1);
        int i18 = this.f34811j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f34814m.X;
    }

    @Override
    public final int e() {
        return this.f34806b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        sh0 sh0Var = this.f34814m;
        g(1, sh0Var.f37790r, sparseIntArray);
        g(2, sh0Var.f37792s, sparseIntArray);
        g(3, sh0Var.v, sparseIntArray);
        g(4, sh0Var.f37795w, sparseIntArray);
        g(5, sh0Var.f37796x, sparseIntArray);
        g(6, sh0Var.L, sparseIntArray);
        g(7, sh0Var.N, sparseIntArray);
        g(8, sh0Var.O, sparseIntArray);
        g(9, sh0Var.Q, sparseIntArray);
        g(10, sh0Var.R, sparseIntArray);
        g(11, sh0Var.S, sparseIntArray);
        g(12, sh0Var.P, sparseIntArray);
        g(13, sh0Var.F, sparseIntArray);
    }
}
