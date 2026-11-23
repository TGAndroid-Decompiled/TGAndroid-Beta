package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class i21 implements View.OnClickListener {
    public final TLRPC.TL_authorization f48565a;
    public final n21 f48566b;

    public i21(n21 n21Var, TLRPC.TL_authorization tL_authorization) {
        this.f48566b = n21Var;
        this.f48565a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        n21.J0(this.f48566b, this.f48565a.ip);
    }
}
