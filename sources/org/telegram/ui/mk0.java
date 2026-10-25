package org.telegram.ui;

import android.view.View;
public final class mk0 implements org.telegram.ui.Components.am0, org.telegram.ui.ActionBar.b2 {
    public final NotificationsSettingsActivity f41570a;

    public mk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f41570a = notificationsSettingsActivity;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.Z(this.f41570a, view, i10, f7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        NotificationsSettingsActivity.a0(this.f41570a);
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
