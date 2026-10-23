package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class as0 extends org.telegram.ui.Components.ty0 {
    public final bs0 f35775x0;

    public as0(bs0 bs0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, messageObject, tLObject, g6Var);
        this.f35775x0 = bs0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f35775x0.f36162b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
