package org.telegram.ui.Components;

import android.content.Context;
public final class h4 extends cb0 {
    public final int[] f34294z0;

    public h4(Context context, org.telegram.ui.ActionBar.e6 e6Var, int[] iArr) {
        super(context, e6Var);
        this.f34294z0 = iArr;
    }

    @Override
    public final CharSequence d(int i3) {
        int i10 = this.f34294z0[i3];
        if (i10 == 0) {
            return org.telegram.messenger.bd.M0(2131748315, null);
        }
        if (i10 < 60) {
            return org.telegram.messenger.bd.G(i10, "Minutes", new Object[0]);
        }
        if (i10 < 1440) {
            return org.telegram.messenger.bd.G(i10 / 60, "Hours", new Object[0]);
        }
        if (i10 < 10080) {
            return org.telegram.messenger.bd.G(i10 / 1440, "Days", new Object[0]);
        }
        if (i10 < 44640) {
            return org.telegram.messenger.bd.G(i10 / 10080, "Weeks", new Object[0]);
        }
        if (i10 < 525600) {
            return org.telegram.messenger.bd.G(i10 / 44640, "Months", new Object[0]);
        }
        return org.telegram.messenger.bd.G(i10 / 525600, "Years", new Object[0]);
    }
}
