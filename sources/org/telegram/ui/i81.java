package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class i81 implements View.OnClickListener {
    public final TLRPC.TL_authorization f37067a;
    public final o81 f37068b;

    public i81(o81 o81Var, TLRPC.TL_authorization tL_authorization) {
        this.f37068b = o81Var;
        this.f37067a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        o81.n(this.f37068b, this.f37067a.ip);
    }
}
