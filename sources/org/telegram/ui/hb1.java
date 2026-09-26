package org.telegram.ui;

import android.content.Intent;
public final class hb1 implements org.telegram.ui.Components.il0, org.telegram.ui.ActionBar.z1 {
    public final int f34181a;
    public final ThemeActivity f34182b;

    public hb1(ThemeActivity themeActivity, int i10) {
        this.f34181a = i10;
        this.f34182b = themeActivity;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f34181a) {
            case 1:
                ThemeActivity themeActivity = this.f34182b;
                themeActivity.getClass();
                org.telegram.ui.Components.e5.W(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f34182b;
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
        i10 = this.f34182b.sensitiveContentRow;
        return i10;
    }
}
