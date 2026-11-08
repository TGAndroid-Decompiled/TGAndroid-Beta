package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class f21 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f45427a;
    public final l21 f45428b;

    public f21(l21 l21Var, TLRPC.TL_authorization tL_authorization) {
        this.f45428b = l21Var;
        this.f45427a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        l21.I0(this.f45428b, this.f45427a.country);
        return true;
    }
}
