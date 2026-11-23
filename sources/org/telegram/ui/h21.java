package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h21 implements View.OnClickListener {
    public final TLRPC.TL_authorization f48176a;
    public final m21 f48177b;

    public h21(m21 m21Var, TLRPC.TL_authorization tL_authorization) {
        this.f48177b = m21Var;
        this.f48176a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        m21.J0(this.f48177b, this.f48176a.ip);
    }
}
