package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m61 implements View.OnClickListener {
    public final TLRPC.TL_authorization f39131a;
    public final u61 f39132b;

    public m61(u61 u61Var, TLRPC.TL_authorization tL_authorization) {
        this.f39132b = u61Var;
        this.f39131a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        u61.n(this.f39132b, this.f39131a.country);
    }
}
