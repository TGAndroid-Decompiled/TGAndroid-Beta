package org.telegram.ui;

import android.content.Intent;
public final class n51 implements org.telegram.ui.Components.nj0, org.telegram.ui.ActionBar.q1 {
    public final int f50087a;
    public final ThemeActivity f50088b;

    public n51(ThemeActivity themeActivity, int i7) {
        this.f50087a = i7;
        this.f50088b = themeActivity;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f50087a) {
            case 1:
                ThemeActivity themeActivity = this.f50088b;
                if (themeActivity.getParentActivity() != null) {
                    try {
                        themeActivity.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                ThemeActivity themeActivity2 = this.f50088b;
                themeActivity2.getClass();
                org.telegram.ui.Components.c5.T(themeActivity2, 0, null, null);
                return;
        }
    }

    @Override
    public int run() {
        int i7;
        i7 = this.f50088b.sensitiveContentRow;
        return i7;
    }
}
