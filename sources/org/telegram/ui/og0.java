package org.telegram.ui;

import android.content.Context;
public final class og0 extends ah.e {
    public final int f48447n;

    public og0(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.f48447n = i7;
    }

    @Override
    public final int getHeaderHeight() {
        switch (this.f48447n) {
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
