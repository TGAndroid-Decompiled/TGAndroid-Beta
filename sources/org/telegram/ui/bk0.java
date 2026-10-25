package org.telegram.ui;

import android.view.View;
public final class bk0 implements Runnable {
    public final int f38110a;
    public final NotificationsCustomSettingsActivity f38111b;
    public final ok0 f38112c;
    public final View d;

    public bk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ok0 ok0Var, View view, int i10, int i11) {
        this.f38110a = i11;
        this.f38111b = notificationsCustomSettingsActivity;
        this.f38112c = ok0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f38110a) {
            case 0:
                this.f38111b.l0(this.f38112c, this.d, false);
                return;
            case 1:
                this.f38111b.f0(this.f38112c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.Y(this.f38111b, this.f38112c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.W(this.f38111b, this.f38112c, this.d);
                return;
            case 4:
                this.f38111b.f0(this.f38112c, this.d);
                return;
            default:
                this.f38111b.l0(this.f38112c, this.d, true);
                return;
        }
    }

    public bk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ok0 ok0Var, View view, boolean z10, int i10) {
        this.f38110a = i10;
        this.f38111b = notificationsCustomSettingsActivity;
        this.f38112c = ok0Var;
        this.d = view;
    }
}
