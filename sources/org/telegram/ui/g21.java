package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g21 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f47871a;
    public final m21 f47872b;

    public g21(m21 m21Var, TLRPC.TL_authorization tL_authorization) {
        this.f47872b = m21Var;
        this.f47871a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        m21.J0(this.f47872b, this.f47871a.country);
        return true;
    }
}
