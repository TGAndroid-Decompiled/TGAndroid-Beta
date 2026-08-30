package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class sk extends f2.z0 {
    public final al f28721a;

    public sk(al alVar) {
        this.f28721a = alVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z4;
        el0 el0Var;
        al alVar = this.f28721a;
        lh.e1 e1Var = alVar.M;
        li liVar = alVar.f24278b;
        if (i10 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        alVar.I = z4;
        if (!z4 && alVar.G != null) {
            alVar.G = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = liVar.getBackgroundPaddingTop();
            if (((liVar.Y1[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (el0Var = (el0) e1Var.K(0)) != null) {
                View view = el0Var.f5785a;
                if (view.getTop() > alVar.f23445x0 - alVar.f23443w0) {
                    e1Var.v0(0, view.getTop() - (alVar.f23445x0 - alVar.f23443w0), null);
                }
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        al alVar = this.f28721a;
        alVar.e0();
        if (alVar.G != null) {
            alVar.H += i11;
        }
        alVar.f24278b.X1(alVar, i11);
    }
}
