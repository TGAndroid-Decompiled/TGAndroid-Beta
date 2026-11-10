package org.telegram.ui;

import android.content.Context;
public final class pg0 extends ah.e {
    public final int f48769n;

    public pg0(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.f48769n = i7;
    }

    @Override
    public final int getHeaderHeight() {
        switch (this.f48769n) {
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
