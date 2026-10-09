package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class b81 implements View.OnClickListener {
    public final TLRPC.TL_authorization f36169a;
    public final h81 f36170b;

    public b81(h81 h81Var, TLRPC.TL_authorization tL_authorization) {
        this.f36170b = h81Var;
        this.f36169a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        h81.o(this.f36170b, this.f36169a.ip);
    }
}
