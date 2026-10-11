package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ql extends s4.t0 {
    public final xl f30176a;

    public ql(xl xlVar) {
        this.f30176a = xlVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        cm0 cm0Var;
        xl xlVar = this.f30176a;
        ai.w0 w0Var = xlVar.P;
        yi yiVar = xlVar.f30161b;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        xlVar.L = z10;
        if (!z10 && xlVar.J != null) {
            xlVar.J = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = yiVar.getBackgroundPaddingTop();
            if (((yiVar.f33214e2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (cm0Var = (cm0) w0Var.K(0)) != null) {
                View view = cm0Var.f47748a;
                if (view.getTop() > xlVar.A0 - xlVar.f32978z0) {
                    w0Var.v0(0, view.getTop() - (xlVar.A0 - xlVar.f32978z0), null);
                }
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        xl xlVar = this.f30176a;
        xlVar.h0();
        if (xlVar.J != null) {
            xlVar.K += i11;
        }
        xlVar.f30161b.b2(xlVar, i11);
    }
}
