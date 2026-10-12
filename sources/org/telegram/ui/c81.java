package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class c81 implements View.OnClickListener {
    public final TLRPC.TL_authorization f36369a;
    public final k81 f36370b;

    public c81(k81 k81Var, TLRPC.TL_authorization tL_authorization) {
        this.f36370b = k81Var;
        this.f36369a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        k81.o(this.f36370b, this.f36369a.country);
    }
}
