package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class pi extends org.telegram.ui.Components.fo {
    public final xn J;

    public pi(xn xnVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, i10, document, f6Var);
        this.J = xnVar;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        float y10 = getY();
        xn xnVar = this.J;
        float y11 = xnVar.O0.getY() + y10;
        this.G = xnVar.U0.getBackgroundSizeY();
        this.F = y11;
    }
}
