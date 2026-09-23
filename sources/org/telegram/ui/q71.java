package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f36316a;
    public final w71 f36317b;

    public q71(w71 w71Var, TLRPC.TL_authorization tL_authorization) {
        this.f36317b = w71Var;
        this.f36316a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        w71.m(this.f36317b, this.f36316a.ip);
    }
}
