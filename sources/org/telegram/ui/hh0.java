package org.telegram.ui;

import android.view.View;
public final class hh0 implements Runnable {
    public final int f46355a;
    public final NotificationsCustomSettingsActivity f46356b;
    public final rh0 f46357c;
    public final View d;

    public hh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, rh0 rh0Var, View view, int i7, int i10) {
        this.f46355a = i10;
        this.f46356b = notificationsCustomSettingsActivity;
        this.f46357c = rh0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f46355a) {
            case 0:
                this.f46356b.p0(this.f46357c, this.d, false);
                return;
            case 1:
                this.f46356b.j0(this.f46357c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.c0(this.f46356b, this.f46357c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.a0(this.f46356b, this.f46357c, this.d);
                return;
            case 4:
                this.f46356b.j0(this.f46357c, this.d);
                return;
            default:
                this.f46356b.p0(this.f46357c, this.d, true);
                return;
        }
    }

    public hh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, rh0 rh0Var, View view, boolean z9, int i7) {
        this.f46355a = i7;
        this.f46356b = notificationsCustomSettingsActivity;
        this.f46357c = rh0Var;
        this.d = view;
    }
}
