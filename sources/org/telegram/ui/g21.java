package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g21 implements View.OnClickListener {
    public final TLRPC.TL_authorization f47924a;
    public final n21 f47925b;

    public g21(n21 n21Var, TLRPC.TL_authorization tL_authorization) {
        this.f47925b = n21Var;
        this.f47924a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        n21.J0(this.f47925b, this.f47924a.country);
    }
}
