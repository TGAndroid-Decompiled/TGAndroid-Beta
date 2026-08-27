package org.telegram.ui;

import android.content.Context;

public final class od0 extends ur {
    public final int h;

    public final Object f41066n;

    public od0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f41066n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((sd0) this.f41066n).h(null);
                break;
            case 1:
                ((me0) this.f41066n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f41066n;
                if (passcodeActivity.A != 0) {
                    passcodeActivity.g0();
                } else {
                    postDelayed(new zk0(this, 0), 260L);
                }
                break;
            default:
                ((zf1) this.f41066n).C0();
                break;
        }
    }
}
