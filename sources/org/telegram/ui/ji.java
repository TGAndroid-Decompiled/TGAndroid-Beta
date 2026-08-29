package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class ji extends org.telegram.ui.Components.co {
    public final tn I;

    public ji(tn tnVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, i10, document, c6Var);
        this.I = tnVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y8 = getY();
        tn tnVar = this.I;
        float y10 = tnVar.N0.getY() + y8;
        this.F = tnVar.T0.getBackgroundSizeY();
        this.E = y10;
    }
}
