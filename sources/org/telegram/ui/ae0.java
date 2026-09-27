package org.telegram.ui;

import android.content.Context;
public final class ae0 extends bs {
    public final int h;
    public final Object f32056n;

    public ae0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f32056n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((de0) this.f32056n).h(null);
                return;
            case 1:
                ((xe0) this.f32056n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f32056n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new ml0(this, 0), 260L);
                    return;
                } else {
                    passcodeActivity.g0();
                    return;
                }
            default:
                ((zg1) this.f32056n).C0();
                return;
        }
    }
}
