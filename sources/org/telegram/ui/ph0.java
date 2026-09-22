package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ph0 extends s4.o {
    public int f36575b;
    public int f36576c;
    public int d;
    public int e;
    public int f36577f;
    public int f36578g;
    public int h;
    public final SparseIntArray f36579i = new SparseIntArray();
    public final SparseIntArray f36580j = new SparseIntArray();
    public final ArrayList f36581k = new ArrayList();
    public final ArrayList f36582l = new ArrayList();
    public final yh0 f36583m;

    public ph0(yh0 yh0Var) {
        this.f36583m = yh0Var;
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
        int i14 = this.f36576c;
        yh0 yh0Var = this.f36583m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f36577f)) && ((i11 >= (i13 = yh0Var.f39880y) && i11 < yh0Var.E) || (i11 >= yh0Var.H && i11 < yh0Var.I))) {
            if (i11 >= i13 && i11 < yh0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) yh0Var.f39864i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) yh0Var.f39865j0.get(i11 - yh0Var.H);
            }
            int i15 = this.f36576c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f36581k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f36582l.get(i10 - this.e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f36578g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = yh0Var.U) && i11 < yh0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f36579i.get(i10, -1);
        int i18 = this.f36580j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f36583m.X;
    }

    @Override
    public final int e() {
        return this.f36575b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        yh0 yh0Var = this.f36583m;
        g(1, yh0Var.f39873r, sparseIntArray);
        g(2, yh0Var.f39875s, sparseIntArray);
        g(3, yh0Var.v, sparseIntArray);
        g(4, yh0Var.f39878w, sparseIntArray);
        g(5, yh0Var.f39879x, sparseIntArray);
        g(6, yh0Var.L, sparseIntArray);
        g(7, yh0Var.N, sparseIntArray);
        g(8, yh0Var.O, sparseIntArray);
        g(9, yh0Var.Q, sparseIntArray);
        g(10, yh0Var.R, sparseIntArray);
        g(11, yh0Var.S, sparseIntArray);
        g(12, yh0Var.P, sparseIntArray);
        g(13, yh0Var.F, sparseIntArray);
    }
}
