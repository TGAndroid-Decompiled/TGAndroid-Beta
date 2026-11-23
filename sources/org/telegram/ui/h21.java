package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h21 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f48415a;
    public final l21 f48416b;

    public h21(l21 l21Var, TLRPC.TL_authorization tL_authorization) {
        this.f48416b = l21Var;
        this.f48415a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        l21.J0(this.f48416b, this.f48415a.country);
        return true;
    }
}
