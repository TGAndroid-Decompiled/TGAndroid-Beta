package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class kl extends s4.r0 {
    public final rl f27903a;

    public kl(rl rlVar) {
        this.f27903a = rlVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        tl0 tl0Var;
        rl rlVar = this.f27903a;
        ai.u1 u1Var = rlVar.P;
        ti tiVar = rlVar.f28176b;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        rlVar.L = z10;
        if (!z10 && rlVar.J != null) {
            rlVar.J = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = tiVar.getBackgroundPaddingTop();
            if (((tiVar.f30547e2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (tl0Var = (tl0) u1Var.K(0)) != null) {
                View view = tl0Var.f45920a;
                if (view.getTop() > rlVar.A0 - rlVar.f29980z0) {
                    u1Var.v0(0, view.getTop() - (rlVar.A0 - rlVar.f29980z0), null);
                }
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        rl rlVar = this.f27903a;
        rlVar.h0();
        if (rlVar.J != null) {
            rlVar.K += i11;
        }
        rlVar.f28176b.b2(rlVar, i11);
    }
}
