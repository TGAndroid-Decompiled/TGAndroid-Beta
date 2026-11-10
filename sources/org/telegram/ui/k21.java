package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class k21 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f47139a;
    public final o21 f47140b;

    public k21(o21 o21Var, TLRPC.TL_authorization tL_authorization) {
        this.f47140b = o21Var;
        this.f47139a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        o21.I0(this.f47140b, this.f47139a.country);
        return true;
    }
}
