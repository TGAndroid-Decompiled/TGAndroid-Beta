package org.telegram.ui;

import android.content.Context;
public final class lb0 extends ar {
    public final int h;
    public final Object f48965n;

    public lb0(int i7, Context context, Object obj) {
        super(context);
        this.h = i7;
        this.f48965n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((ob0) this.f48965n).h(null);
                return;
            case 1:
                ((gc0) this.f48965n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f48965n;
                if (passcodeActivity.F == 0) {
                    postDelayed(new ef0(this, 3), 260L);
                    return;
                } else {
                    passcodeActivity.u0();
                    return;
                }
            default:
                ((xa1) this.f48965n).H0();
                return;
        }
    }
}
