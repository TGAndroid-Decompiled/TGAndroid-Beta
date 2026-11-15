package org.telegram.ui.Components;

import android.content.Context;
public final class c4 extends ib0 {
    public final int[] f33500z0;

    public c4(Context context, org.telegram.ui.ActionBar.e6 e6Var, int[] iArr) {
        super(context, e6Var);
        this.f33500z0 = iArr;
    }

    @Override
    public final CharSequence d(int i7) {
        int i10 = this.f33500z0[i7];
        if (i10 == 0) {
            return org.telegram.messenger.hd.M0(2131753849, null);
        }
        if (i10 < 10080) {
            return org.telegram.messenger.hd.G(i10 / 1440, "Days", new Object[0]);
        }
        if (i10 < 44640) {
            return org.telegram.messenger.hd.G(i10 / 1440, "Weeks", new Object[0]);
        }
        if (i10 < 525600) {
            return org.telegram.messenger.hd.G(i10 / 10080, "Months", new Object[0]);
        }
        return org.telegram.messenger.hd.G(((i10 * 5) / 31) * 1440, "Years", new Object[0]);
    }
}
