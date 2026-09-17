package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ph0 extends s4.o {
    public int f39515b;
    public int f39516c;
    public int d;
    public int f39517e;
    public int f39518f;
    public int f39519g;
    public int h;
    public final SparseIntArray f39520i = new SparseIntArray();
    public final SparseIntArray f39521j = new SparseIntArray();
    public final ArrayList f39522k = new ArrayList();
    public final ArrayList f39523l = new ArrayList();
    public final yh0 f39524m;

    public ph0(yh0 yh0Var) {
        this.f39524m = yh0Var;
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
        int i14 = this.f39516c;
        yh0 yh0Var = this.f39524m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.f39517e && i10 < this.f39518f)) && ((i11 >= (i13 = yh0Var.f43149y) && i11 < yh0Var.E) || (i11 >= yh0Var.H && i11 < yh0Var.I))) {
            if (i11 >= i13 && i11 < yh0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) yh0Var.f43133i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) yh0Var.f43134j0.get(i11 - yh0Var.H);
            }
            int i15 = this.f39516c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f39522k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f39523l.get(i10 - this.f39517e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f39519g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = yh0Var.U) && i11 < yh0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f39520i.get(i10, -1);
        int i18 = this.f39521j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f39524m.X;
    }

    @Override
    public final int e() {
        return this.f39515b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        yh0 yh0Var = this.f39524m;
        g(1, yh0Var.f43142r, sparseIntArray);
        g(2, yh0Var.f43144s, sparseIntArray);
        g(3, yh0Var.v, sparseIntArray);
        g(4, yh0Var.f43147w, sparseIntArray);
        g(5, yh0Var.f43148x, sparseIntArray);
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
