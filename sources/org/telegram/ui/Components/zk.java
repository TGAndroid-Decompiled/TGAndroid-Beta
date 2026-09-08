package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class zk extends s4.s0 {
    public final gl f33197a;

    public zk(gl glVar) {
        this.f33197a = glVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        vk0 vk0Var;
        gl glVar = this.f33197a;
        bi.o0 o0Var = glVar.P;
        vi viVar = glVar.f28780b;
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
            if (((viVar.f31293b2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vk0Var = (vk0) o0Var.K(0)) != null) {
                View view = vk0Var.f45766a;
                if (view.getTop() > glVar.A0 - glVar.f26485z0) {
                    o0Var.v0(0, view.getTop() - (glVar.A0 - glVar.f26485z0), null);
                }
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        gl glVar = this.f33197a;
        glVar.e0();
        if (glVar.J != null) {
            glVar.K += i11;
        }
        glVar.f28780b.X1(glVar, i11);
    }
}
