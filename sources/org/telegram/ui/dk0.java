package org.telegram.ui;

import android.view.View;

public final class dk0 implements org.telegram.ui.Components.qk0, org.telegram.ui.ActionBar.a2 {

    public final NotificationsSettingsActivity f37434a;

    public dk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f37434a = notificationsSettingsActivity;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f37434a, view, i10, f10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f37434a);
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void c0(View view, float f10, float f11) {
    }
}
