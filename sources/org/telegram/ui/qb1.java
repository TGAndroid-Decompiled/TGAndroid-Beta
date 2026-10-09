package org.telegram.ui;

import android.content.Intent;
public final class qb1 implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.a2 {
    public final int f41074a;
    public final ThemeActivity f41075b;

    public qb1(ThemeActivity themeActivity, int i10) {
        this.f41074a = i10;
        this.f41075b = themeActivity;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41074a) {
            case 1:
                ThemeActivity themeActivity = this.f41075b;
                themeActivity.getClass();
                org.telegram.ui.Components.g5.V(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f41075b;
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
        i10 = this.f41075b.sensitiveContentRow;
        return i10;
    }
}
