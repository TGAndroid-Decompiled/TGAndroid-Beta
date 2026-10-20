package org.telegram.ui;

import android.content.Context;
public final class id0 extends qr {
    public final int h;
    public final Object f37925n;

    public id0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f37925n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((md0) this.f37925n).h(null);
                return;
            case 1:
                ((ge0) this.f37925n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37925n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new ck0(this, 1), 260L);
                    return;
                } else {
                    passcodeActivity.j0();
                    return;
                }
            default:
                ((vf1) this.f37925n).C0();
                return;
        }
    }
}
