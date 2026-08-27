package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class mk extends f2.b1 {

    public final tk f30695a;

    public mk(tk tkVar) {
        this.f30695a = tkVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        lk0 lk0Var;
        tk tkVar = this.f30695a;
        hh.f1 f1Var = tkVar.L;
        gi giVar = tkVar.f34900b;
        boolean z10 = i10 != 0;
        tkVar.H = z10;
        if (!z10 && tkVar.F != null) {
            tkVar.F = null;
        }
        if (i10 == 0) {
            int iDp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = giVar.getBackgroundPaddingTop();
            if (((giVar.X1[0] - backgroundPaddingTop) - iDp) + backgroundPaddingTop >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || (lk0Var = (lk0) f1Var.K(0)) == null) {
                return;
            }
            View view = lk0Var.f5789a;
            if (view.getTop() > tkVar.f32823w0 - tkVar.f32821v0) {
                f1Var.v0(0, view.getTop() - (tkVar.f32823w0 - tkVar.f32821v0), null);
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        tk tkVar = this.f30695a;
        tkVar.e0();
        if (tkVar.F != null) {
            tkVar.G += i11;
        }
        tkVar.f34900b.X1(tkVar, i11);
    }
}
