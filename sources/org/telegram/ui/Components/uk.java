package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class uk extends f2.a1 {
    public final cl f31687a;

    public uk(cl clVar) {
        this.f31687a = clVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z4;
        fl0 fl0Var;
        cl clVar = this.f31687a;
        mh.d1 d1Var = clVar.M;
        mi miVar = clVar.f26546b;
        if (i10 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        clVar.I = z4;
        if (!z4 && clVar.G != null) {
            clVar.G = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = miVar.getBackgroundPaddingTop();
            if (((miVar.Y1[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (fl0Var = (fl0) d1Var.K(0)) != null) {
                View view = fl0Var.f5875a;
                if (view.getTop() > clVar.f26023x0 - clVar.f26021w0) {
                    d1Var.v0(0, view.getTop() - (clVar.f26023x0 - clVar.f26021w0), null);
                }
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        cl clVar = this.f31687a;
        clVar.e0();
        if (clVar.G != null) {
            clVar.H += i11;
        }
        clVar.f26546b.X1(clVar, i11);
    }
}
