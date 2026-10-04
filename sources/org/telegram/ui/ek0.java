package org.telegram.ui;

import android.view.View;
public final class ek0 implements Runnable {
    public final int f36038a;
    public final NotificationsCustomSettingsActivity f36039b;
    public final rk0 f36040c;
    public final View d;

    public ek0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, rk0 rk0Var, View view, int i10, int i11) {
        this.f36038a = i11;
        this.f36039b = notificationsCustomSettingsActivity;
        this.f36040c = rk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f36038a) {
            case 0:
                this.f36039b.k0(this.f36040c, this.d, false);
                return;
            case 1:
                this.f36039b.e0(this.f36040c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.W(this.f36039b, this.f36040c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.T(this.f36039b, this.f36040c, this.d);
                return;
            case 4:
                this.f36039b.e0(this.f36040c, this.d);
                return;
            default:
                this.f36039b.k0(this.f36040c, this.d, true);
                return;
        }
    }

    public ek0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, rk0 rk0Var, View view, boolean z10, int i10) {
        this.f36038a = i10;
        this.f36039b = notificationsCustomSettingsActivity;
        this.f36040c = rk0Var;
        this.d = view;
    }
}
