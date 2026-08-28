package org.telegram.ui.Components;

import android.content.Context;
public abstract class mp extends m2.g {
    public lp f30903s0;

    public mp(Context context) {
        super(context);
        b(new kp((ah0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(m2.a aVar) {
        if (aVar instanceof lp) {
            setAdapter((lp) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(lp lpVar) {
        this.f30903s0 = lpVar;
        super.setAdapter((m2.a) lpVar);
        if (lpVar != null) {
            x(lpVar.j(), false);
        }
    }
}
