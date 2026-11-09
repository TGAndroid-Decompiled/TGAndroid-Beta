package org.telegram.ui.Components;

import android.content.Context;
public final class e4 extends ib0 {
    public final int[] f33285y0;

    public e4(Context context, org.telegram.ui.ActionBar.g6 g6Var, int[] iArr) {
        super(context, g6Var);
        this.f33285y0 = iArr;
    }

    @Override
    public final CharSequence d(int i7) {
        int i10 = this.f33285y0[i7];
        if (i10 == 0) {
            return org.telegram.messenger.id.M0(2131753849, null);
        }
        if (i10 < 10080) {
            return org.telegram.messenger.id.G(i10 / 1440, "Days", new Object[0]);
        }
        if (i10 < 44640) {
            return org.telegram.messenger.id.G(i10 / 1440, "Weeks", new Object[0]);
        }
        if (i10 < 525600) {
            return org.telegram.messenger.id.G(i10 / 10080, "Months", new Object[0]);
        }
        return org.telegram.messenger.id.G(((i10 * 5) / 31) * 1440, "Years", new Object[0]);
    }
}
