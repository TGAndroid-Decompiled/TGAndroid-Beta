package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

public final class q61 implements View.OnLongClickListener {

    public final TLRPC.TL_authorization f41532a;

    public final x61 f41533b;

    public q61(x61 x61Var, TLRPC.TL_authorization tL_authorization) {
        this.f41533b = x61Var;
        this.f41532a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        x61.m(this.f41533b, this.f41532a.country);
        return true;
    }
}
