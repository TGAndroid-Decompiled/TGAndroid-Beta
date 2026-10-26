package org.telegram.ui;

import android.content.Intent;
public final class ka1 implements org.telegram.ui.Components.wl0, org.telegram.ui.ActionBar.b2 {
    public final int f40872a;
    public final ThemeActivity f40873b;

    public ka1(ThemeActivity themeActivity, int i10) {
        this.f40872a = i10;
        this.f40873b = themeActivity;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f40872a) {
            case 1:
                ThemeActivity themeActivity = this.f40873b;
                themeActivity.getClass();
                org.telegram.ui.Components.g5.V(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f40873b;
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
        i10 = this.f40873b.sensitiveContentRow;
        return i10;
    }
}
