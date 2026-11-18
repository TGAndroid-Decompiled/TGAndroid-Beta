package org.telegram.ui;

import android.content.Context;
public final class qg0 extends ah.e {
    public final int f51266n;

    public qg0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.f51266n = i7;
    }

    @Override
    public final int getHeaderHeight() {
        switch (this.f51266n) {
            case 0:
                if (getResources().getConfiguration().orientation == 2) {
                    return org.telegram.messenger.g0.L(48.0f);
                }
                return org.telegram.messenger.g0.L(54.0f);
            default:
                if (getResources().getConfiguration().orientation == 2) {
                    return org.telegram.messenger.g0.L(48.0f);
                }
                return org.telegram.messenger.g0.L(54.0f);
        }
    }
}
