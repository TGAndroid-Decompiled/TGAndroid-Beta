package org.telegram.ui;

import android.content.Intent;
public final class n51 implements org.telegram.ui.Components.lj0, org.telegram.ui.ActionBar.r1 {
    public final int f50068a;
    public final ThemeActivity f50069b;

    public n51(ThemeActivity themeActivity, int i7) {
        this.f50068a = i7;
        this.f50069b = themeActivity;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f50068a) {
            case 1:
                ThemeActivity themeActivity = this.f50069b;
                if (themeActivity.getParentActivity() != null) {
                    try {
                        themeActivity.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                ThemeActivity themeActivity2 = this.f50069b;
                themeActivity2.getClass();
                org.telegram.ui.Components.b5.T(themeActivity2, 0, null, null);
                return;
        }
    }

    @Override
    public int run() {
        int i7;
        i7 = this.f50069b.sensitiveContentRow;
        return i7;
    }
}
