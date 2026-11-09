package org.telegram.ui.Components;

import android.content.Context;
public final class ju0 extends na {
    public vr P1;

    public ju0(Context context) {
        super(context, null, true, false, null);
        N();
        this.f36312v1 = true;
        this.f36311u1 = true;
        Y0();
        qj0 qj0Var = this.f36303k1;
        int i7 = this.f28654t0;
        qj0Var.setPadding(i7, 0, i7, 0);
        this.f36303k1.j(new ui(this, 17));
        this.f36303k1.setOnItemClickListener(new k(this, 14));
    }

    @Override
    public final pj0 L0(qj0 qj0Var) {
        vr vrVar = new vr(qj0Var, getContext(), this.f28621a, 0, true, this.I0);
        this.P1 = vrVar;
        vrVar.f35945r = false;
        return vrVar;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.id.M0(2131745821, null);
    }
}
