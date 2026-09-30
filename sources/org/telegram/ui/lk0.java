package org.telegram.ui;

import android.view.View;
public final class lk0 implements org.telegram.ui.Components.ol0, org.telegram.ui.ActionBar.z1 {
    public final NotificationsSettingsActivity f35470a;

    public lk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f35470a = notificationsSettingsActivity;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f35470a, view, i10, f7);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f35470a);
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
