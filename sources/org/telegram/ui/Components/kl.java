package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class kl extends s4.u0 {
    public final sl f29935a;

    public kl(sl slVar) {
        this.f29935a = slVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        vl0 vl0Var;
        sl slVar = this.f29935a;
        bi.r1 r1Var = slVar.N;
        ti tiVar = slVar.f30215b;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        slVar.J = z10;
        if (!z10 && slVar.H != null) {
            slVar.H = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = tiVar.getBackgroundPaddingTop();
            if (((tiVar.f33019e2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vl0Var = (vl0) r1Var.K(0)) != null) {
                View view = vl0Var.f47738a;
                if (view.getTop() > slVar.f32620x0 - slVar.f32618w0) {
                    r1Var.w0(0, view.getTop() - (slVar.f32620x0 - slVar.f32618w0), null);
                }
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        sl slVar = this.f29935a;
        slVar.h0();
        if (slVar.H != null) {
            slVar.I += i11;
        }
        slVar.f30215b.e2(slVar, i11);
    }
}
