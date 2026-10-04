package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nh0 extends s4.o {
    public int f38982b;
    public int f38983c;
    public int d;
    public int f38984e;
    public int f38985f;
    public int f38986g;
    public int h;
    public final SparseIntArray f38987i = new SparseIntArray();
    public final SparseIntArray f38988j = new SparseIntArray();
    public final ArrayList f38989k = new ArrayList();
    public final ArrayList f38990l = new ArrayList();
    public final wh0 f38991m;

    public nh0(wh0 wh0Var) {
        this.f38991m = wh0Var;
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
        int i14 = this.f38983c;
        wh0 wh0Var = this.f38991m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.f38984e && i10 < this.f38985f)) && ((i11 >= (i13 = wh0Var.f42496y) && i11 < wh0Var.E) || (i11 >= wh0Var.H && i11 < wh0Var.I))) {
            if (i11 >= i13 && i11 < wh0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) wh0Var.f42480i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) wh0Var.f42481j0.get(i11 - wh0Var.H);
            }
            int i15 = this.f38983c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f38989k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f38990l.get(i10 - this.f38984e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f38986g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = wh0Var.U) && i11 < wh0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f38987i.get(i10, -1);
        int i18 = this.f38988j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f38991m.X;
    }

    @Override
    public final int e() {
        return this.f38982b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        wh0 wh0Var = this.f38991m;
        g(1, wh0Var.f42489r, sparseIntArray);
        g(2, wh0Var.f42491s, sparseIntArray);
        g(3, wh0Var.v, sparseIntArray);
        g(4, wh0Var.f42494w, sparseIntArray);
        g(5, wh0Var.f42495x, sparseIntArray);
        g(6, wh0Var.L, sparseIntArray);
        g(7, wh0Var.N, sparseIntArray);
        g(8, wh0Var.O, sparseIntArray);
        g(9, wh0Var.Q, sparseIntArray);
        g(10, wh0Var.R, sparseIntArray);
        g(11, wh0Var.S, sparseIntArray);
        g(12, wh0Var.P, sparseIntArray);
        g(13, wh0Var.F, sparseIntArray);
    }
}
