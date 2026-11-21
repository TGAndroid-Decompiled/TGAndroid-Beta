package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class i21 implements View.OnClickListener {
    public final TLRPC.TL_authorization f48561a;
    public final n21 f48562b;

    public i21(n21 n21Var, TLRPC.TL_authorization tL_authorization) {
        this.f48562b = n21Var;
        this.f48561a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        n21.J0(this.f48562b, this.f48561a.ip);
    }
}
