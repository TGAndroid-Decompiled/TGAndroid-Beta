package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q61 implements View.OnClickListener {
    public final TLRPC.TL_authorization f41695a;
    public final y61 f41696b;

    public q61(y61 y61Var, TLRPC.TL_authorization tL_authorization) {
        this.f41696b = y61Var;
        this.f41695a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        y61.m(this.f41696b, this.f41695a.country);
    }
}
