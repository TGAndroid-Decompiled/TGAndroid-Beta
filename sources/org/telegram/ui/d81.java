package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class d81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f36687a;
    public final k81 f36688b;

    public d81(k81 k81Var, TLRPC.TL_authorization tL_authorization) {
        this.f36688b = k81Var;
        this.f36687a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        k81.o(this.f36688b, this.f36687a.country);
        return true;
    }
}
