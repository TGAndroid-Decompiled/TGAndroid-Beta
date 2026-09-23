package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class ks0 extends org.telegram.ui.Components.ux0 {
    public final ls0 f34795v0;

    public ks0(ls0 ls0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, messageObject, tLObject, d6Var);
        this.f34795v0 = ls0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f34795v0.f35085b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
