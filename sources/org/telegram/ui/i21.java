package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class i21 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f46472a;
    public final o21 f46473b;

    public i21(o21 o21Var, TLRPC.TL_authorization tL_authorization) {
        this.f46473b = o21Var;
        this.f46472a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        o21.I0(this.f46473b, this.f46472a.country);
        return true;
    }
}
