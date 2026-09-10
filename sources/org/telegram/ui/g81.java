package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class g81 implements View.OnClickListener {
    public final i81 f33041a;
    public final TLRPC.TL_authorization f33042b;
    public final j81 f33043c;

    public g81(j81 j81Var, i81 i81Var, TLRPC.TL_authorization tL_authorization) {
        this.f33043c = j81Var;
        this.f33041a = i81Var;
        this.f33042b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        i81 i81Var = this.f33041a;
        Switch r02 = i81Var.d;
        r02.c(!r02.h, true);
        this.f33042b.call_requests_disabled = !i81Var.d.h;
        j81.n(this.f33043c);
    }
}
