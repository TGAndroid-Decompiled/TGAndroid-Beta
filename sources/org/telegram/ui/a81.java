package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class a81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f35873a;
    public final h81 f35874b;

    public a81(h81 h81Var, TLRPC.TL_authorization tL_authorization) {
        this.f35874b = h81Var;
        this.f35873a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        h81.o(this.f35874b, this.f35873a.country);
        return true;
    }
}
