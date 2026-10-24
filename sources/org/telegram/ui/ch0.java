package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ch0 extends s4.o {
    public int f36341b;
    public int f36342c;
    public int d;
    public int e;
    public int f36343f;
    public int f36344g;
    public int h;
    public final SparseIntArray f36345i = new SparseIntArray();
    public final SparseIntArray f36346j = new SparseIntArray();
    public final ArrayList f36347k = new ArrayList();
    public final ArrayList f36348l = new ArrayList();
    public final lh0 f36349m;

    public ch0(lh0 lh0Var) {
        this.f36349m = lh0Var;
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
        int i14 = this.f36342c;
        lh0 lh0Var = this.f36349m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f36343f)) && ((i11 >= (i13 = lh0Var.f39299y) && i11 < lh0Var.E) || (i11 >= lh0Var.H && i11 < lh0Var.I))) {
            if (i11 >= i13 && i11 < lh0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) lh0Var.f39283i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) lh0Var.f39284j0.get(i11 - lh0Var.H);
            }
            int i15 = this.f36342c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f36347k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f36348l.get(i10 - this.e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f36344g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = lh0Var.U) && i11 < lh0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f36345i.get(i10, -1);
        int i18 = this.f36346j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f36349m.X;
    }

    @Override
    public final int e() {
        return this.f36341b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        lh0 lh0Var = this.f36349m;
        g(1, lh0Var.f39292r, sparseIntArray);
        g(2, lh0Var.f39294s, sparseIntArray);
        g(3, lh0Var.v, sparseIntArray);
        g(4, lh0Var.f39297w, sparseIntArray);
        g(5, lh0Var.f39298x, sparseIntArray);
        g(6, lh0Var.L, sparseIntArray);
        g(7, lh0Var.N, sparseIntArray);
        g(8, lh0Var.O, sparseIntArray);
        g(9, lh0Var.Q, sparseIntArray);
        g(10, lh0Var.R, sparseIntArray);
        g(11, lh0Var.S, sparseIntArray);
        g(12, lh0Var.P, sparseIntArray);
        g(13, lh0Var.F, sparseIntArray);
    }
}
