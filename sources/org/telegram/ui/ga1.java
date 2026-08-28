package org.telegram.ui;

import android.content.Intent;
public final class ga1 implements org.telegram.ui.Components.jk0, org.telegram.ui.ActionBar.b2 {
    public final int f38494a;
    public final ThemeActivity f38495b;

    public ga1(ThemeActivity themeActivity, int i9) {
        this.f38494a = i9;
        this.f38495b = themeActivity;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f38494a) {
            case 1:
                ThemeActivity themeActivity = this.f38495b;
                themeActivity.getClass();
                org.telegram.ui.Components.y4.W(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f38495b;
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
        int i9;
        i9 = this.f38495b.sensitiveContentRow;
        return i9;
    }
}
