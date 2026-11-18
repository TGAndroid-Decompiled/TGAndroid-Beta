package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g21 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f47886a;
    public final m21 f47887b;

    public g21(m21 m21Var, TLRPC.TL_authorization tL_authorization) {
        this.f47887b = m21Var;
        this.f47886a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        m21.J0(this.f47887b, this.f47886a.country);
        return true;
    }
}
