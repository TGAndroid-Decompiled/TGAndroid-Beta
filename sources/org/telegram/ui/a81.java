package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class a81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f35917a;
    public final h81 f35918b;

    public a81(h81 h81Var, TLRPC.TL_authorization tL_authorization) {
        this.f35918b = h81Var;
        this.f35917a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        h81.o(this.f35918b, this.f35917a.country);
        return true;
    }
}
