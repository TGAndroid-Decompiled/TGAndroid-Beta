package org.telegram.ui.Components;

import android.content.Context;
public final class gu0 extends ma {
    public vr Q1;

    public gu0(Context context) {
        super(context, null, true, false, null);
        N();
        this.f36112w1 = true;
        this.f36111v1 = true;
        Y0();
        tj0 tj0Var = this.f36102l1;
        int i3 = this.f28618u0;
        tj0Var.setPadding(i3, 0, i3, 0);
        this.f36102l1.j(new ji(this, 19));
        this.f36102l1.setOnItemClickListener(new k(this, 14));
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        vr vrVar = new vr(tj0Var, getContext(), this.f28583a, 0, true, this.J0);
        this.Q1 = vrVar;
        vrVar.f33698r = false;
        return vrVar;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.bd.M0(2131745831, null);
    }
}
