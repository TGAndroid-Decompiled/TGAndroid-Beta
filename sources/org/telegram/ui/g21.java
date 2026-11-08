package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g21 implements View.OnClickListener {
    public final TLRPC.TL_authorization f45768a;
    public final l21 f45769b;

    public g21(l21 l21Var, TLRPC.TL_authorization tL_authorization) {
        this.f45769b = l21Var;
        this.f45768a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        l21.I0(this.f45769b, this.f45768a.ip);
    }
}
