package org.telegram.ui;

import android.content.Intent;
public final class c51 implements org.telegram.ui.Components.cj0, org.telegram.ui.ActionBar.p1 {
    public final int f44239a;
    public final ThemeActivity f44240b;

    public c51(ThemeActivity themeActivity, int i3) {
        this.f44239a = i3;
        this.f44240b = themeActivity;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f44239a) {
            case 1:
                ThemeActivity themeActivity = this.f44240b;
                if (themeActivity.getParentActivity() != null) {
                    try {
                        themeActivity.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                ThemeActivity themeActivity2 = this.f44240b;
                themeActivity2.getClass();
                org.telegram.ui.Components.t4.V(themeActivity2, 0, null, null);
                return;
        }
    }

    @Override
    public int run() {
        int i3;
        i3 = this.f44240b.sensitiveContentRow;
        return i3;
    }
}
