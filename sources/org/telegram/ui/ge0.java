package org.telegram.ui;

import android.content.Context;
public final class ge0 extends hs {
    public final int h;
    public final Object f36174n;

    public ge0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f36174n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((je0) this.f36174n).h(null);
                return;
            case 1:
                ((ef0) this.f36174n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f36174n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new xk0(this, 1), 260L);
                    return;
                } else {
                    passcodeActivity.j0();
                    return;
                }
            default:
                ((oh1) this.f36174n).C0();
                return;
        }
    }
}
