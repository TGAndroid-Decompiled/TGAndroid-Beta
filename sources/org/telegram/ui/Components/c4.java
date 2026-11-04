package org.telegram.ui.Components;

import android.content.Context;
public final class c4 extends cb0 {
    public final int[] f32522z0;

    public c4(Context context, org.telegram.ui.ActionBar.e6 e6Var, int[] iArr) {
        super(context, e6Var);
        this.f32522z0 = iArr;
    }

    @Override
    public final CharSequence d(int i3) {
        int i10 = this.f32522z0[i3];
        if (i10 == 0) {
            return org.telegram.messenger.bd.M0(2131753849, null);
        }
        if (i10 < 10080) {
            return org.telegram.messenger.bd.G(i10 / 1440, "Days", new Object[0]);
        }
        if (i10 < 44640) {
            return org.telegram.messenger.bd.G(i10 / 1440, "Weeks", new Object[0]);
        }
        if (i10 < 525600) {
            return org.telegram.messenger.bd.G(i10 / 10080, "Months", new Object[0]);
        }
        return org.telegram.messenger.bd.G(((i10 * 5) / 31) * 1440, "Years", new Object[0]);
    }
}
