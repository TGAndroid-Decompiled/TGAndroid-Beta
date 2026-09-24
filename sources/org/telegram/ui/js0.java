package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class js0 extends org.telegram.ui.Components.fy0 {
    public final ks0 f34853v0;

    public js0(ks0 ks0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, messageObject, tLObject, d6Var);
        this.f34853v0 = ks0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f34853v0.f35135b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
