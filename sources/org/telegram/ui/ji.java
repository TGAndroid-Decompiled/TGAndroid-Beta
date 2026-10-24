package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class ji extends org.telegram.ui.Components.ro {
    public final sn M;

    public ji(sn snVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, i10, document, g6Var);
        this.M = snVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        sn snVar = this.M;
        float y10 = snVar.f41486d1.getY() + y3;
        this.J = snVar.f41558j1.getBackgroundSizeY();
        this.I = y10;
    }
}
