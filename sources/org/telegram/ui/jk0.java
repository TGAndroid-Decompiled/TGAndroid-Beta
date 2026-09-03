package org.telegram.ui;

import android.view.View;
public final class jk0 implements org.telegram.ui.Components.il0, org.telegram.ui.ActionBar.c2 {
    public final NotificationsSettingsActivity f35315a;

    public jk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f35315a = notificationsSettingsActivity;
    }

    @Override
    public boolean Z0(View view) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f35315a, view, i10, f10);
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f35315a);
    }

    @Override
    public void n0(View view, float f10, float f11) {
    }
}
