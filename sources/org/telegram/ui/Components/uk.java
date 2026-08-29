package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class uk extends f2.a1 {
    public final bl f33250a;

    public uk(bl blVar) {
        this.f33250a = blVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        vk0 vk0Var;
        bl blVar = this.f33250a;
        jh.e1 e1Var = blVar.L;
        ni niVar = blVar.f28403b;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        blVar.H = z10;
        if (!z10 && blVar.F != null) {
            blVar.F = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = niVar.getBackgroundPaddingTop();
            if (((niVar.X1[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (vk0Var = (vk0) e1Var.K(0)) != null) {
                View view = vk0Var.f6432a;
                if (view.getTop() > blVar.f27177w0 - blVar.f27175v0) {
                    e1Var.v0(0, view.getTop() - (blVar.f27177w0 - blVar.f27175v0), null);
                }
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bl blVar = this.f33250a;
        blVar.e0();
        if (blVar.F != null) {
            blVar.G += i11;
        }
        blVar.f28403b.X1(blVar, i11);
    }
}
