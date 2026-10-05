package org.telegram.ui;

import android.view.View;
public final class pk0 implements org.telegram.ui.Components.nl0, org.telegram.ui.ActionBar.a2 {
    public final NotificationsSettingsActivity f39601a;

    public pk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f39601a = notificationsSettingsActivity;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.X(this.f39601a, view, i10, f7);
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        NotificationsSettingsActivity.Y(this.f39601a);
    }

    @Override
    public void s0(View view, float f7, float f10) {
    }
}
