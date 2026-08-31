package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class i71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f37767a;
    public final p71 f37768b;

    public i71(p71 p71Var, TLRPC.TL_authorization tL_authorization) {
        this.f37768b = p71Var;
        this.f37767a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        p71.m(this.f37768b, this.f37767a.country);
        return true;
    }
}
