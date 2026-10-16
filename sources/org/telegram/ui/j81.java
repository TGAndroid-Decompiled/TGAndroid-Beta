package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f36986a;
    public final o81 f36987b;

    public j81(o81 o81Var, TLRPC.TL_authorization tL_authorization) {
        this.f36987b = o81Var;
        this.f36986a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        o81.n(this.f36987b, this.f36986a.country);
        return true;
    }
}
