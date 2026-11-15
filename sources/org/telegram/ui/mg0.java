package org.telegram.ui;

import android.content.Context;
public final class mg0 extends ah.e {
    public final int f49231n;

    public mg0(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f49231n = i7;
    }

    @Override
    public final int getHeaderHeight() {
        switch (this.f49231n) {
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
