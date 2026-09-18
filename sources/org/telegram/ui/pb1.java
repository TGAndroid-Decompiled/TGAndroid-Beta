package org.telegram.ui;

import android.content.Intent;
public final class pb1 implements org.telegram.ui.Components.xk0, org.telegram.ui.ActionBar.b2 {
    public final int f36594a;
    public final ThemeActivity f36595b;

    public pb1(ThemeActivity themeActivity, int i10) {
        this.f36594a = i10;
        this.f36595b = themeActivity;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f36594a) {
            case 1:
                ThemeActivity themeActivity = this.f36595b;
                themeActivity.getClass();
                org.telegram.ui.Components.c5.W(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f36595b;
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
        i10 = this.f36595b.sensitiveContentRow;
        return i10;
    }
}
