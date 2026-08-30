package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f35253a;
    public final o71 f35254b;

    public j71(o71 o71Var, TLRPC.TL_authorization tL_authorization) {
        this.f35254b = o71Var;
        this.f35253a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        o71.m(this.f35254b, this.f35253a.country);
        return true;
    }
}
