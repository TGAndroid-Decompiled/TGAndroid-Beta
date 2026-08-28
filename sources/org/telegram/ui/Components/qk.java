package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class qk extends f2.d1 {
    public final xk f31980a;

    public qk(xk xkVar) {
        this.f31980a = xkVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i9) {
        boolean z10;
        ik0 ik0Var;
        xk xkVar = this.f31980a;
        gh.f1 f1Var = xkVar.L;
        ki kiVar = xkVar.f27493b;
        if (i9 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        xkVar.H = z10;
        if (!z10 && xkVar.F != null) {
            xkVar.F = null;
        }
        if (i9 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = kiVar.getBackgroundPaddingTop();
            if (((kiVar.X1[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (ik0Var = (ik0) f1Var.K(0)) != null) {
                View view = ik0Var.f5501a;
                if (view.getTop() > xkVar.f34713w0 - xkVar.f34711v0) {
                    f1Var.v0(0, view.getTop() - (xkVar.f34713w0 - xkVar.f34711v0), null);
                }
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        xk xkVar = this.f31980a;
        xkVar.d0();
        if (xkVar.F != null) {
            xkVar.G += i10;
        }
        xkVar.f27493b.X1(xkVar, i10);
    }
}
