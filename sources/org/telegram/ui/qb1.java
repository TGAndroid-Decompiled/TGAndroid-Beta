package org.telegram.ui;

import android.content.Intent;
public final class qb1 implements org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.a2 {
    public final int f41120a;
    public final ThemeActivity f41121b;

    public qb1(ThemeActivity themeActivity, int i10) {
        this.f41120a = i10;
        this.f41121b = themeActivity;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41120a) {
            case 1:
                ThemeActivity themeActivity = this.f41121b;
                themeActivity.getClass();
                org.telegram.ui.Components.g5.V(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f41121b;
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
        i10 = this.f41121b.sensitiveContentRow;
        return i10;
    }
}
