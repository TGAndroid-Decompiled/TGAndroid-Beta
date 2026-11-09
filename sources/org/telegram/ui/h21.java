package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h21 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f46133a;
    public final n21 f46134b;

    public h21(n21 n21Var, TLRPC.TL_authorization tL_authorization) {
        this.f46134b = n21Var;
        this.f46133a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        n21.I0(this.f46134b, this.f46133a.country);
        return true;
    }
}
