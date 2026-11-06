package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class e21 implements View.OnClickListener {
    public final TLRPC.TL_authorization f45186a;
    public final l21 f45187b;

    public e21(l21 l21Var, TLRPC.TL_authorization tL_authorization) {
        this.f45187b = l21Var;
        this.f45186a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        l21.I0(this.f45187b, this.f45186a.country);
    }
}
