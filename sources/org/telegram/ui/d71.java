package org.telegram.ui;

import android.content.Intent;
public final class d71 implements org.telegram.ui.Components.ek0, org.telegram.ui.ActionBar.u1 {
    public final int f36520a;
    public final ThemeActivity f36521b;

    public d71(ThemeActivity themeActivity, int i10) {
        this.f36520a = i10;
        this.f36521b = themeActivity;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f36520a) {
            case 1:
                ThemeActivity themeActivity = this.f36521b;
                if (themeActivity.getParentActivity() != null) {
                    try {
                        themeActivity.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                ThemeActivity themeActivity2 = this.f36521b;
                themeActivity2.getClass();
                org.telegram.ui.Components.s4.V(themeActivity2, 0, null, null);
                return;
        }
    }

    @Override
    public int run() {
        int i10;
        i10 = this.f36521b.sensitiveContentRow;
        return i10;
    }
}
