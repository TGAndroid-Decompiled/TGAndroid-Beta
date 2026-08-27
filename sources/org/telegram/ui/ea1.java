package org.telegram.ui;

import android.content.Intent;

public final class ea1 implements org.telegram.ui.Components.mk0, org.telegram.ui.ActionBar.a2 {

    public final int f37722a;

    public final ThemeActivity f37723b;

    public ea1(ThemeActivity themeActivity, int i10) {
        this.f37722a = i10;
        this.f37723b = themeActivity;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37722a) {
            case 1:
                ThemeActivity themeActivity = this.f37723b;
                themeActivity.getClass();
                org.telegram.ui.Components.y4.W(themeActivity, 0, null, null);
                break;
            default:
                ThemeActivity themeActivity2 = this.f37723b;
                if (themeActivity2.getParentActivity() != null) {
                    try {
                        themeActivity2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
        }
    }

    @Override
    public int run() {
        return this.f37723b.sensitiveContentRow;
    }
}
