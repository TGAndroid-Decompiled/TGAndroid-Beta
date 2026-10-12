package org.telegram.ui;

import android.content.Context;
public final class de0 extends fs {
    public final int h;
    public final Object f36777n;

    public de0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f36777n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((ge0) this.f36777n).h(null);
                return;
            case 1:
                ((af0) this.f36777n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f36777n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new uk0(this, 1), 260L);
                    return;
                } else {
                    passcodeActivity.j0();
                    return;
                }
            default:
                ((kh1) this.f36777n).C0();
                return;
        }
    }
}
