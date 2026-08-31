package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f38031a;
    public final p71 f38032b;

    public j71(p71 p71Var, TLRPC.TL_authorization tL_authorization) {
        this.f38032b = p71Var;
        this.f38031a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        p71.m(this.f38032b, this.f38031a.ip);
    }
}
