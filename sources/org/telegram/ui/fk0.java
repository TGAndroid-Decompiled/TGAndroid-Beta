package org.telegram.ui;

import android.view.View;
public final class fk0 implements org.telegram.ui.Components.am0, org.telegram.ui.ActionBar.z1 {
    public final NotificationsSettingsActivity f37350a;

    public fk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f37350a = notificationsSettingsActivity;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f37350a, view, i10, f7);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f37350a);
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
