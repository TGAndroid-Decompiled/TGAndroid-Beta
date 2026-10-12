package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class c81 implements View.OnClickListener {
    public final TLRPC.TL_authorization f36367a;
    public final k81 f36368b;

    public c81(k81 k81Var, TLRPC.TL_authorization tL_authorization) {
        this.f36368b = k81Var;
        this.f36367a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        k81.o(this.f36368b, this.f36367a.country);
    }
}
