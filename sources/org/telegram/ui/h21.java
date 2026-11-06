package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h21 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f46200a;
    public final l21 f46201b;

    public h21(l21 l21Var, TLRPC.TL_authorization tL_authorization) {
        this.f46201b = l21Var;
        this.f46200a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        l21.I0(this.f46201b, this.f46200a.country);
        return true;
    }
}
