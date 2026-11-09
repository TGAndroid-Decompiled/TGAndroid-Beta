package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j21 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f46819a;
    public final n21 f46820b;

    public j21(n21 n21Var, TLRPC.TL_authorization tL_authorization) {
        this.f46820b = n21Var;
        this.f46819a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        n21.I0(this.f46820b, this.f46819a.country);
        return true;
    }
}
