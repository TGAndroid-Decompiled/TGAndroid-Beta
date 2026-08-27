package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

public final class p61 implements View.OnClickListener {

    public final TLRPC.TL_authorization f41285a;

    public final x61 f41286b;

    public p61(x61 x61Var, TLRPC.TL_authorization tL_authorization) {
        this.f41286b = x61Var;
        this.f41285a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        x61.m(this.f41286b, this.f41285a.country);
    }
}
