package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class d81 implements View.OnClickListener {
    public final TLRPC.TL_authorization f31861a;
    public final j81 f31862b;

    public d81(j81 j81Var, TLRPC.TL_authorization tL_authorization) {
        this.f31862b = j81Var;
        this.f31861a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        j81.m(this.f31862b, this.f31861a.ip);
    }
}
