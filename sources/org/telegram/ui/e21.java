package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class e21 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f46534a;
    public final i21 f46535b;

    public e21(i21 i21Var, TLRPC.TL_authorization tL_authorization) {
        this.f46535b = i21Var;
        this.f46534a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        i21.I0(this.f46535b, this.f46534a.country);
        return true;
    }
}
