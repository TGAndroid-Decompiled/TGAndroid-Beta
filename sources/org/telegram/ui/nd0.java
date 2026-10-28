package org.telegram.ui;

import android.content.Context;
public final class nd0 extends xr {
    public final int h;
    public final Object f41777n;

    public nd0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f41777n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((qd0) this.f41777n).h(null);
                return;
            case 1:
                ((le0) this.f41777n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f41777n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new nj0(this, 2), 260L);
                    return;
                } else {
                    passcodeActivity.q0();
                    return;
                }
            default:
                ((fg1) this.f41777n).D0();
                return;
        }
    }
}
