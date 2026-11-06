package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class e21 implements View.OnClickListener {
    public final TLRPC.TL_authorization f45185a;
    public final l21 f45186b;

    public e21(l21 l21Var, TLRPC.TL_authorization tL_authorization) {
        this.f45186b = l21Var;
        this.f45185a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        l21.I0(this.f45186b, this.f45185a.country);
    }
}
