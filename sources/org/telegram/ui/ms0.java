package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class ms0 extends org.telegram.ui.Components.ry0 {
    public final ns0 f38743v0;

    public ms0(ns0 ns0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, messageObject, tLObject, d6Var);
        this.f38743v0 = ns0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f38743v0.f39030b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
