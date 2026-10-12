package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class sl extends s4.t0 {
    public final zl f30588a;

    public sl(zl zlVar) {
        this.f30588a = zlVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        gm0 gm0Var;
        zl zlVar = this.f30588a;
        ai.w0 w0Var = zlVar.P;
        aj ajVar = zlVar.f30570b;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zlVar.L = z10;
        if (!z10 && zlVar.J != null) {
            zlVar.J = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = ajVar.getBackgroundPaddingTop();
            if (((ajVar.f24336e2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (gm0Var = (gm0) w0Var.K(0)) != null) {
                View view = gm0Var.f47897a;
                if (view.getTop() > zlVar.A0 - zlVar.f33430z0) {
                    w0Var.v0(0, view.getTop() - (zlVar.A0 - zlVar.f33430z0), null);
                }
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        zl zlVar = this.f30588a;
        zlVar.h0();
        if (zlVar.J != null) {
            zlVar.K += i11;
        }
        zlVar.f30570b.b2(zlVar, i11);
    }
}
