package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class il extends s4.r0 {
    public final pl f27441a;

    public il(pl plVar) {
        this.f27441a = plVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        vl0 vl0Var;
        pl plVar = this.f27441a;
        ai.u1 u1Var = plVar.N;
        ri riVar = plVar.f27704b;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        plVar.J = z10;
        if (!z10 && plVar.H != null) {
            plVar.H = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = riVar.getBackgroundPaddingTop();
            if (((riVar.f30144e2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vl0Var = (vl0) u1Var.K(0)) != null) {
                View view = vl0Var.f46342a;
                if (view.getTop() > plVar.f29615x0 - plVar.f29613w0) {
                    u1Var.v0(0, view.getTop() - (plVar.f29615x0 - plVar.f29613w0), null);
                }
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        pl plVar = this.f27441a;
        plVar.h0();
        if (plVar.H != null) {
            plVar.I += i11;
        }
        plVar.f27704b.f2(plVar, i11);
    }
}
