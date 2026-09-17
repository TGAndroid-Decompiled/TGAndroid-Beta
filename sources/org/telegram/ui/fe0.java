package org.telegram.ui;

import android.content.Context;
public final class fe0 extends fs {
    public final int h;
    public final Object f33624n;

    public fe0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f33624n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((ie0) this.f33624n).h(null);
                return;
            case 1:
                ((cf0) this.f33624n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f33624n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new sl0(this, 0), 260L);
                    return;
                } else {
                    passcodeActivity.g0();
                    return;
                }
            default:
                ((ih1) this.f33624n).C0();
                return;
        }
    }
}
