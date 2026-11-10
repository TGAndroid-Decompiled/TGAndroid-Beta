package org.telegram.ui;

import android.content.Intent;
public final class p51 implements org.telegram.ui.Components.yi0, org.telegram.ui.ActionBar.r1 {
    public final int f48668a;
    public final ThemeActivity f48669b;

    public p51(ThemeActivity themeActivity, int i7) {
        this.f48668a = i7;
        this.f48669b = themeActivity;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f48668a) {
            case 1:
                ThemeActivity themeActivity = this.f48669b;
                if (themeActivity.getParentActivity() != null) {
                    try {
                        themeActivity.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                ThemeActivity themeActivity2 = this.f48669b;
                themeActivity2.getClass();
                org.telegram.ui.Components.u4.T(themeActivity2, 0, null, null);
                return;
        }
    }

    @Override
    public int run() {
        int i7;
        i7 = this.f48669b.sensitiveContentRow;
        return i7;
    }
}
