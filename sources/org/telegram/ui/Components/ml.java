package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ml extends s4.r0 {
    public final tl f27118a;

    public ml(tl tlVar) {
        this.f27118a = tlVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        wl0 wl0Var;
        tl tlVar = this.f27118a;
        bi.o0 o0Var = tlVar.P;
        vi viVar = tlVar.f27360b;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tlVar.L = z10;
        if (!z10 && tlVar.J != null) {
            tlVar.J = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
            if (((viVar.f29670e2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wl0Var = (wl0) o0Var.K(0)) != null) {
                View view = wl0Var.f44838a;
                if (view.getTop() > tlVar.A0 - tlVar.f29122z0) {
                    o0Var.v0(0, view.getTop() - (tlVar.A0 - tlVar.f29122z0), null);
                }
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        tl tlVar = this.f27118a;
        tlVar.h0();
        if (tlVar.J != null) {
            tlVar.K += i11;
        }
        tlVar.f27360b.b2(tlVar, i11);
    }
}
