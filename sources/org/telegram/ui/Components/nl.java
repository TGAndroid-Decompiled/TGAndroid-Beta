package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class nl extends s4.r0 {
    public final ul f27684a;

    public nl(ul ulVar) {
        this.f27684a = ulVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        wl0 wl0Var;
        ul ulVar = this.f27684a;
        bi.o0 o0Var = ulVar.P;
        vi viVar = ulVar.f27671b;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ulVar.L = z10;
        if (!z10 && ulVar.J != null) {
            ulVar.J = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
            if (((viVar.f29999e2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wl0Var = (wl0) o0Var.K(0)) != null) {
                View view = wl0Var.f44838a;
                if (view.getTop() > ulVar.A0 - ulVar.f29736z0) {
                    o0Var.v0(0, view.getTop() - (ulVar.A0 - ulVar.f29736z0), null);
                }
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ul ulVar = this.f27684a;
        ulVar.h0();
        if (ulVar.J != null) {
            ulVar.K += i11;
        }
        ulVar.f27671b.b2(ulVar, i11);
    }
}
