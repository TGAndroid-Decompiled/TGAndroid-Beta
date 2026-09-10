package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class el extends s4.s0 {
    public final ll f22723a;

    public el(ll llVar) {
        this.f22723a = llVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        fl0 fl0Var;
        ll llVar = this.f22723a;
        bi.y1 y1Var = llVar.P;
        yi yiVar = llVar.f26422b;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        llVar.L = z10;
        if (!z10 && llVar.J != null) {
            llVar.J = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = yiVar.getBackgroundPaddingTop();
            if (((yiVar.f29354b2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (fl0Var = (fl0) y1Var.K(0)) != null) {
                View view = fl0Var.f41610a;
                if (view.getTop() > llVar.A0 - llVar.f25054z0) {
                    y1Var.v0(0, view.getTop() - (llVar.A0 - llVar.f25054z0), null);
                }
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ll llVar = this.f22723a;
        llVar.e0();
        if (llVar.J != null) {
            llVar.K += i11;
        }
        llVar.f26422b.X1(llVar, i11);
    }
}
