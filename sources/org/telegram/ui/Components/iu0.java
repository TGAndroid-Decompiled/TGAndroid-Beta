package org.telegram.ui.Components;

import android.content.Context;
public final class iu0 extends ma {
    public ur S1;

    public iu0(Context context) {
        super(context, null, true, false, null);
        N();
        this.f35912y1 = true;
        this.f35911x1 = true;
        Y0();
        pj0 pj0Var = this.n1;
        int i7 = this.f28705t0;
        pj0Var.setPadding(i7, 0, i7, 0);
        this.n1.j(new ti(this, 17));
        this.n1.setOnItemClickListener(new j(this, 14));
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        ur urVar = new ur(pj0Var, getContext(), this.f28669a, 0, true, this.I0);
        this.S1 = urVar;
        urVar.f35845r = false;
        return urVar;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.id.M0(2131745821, null);
    }
}
