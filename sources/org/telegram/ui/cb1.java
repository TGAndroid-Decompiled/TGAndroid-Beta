package org.telegram.ui;

import android.content.Intent;
public final class cb1 implements org.telegram.ui.Components.el0, org.telegram.ui.ActionBar.c2 {
    public final int f33068a;
    public final ThemeActivity f33069b;

    public cb1(ThemeActivity themeActivity, int i10) {
        this.f33068a = i10;
        this.f33069b = themeActivity;
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f33068a) {
            case 1:
                ThemeActivity themeActivity = this.f33069b;
                themeActivity.getClass();
                org.telegram.ui.Components.z4.W(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f33069b;
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
        i10 = this.f33069b.sensitiveContentRow;
        return i10;
    }
}
