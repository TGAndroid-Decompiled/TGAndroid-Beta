package org.telegram.ui;

import android.view.View;
public final class ek0 implements Runnable {
    public final int f36044a;
    public final NotificationsCustomSettingsActivity f36045b;
    public final rk0 f36046c;
    public final View d;

    public ek0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, rk0 rk0Var, View view, int i10, int i11) {
        this.f36044a = i11;
        this.f36045b = notificationsCustomSettingsActivity;
        this.f36046c = rk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f36044a) {
            case 0:
                this.f36045b.k0(this.f36046c, this.d, false);
                return;
            case 1:
                this.f36045b.e0(this.f36046c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.W(this.f36045b, this.f36046c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.T(this.f36045b, this.f36046c, this.d);
                return;
            case 4:
                this.f36045b.e0(this.f36046c, this.d);
                return;
            default:
                this.f36045b.k0(this.f36046c, this.d, true);
                return;
        }
    }

    public ek0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, rk0 rk0Var, View view, boolean z10, int i10) {
        this.f36044a = i10;
        this.f36045b = notificationsCustomSettingsActivity;
        this.f36046c = rk0Var;
        this.d = view;
    }
}
