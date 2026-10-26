package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class ki extends org.telegram.ui.Components.vo {
    public final un M;

    public ki(un unVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, i10, document, u6Var);
        this.M = unVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        un unVar = this.M;
        float y10 = unVar.f44221d1.getY() + y3;
        this.J = unVar.f44295j1.getBackgroundSizeY();
        this.I = y10;
    }
}
