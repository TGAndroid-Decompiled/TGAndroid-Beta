package org.telegram.ui.Components;

import android.content.Context;
public final class tu0 extends sa {
    public ks T1;

    public tu0(Context context) {
        super(context, null, true, false, null);
        O();
        this.f39543z1 = true;
        this.f39542y1 = true;
        Z0();
        ek0 ek0Var = this.f39532o1;
        int i7 = this.f30211u0;
        ek0Var.setPadding(i7, 0, i7, 0);
        this.f39532o1.j(new oa(this, 20));
        this.f39532o1.setOnItemClickListener(new o(this, 14));
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        ks ksVar = new ks(ek0Var, getContext(), this.f30173a, 0, true, this.J0);
        this.T1 = ksVar;
        ksVar.f34062r = false;
        return ksVar;
    }

    @Override
    public final CharSequence P0() {
        return org.telegram.messenger.hd.N0(2131745625, null);
    }
}
