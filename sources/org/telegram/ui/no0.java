package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;
public final class no0 extends org.telegram.ui.Components.bw0 {
    public final oo0 f49588s2;

    public no0(oo0 oo0Var, Activity activity, org.telegram.messenger.gj gjVar, TLObject tLObject, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, gjVar, tLObject, e6Var);
        this.f49588s2 = oo0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f49588s2.f50016b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
