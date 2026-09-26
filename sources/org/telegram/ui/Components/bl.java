package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class bl extends s4.s0 {
    public final il f23056a;

    public bl(il ilVar) {
        this.f23056a = ilVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        hl0 hl0Var;
        il ilVar = this.f23056a;
        ai.w0 w0Var = ilVar.P;
        wi wiVar = ilVar.f27043b;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ilVar.L = z10;
        if (!z10 && ilVar.J != null) {
            ilVar.J = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = wiVar.getBackgroundPaddingTop();
            if (((wiVar.f30008b2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (hl0Var = (hl0) w0Var.K(0)) != null) {
                View view = hl0Var.f42959a;
                if (view.getTop() > ilVar.A0 - ilVar.f25150z0) {
                    w0Var.v0(0, view.getTop() - (ilVar.A0 - ilVar.f25150z0), null);
                }
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        il ilVar = this.f23056a;
        ilVar.e0();
        if (ilVar.J != null) {
            ilVar.K += i11;
        }
        ilVar.f27043b.X1(ilVar, i11);
    }
}
