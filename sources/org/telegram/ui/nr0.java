package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class nr0 extends org.telegram.ui.Components.nx0 {
    public final or0 f40894r0;

    public nr0(or0 or0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, messageObject, tLObject, c6Var);
        this.f40894r0 = or0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f40894r0.f41216b;
        if (photoViewer.Q3 == this) {
            photoViewer.Q3 = null;
        }
    }
}
