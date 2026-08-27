package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class i71 extends f2.l0 {

    public final org.telegram.ui.vq f29266r;

    public i71(org.telegram.ui.vq vqVar, Context context) {
        super(context);
        this.f29266r = vqVar;
    }

    @Override
    public final void g(View view, f2.j1 j1Var) {
        int iJ = j(o(), view);
        if (iJ > 0 || (iJ == 0 && view.getLeft() - AndroidUtilities.dp(21.0f) < 0)) {
            iJ += AndroidUtilities.dp(60.0f);
        } else if (iJ < 0) {
            iJ -= AndroidUtilities.dp(60.0f);
        } else if (iJ == 0) {
            if (AndroidUtilities.dp(21.0f) + view.getRight() > ((o71) this.f29266r.J).getMeasuredWidth()) {
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
