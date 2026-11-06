package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class ai extends org.telegram.ui.Components.pn {
    public final an M;

    public ai(an anVar, Activity activity, int i7, TLRPC.Document document, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, i7, document, f6Var);
        this.M = anVar;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        float y10 = getY();
        an anVar = this.M;
        float y11 = anVar.f43763f1.getY() + y10;
        this.J = anVar.l1.getBackgroundSizeY();
        this.I = y11;
    }
}
