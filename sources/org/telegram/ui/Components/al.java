package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class al extends s4.s0 {
    public final hl f22723a;

    public al(hl hlVar) {
        this.f22723a = hlVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        gl0 gl0Var;
        hl hlVar = this.f22723a;
        ai.w0 w0Var = hlVar.P;
        wi wiVar = hlVar.f27087b;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        hlVar.L = z10;
        if (!z10 && hlVar.J != null) {
            hlVar.J = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = wiVar.getBackgroundPaddingTop();
            if (((wiVar.f29993b2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (gl0Var = (gl0) w0Var.K(0)) != null) {
                View view = gl0Var.f42960a;
                if (view.getTop() > hlVar.A0 - hlVar.f24827z0) {
                    w0Var.v0(0, view.getTop() - (hlVar.A0 - hlVar.f24827z0), null);
                }
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        hl hlVar = this.f22723a;
        hlVar.e0();
        if (hlVar.J != null) {
            hlVar.K += i11;
        }
        hlVar.f27087b.X1(hlVar, i11);
    }
}
