package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class e21 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f46524a;
    public final i21 f46525b;

    public e21(i21 i21Var, TLRPC.TL_authorization tL_authorization) {
        this.f46525b = i21Var;
        this.f46524a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        i21.I0(this.f46525b, this.f46524a.country);
        return true;
    }
}
