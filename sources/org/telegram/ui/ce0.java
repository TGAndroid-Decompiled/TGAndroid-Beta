package org.telegram.ui;

import android.content.Context;
public final class ce0 extends cs {
    public final int h;
    public final Object f36631n;

    public ce0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f36631n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((fe0) this.f36631n).h(null);
                return;
            case 1:
                ((ze0) this.f36631n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f36631n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new tk0(this, 1), 260L);
                    return;
                } else {
                    passcodeActivity.j0();
                    return;
                }
            default:
                ((ih1) this.f36631n).C0();
                return;
        }
    }
}
