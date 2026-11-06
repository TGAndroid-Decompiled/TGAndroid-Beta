package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g21 implements View.OnClickListener {
    public final TLRPC.TL_authorization f45791a;
    public final l21 f45792b;

    public g21(l21 l21Var, TLRPC.TL_authorization tL_authorization) {
        this.f45792b = l21Var;
        this.f45791a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        l21.I0(this.f45792b, this.f45791a.ip);
    }
}
