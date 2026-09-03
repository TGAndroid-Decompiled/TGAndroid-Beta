package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class cs0 extends org.telegram.ui.Components.xx0 {
    public final ds0 f35856s0;

    public cs0(ds0 ds0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, messageObject, tLObject, g6Var);
        this.f35856s0 = ds0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f35856s0.f36251b;
        if (photoViewer.R3 == this) {
            photoViewer.R3 = null;
        }
    }
}
