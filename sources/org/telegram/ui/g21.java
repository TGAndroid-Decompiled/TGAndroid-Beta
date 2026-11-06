package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g21 implements View.OnClickListener {
    public final TLRPC.TL_authorization f45792a;
    public final l21 f45793b;

    public g21(l21 l21Var, TLRPC.TL_authorization tL_authorization) {
        this.f45793b = l21Var;
        this.f45792a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        l21.I0(this.f45793b, this.f45792a.ip);
    }
}
