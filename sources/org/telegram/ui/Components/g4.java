package org.telegram.ui.Components;

import android.content.Context;
public final class g4 extends ac0 {
    public final int[] f26316y0;

    public g4(Context context, org.telegram.ui.ActionBar.p6 p6Var, int[] iArr) {
        super(context, p6Var);
        this.f26316y0 = iArr;
    }

    @Override
    public final CharSequence d(int i10) {
        int i11 = this.f26316y0[i10];
        if (i11 == 0) {
            return org.telegram.messenger.dd.L0(2131748322, null);
        }
        if (i11 < 60) {
            return org.telegram.messenger.dd.G(i11, "Minutes", new Object[0]);
        }
        if (i11 < 1440) {
            return org.telegram.messenger.dd.G(i11 / 60, "Hours", new Object[0]);
        }
        if (i11 < 10080) {
            return org.telegram.messenger.dd.G(i11 / 1440, "Days", new Object[0]);
        }
        if (i11 < 44640) {
            return org.telegram.messenger.dd.G(i11 / 10080, "Weeks", new Object[0]);
        }
        if (i11 < 525600) {
            return org.telegram.messenger.dd.G(i11 / 44640, "Months", new Object[0]);
        }
        return org.telegram.messenger.dd.G(i11 / 525600, "Years", new Object[0]);
    }
}
