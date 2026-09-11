package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ph0 extends s4.o {
    public int f39514b;
    public int f39515c;
    public int d;
    public int f39516e;
    public int f39517f;
    public int f39518g;
    public int h;
    public final SparseIntArray f39519i = new SparseIntArray();
    public final SparseIntArray f39520j = new SparseIntArray();
    public final ArrayList f39521k = new ArrayList();
    public final ArrayList f39522l = new ArrayList();
    public final yh0 f39523m;

    public ph0(yh0 yh0Var) {
        this.f39523m = yh0Var;
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
        int i14 = this.f39515c;
        yh0 yh0Var = this.f39523m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.f39516e && i10 < this.f39517f)) && ((i11 >= (i13 = yh0Var.f43148y) && i11 < yh0Var.E) || (i11 >= yh0Var.H && i11 < yh0Var.I))) {
            if (i11 >= i13 && i11 < yh0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) yh0Var.f43132i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) yh0Var.f43133j0.get(i11 - yh0Var.H);
            }
            int i15 = this.f39515c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f39521k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f39522l.get(i10 - this.f39516e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f39518g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = yh0Var.U) && i11 < yh0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f39519i.get(i10, -1);
        int i18 = this.f39520j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f39523m.X;
    }

    @Override
    public final int e() {
        return this.f39514b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        yh0 yh0Var = this.f39523m;
        g(1, yh0Var.f43141r, sparseIntArray);
        g(2, yh0Var.f43143s, sparseIntArray);
        g(3, yh0Var.v, sparseIntArray);
        g(4, yh0Var.f43146w, sparseIntArray);
        g(5, yh0Var.f43147x, sparseIntArray);
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
