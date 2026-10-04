package org.telegram.ui;

import android.content.Context;
public final class be0 extends cs {
    public final int h;
    public final Object f35063n;

    public be0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f35063n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((ee0) this.f35063n).h(null);
                return;
            case 1:
                ((ye0) this.f35063n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f35063n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new nl0(this, 0), 260L);
                    return;
                } else {
                    passcodeActivity.g0();
                    return;
                }
            default:
                ((bh1) this.f35063n).C0();
                return;
        }
    }
}
