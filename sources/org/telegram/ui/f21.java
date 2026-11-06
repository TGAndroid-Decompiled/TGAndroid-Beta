package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class f21 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f45469a;
    public final l21 f45470b;

    public f21(l21 l21Var, TLRPC.TL_authorization tL_authorization) {
        this.f45470b = l21Var;
        this.f45469a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        l21.I0(this.f45470b, this.f45469a.country);
        return true;
    }
}
