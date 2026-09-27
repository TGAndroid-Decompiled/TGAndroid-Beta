package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class ms0 extends org.telegram.ui.Components.hy0 {
    public final ns0 f35749v0;

    public ms0(ns0 ns0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, messageObject, tLObject, e6Var);
        this.f35749v0 = ns0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f35749v0.f36082b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
