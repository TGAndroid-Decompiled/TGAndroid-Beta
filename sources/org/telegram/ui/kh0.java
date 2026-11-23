package org.telegram.ui;

import android.view.View;
public final class kh0 implements Runnable {
    public final int f49322a;
    public final NotificationsCustomSettingsActivity f49323b;
    public final uh0 f49324c;
    public final View d;

    public kh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, uh0 uh0Var, View view, int i7, int i10) {
        this.f49322a = i10;
        this.f49323b = notificationsCustomSettingsActivity;
        this.f49324c = uh0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f49322a) {
            case 0:
                this.f49323b.p0(this.f49324c, this.d, false);
                return;
            case 1:
                this.f49323b.j0(this.f49324c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.c0(this.f49323b, this.f49324c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.a0(this.f49323b, this.f49324c, this.d);
                return;
            case 4:
                this.f49323b.j0(this.f49324c, this.d);
                return;
            default:
                this.f49323b.p0(this.f49324c, this.d, true);
                return;
        }
    }

    public kh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, uh0 uh0Var, View view, boolean z10, int i7) {
        this.f49322a = i7;
        this.f49323b = notificationsCustomSettingsActivity;
        this.f49324c = uh0Var;
        this.d = view;
    }
}
