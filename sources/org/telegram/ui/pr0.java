package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

public final class pr0 extends org.telegram.ui.Components.ex0 {

    public final qr0 f41423r0;

    public pr0(qr0 qr0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, messageObject, tLObject, c6Var);
        this.f41423r0 = qr0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f41423r0.f41739b;
        if (photoViewer.Q3 == this) {
            photoViewer.Q3 = null;
        }
    }
}
