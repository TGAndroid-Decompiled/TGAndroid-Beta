package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class d81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f36685a;
    public final k81 f36686b;

    public d81(k81 k81Var, TLRPC.TL_authorization tL_authorization) {
        this.f36686b = k81Var;
        this.f36685a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        k81.o(this.f36686b, this.f36685a.country);
        return true;
    }
}
