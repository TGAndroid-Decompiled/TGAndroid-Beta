package org.telegram.ui;

import android.view.View;
public final class ph0 implements org.telegram.ui.Components.hj0, org.telegram.ui.ActionBar.q1 {
    public final NotificationsSettingsActivity f50289a;

    public ph0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f50289a = notificationsSettingsActivity;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        NotificationsSettingsActivity.d0(this.f50289a, view, i7, f10);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        NotificationsSettingsActivity.e0(this.f50289a);
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
