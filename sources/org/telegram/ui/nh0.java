package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nh0 extends s4.o {
    public int f38968b;
    public int f38969c;
    public int d;
    public int f38970e;
    public int f38971f;
    public int f38972g;
    public int h;
    public final SparseIntArray f38973i = new SparseIntArray();
    public final SparseIntArray f38974j = new SparseIntArray();
    public final ArrayList f38975k = new ArrayList();
    public final ArrayList f38976l = new ArrayList();
    public final wh0 f38977m;

    public nh0(wh0 wh0Var) {
        this.f38977m = wh0Var;
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
        int i14 = this.f38969c;
        wh0 wh0Var = this.f38977m;
        if (((i10 >= i14 && i10 < this.d) || (i10 >= this.f38970e && i10 < this.f38971f)) && ((i11 >= (i13 = wh0Var.f42558y) && i11 < wh0Var.E) || (i11 >= wh0Var.H && i11 < wh0Var.I))) {
            if (i11 >= i13 && i11 < wh0Var.E) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) wh0Var.f42542i0.get(i11 - i13);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) wh0Var.f42543j0.get(i11 - wh0Var.H);
            }
            int i15 = this.f38969c;
            if (i10 >= i15 && i10 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f38975k.get(i10 - i15);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f38976l.get(i10 - this.f38970e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i16 = this.f38972g;
        if (i10 >= i16 && i10 < this.h && i11 >= (i12 = wh0Var.U) && i11 < wh0Var.V) {
            if (i10 - i16 != i11 - i12) {
                return false;
            }
            return true;
        }
        int i17 = this.f38973i.get(i10, -1);
        int i18 = this.f38974j.get(i11, -1);
        if (i17 < 0 || i17 != i18) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f38977m.X;
    }

    @Override
    public final int e() {
        return this.f38968b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        wh0 wh0Var = this.f38977m;
        g(1, wh0Var.f42551r, sparseIntArray);
        g(2, wh0Var.f42553s, sparseIntArray);
        g(3, wh0Var.v, sparseIntArray);
        g(4, wh0Var.f42556w, sparseIntArray);
        g(5, wh0Var.f42557x, sparseIntArray);
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
