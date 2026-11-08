package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h21 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f46202a;
    public final l21 f46203b;

    public h21(l21 l21Var, TLRPC.TL_authorization tL_authorization) {
        this.f46203b = l21Var;
        this.f46202a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        l21.I0(this.f46203b, this.f46202a.country);
        return true;
    }
}
