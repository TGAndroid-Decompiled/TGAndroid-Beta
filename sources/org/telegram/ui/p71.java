package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class p71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f36038a;
    public final w71 f36039b;

    public p71(w71 w71Var, TLRPC.TL_authorization tL_authorization) {
        this.f36039b = w71Var;
        this.f36038a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        w71.m(this.f36039b, this.f36038a.country);
        return true;
    }
}
