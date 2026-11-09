package org.telegram.ui;

import android.content.Intent;
public final class o51 implements org.telegram.ui.Components.zi0, org.telegram.ui.ActionBar.r1 {
    public final int f48351a;
    public final ThemeActivity f48352b;

    public o51(ThemeActivity themeActivity, int i7) {
        this.f48351a = i7;
        this.f48352b = themeActivity;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f48351a) {
            case 1:
                ThemeActivity themeActivity = this.f48352b;
                if (themeActivity.getParentActivity() != null) {
                    try {
                        themeActivity.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                ThemeActivity themeActivity2 = this.f48352b;
                themeActivity2.getClass();
                org.telegram.ui.Components.v4.T(themeActivity2, 0, null, null);
                return;
        }
    }

    @Override
    public int run() {
        int i7;
        i7 = this.f48352b.sensitiveContentRow;
        return i7;
    }
}
