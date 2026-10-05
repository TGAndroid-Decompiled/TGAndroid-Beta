package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class cl extends s4.s0 {
    public final jl f25465a;

    public cl(jl jlVar) {
        this.f25465a = jlVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        il0 il0Var;
        jl jlVar = this.f25465a;
        ai.w0 w0Var = jlVar.P;
        xi xiVar = jlVar.f29741b;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        jlVar.L = z10;
        if (!z10 && jlVar.J != null) {
            jlVar.J = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = xiVar.getBackgroundPaddingTop();
            if (((xiVar.f32897b2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (il0Var = (il0) w0Var.K(0)) != null) {
                View view = il0Var.f46538a;
                if (view.getTop() > jlVar.A0 - jlVar.f27906z0) {
                    w0Var.w0(0, view.getTop() - (jlVar.A0 - jlVar.f27906z0), null);
                }
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        jl jlVar = this.f25465a;
        jlVar.e0();
        if (jlVar.J != null) {
            jlVar.K += i11;
        }
        jlVar.f29741b.W1(jlVar, i11);
    }
}
