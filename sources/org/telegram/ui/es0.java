package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class es0 extends org.telegram.ui.Components.cz0 {
    public final fs0 f39173x0;

    public es0(fs0 fs0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, messageObject, tLObject, u6Var);
        this.f39173x0 = fs0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f39173x0.f39440b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
