package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ql extends s4.t0 {
    public final xl f30185a;

    public ql(xl xlVar) {
        this.f30185a = xlVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        am0 am0Var;
        xl xlVar = this.f30185a;
        ai.w0 w0Var = xlVar.P;
        yi yiVar = xlVar.f30173b;
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
            if (((yiVar.f33226e2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (am0Var = (am0) w0Var.K(0)) != null) {
                View view = am0Var.f47656a;
                if (view.getTop() > xlVar.A0 - xlVar.f32934z0) {
                    w0Var.v0(0, view.getTop() - (xlVar.A0 - xlVar.f32934z0), null);
                }
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        xl xlVar = this.f30185a;
        xlVar.h0();
        if (xlVar.J != null) {
            xlVar.K += i11;
        }
        xlVar.f30173b.b2(xlVar, i11);
    }
}
