package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class i21 implements View.OnClickListener {
    public final TLRPC.TL_authorization f46447a;
    public final n21 f46448b;

    public i21(n21 n21Var, TLRPC.TL_authorization tL_authorization) {
        this.f46448b = n21Var;
        this.f46447a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        n21.I0(this.f46448b, this.f46447a.ip);
    }
}
