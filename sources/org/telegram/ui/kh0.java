package org.telegram.ui;

import android.view.View;
public final class kh0 implements org.telegram.ui.Components.gj0, org.telegram.ui.ActionBar.p1 {
    public final NotificationsSettingsActivity f46948a;

    public kh0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f46948a = notificationsSettingsActivity;
    }

    @Override
    public void b(float f10, float f11, int i3, View view) {
        NotificationsSettingsActivity.d0(this.f46948a, view, i3, f10);
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        NotificationsSettingsActivity.e0(this.f46948a);
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
