package org.telegram.ui;

import android.view.View;
public final class hk0 implements org.telegram.ui.Components.jl0, org.telegram.ui.ActionBar.c2 {
    public final NotificationsSettingsActivity f34908a;

    public hk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f34908a = notificationsSettingsActivity;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f34908a, view, i10, f10);
    }

    @Override
    public boolean e1(View view) {
        return false;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f34908a);
    }

    @Override
    public void o0(View view, float f10, float f11) {
    }
}
