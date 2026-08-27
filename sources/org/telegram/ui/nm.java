package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

public abstract class nm extends org.telegram.ui.Components.zk0 implements jh.z6 {
    public final rn T2;

    public nm(rn rnVar, Context context, pn pnVar) {
        super(context, pnVar);
        this.T2 = rnVar;
    }

    @Override
    public final void a(int[] iArr) {
        rn rnVar = this.T2;
        iArr[0] = ((int) rnVar.f42160o9) - AndroidUtilities.dp(4.0f);
        iArr[1] = org.telegram.messenger.y1.A(3.0f, rnVar.f42213t0.getPaddingBottom(), rnVar.f42213t0.getMeasuredHeight());
    }
}
