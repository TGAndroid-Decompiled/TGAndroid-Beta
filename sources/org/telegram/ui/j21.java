package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j21 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f48869a;
    public final n21 f48870b;

    public j21(n21 n21Var, TLRPC.TL_authorization tL_authorization) {
        this.f48870b = n21Var;
        this.f48869a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        n21.J0(this.f48870b, this.f48869a.country);
        return true;
    }
}
