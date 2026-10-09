package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class a81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f35871a;
    public final h81 f35872b;

    public a81(h81 h81Var, TLRPC.TL_authorization tL_authorization) {
        this.f35872b = h81Var;
        this.f35871a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        h81.o(this.f35872b, this.f35871a.country);
        return true;
    }
}
