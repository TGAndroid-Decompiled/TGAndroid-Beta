package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class oi extends org.telegram.ui.Components.vo {
    public final wn M;

    public oi(wn wnVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, i10, document, u6Var);
        this.M = wnVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        wn wnVar = this.M;
        float y10 = wnVar.f45088d1.getY() + y3;
        this.J = wnVar.f45163j1.getBackgroundSizeY();
        this.I = y10;
    }
}
