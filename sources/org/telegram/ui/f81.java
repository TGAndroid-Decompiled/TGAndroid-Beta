package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class f81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f37680a;
    public final k81 f37681b;

    public f81(k81 k81Var, TLRPC.TL_authorization tL_authorization) {
        this.f37681b = k81Var;
        this.f37680a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        k81.o(this.f37681b, this.f37680a.country);
        return true;
    }
}
