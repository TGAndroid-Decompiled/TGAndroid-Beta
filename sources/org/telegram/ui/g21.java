package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g21 implements View.OnClickListener {
    public final TLRPC.TL_authorization f48035a;
    public final l21 f48036b;

    public g21(l21 l21Var, TLRPC.TL_authorization tL_authorization) {
        this.f48036b = l21Var;
        this.f48035a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        l21.J0(this.f48036b, this.f48035a.ip);
    }
}
