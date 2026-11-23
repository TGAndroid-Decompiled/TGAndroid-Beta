package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class i21 implements View.OnClickListener {
    public final org.telegram.ui.Components.ug f48696a;
    public final TLRPC.TL_authorization f48697b;
    public final l21 f48698c;

    public i21(l21 l21Var, org.telegram.ui.Components.ug ugVar, TLRPC.TL_authorization tL_authorization) {
        this.f48698c = l21Var;
        this.f48696a = ugVar;
        this.f48697b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.ug ugVar = this.f48696a;
        Switch r02 = (Switch) ugVar.f40372f;
        r02.c(!r02.h, true);
        this.f48697b.encrypted_requests_disabled = !((Switch) ugVar.f40372f).h;
        l21.K0(this.f48698c);
    }
}
