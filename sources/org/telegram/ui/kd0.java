package org.telegram.ui;

import android.content.Context;
public final class kd0 extends sr {
    public final int h;
    public final Object f38473n;

    public kd0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f38473n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((od0) this.f38473n).h(null);
                return;
            case 1:
                ((ie0) this.f38473n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f38473n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new ek0(this, 1), 260L);
                    return;
                } else {
                    passcodeActivity.j0();
                    return;
                }
            default:
                ((xf1) this.f38473n).C0();
                return;
        }
    }
}
