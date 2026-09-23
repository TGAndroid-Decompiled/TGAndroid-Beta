package org.telegram.ui;

import android.content.Intent;
public final class gb1 implements org.telegram.ui.Components.xk0, org.telegram.ui.ActionBar.a2 {
    public final int f33509a;
    public final ThemeActivity f33510b;

    public gb1(ThemeActivity themeActivity, int i10) {
        this.f33509a = i10;
        this.f33510b = themeActivity;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f33509a) {
            case 1:
                ThemeActivity themeActivity = this.f33510b;
                themeActivity.getClass();
                org.telegram.ui.Components.e5.W(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f33510b;
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
        i10 = this.f33510b.sensitiveContentRow;
        return i10;
    }
}
