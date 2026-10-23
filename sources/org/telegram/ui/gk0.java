package org.telegram.ui;

import android.view.View;
public final class gk0 implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.z1 {
    public final NotificationsSettingsActivity f37626a;

    public gk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f37626a = notificationsSettingsActivity;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f37626a, view, i10, f7);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f37626a);
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
