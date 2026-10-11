package org.telegram.ui;

import android.content.Intent;
public final class pb1 implements org.telegram.ui.Components.dm0, org.telegram.ui.ActionBar.z1 {
    public final int f40817a;
    public final ThemeActivity f40818b;

    public pb1(ThemeActivity themeActivity, int i10) {
        this.f40817a = i10;
        this.f40818b = themeActivity;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40817a) {
            case 1:
                ThemeActivity themeActivity = this.f40818b;
                themeActivity.getClass();
                org.telegram.ui.Components.g5.V(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f40818b;
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
        i10 = this.f40818b.sensitiveContentRow;
        return i10;
    }
}
