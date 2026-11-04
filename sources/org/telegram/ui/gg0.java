package org.telegram.ui;

import android.content.Context;
public final class gg0 extends bh.d {
    public final int f45657n;

    public gg0(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f45657n = i3;
    }

    @Override
    public final int getHeaderHeight() {
        switch (this.f45657n) {
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
