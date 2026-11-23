package org.telegram.ui.Components;

import android.content.Context;
public final class k4 extends qb0 {
    public final int[] f36641z0;

    public k4(Context context, org.telegram.ui.ActionBar.i6 i6Var, int[] iArr) {
        super(context, i6Var);
        this.f36641z0 = iArr;
    }

    @Override
    public final CharSequence d(int i7) {
        int i10 = this.f36641z0[i7];
        if (i10 == 0) {
            return org.telegram.messenger.gd.N0(2131753846, null);
        }
        if (i10 < 10080) {
            return org.telegram.messenger.gd.G(i10 / 1440, "Days", new Object[0]);
        }
        if (i10 < 44640) {
            return org.telegram.messenger.gd.G(i10 / 1440, "Weeks", new Object[0]);
        }
        if (i10 < 525600) {
            return org.telegram.messenger.gd.G(i10 / 10080, "Months", new Object[0]);
        }
        return org.telegram.messenger.gd.G(((i10 * 5) / 31) * 1440, "Years", new Object[0]);
    }
}
