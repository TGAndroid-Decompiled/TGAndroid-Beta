package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f38875a;
    public final u71 f38876b;

    public m71(u71 u71Var, TLRPC.TL_authorization tL_authorization) {
        this.f38876b = u71Var;
        this.f38875a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        u71.m(this.f38876b, this.f38875a.country);
    }
}
