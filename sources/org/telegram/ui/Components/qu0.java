package org.telegram.ui.Components;

import android.content.Context;
public final class qu0 extends sa {
    public is T1;

    public qu0(Context context) {
        super(context, null, true, false, null);
        O();
        this.f39545z1 = true;
        this.f39544y1 = true;
        Z0();
        ck0 ck0Var = this.f39534o1;
        int i7 = this.f30227u0;
        ck0Var.setPadding(i7, 0, i7, 0);
        this.f39534o1.j(new oa(this, 20));
        this.f39534o1.setOnItemClickListener(new n(this, 14));
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        is isVar = new is(ck0Var, getContext(), this.f30189a, 0, true, this.J0);
        this.T1 = isVar;
        isVar.f42809r = false;
        return isVar;
    }

    @Override
    public final CharSequence P0() {
        return org.telegram.messenger.gd.M0(2131745626, null);
    }
}
