package org.telegram.ui;

import android.view.View;
public final class bk0 implements org.telegram.ui.Components.yl0, org.telegram.ui.ActionBar.a2 {
    public final NotificationsSettingsActivity f35668a;

    public bk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f35668a = notificationsSettingsActivity;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f35668a, view, i10, f7);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f35668a);
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
