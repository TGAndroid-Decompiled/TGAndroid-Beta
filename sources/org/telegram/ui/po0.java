package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;
public final class po0 extends org.telegram.ui.Components.yv0 {
    public final qo0 f48897o2;

    public po0(qo0 qo0Var, Activity activity, org.telegram.messenger.ij ijVar, TLObject tLObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, ijVar, tLObject, f6Var);
        this.f48897o2 = qo0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f48897o2.f49287b;
        if (photoViewer.T3 == this) {
            photoViewer.T3 = null;
        }
    }
}
