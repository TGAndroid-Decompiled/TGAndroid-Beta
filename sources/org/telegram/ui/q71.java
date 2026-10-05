package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f39729a;
    public final x71 f39730b;

    public q71(x71 x71Var, TLRPC.TL_authorization tL_authorization) {
        this.f39730b = x71Var;
        this.f39729a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        x71.m(this.f39730b, this.f39729a.country);
        return true;
    }
}
