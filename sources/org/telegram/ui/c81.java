package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class c81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f36626a;
    public final h81 f36627b;

    public c81(h81 h81Var, TLRPC.TL_authorization tL_authorization) {
        this.f36627b = h81Var;
        this.f36626a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        h81.o(this.f36627b, this.f36626a.country);
        return true;
    }
}
