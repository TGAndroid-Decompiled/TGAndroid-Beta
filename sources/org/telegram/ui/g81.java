package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g81 implements View.OnClickListener {
    public final TLRPC.TL_authorization f36340a;
    public final o81 f36341b;

    public g81(o81 o81Var, TLRPC.TL_authorization tL_authorization) {
        this.f36341b = o81Var;
        this.f36340a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        o81.n(this.f36341b, this.f36340a.country);
    }
}
