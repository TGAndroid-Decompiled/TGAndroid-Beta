package org.telegram.ui;

import android.content.Context;
public final class be0 extends bs {
    public final int h;
    public final Object f36350n;

    public be0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f36350n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((ee0) this.f36350n).h(null);
                return;
            case 1:
                ((ye0) this.f36350n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f36350n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new sk0(this, 1), 260L);
                    return;
                } else {
                    passcodeActivity.j0();
                    return;
                }
            default:
                ((hh1) this.f36350n).C0();
                return;
        }
    }
}
