package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class e81 implements View.OnClickListener {
    public final TLRPC.TL_authorization f37028a;
    public final k81 f37029b;

    public e81(k81 k81Var, TLRPC.TL_authorization tL_authorization) {
        this.f37029b = k81Var;
        this.f37028a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        k81.o(this.f37029b, this.f37028a.ip);
    }
}
