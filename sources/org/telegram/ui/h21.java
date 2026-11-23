package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h21 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f48212a;
    public final n21 f48213b;

    public h21(n21 n21Var, TLRPC.TL_authorization tL_authorization) {
        this.f48213b = n21Var;
        this.f48212a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        n21.J0(this.f48213b, this.f48212a.country);
        return true;
    }
}
