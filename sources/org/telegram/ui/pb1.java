package org.telegram.ui;

import android.content.Intent;
public final class pb1 implements org.telegram.ui.Components.wk0, org.telegram.ui.ActionBar.a2 {
    public final int f39466a;
    public final ThemeActivity f39467b;

    public pb1(ThemeActivity themeActivity, int i10) {
        this.f39466a = i10;
        this.f39467b = themeActivity;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39466a) {
            case 1:
                ThemeActivity themeActivity = this.f39467b;
                themeActivity.getClass();
                org.telegram.ui.Components.e5.W(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f39467b;
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
        i10 = this.f39467b.sensitiveContentRow;
        return i10;
    }
}
