package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class qi extends org.telegram.ui.Components.ko {
    public final xn M;

    public qi(xn xnVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, i10, document, d6Var);
        this.M = xnVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        xn xnVar = this.M;
        float y10 = xnVar.R0.getY() + y3;
        this.J = xnVar.X0.getBackgroundSizeY();
        this.I = y10;
    }
}
