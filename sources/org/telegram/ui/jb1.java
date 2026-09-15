package org.telegram.ui;

import android.content.Intent;
public final class jb1 implements ki.e, org.telegram.ui.Components.wk0, org.telegram.ui.ActionBar.a2 {
    public final int f34848a;
    public final ThemeActivity f34849b;

    public jb1(ThemeActivity themeActivity, int i10) {
        this.f34848a = i10;
        this.f34849b = themeActivity;
    }

    @Override
    public int e() {
        ThemeActivity themeActivity = this.f34849b;
        themeActivity.getClass();
        return themeActivity.getThemedColor(org.telegram.ui.ActionBar.i6.f18780a7);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f34848a) {
            case 2:
                ThemeActivity themeActivity = this.f34849b;
                if (themeActivity.getParentActivity() != null) {
                    try {
                        themeActivity.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                ThemeActivity themeActivity2 = this.f34849b;
                themeActivity2.getClass();
                org.telegram.ui.Components.c5.W(themeActivity2, 0, null, null);
                return;
        }
    }

    @Override
    public int run() {
        int i10;
        i10 = this.f34849b.sensitiveContentRow;
        return i10;
    }
}
