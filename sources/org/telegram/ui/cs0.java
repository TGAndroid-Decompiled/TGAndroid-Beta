package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class cs0 extends org.telegram.ui.Components.xx0 {
    public final ds0 f33216s0;

    public cs0(ds0 ds0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, messageObject, tLObject, f6Var);
        this.f33216s0 = ds0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f33216s0.f33528b;
        if (photoViewer.R3 == this) {
            photoViewer.R3 = null;
        }
    }
}
