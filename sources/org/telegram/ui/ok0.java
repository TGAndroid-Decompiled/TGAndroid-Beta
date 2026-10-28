package org.telegram.ui;

import android.view.View;
public final class ok0 implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.b2 {
    public final NotificationsSettingsActivity f42105a;

    public ok0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f42105a = notificationsSettingsActivity;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.Z(this.f42105a, view, i10, f7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        NotificationsSettingsActivity.a0(this.f42105a);
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
