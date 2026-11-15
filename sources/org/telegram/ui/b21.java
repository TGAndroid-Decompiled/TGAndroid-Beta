package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class b21 implements View.OnClickListener {
    public final TLRPC.TL_authorization f45560a;
    public final i21 f45561b;

    public b21(i21 i21Var, TLRPC.TL_authorization tL_authorization) {
        this.f45561b = i21Var;
        this.f45560a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        i21.I0(this.f45561b, this.f45560a.country);
    }
}
