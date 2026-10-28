package org.telegram.ui;

import android.content.Intent;
public final class ma1 implements org.telegram.ui.Components.xl0, org.telegram.ui.ActionBar.b2 {
    public final int f41404a;
    public final ThemeActivity f41405b;

    public ma1(ThemeActivity themeActivity, int i10) {
        this.f41404a = i10;
        this.f41405b = themeActivity;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f41404a) {
            case 1:
                ThemeActivity themeActivity = this.f41405b;
                themeActivity.getClass();
                org.telegram.ui.Components.g5.V(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f41405b;
                if (themeActivity2.getParentActivity() != null) {
                    try {
                        themeActivity2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public int run() {
        int i10;
        i10 = this.f41405b.sensitiveContentRow;
        return i10;
    }
}
