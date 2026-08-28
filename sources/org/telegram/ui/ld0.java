package org.telegram.ui;

import android.content.Context;
public final class ld0 extends sr {
    public final int h;
    public final Object f40113n;

    public ld0(Object obj, Context context, int i9) {
        super(context);
        this.h = i9;
        this.f40113n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((pd0) this.f40113n).h(null);
                return;
            case 1:
                ((je0) this.f40113n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f40113n;
                if (passcodeActivity.A == 0) {
                    postDelayed(new zk0(this, 0), 260L);
                    return;
                } else {
                    passcodeActivity.f0();
                    return;
                }
            default:
                ((ag1) this.f40113n).B0();
                return;
        }
    }
}
