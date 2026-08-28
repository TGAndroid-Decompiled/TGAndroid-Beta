package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class or0 extends org.telegram.ui.Components.cx0 {
    public final pr0 f41234r0;

    public or0(pr0 pr0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity, messageObject, tLObject, b6Var);
        this.f41234r0 = pr0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f41234r0.f41587b;
        if (photoViewer.Q3 == this) {
            photoViewer.Q3 = null;
        }
    }
}
