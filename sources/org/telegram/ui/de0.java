package org.telegram.ui;

import android.content.Context;
public final class de0 extends es {
    public final int h;
    public final Object f35800n;

    public de0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f35800n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((ge0) this.f35800n).h(null);
                return;
            case 1:
                ((af0) this.f35800n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f35800n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new rl0(this, 0), 260L);
                    return;
                } else {
                    passcodeActivity.g0();
                    return;
                }
            default:
                ((hh1) this.f35800n).C0();
                return;
        }
    }
}
