package org.telegram.ui;

import android.content.Context;
public final class ob0 extends br {
    public final int h;
    public final Object f48489n;

    public ob0(int i7, Context context, Object obj) {
        super(context);
        this.h = i7;
        this.f48489n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((rb0) this.f48489n).h(null);
                return;
            case 1:
                ((kc0) this.f48489n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f48489n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new hf0(this, 3), 260L);
                    return;
                } else {
                    passcodeActivity.u0();
                    return;
                }
            default:
                ((cb1) this.f48489n).H0();
                return;
        }
    }
}
