package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f36447a;
    public final o81 f36448b;

    public h81(o81 o81Var, TLRPC.TL_authorization tL_authorization) {
        this.f36448b = o81Var;
        this.f36447a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        o81.n(this.f36448b, this.f36447a.country);
        return true;
    }
}
