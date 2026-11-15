package org.telegram.ui.Components;

import android.content.Context;
public final class iu0 extends ja {
    public bs T1;

    public iu0(Context context) {
        super(context, null, true, false, null);
        O();
        this.f35942z1 = true;
        this.f35941y1 = true;
        Y0();
        uj0 uj0Var = this.f35931o1;
        int i7 = this.f29717u0;
        uj0Var.setPadding(i7, 0, i7, 0);
        this.f35931o1.j(new ri(this, 19));
        this.f35931o1.setOnItemClickListener(new j(this, 14));
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        bs bsVar = new bs(uj0Var, getContext(), this.f29679a, 0, true, this.J0);
        this.T1 = bsVar;
        bsVar.f38199r = false;
        return bsVar;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.hd.M0(2131745821, null);
    }
}
