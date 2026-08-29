package org.telegram.ui;

import android.content.Intent;
public final class ha1 implements org.telegram.ui.Components.wk0, org.telegram.ui.ActionBar.b2 {
    public final int f38838a;
    public final ThemeActivity f38839b;

    public ha1(ThemeActivity themeActivity, int i10) {
        this.f38838a = i10;
        this.f38839b = themeActivity;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f38838a) {
            case 1:
                ThemeActivity themeActivity = this.f38839b;
                themeActivity.getClass();
                org.telegram.ui.Components.c5.W(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f38839b;
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
        i10 = this.f38839b.sensitiveContentRow;
        return i10;
    }
}
