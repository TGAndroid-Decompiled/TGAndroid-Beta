package org.telegram.ui;

import android.content.Context;
public final class od0 extends sr {
    public final int h;
    public final Object f40139n;

    public od0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f40139n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((rd0) this.f40139n).h(null);
                return;
            case 1:
                ((me0) this.f40139n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f40139n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new oj0(this, 2), 260L);
                    return;
                } else {
                    passcodeActivity.j0();
                    return;
                }
            default:
                ((bg1) this.f40139n).C0();
                return;
        }
    }
}
