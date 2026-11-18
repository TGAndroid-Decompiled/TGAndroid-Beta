package org.telegram.ui;

import android.view.View;
public final class jh0 implements Runnable {
    public final int f48986a;
    public final NotificationsCustomSettingsActivity f48987b;
    public final th0 f48988c;
    public final View d;

    public jh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, th0 th0Var, View view, int i7, int i10) {
        this.f48986a = i10;
        this.f48987b = notificationsCustomSettingsActivity;
        this.f48988c = th0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f48986a) {
            case 0:
                this.f48987b.p0(this.f48988c, this.d, false);
                return;
            case 1:
                this.f48987b.j0(this.f48988c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.c0(this.f48987b, this.f48988c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.a0(this.f48987b, this.f48988c, this.d);
                return;
            case 4:
                this.f48987b.j0(this.f48988c, this.d);
                return;
            default:
                this.f48987b.p0(this.f48988c, this.d, true);
                return;
        }
    }

    public jh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, th0 th0Var, View view, boolean z10, int i7) {
        this.f48986a = i7;
        this.f48987b = notificationsCustomSettingsActivity;
        this.f48988c = th0Var;
        this.d = view;
    }
}
