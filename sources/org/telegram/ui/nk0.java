package org.telegram.ui;

import android.view.View;
public final class nk0 implements org.telegram.ui.Components.nl0, org.telegram.ui.ActionBar.b2 {
    public final NotificationsSettingsActivity f36042a;

    public nk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f36042a = notificationsSettingsActivity;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f36042a, view, i10, f7);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f36042a);
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
