package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class wm extends f2.l0 {

    public final zi f34289r;

    public wm(zi ziVar, Context context) {
        super(context);
        this.f34289r = ziVar;
    }

    @Override
    public final int k(int i10, View view) {
        int i11;
        in inVar = (in) this.f34289r.V;
        if (inVar.R0) {
            i10 = -1;
        }
        int iK = super.k(i10, view);
        if (inVar.R0) {
            iK += AndroidUtilities.dp(160.0f);
        }
        if (!inVar.R0) {
            iK = org.telegram.messenger.y1.A(7.0f, inVar.N0 - AndroidUtilities.statusBarHeight, iK);
        }
        if (inVar.R0 && iK == 0 && (i11 = inVar.S0) >= 0) {
            in.K(inVar, i11);
            inVar.S0 = -1;
        }
        inVar.R0 = false;
        return iK;
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
