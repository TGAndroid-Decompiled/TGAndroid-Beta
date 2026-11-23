package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class ai extends org.telegram.ui.Components.io {
    public final bn N;

    public ai(bn bnVar, Activity activity, int i7, TLRPC.Document document, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity, i7, document, h6Var);
        this.N = bnVar;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        float y10 = getY();
        bn bnVar = this.N;
        float y11 = bnVar.f46033g1.getY() + y10;
        this.K = bnVar.f46111m1.getBackgroundSizeY();
        this.J = y11;
    }
}
