package org.telegram.ui;

import android.content.Intent;
public final class m51 implements org.telegram.ui.Components.nj0, org.telegram.ui.ActionBar.q1 {
    public final int f49960a;
    public final ThemeActivity f49961b;

    public m51(ThemeActivity themeActivity, int i7) {
        this.f49960a = i7;
        this.f49961b = themeActivity;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f49960a) {
            case 1:
                ThemeActivity themeActivity = this.f49961b;
                if (themeActivity.getParentActivity() != null) {
                    try {
                        themeActivity.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                ThemeActivity themeActivity2 = this.f49961b;
                themeActivity2.getClass();
                org.telegram.ui.Components.b5.T(themeActivity2, 0, null, null);
                return;
        }
    }

    @Override
    public int run() {
        int i7;
        i7 = this.f49961b.sensitiveContentRow;
        return i7;
    }
}
