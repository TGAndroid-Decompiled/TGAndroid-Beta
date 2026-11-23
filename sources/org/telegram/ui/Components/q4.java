package org.telegram.ui.Components;

import android.content.Context;
public final class q4 extends tb0 {
    public final int[] f38780z0;

    public q4(Context context, org.telegram.ui.ActionBar.h6 h6Var, int[] iArr) {
        super(context, h6Var);
        this.f38780z0 = iArr;
    }

    @Override
    public final CharSequence d(int i7) {
        int i10 = this.f38780z0[i7];
        if (i10 == 0) {
            return org.telegram.messenger.hd.N0(2131748114, null);
        }
        if (i10 < 60) {
            return org.telegram.messenger.hd.G(i10, "Minutes", new Object[0]);
        }
        if (i10 < 1440) {
            return org.telegram.messenger.hd.G(i10 / 60, "Hours", new Object[0]);
        }
        if (i10 < 10080) {
            return org.telegram.messenger.hd.G(i10 / 1440, "Days", new Object[0]);
        }
        if (i10 < 44640) {
            return org.telegram.messenger.hd.G(i10 / 10080, "Weeks", new Object[0]);
        }
        if (i10 < 525600) {
            return org.telegram.messenger.hd.G(i10 / 44640, "Months", new Object[0]);
        }
        return org.telegram.messenger.hd.G(i10 / 525600, "Years", new Object[0]);
    }
}
