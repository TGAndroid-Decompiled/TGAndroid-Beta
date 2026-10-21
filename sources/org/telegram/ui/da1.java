package org.telegram.ui;

import android.content.Intent;
public final class da1 implements org.telegram.ui.Components.ul0, org.telegram.ui.ActionBar.a2 {
    public final int f36320a;
    public final ThemeActivity f36321b;

    public da1(ThemeActivity themeActivity, int i10) {
        this.f36320a = i10;
        this.f36321b = themeActivity;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36320a) {
            case 1:
                ThemeActivity themeActivity = this.f36321b;
                themeActivity.getClass();
                org.telegram.ui.Components.f5.V(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f36321b;
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
        i10 = this.f36321b.sensitiveContentRow;
        return i10;
    }
}
