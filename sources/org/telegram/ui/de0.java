package org.telegram.ui;

import android.content.Context;
public final class de0 extends fs {
    public final int h;
    public final Object f31891n;

    public de0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f31891n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((ge0) this.f31891n).h(null);
                return;
            case 1:
                ((af0) this.f31891n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f31891n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new ql0(this, 0), 260L);
                    return;
                } else {
                    passcodeActivity.g0();
                    return;
                }
            default:
                ((mh1) this.f31891n).C0();
                return;
        }
    }
}
