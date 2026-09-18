package org.telegram.ui;

import android.content.Intent;
public final class ob1 implements org.telegram.ui.Components.hl0, org.telegram.ui.ActionBar.a2 {
    public final int f36161a;
    public final ThemeActivity f36162b;

    public ob1(ThemeActivity themeActivity, int i10) {
        this.f36161a = i10;
        this.f36162b = themeActivity;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36161a) {
            case 1:
                ThemeActivity themeActivity = this.f36162b;
                themeActivity.getClass();
                org.telegram.ui.Components.e5.W(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f36162b;
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
        i10 = this.f36162b.sensitiveContentRow;
        return i10;
    }
}
