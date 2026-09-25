package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f36812a;
    public final x71 f36813b;

    public q71(x71 x71Var, TLRPC.TL_authorization tL_authorization) {
        this.f36813b = x71Var;
        this.f36812a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        x71.m(this.f36813b, this.f36812a.country);
        return true;
    }
}
