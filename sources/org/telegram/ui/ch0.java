package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ch0 extends s4.p {
    public int f38346b;
    public int f38347c;
    public int d;
    public int e;
    public int f38348f;
    public int f38349g;
    public int h;
    public final SparseIntArray f38350i = new SparseIntArray();
    public final SparseIntArray f38351j = new SparseIntArray();
    public final ArrayList f38352k = new ArrayList();
    public final ArrayList f38353l = new ArrayList();
    public final lh0 f38354m;

    public ch0(lh0 lh0Var) {
        this.f38354m = lh0Var;
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
        int i14 = this.f38347c;
        lh0 lh0Var = this.f38354m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f38348f)) && ((i11 >= (i13 = lh0Var.f41189y) && i11 < lh0Var.E) || (i11 >= lh0Var.H && i11 < lh0Var.I))) {
            if (i11 >= i13 && i11 < lh0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) lh0Var.f41173i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) lh0Var.f41174j0.get(i11 - lh0Var.H);
            }
            int i15 = this.f38347c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f38352k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f38353l.get(i10 - this.e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f38349g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = lh0Var.U) && i11 < lh0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f38350i.get(i10, -1);
        int i18 = this.f38351j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f38354m.X;
    }

    @Override
    public final int e() {
        return this.f38346b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        lh0 lh0Var = this.f38354m;
        g(1, lh0Var.f41182r, sparseIntArray);
        g(2, lh0Var.f41184s, sparseIntArray);
        g(3, lh0Var.v, sparseIntArray);
        g(4, lh0Var.f41187w, sparseIntArray);
        g(5, lh0Var.f41188x, sparseIntArray);
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
