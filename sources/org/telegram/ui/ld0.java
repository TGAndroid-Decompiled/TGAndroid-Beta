package org.telegram.ui;

import android.content.Context;
public final class ld0 extends vr {
    public final int h;
    public final Object f41251n;

    public ld0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f41251n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((od0) this.f41251n).h(null);
                return;
            case 1:
                ((je0) this.f41251n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f41251n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new lj0(this, 2), 260L);
                    return;
                } else {
                    passcodeActivity.q0();
                    return;
                }
            default:
                ((dg1) this.f41251n).D0();
                return;
        }
    }
}
