package org.telegram.ui;

import android.content.Intent;
public final class n51 implements org.telegram.ui.Components.yi0, org.telegram.ui.ActionBar.r1 {
    public final int f47937a;
    public final ThemeActivity f47938b;

    public n51(ThemeActivity themeActivity, int i7) {
        this.f47937a = i7;
        this.f47938b = themeActivity;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f47937a) {
            case 1:
                ThemeActivity themeActivity = this.f47938b;
                if (themeActivity.getParentActivity() != null) {
                    try {
                        themeActivity.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                ThemeActivity themeActivity2 = this.f47938b;
                themeActivity2.getClass();
                org.telegram.ui.Components.v4.T(themeActivity2, 0, null, null);
                return;
        }
    }

    @Override
    public int run() {
        int i7;
        i7 = this.f47938b.sensitiveContentRow;
        return i7;
    }
}
