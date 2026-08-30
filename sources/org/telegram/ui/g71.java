package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f34468a;
    public final o71 f34469b;

    public g71(o71 o71Var, TLRPC.TL_authorization tL_authorization) {
        this.f34469b = o71Var;
        this.f34468a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        o71.m(this.f34469b, this.f34468a.country);
    }
}
