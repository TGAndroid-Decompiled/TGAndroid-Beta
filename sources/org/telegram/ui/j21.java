package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j21 implements View.OnClickListener {
    public final TLRPC.TL_authorization f46796a;
    public final o21 f46797b;

    public j21(o21 o21Var, TLRPC.TL_authorization tL_authorization) {
        this.f46797b = o21Var;
        this.f46796a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        o21.I0(this.f46797b, this.f46796a.ip);
    }
}
