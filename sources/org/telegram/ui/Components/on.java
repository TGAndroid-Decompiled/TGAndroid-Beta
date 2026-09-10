package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class on extends s4.d0 {
    public final gg.j0 f25844r;

    public on(gg.j0 j0Var, Context context) {
        super(context);
        this.f25844r = j0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int i11;
        zn znVar = (zn) this.f25844r.V;
        if (znVar.V0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (znVar.V0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!znVar.V0) {
            k10 = org.telegram.messenger.a2.z(7.0f, znVar.R0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (znVar.V0 && k10 == 0 && (i11 = znVar.W0) >= 0) {
            zn.K(znVar, i11);
            znVar.W0 = -1;
        }
        znVar.V0 = false;
        return k10;
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
