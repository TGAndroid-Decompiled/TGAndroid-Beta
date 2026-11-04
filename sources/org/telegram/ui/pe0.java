package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pe0 extends u4.o {
    public int f48558b;
    public int f48559c;
    public int d;
    public int f48560e;
    public int f48561f;
    public int f48562g;
    public int h;
    public final SparseIntArray f48563i = new SparseIntArray();
    public final SparseIntArray f48564j = new SparseIntArray();
    public final ArrayList f48565k = new ArrayList();
    public final ArrayList f48566l = new ArrayList();
    public final xe0 f48567m;

    public pe0(xe0 xe0Var) {
        this.f48567m = xe0Var;
    }

    public static void g(int i3, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i3);
        }
    }

    @Override
    public final boolean a(int i3, int i10) {
        return b(i3, i10);
    }

    @Override
    public final boolean b(int i3, int i10) {
        int i11;
        int i12;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2;
        int i13 = this.f48559c;
        xe0 xe0Var = this.f48567m;
        if (((i3 >= i13 && i3 < this.d) || (i3 >= this.f48560e && i3 < this.f48561f)) && ((i10 >= (i12 = xe0Var.E) && i10 < xe0Var.F) || (i10 >= xe0Var.I && i10 < xe0Var.J))) {
            if (i10 >= i12 && i10 < xe0Var.F) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) xe0Var.f51997j0.get(i10 - i12);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) xe0Var.f51998k0.get(i10 - xe0Var.I);
            }
            int i14 = this.f48559c;
            if (i3 >= i14 && i3 < this.d) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f48565k.get(i3 - i14);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.f48566l.get(i3 - this.f48560e);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i15 = this.f48562g;
        if (i3 >= i15 && i3 < this.h && i10 >= (i11 = xe0Var.V) && i10 < xe0Var.W) {
            if (i3 - i15 != i10 - i11) {
                return false;
            }
            return true;
        }
        int i16 = this.f48563i.get(i3, -1);
        int i17 = this.f48564j.get(i10, -1);
        if (i16 < 0 || i16 != i17) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f48567m.Y;
    }

    @Override
    public final int e() {
        return this.f48558b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        xe0 xe0Var = this.f48567m;
        g(1, xe0Var.f52005r, sparseIntArray);
        g(2, xe0Var.f52007s, sparseIntArray);
        g(3, xe0Var.f52011w, sparseIntArray);
        g(4, xe0Var.f52012x, sparseIntArray);
        g(5, xe0Var.f52013y, sparseIntArray);
        g(6, xe0Var.M, sparseIntArray);
        g(7, xe0Var.O, sparseIntArray);
        g(8, xe0Var.P, sparseIntArray);
        g(9, xe0Var.R, sparseIntArray);
        g(10, xe0Var.S, sparseIntArray);
        g(11, xe0Var.T, sparseIntArray);
        g(12, xe0Var.Q, sparseIntArray);
        g(13, xe0Var.G, sparseIntArray);
    }
}
