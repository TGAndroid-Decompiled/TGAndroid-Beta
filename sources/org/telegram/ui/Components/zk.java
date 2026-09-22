package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class zk extends s4.s0 {
    public final gl f30901a;

    public zk(gl glVar) {
        this.f30901a = glVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        il0 il0Var;
        gl glVar = this.f30901a;
        ai.w0 w0Var = glVar.P;
        vi viVar = glVar.f26786b;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        glVar.L = z10;
        if (!z10 && glVar.J != null) {
            glVar.J = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
            if (((viVar.f29084b2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (il0Var = (il0) w0Var.L(0)) != null) {
                View view = il0Var.f42995a;
                if (view.getTop() > glVar.A0 - glVar.f24593z0) {
                    w0Var.w0(0, view.getTop() - (glVar.A0 - glVar.f24593z0), null);
                }
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        gl glVar = this.f30901a;
        glVar.e0();
        if (glVar.J != null) {
            glVar.K += i11;
        }
        glVar.f26786b.X1(glVar, i11);
    }
}
