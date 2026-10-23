package org.telegram.ui;

import android.content.Intent;
public final class ia1 implements org.telegram.ui.Components.xl0, org.telegram.ui.ActionBar.z1 {
    public final int f38134a;
    public final ThemeActivity f38135b;

    public ia1(ThemeActivity themeActivity, int i10) {
        this.f38134a = i10;
        this.f38135b = themeActivity;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f38134a) {
            case 1:
                ThemeActivity themeActivity = this.f38135b;
                themeActivity.getClass();
                org.telegram.ui.Components.f5.W(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f38135b;
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
        i10 = this.f38135b.sensitiveContentRow;
        return i10;
    }
}
