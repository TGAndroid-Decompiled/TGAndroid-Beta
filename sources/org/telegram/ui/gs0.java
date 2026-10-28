package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class gs0 extends org.telegram.ui.Components.dz0 {
    public final hs0 f39686x0;

    public gs0(hs0 hs0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, messageObject, tLObject, u6Var);
        this.f39686x0 = hs0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f39686x0.f39958b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
