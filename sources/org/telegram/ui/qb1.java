package org.telegram.ui;

import android.content.Intent;
public final class qb1 implements org.telegram.ui.Components.jl0, org.telegram.ui.ActionBar.a2 {
    public final int f36898a;
    public final ThemeActivity f36899b;

    public qb1(ThemeActivity themeActivity, int i10) {
        this.f36898a = i10;
        this.f36899b = themeActivity;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36898a) {
            case 1:
                ThemeActivity themeActivity = this.f36899b;
                themeActivity.getClass();
                org.telegram.ui.Components.d5.W(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f36899b;
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
        i10 = this.f36899b.sensitiveContentRow;
        return i10;
    }
}
