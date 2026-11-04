package org.telegram.ui;

import android.content.Context;
public final class ib0 extends xq {
    public final int h;
    public final Object f46230n;

    public ib0(int i3, Context context, Object obj) {
        super(context);
        this.h = i3;
        this.f46230n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((lb0) this.f46230n).h(null);
                return;
            case 1:
                ((fc0) this.f46230n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f46230n;
                if (passcodeActivity.F == 0) {
                    postDelayed(new sg0(this, 2), 260L);
                    return;
                } else {
                    passcodeActivity.u0();
                    return;
                }
            default:
                ((ra1) this.f46230n).H0();
                return;
        }
    }
}
