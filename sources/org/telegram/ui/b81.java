package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class b81 implements View.OnClickListener {
    public final TLRPC.TL_authorization f31181a;
    public final j81 f31182b;

    public b81(j81 j81Var, TLRPC.TL_authorization tL_authorization) {
        this.f31182b = j81Var;
        this.f31181a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        j81.m(this.f31182b, this.f31181a.country);
    }
}
