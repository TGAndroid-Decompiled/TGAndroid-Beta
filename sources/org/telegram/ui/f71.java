package org.telegram.ui;

import android.content.Intent;
public final class f71 implements org.telegram.ui.Components.dk0, org.telegram.ui.ActionBar.u1 {
    public final int f37192a;
    public final ThemeActivity f37193b;

    public f71(ThemeActivity themeActivity, int i10) {
        this.f37192a = i10;
        this.f37193b = themeActivity;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f37192a) {
            case 1:
                ThemeActivity themeActivity = this.f37193b;
                if (themeActivity.getParentActivity() != null) {
                    try {
                        themeActivity.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                ThemeActivity themeActivity2 = this.f37193b;
                themeActivity2.getClass();
                org.telegram.ui.Components.s4.V(themeActivity2, 0, null, null);
                return;
        }
    }

    @Override
    public int run() {
        int i10;
        i10 = this.f37193b.sensitiveContentRow;
        return i10;
    }
}
