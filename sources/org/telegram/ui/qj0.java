package org.telegram.ui;

import android.view.View;
public final class qj0 implements Runnable {
    public final int f40590a;
    public final NotificationsCustomSettingsActivity f40591b;
    public final ek0 f40592c;
    public final View d;

    public qj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ek0 ek0Var, View view, int i10, int i11) {
        this.f40590a = i11;
        this.f40591b = notificationsCustomSettingsActivity;
        this.f40592c = ek0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f40590a) {
            case 0:
                this.f40591b.k0(this.f40592c, this.d, false);
                return;
            case 1:
                this.f40591b.e0(this.f40592c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f40591b, this.f40592c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f40591b, this.f40592c, this.d);
                return;
            case 4:
                this.f40591b.e0(this.f40592c, this.d);
                return;
            default:
                this.f40591b.k0(this.f40592c, this.d, true);
                return;
        }
    }

    public qj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ek0 ek0Var, View view, boolean z10, int i10) {
        this.f40590a = i10;
        this.f40591b = notificationsCustomSettingsActivity;
        this.f40592c = ek0Var;
        this.d = view;
    }
}
