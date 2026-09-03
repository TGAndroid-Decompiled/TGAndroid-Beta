package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class o71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f36680a;
    public final v71 f36681b;

    public o71(v71 v71Var, TLRPC.TL_authorization tL_authorization) {
        this.f36681b = v71Var;
        this.f36680a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        v71.m(this.f36681b, this.f36680a.country);
        return true;
    }
}
