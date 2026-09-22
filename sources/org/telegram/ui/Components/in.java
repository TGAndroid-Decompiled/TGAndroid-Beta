package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class in extends s4.d0 {
    public final hg.e0 f25159r;

    public in(hg.e0 e0Var, Context context) {
        super(context);
        this.f25159r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int i11;
        un unVar = (un) this.f25159r.V;
        if (unVar.V0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (unVar.V0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!unVar.V0) {
            k10 = org.telegram.messenger.l0.A(7.0f, unVar.R0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (unVar.V0 && k10 == 0 && (i11 = unVar.W0) >= 0) {
            un.K(unVar, i11);
            unVar.W0 = -1;
        }
        unVar.V0 = false;
        return k10;
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
