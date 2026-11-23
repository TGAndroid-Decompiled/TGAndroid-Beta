package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class f21 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f47670a;
    public final l21 f47671b;

    public f21(l21 l21Var, TLRPC.TL_authorization tL_authorization) {
        this.f47671b = l21Var;
        this.f47670a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        l21.J0(this.f47671b, this.f47670a.country);
        return true;
    }
}
