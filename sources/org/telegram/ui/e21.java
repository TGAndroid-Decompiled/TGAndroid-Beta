package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class e21 implements View.OnClickListener {
    public final TLRPC.TL_authorization f47304a;
    public final l21 f47305b;

    public e21(l21 l21Var, TLRPC.TL_authorization tL_authorization) {
        this.f47305b = l21Var;
        this.f47304a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        l21.J0(this.f47305b, this.f47304a.country);
    }
}
