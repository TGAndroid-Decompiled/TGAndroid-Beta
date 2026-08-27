package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

public final class ji extends org.telegram.ui.Components.wn {
    public final rn I;

    public ji(rn rnVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, i10, document, c6Var);
        this.I = rnVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y10 = getY();
        rn rnVar = this.I;
        float y11 = rnVar.N0.getY() + y10;
        this.F = rnVar.T0.getBackgroundSizeY();
        this.E = y11;
    }
}
