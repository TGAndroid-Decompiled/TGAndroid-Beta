package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class o71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f35703a;
    public final w71 f35704b;

    public o71(w71 w71Var, TLRPC.TL_authorization tL_authorization) {
        this.f35704b = w71Var;
        this.f35703a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        w71.m(this.f35704b, this.f35703a.country);
    }
}
