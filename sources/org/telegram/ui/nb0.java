package org.telegram.ui;

import android.content.Context;
public final class nb0 extends ar {
    public final int h;
    public final Object f48151n;

    public nb0(int i7, Context context, Object obj) {
        super(context);
        this.h = i7;
        this.f48151n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((qb0) this.f48151n).h(null);
                return;
            case 1:
                ((jc0) this.f48151n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f48151n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new gf0(this, 3), 260L);
                    return;
                } else {
                    passcodeActivity.u0();
                    return;
                }
            default:
                ((bb1) this.f48151n).H0();
                return;
        }
    }
}
