package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class e21 implements View.OnClickListener {
    public final TLRPC.TL_authorization f45156a;
    public final l21 f45157b;

    public e21(l21 l21Var, TLRPC.TL_authorization tL_authorization) {
        this.f45157b = l21Var;
        this.f45156a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        l21.I0(this.f45157b, this.f45156a.country);
    }
}
