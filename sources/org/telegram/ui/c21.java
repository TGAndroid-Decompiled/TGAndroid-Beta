package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class c21 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f45875a;
    public final i21 f45876b;

    public c21(i21 i21Var, TLRPC.TL_authorization tL_authorization) {
        this.f45876b = i21Var;
        this.f45875a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        i21.I0(this.f45876b, this.f45875a.country);
        return true;
    }
}
