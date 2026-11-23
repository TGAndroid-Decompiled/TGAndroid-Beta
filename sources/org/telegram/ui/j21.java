package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class j21 implements View.OnClickListener {
    public final org.telegram.ui.Components.ug f48972a;
    public final TLRPC.TL_authorization f48973b;
    public final l21 f48974c;

    public j21(l21 l21Var, org.telegram.ui.Components.ug ugVar, TLRPC.TL_authorization tL_authorization) {
        this.f48974c = l21Var;
        this.f48972a = ugVar;
        this.f48973b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.ug ugVar = this.f48972a;
        Switch r02 = (Switch) ugVar.f40372f;
        r02.c(!r02.h, true);
        this.f48973b.call_requests_disabled = !((Switch) ugVar.f40372f).h;
        l21.K0(this.f48974c);
    }
}
