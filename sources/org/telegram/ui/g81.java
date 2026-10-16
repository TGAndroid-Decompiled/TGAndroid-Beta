package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g81 implements View.OnClickListener {
    public final TLRPC.TL_authorization f36097a;
    public final o81 f36098b;

    public g81(o81 o81Var, TLRPC.TL_authorization tL_authorization) {
        this.f36098b = o81Var;
        this.f36097a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        o81.n(this.f36098b, this.f36097a.country);
    }
}
