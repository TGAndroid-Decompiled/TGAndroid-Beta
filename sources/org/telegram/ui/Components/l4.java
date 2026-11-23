package org.telegram.ui.Components;

import android.content.Context;
public final class l4 extends tb0 {
    public final int[] f37055z0;

    public l4(Context context, org.telegram.ui.ActionBar.h6 h6Var, int[] iArr) {
        super(context, h6Var);
        this.f37055z0 = iArr;
    }

    @Override
    public final CharSequence d(int i7) {
        int i10 = this.f37055z0[i7];
        if (i10 == 0) {
            return org.telegram.messenger.hd.N0(2131753846, null);
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
