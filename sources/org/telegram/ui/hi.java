package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class hi extends org.telegram.ui.Components.yn {
    public final qn I;

    public hi(qn qnVar, Activity activity, int i9, TLRPC.Document document, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity, i9, document, b6Var);
        this.I = qnVar;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        float y10 = getY();
        qn qnVar = this.I;
        float y11 = qnVar.N0.getY() + y10;
        this.F = qnVar.T0.getBackgroundSizeY();
        this.E = y11;
    }
}
