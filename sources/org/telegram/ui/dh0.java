package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dh0 extends s4.o {
    public int f36627b;
    public int f36628c;
    public int d;
    public int e;
    public int f36629f;
    public int f36630g;
    public int h;
    public final SparseIntArray f36631i = new SparseIntArray();
    public final SparseIntArray f36632j = new SparseIntArray();
    public final ArrayList f36633k = new ArrayList();
    public final ArrayList f36634l = new ArrayList();
    public final mh0 f36635m;

    public dh0(mh0 mh0Var) {
        this.f36635m = mh0Var;
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
        int i14 = this.f36628c;
        mh0 mh0Var = this.f36635m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f36629f)) && ((i11 >= (i13 = mh0Var.f39604y) && i11 < mh0Var.E) || (i11 >= mh0Var.H && i11 < mh0Var.I))) {
            if (i11 >= i13 && i11 < mh0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) mh0Var.f39588i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) mh0Var.f39589j0.get(i11 - mh0Var.H);
            }
            int i15 = this.f36628c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f36633k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f36634l.get(i10 - this.e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f36630g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = mh0Var.U) && i11 < mh0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f36631i.get(i10, -1);
        int i18 = this.f36632j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f36635m.X;
    }

    @Override
    public final int e() {
        return this.f36627b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        mh0 mh0Var = this.f36635m;
        g(1, mh0Var.f39597r, sparseIntArray);
        g(2, mh0Var.f39599s, sparseIntArray);
        g(3, mh0Var.v, sparseIntArray);
        g(4, mh0Var.f39602w, sparseIntArray);
        g(5, mh0Var.f39603x, sparseIntArray);
        g(6, mh0Var.L, sparseIntArray);
        g(7, mh0Var.N, sparseIntArray);
        g(8, mh0Var.O, sparseIntArray);
        g(9, mh0Var.Q, sparseIntArray);
        g(10, mh0Var.R, sparseIntArray);
        g(11, mh0Var.S, sparseIntArray);
        g(12, mh0Var.P, sparseIntArray);
        g(13, mh0Var.F, sparseIntArray);
    }
}
