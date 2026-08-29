package org.telegram.ui;

import android.content.Context;
public final class md0 extends sr {
    public final int h;
    public final Object f40528n;

    public md0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f40528n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((pd0) this.f40528n).h(null);
                return;
            case 1:
                ((ie0) this.f40528n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f40528n;
                if (passcodeActivity.A == 0) {
                    postDelayed(new vk0(this, 0), 260L);
                    return;
                } else {
                    passcodeActivity.g0();
                    return;
                }
            default:
                ((cg1) this.f40528n).C0();
                return;
        }
    }
}
