package org.telegram.ui;

import android.content.Intent;
public final class hb1 implements org.telegram.ui.Components.jl0, org.telegram.ui.ActionBar.b2 {
    public final int f34186a;
    public final ThemeActivity f34187b;

    public hb1(ThemeActivity themeActivity, int i10) {
        this.f34186a = i10;
        this.f34187b = themeActivity;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f34186a) {
            case 1:
                ThemeActivity themeActivity = this.f34187b;
                themeActivity.getClass();
                org.telegram.ui.Components.e5.W(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f34187b;
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
        i10 = this.f34187b.sensitiveContentRow;
        return i10;
    }
}
