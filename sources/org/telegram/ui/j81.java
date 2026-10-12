package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f37316a;
    public final o81 f37317b;

    public j81(o81 o81Var, TLRPC.TL_authorization tL_authorization) {
        this.f37317b = o81Var;
        this.f37316a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        o81.n(this.f37317b, this.f37316a.country);
        return true;
    }
}
