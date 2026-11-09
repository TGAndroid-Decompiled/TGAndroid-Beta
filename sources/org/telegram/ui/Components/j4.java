package org.telegram.ui.Components;

import android.content.Context;
public final class j4 extends ib0 {
    public final int[] f34924y0;

    public j4(Context context, org.telegram.ui.ActionBar.g6 g6Var, int[] iArr) {
        super(context, g6Var);
        this.f34924y0 = iArr;
    }

    @Override
    public final CharSequence d(int i7) {
        int i10 = this.f34924y0[i7];
        if (i10 == 0) {
            return org.telegram.messenger.id.M0(2131748307, null);
        }
        if (i10 < 60) {
            return org.telegram.messenger.id.G(i10, "Minutes", new Object[0]);
        }
        if (i10 < 1440) {
            return org.telegram.messenger.id.G(i10 / 60, "Hours", new Object[0]);
        }
        if (i10 < 10080) {
            return org.telegram.messenger.id.G(i10 / 1440, "Days", new Object[0]);
        }
        if (i10 < 44640) {
            return org.telegram.messenger.id.G(i10 / 10080, "Weeks", new Object[0]);
        }
        if (i10 < 525600) {
            return org.telegram.messenger.id.G(i10 / 44640, "Months", new Object[0]);
        }
        return org.telegram.messenger.id.G(i10 / 525600, "Years", new Object[0]);
    }
}
