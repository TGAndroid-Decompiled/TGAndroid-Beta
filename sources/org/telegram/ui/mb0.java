package org.telegram.ui;

import android.content.Context;
public final class mb0 extends br {
    public final int h;
    public final Object f49837n;

    public mb0(int i7, Context context, Object obj) {
        super(context);
        this.h = i7;
        this.f49837n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((pb0) this.f49837n).h(null);
                return;
            case 1:
                ((hc0) this.f49837n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f49837n;
                if (passcodeActivity.F == 0) {
                    postDelayed(new hf0(this, 3), 260L);
                    return;
                } else {
                    passcodeActivity.u0();
                    return;
                }
            default:
                ((bb1) this.f49837n).H0();
                return;
        }
    }
}
