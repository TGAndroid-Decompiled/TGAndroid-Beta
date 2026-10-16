package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class i81 implements View.OnClickListener {
    public final TLRPC.TL_authorization f36755a;
    public final o81 f36756b;

    public i81(o81 o81Var, TLRPC.TL_authorization tL_authorization) {
        this.f36756b = o81Var;
        this.f36755a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        o81.n(this.f36756b, this.f36755a.ip);
    }
}
