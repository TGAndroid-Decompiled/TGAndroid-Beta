package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class d21 implements View.OnClickListener {
    public final TLRPC.TL_authorization f46265a;
    public final i21 f46266b;

    public d21(i21 i21Var, TLRPC.TL_authorization tL_authorization) {
        this.f46266b = i21Var;
        this.f46265a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        i21.I0(this.f46266b, this.f46265a.ip);
    }
}
