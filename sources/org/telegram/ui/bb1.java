package org.telegram.ui;

import android.content.Intent;
public final class bb1 implements org.telegram.ui.Components.fl0, org.telegram.ui.ActionBar.c2 {
    public final int f35429a;
    public final ThemeActivity f35430b;

    public bb1(ThemeActivity themeActivity, int i10) {
        this.f35429a = i10;
        this.f35430b = themeActivity;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f35429a) {
            case 1:
                ThemeActivity themeActivity = this.f35430b;
                themeActivity.getClass();
                org.telegram.ui.Components.z4.W(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f35430b;
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
        i10 = this.f35430b.sensitiveContentRow;
        return i10;
    }
}
