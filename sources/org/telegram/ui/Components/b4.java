package org.telegram.ui.Components;

import android.content.Context;
public final class b4 extends ac0 {
    public final int[] f24617y0;

    public b4(Context context, org.telegram.ui.ActionBar.p6 p6Var, int[] iArr) {
        super(context, p6Var);
        this.f24617y0 = iArr;
    }

    @Override
    public final CharSequence d(int i10) {
        int i11 = this.f24617y0[i10];
        if (i11 == 0) {
            return org.telegram.messenger.dd.L0(2131753849, null);
        }
        if (i11 < 10080) {
            return org.telegram.messenger.dd.G(i11 / 1440, "Days", new Object[0]);
        }
        if (i11 < 44640) {
            return org.telegram.messenger.dd.G(i11 / 1440, "Weeks", new Object[0]);
        }
        if (i11 < 525600) {
            return org.telegram.messenger.dd.G(i11 / 10080, "Months", new Object[0]);
        }
        return org.telegram.messenger.dd.G(((i11 * 5) / 31) * 1440, "Years", new Object[0]);
    }
}
