package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class vn extends s4.c0 {
    public final ig.e0 f30091r;

    public vn(ig.e0 e0Var, Context context) {
        super(context);
        this.f30091r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int i11;
        io ioVar = (io) this.f30091r.V;
        if (ioVar.V0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (ioVar.V0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!ioVar.V0) {
            k10 = org.telegram.messenger.q.C(7.0f, ioVar.R0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (ioVar.V0 && k10 == 0 && (i11 = ioVar.W0) >= 0) {
            io.N(ioVar, i11);
            ioVar.W0 = -1;
        }
        ioVar.V0 = false;
        return k10;
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
