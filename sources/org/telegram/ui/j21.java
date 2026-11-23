package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j21 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f48873a;
    public final n21 f48874b;

    public j21(n21 n21Var, TLRPC.TL_authorization tL_authorization) {
        this.f48874b = n21Var;
        this.f48873a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        n21.J0(this.f48874b, this.f48873a.country);
        return true;
    }
}
