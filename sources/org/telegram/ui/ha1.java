package org.telegram.ui;

import android.content.Intent;
public final class ha1 implements org.telegram.ui.Components.wl0, org.telegram.ui.ActionBar.z1 {
    public final int f37799a;
    public final ThemeActivity f37800b;

    public ha1(ThemeActivity themeActivity, int i10) {
        this.f37799a = i10;
        this.f37800b = themeActivity;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f37799a) {
            case 1:
                ThemeActivity themeActivity = this.f37800b;
                themeActivity.getClass();
                org.telegram.ui.Components.d5.V(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f37800b;
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
        i10 = this.f37800b.sensitiveContentRow;
        return i10;
    }
}
