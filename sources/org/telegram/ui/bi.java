package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class bi extends org.telegram.ui.Components.on {
    public final cn M;

    public bi(cn cnVar, Activity activity, int i7, TLRPC.Document document, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity, i7, document, h6Var);
        this.M = cnVar;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        float y10 = getY();
        cn cnVar = this.M;
        float y11 = cnVar.f44489f1.getY() + y10;
        this.J = cnVar.l1.getBackgroundSizeY();
        this.I = y11;
    }
}
