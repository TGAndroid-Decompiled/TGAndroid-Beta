package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class kl extends s4.r0 {
    public final rl f28058a;

    public kl(rl rlVar) {
        this.f28058a = rlVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        wl0 wl0Var;
        rl rlVar = this.f28058a;
        ai.u1 u1Var = rlVar.N;
        ti tiVar = rlVar.f28366b;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        rlVar.J = z10;
        if (!z10 && rlVar.H != null) {
            rlVar.H = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = tiVar.getBackgroundPaddingTop();
            if (((tiVar.f30728e2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wl0Var = (wl0) u1Var.K(0)) != null) {
                View view = wl0Var.f46343a;
                if (view.getTop() > rlVar.f30219y0 - rlVar.f30217x0) {
                    u1Var.v0(0, view.getTop() - (rlVar.f30219y0 - rlVar.f30217x0), null);
                }
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        rl rlVar = this.f28058a;
        rlVar.i0();
        if (rlVar.H != null) {
            rlVar.I += i11;
        }
        rlVar.f28366b.f2(rlVar, i11);
    }
}
