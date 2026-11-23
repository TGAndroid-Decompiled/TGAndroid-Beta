package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class i21 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f48537a;
    public final m21 f48538b;

    public i21(m21 m21Var, TLRPC.TL_authorization tL_authorization) {
        this.f48538b = m21Var;
        this.f48537a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        m21.J0(this.f48538b, this.f48537a.country);
        return true;
    }
}
