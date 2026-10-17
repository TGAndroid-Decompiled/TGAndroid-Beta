package org.telegram.ui;

import android.content.Intent;
public final class fa1 implements org.telegram.ui.Components.tl0, org.telegram.ui.ActionBar.a2 {
    public final int f36856a;
    public final ThemeActivity f36857b;

    public fa1(ThemeActivity themeActivity, int i10) {
        this.f36856a = i10;
        this.f36857b = themeActivity;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36856a) {
            case 1:
                ThemeActivity themeActivity = this.f36857b;
                themeActivity.getClass();
                org.telegram.ui.Components.f5.V(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f36857b;
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
        i10 = this.f36857b.sensitiveContentRow;
        return i10;
    }
}
