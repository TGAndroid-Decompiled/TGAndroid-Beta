package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h21 implements View.OnClickListener {
    public final TLRPC.TL_authorization f48133a;
    public final m21 f48134b;

    public h21(m21 m21Var, TLRPC.TL_authorization tL_authorization) {
        this.f48134b = m21Var;
        this.f48133a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        m21.J0(this.f48134b, this.f48133a.ip);
    }
}
