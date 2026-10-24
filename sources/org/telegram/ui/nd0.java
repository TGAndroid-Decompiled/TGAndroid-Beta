package org.telegram.ui;

import android.content.Context;
public final class nd0 extends sr {
    public final int h;
    public final Object f39806n;

    public nd0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f39806n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((qd0) this.f39806n).h(null);
                return;
            case 1:
                ((le0) this.f39806n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f39806n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new nj0(this, 2), 260L);
                    return;
                } else {
                    passcodeActivity.j0();
                    return;
                }
            default:
                ((ag1) this.f39806n).C0();
                return;
        }
    }
}
