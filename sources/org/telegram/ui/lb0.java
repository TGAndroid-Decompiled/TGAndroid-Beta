package org.telegram.ui;

import android.content.Context;
public final class lb0 extends br {
    public final int h;
    public final Object f49562n;

    public lb0(int i7, Context context, Object obj) {
        super(context);
        this.h = i7;
        this.f49562n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((ob0) this.f49562n).h(null);
                return;
            case 1:
                ((gc0) this.f49562n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f49562n;
                if (passcodeActivity.F == 0) {
                    postDelayed(new hf0(this, 3), 260L);
                    return;
                } else {
                    passcodeActivity.u0();
                    return;
                }
            default:
                ((bb1) this.f49562n).H0();
                return;
        }
    }
}
