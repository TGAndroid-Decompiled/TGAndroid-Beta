package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class qi extends org.telegram.ui.Components.eo {
    public final zn J;

    public qi(zn znVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, i10, document, f6Var);
        this.J = znVar;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        float y10 = getY();
        zn znVar = this.J;
        float y11 = znVar.O0.getY() + y10;
        this.G = znVar.U0.getBackgroundSizeY();
        this.F = y11;
    }
}
