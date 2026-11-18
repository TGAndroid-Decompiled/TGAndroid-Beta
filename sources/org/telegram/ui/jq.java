package org.telegram.ui;

import android.app.Activity;
public final class jq extends org.telegram.ui.Components.o10 {
    public final rq n1;

    public jq(rq rqVar, Activity activity, rq rqVar2) {
        super(activity, rqVar2);
        this.n1 = rqVar;
    }

    @Override
    public final void K0() {
        rq rqVar = this.n1;
        rqVar.getMessagesController().S(rqVar.getParentActivity(), rqVar.f51756n, rqVar, new w0(this, 27));
    }

    @Override
    public final void J0() {
    }
}
