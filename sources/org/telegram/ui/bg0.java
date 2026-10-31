package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bg0 extends s4.n {
    public int f36251b;
    public int f36252c;
    public int d;
    public int e;
    public int f36253f;
    public int f36254g;
    public int h;
    public final SparseIntArray f36255i = new SparseIntArray();
    public final SparseIntArray f36256j = new SparseIntArray();
    public final ArrayList f36257k = new ArrayList();
    public final ArrayList f36258l = new ArrayList();
    public final kg0 f36259m;

    public bg0(kg0 kg0Var) {
        this.f36259m = kg0Var;
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
        int i14 = this.f36252c;
        kg0 kg0Var = this.f36259m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.e && i10 < this.f36253f)) && ((i11 >= (i13 = kg0Var.D) && i11 < kg0Var.E) || (i11 >= kg0Var.H && i11 < kg0Var.I))) {
            if (i11 >= i13 && i11 < kg0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) kg0Var.f38806i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) kg0Var.f38807j0.get(i11 - kg0Var.H);
            }
            int i15 = this.f36252c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f36257k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f36258l.get(i10 - this.e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f36254g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = kg0Var.U) && i11 < kg0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f36255i.get(i10, -1);
        int i18 = this.f36256j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f36259m.X;
    }

    @Override
    public final int e() {
        return this.f36251b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        kg0 kg0Var = this.f36259m;
        g(1, kg0Var.f38815r, sparseIntArray);
        g(2, kg0Var.f38817s, sparseIntArray);
        g(3, kg0Var.f38820w, sparseIntArray);
        g(4, kg0Var.f38821x, sparseIntArray);
        g(5, kg0Var.f38822y, sparseIntArray);
        g(6, kg0Var.L, sparseIntArray);
        g(7, kg0Var.N, sparseIntArray);
        g(8, kg0Var.O, sparseIntArray);
        g(9, kg0Var.Q, sparseIntArray);
        g(10, kg0Var.R, sparseIntArray);
        g(11, kg0Var.S, sparseIntArray);
        g(12, kg0Var.P, sparseIntArray);
        g(13, kg0Var.F, sparseIntArray);
    }
}
