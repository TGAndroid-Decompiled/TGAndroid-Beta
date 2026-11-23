package org.telegram.ui;

import android.view.View;
public final class ih0 implements Runnable {
    public final int f48815a;
    public final NotificationsCustomSettingsActivity f48816b;
    public final sh0 f48817c;
    public final View d;

    public ih0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, sh0 sh0Var, View view, int i7, int i10) {
        this.f48815a = i10;
        this.f48816b = notificationsCustomSettingsActivity;
        this.f48817c = sh0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f48815a) {
            case 0:
                this.f48816b.p0(this.f48817c, this.d, false);
                return;
            case 1:
                this.f48816b.j0(this.f48817c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.c0(this.f48816b, this.f48817c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.a0(this.f48816b, this.f48817c, this.d);
                return;
            case 4:
                this.f48816b.j0(this.f48817c, this.d);
                return;
            default:
                this.f48816b.p0(this.f48817c, this.d, true);
                return;
        }
    }

    public ih0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, sh0 sh0Var, View view, boolean z10, int i7) {
        this.f48815a = i7;
        this.f48816b = notificationsCustomSettingsActivity;
        this.f48817c = sh0Var;
        this.d = view;
    }
}
