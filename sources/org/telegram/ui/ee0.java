package org.telegram.ui;

import android.content.Context;
public final class ee0 extends ds {
    public final int h;
    public final Object f33267n;

    public ee0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f33267n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((he0) this.f33267n).h(null);
                return;
            case 1:
                ((bf0) this.f33267n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f33267n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new sl0(this, 0), 260L);
                    return;
                } else {
                    passcodeActivity.g0();
                    return;
                }
            default:
                ((gh1) this.f33267n).C0();
                return;
        }
    }
}
