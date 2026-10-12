package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f36657a;
    public final o81 f36658b;

    public h81(o81 o81Var, TLRPC.TL_authorization tL_authorization) {
        this.f36658b = o81Var;
        this.f36657a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        o81.n(this.f36658b, this.f36657a.country);
        return true;
    }
}
