package org.telegram.ui;

import android.view.View;
public final class lk0 implements org.telegram.ui.Components.nl0, org.telegram.ui.ActionBar.z1 {
    public final NotificationsSettingsActivity f35382a;

    public lk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f35382a = notificationsSettingsActivity;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f35382a, view, i10, f7);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f35382a);
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
