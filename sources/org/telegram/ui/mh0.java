package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mh0 extends s4.o {
    public int f35695b;
    public int f35696c;
    public int d;
    public int e;
    public int f35697f;
    public int f35698g;
    public int h;
    public final SparseIntArray f35699i = new SparseIntArray();
    public final SparseIntArray f35700j = new SparseIntArray();
    public final ArrayList f35701k = new ArrayList();
    public final ArrayList f35702l = new ArrayList();
    public final vh0 f35703m;

    public mh0(vh0 vh0Var) {
        this.f35703m = vh0Var;
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
        int i14 = this.f35696c;
        vh0 vh0Var = this.f35703m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f35697f)) && ((i11 >= (i13 = vh0Var.f38610y) && i11 < vh0Var.E) || (i11 >= vh0Var.H && i11 < vh0Var.I))) {
            if (i11 >= i13 && i11 < vh0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) vh0Var.f38594i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) vh0Var.f38595j0.get(i11 - vh0Var.H);
            }
            int i15 = this.f35696c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f35701k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f35702l.get(i10 - this.e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f35698g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = vh0Var.U) && i11 < vh0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f35699i.get(i10, -1);
        int i18 = this.f35700j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f35703m.X;
    }

    @Override
    public final int e() {
        return this.f35695b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        vh0 vh0Var = this.f35703m;
        g(1, vh0Var.f38603r, sparseIntArray);
        g(2, vh0Var.f38605s, sparseIntArray);
        g(3, vh0Var.v, sparseIntArray);
        g(4, vh0Var.f38608w, sparseIntArray);
        g(5, vh0Var.f38609x, sparseIntArray);
        g(6, vh0Var.L, sparseIntArray);
        g(7, vh0Var.N, sparseIntArray);
        g(8, vh0Var.O, sparseIntArray);
        g(9, vh0Var.Q, sparseIntArray);
        g(10, vh0Var.R, sparseIntArray);
        g(11, vh0Var.S, sparseIntArray);
        g(12, vh0Var.P, sparseIntArray);
        g(13, vh0Var.F, sparseIntArray);
    }
}
