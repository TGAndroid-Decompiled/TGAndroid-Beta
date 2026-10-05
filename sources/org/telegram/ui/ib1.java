package org.telegram.ui;

import android.content.Intent;
public final class ib1 implements org.telegram.ui.Components.jl0, org.telegram.ui.ActionBar.a2 {
    public final int f37375a;
    public final ThemeActivity f37376b;

    public ib1(ThemeActivity themeActivity, int i10) {
        this.f37375a = i10;
        this.f37376b = themeActivity;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37375a) {
            case 1:
                ThemeActivity themeActivity = this.f37376b;
                themeActivity.getClass();
                org.telegram.ui.Components.e5.W(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f37376b;
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
        i10 = this.f37376b.sensitiveContentRow;
        return i10;
    }
}
