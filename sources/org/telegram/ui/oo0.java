package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;
public final class oo0 extends org.telegram.ui.Components.yv0 {
    public final po0 f48435o2;

    public oo0(po0 po0Var, Activity activity, org.telegram.messenger.ij ijVar, TLObject tLObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, ijVar, tLObject, f6Var);
        this.f48435o2 = po0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f48435o2.f48903b;
        if (photoViewer.T3 == this) {
            photoViewer.T3 = null;
        }
    }
}
