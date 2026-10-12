package org.telegram.ui;

import android.content.Context;
public final class ie0 extends hs {
    public final int h;
    public final Object f37103n;

    public ie0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f37103n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((le0) this.f37103n).h(null);
                return;
            case 1:
                ((ff0) this.f37103n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37103n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new yk0(this, 1), 260L);
                    return;
                } else {
                    passcodeActivity.j0();
                    return;
                }
            default:
                ((oh1) this.f37103n).C0();
                return;
        }
    }
}
