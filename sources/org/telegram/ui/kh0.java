package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kh0 extends s4.o {
    public int f34718b;
    public int f34719c;
    public int d;
    public int e;
    public int f34720f;
    public int f34721g;
    public int h;
    public final SparseIntArray f34722i = new SparseIntArray();
    public final SparseIntArray f34723j = new SparseIntArray();
    public final ArrayList f34724k = new ArrayList();
    public final ArrayList f34725l = new ArrayList();
    public final th0 f34726m;

    public kh0(th0 th0Var) {
        this.f34726m = th0Var;
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
        int i14 = this.f34719c;
        th0 th0Var = this.f34726m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f34720f)) && ((i11 >= (i13 = th0Var.f37683y) && i11 < th0Var.E) || (i11 >= th0Var.H && i11 < th0Var.I))) {
            if (i11 >= i13 && i11 < th0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) th0Var.f37667i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) th0Var.f37668j0.get(i11 - th0Var.H);
            }
            int i15 = this.f34719c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f34724k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f34725l.get(i10 - this.e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f34721g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = th0Var.U) && i11 < th0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f34722i.get(i10, -1);
        int i18 = this.f34723j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f34726m.X;
    }

    @Override
    public final int e() {
        return this.f34718b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        th0 th0Var = this.f34726m;
        g(1, th0Var.f37676r, sparseIntArray);
        g(2, th0Var.f37678s, sparseIntArray);
        g(3, th0Var.v, sparseIntArray);
        g(4, th0Var.f37681w, sparseIntArray);
        g(5, th0Var.f37682x, sparseIntArray);
        g(6, th0Var.L, sparseIntArray);
        g(7, th0Var.N, sparseIntArray);
        g(8, th0Var.O, sparseIntArray);
        g(9, th0Var.Q, sparseIntArray);
        g(10, th0Var.R, sparseIntArray);
        g(11, th0Var.S, sparseIntArray);
        g(12, th0Var.P, sparseIntArray);
        g(13, th0Var.F, sparseIntArray);
    }
}
