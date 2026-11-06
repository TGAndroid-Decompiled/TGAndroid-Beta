package org.telegram.ui;

import android.content.Context;
public final class lb0 extends yq {
    public final int h;
    public final Object f47477n;

    public lb0(int i7, Context context, Object obj) {
        super(context);
        this.h = i7;
        this.f47477n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((ob0) this.f47477n).h(null);
                return;
            case 1:
                ((hc0) this.f47477n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f47477n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new ef0(this, 3), 260L);
                    return;
                } else {
                    passcodeActivity.u0();
                    return;
                }
            default:
                ((ya1) this.f47477n).H0();
                return;
        }
    }
}
