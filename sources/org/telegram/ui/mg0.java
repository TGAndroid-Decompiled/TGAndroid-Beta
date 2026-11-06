package org.telegram.ui;

import android.content.Context;
public final class mg0 extends ah.e {
    public final int f47780n;

    public mg0(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f47780n = i7;
    }

    @Override
    public final int getHeaderHeight() {
        switch (this.f47780n) {
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
