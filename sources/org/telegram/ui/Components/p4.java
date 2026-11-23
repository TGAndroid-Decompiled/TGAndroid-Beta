package org.telegram.ui.Components;

import android.content.Context;
public final class p4 extends qb0 {
    public final int[] f38381z0;

    public p4(Context context, org.telegram.ui.ActionBar.i6 i6Var, int[] iArr) {
        super(context, i6Var);
        this.f38381z0 = iArr;
    }

    @Override
    public final CharSequence d(int i7) {
        int i10 = this.f38381z0[i7];
        if (i10 == 0) {
            return org.telegram.messenger.gd.N0(2131748114, null);
        }
        if (i10 < 60) {
            return org.telegram.messenger.gd.G(i10, "Minutes", new Object[0]);
        }
        if (i10 < 1440) {
            return org.telegram.messenger.gd.G(i10 / 60, "Hours", new Object[0]);
        }
        if (i10 < 10080) {
            return org.telegram.messenger.gd.G(i10 / 1440, "Days", new Object[0]);
        }
        if (i10 < 44640) {
            return org.telegram.messenger.gd.G(i10 / 10080, "Weeks", new Object[0]);
        }
        if (i10 < 525600) {
            return org.telegram.messenger.gd.G(i10 / 44640, "Months", new Object[0]);
        }
        return org.telegram.messenger.gd.G(i10 / 525600, "Years", new Object[0]);
    }
}
