package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qh0 extends s4.o {
    public int f36056b;
    public int f36057c;
    public int d;
    public int e;
    public int f36058f;
    public int f36059g;
    public int h;
    public final SparseIntArray f36060i = new SparseIntArray();
    public final SparseIntArray f36061j = new SparseIntArray();
    public final ArrayList f36062k = new ArrayList();
    public final ArrayList f36063l = new ArrayList();
    public final zh0 f36064m;

    public qh0(zh0 zh0Var) {
        this.f36064m = zh0Var;
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
        int i14 = this.f36057c;
        zh0 zh0Var = this.f36064m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f36058f)) && ((i11 >= (i13 = zh0Var.f39350y) && i11 < zh0Var.E) || (i11 >= zh0Var.H && i11 < zh0Var.I))) {
            if (i11 >= i13 && i11 < zh0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) zh0Var.f39334i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) zh0Var.f39335j0.get(i11 - zh0Var.H);
            }
            int i15 = this.f36057c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f36062k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f36063l.get(i10 - this.e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f36059g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = zh0Var.U) && i11 < zh0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f36060i.get(i10, -1);
        int i18 = this.f36061j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f36064m.X;
    }

    @Override
    public final int e() {
        return this.f36056b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        zh0 zh0Var = this.f36064m;
        g(1, zh0Var.f39343r, sparseIntArray);
        g(2, zh0Var.f39345s, sparseIntArray);
        g(3, zh0Var.v, sparseIntArray);
        g(4, zh0Var.f39348w, sparseIntArray);
        g(5, zh0Var.f39349x, sparseIntArray);
        g(6, zh0Var.L, sparseIntArray);
        g(7, zh0Var.N, sparseIntArray);
        g(8, zh0Var.O, sparseIntArray);
        g(9, zh0Var.Q, sparseIntArray);
        g(10, zh0Var.R, sparseIntArray);
        g(11, zh0Var.S, sparseIntArray);
        g(12, zh0Var.P, sparseIntArray);
        g(13, zh0Var.F, sparseIntArray);
    }
}
