package org.telegram.ui;

import android.view.View;
public final class qh0 implements org.telegram.ui.Components.cj0, org.telegram.ui.ActionBar.r1 {
    public final NotificationsSettingsActivity f49047a;

    public qh0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f49047a = notificationsSettingsActivity;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        NotificationsSettingsActivity.d0(this.f49047a, view, i7, f10);
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        NotificationsSettingsActivity.e0(this.f49047a);
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
