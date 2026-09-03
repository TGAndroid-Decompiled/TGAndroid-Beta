package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f37328a;
    public final v71 f37329b;

    public q71(v71 v71Var, TLRPC.TL_authorization tL_authorization) {
        this.f37329b = v71Var;
        this.f37328a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        v71.m(this.f37329b, this.f37328a.country);
        return true;
    }
}
