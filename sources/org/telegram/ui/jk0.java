package org.telegram.ui;

import android.view.View;
public final class jk0 implements org.telegram.ui.Components.jl0, org.telegram.ui.ActionBar.c2 {
    public final NotificationsSettingsActivity f38073a;

    public jk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f38073a = notificationsSettingsActivity;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f38073a, view, i10, f10);
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f38073a);
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
