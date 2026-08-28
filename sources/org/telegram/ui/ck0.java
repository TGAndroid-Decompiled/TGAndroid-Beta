package org.telegram.ui;

import android.view.View;
public final class ck0 implements org.telegram.ui.Components.nk0, org.telegram.ui.ActionBar.b2 {
    public final NotificationsSettingsActivity f37231a;

    public ck0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f37231a = notificationsSettingsActivity;
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        NotificationsSettingsActivity.X(this.f37231a, view, i9, f10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        NotificationsSettingsActivity.Y(this.f37231a);
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g0(View view, float f10, float f11) {
    }
}
