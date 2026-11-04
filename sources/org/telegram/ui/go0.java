package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;
public final class go0 extends org.telegram.ui.Components.xv0 {
    public final ho0 f45685p2;

    public go0(ho0 ho0Var, Activity activity, org.telegram.messenger.zi ziVar, TLObject tLObject, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, ziVar, tLObject, e6Var);
        this.f45685p2 = ho0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f45685p2.f45959b;
        if (photoViewer.V3 == this) {
            photoViewer.V3 = null;
        }
    }
}
