package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g21 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f47850a;
    public final m21 f47851b;

    public g21(m21 m21Var, TLRPC.TL_authorization tL_authorization) {
        this.f47851b = m21Var;
        this.f47850a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        m21.J0(this.f47851b, this.f47850a.country);
        return true;
    }
}
