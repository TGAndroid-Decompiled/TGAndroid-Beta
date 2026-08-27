package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class rz extends f2.l0 {

    public final org.telegram.ui.vq f32280r;

    public rz(org.telegram.ui.vq vqVar, Context context) {
        super(context);
        this.f32280r = vqVar;
    }

    @Override
    public final void g(View view, f2.j1 j1Var) {
        int iJ = j(o(), view);
        if (iJ > 0 || (iJ == 0 && view.getLeft() - AndroidUtilities.dp(21.0f) < 0)) {
            iJ += AndroidUtilities.dp(60.0f);
        } else if (iJ < 0) {
            iJ -= AndroidUtilities.dp(60.0f);
        } else if (iJ == 0) {
            if (AndroidUtilities.dp(21.0f) + view.getRight() > ((yz) this.f32280r.J).getMeasuredWidth()) {
                iJ -= AndroidUtilities.dp(60.0f);
            }
        }
        int iK = k(p(), view);
        int iMax = Math.max(180, m((int) Math.sqrt((iK * iK) + (iJ * iJ))));
        if (iMax > 0) {
            j1Var.b(-iJ, -iK, iMax, this.f5750j);
        }
    }
}
