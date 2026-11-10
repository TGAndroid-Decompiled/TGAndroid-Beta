package org.telegram.ui;

import android.app.Activity;
public final class jq extends org.telegram.ui.Components.d10 {
    public final rq f47058m1;

    public jq(rq rqVar, Activity activity, rq rqVar2) {
        super(activity, rqVar2);
        this.f47058m1 = rqVar;
    }

    @Override
    public final void J0() {
        rq rqVar = this.f47058m1;
        rqVar.getMessagesController().S(rqVar.getParentActivity(), rqVar.f49525n, rqVar, new w0(this, 27));
    }

    @Override
    public final void I0() {
    }
}
