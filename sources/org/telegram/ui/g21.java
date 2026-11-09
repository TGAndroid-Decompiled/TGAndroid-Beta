package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g21 implements View.OnClickListener {
    public final TLRPC.TL_authorization f45854a;
    public final n21 f45855b;

    public g21(n21 n21Var, TLRPC.TL_authorization tL_authorization) {
        this.f45855b = n21Var;
        this.f45854a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        n21.I0(this.f45855b, this.f45854a.country);
    }
}
