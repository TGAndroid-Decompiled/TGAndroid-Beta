package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f37349a;
    public final p71 f37350b;

    public h71(p71 p71Var, TLRPC.TL_authorization tL_authorization) {
        this.f37350b = p71Var;
        this.f37349a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        p71.m(this.f37350b, this.f37349a.country);
    }
}
