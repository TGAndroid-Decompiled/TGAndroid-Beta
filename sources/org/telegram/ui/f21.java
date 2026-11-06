package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class f21 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f45464a;
    public final l21 f45465b;

    public f21(l21 l21Var, TLRPC.TL_authorization tL_authorization) {
        this.f45465b = l21Var;
        this.f45464a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        l21.I0(this.f45465b, this.f45464a.country);
        return true;
    }
}
