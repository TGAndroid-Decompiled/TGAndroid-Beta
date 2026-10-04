package org.telegram.ui;

import android.content.Intent;
public final class kb1 implements org.telegram.ui.Components.jl0, org.telegram.ui.ActionBar.a2 {
    public final int f37919a;
    public final ThemeActivity f37920b;

    public kb1(ThemeActivity themeActivity, int i10) {
        this.f37919a = i10;
        this.f37920b = themeActivity;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37919a) {
            case 1:
                ThemeActivity themeActivity = this.f37920b;
                themeActivity.getClass();
                org.telegram.ui.Components.e5.W(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f37920b;
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
        i10 = this.f37920b.sensitiveContentRow;
        return i10;
    }
}
