package org.telegram.ui;

import android.content.Intent;
public final class k51 implements org.telegram.ui.Components.dj0, org.telegram.ui.ActionBar.q1 {
    public final int f48546a;
    public final ThemeActivity f48547b;

    public k51(ThemeActivity themeActivity, int i7) {
        this.f48546a = i7;
        this.f48547b = themeActivity;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f48546a) {
            case 1:
                ThemeActivity themeActivity = this.f48547b;
                if (themeActivity.getParentActivity() != null) {
                    try {
                        themeActivity.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                ThemeActivity themeActivity2 = this.f48547b;
                themeActivity2.getClass();
                org.telegram.ui.Components.t4.T(themeActivity2, 0, null, null);
                return;
        }
    }

    @Override
    public int run() {
        int i7;
        i7 = this.f48547b.sensitiveContentRow;
        return i7;
    }
}
