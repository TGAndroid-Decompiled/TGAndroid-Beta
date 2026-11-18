package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class f21 implements View.OnClickListener {
    public final TLRPC.TL_authorization f47389a;
    public final m21 f47390b;

    public f21(m21 m21Var, TLRPC.TL_authorization tL_authorization) {
        this.f47390b = m21Var;
        this.f47389a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        m21.J0(this.f47390b, this.f47389a.country);
    }
}
