package org.telegram.ui;

import android.view.View;
public final class ik0 implements Runnable {
    public final int f38933a;
    public final NotificationsCustomSettingsActivity f38934b;
    public final wk0 f38935c;
    public final View d;

    public ik0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, wk0 wk0Var, View view, int i10, int i11) {
        this.f38933a = i11;
        this.f38934b = notificationsCustomSettingsActivity;
        this.f38935c = wk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f38933a) {
            case 0:
                this.f38934b.k0(this.f38935c, this.d, false);
                return;
            case 1:
                this.f38934b.e0(this.f38935c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f38934b, this.f38935c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f38934b, this.f38935c, this.d);
                return;
            case 4:
                this.f38934b.e0(this.f38935c, this.d);
                return;
            default:
                this.f38934b.k0(this.f38935c, this.d, true);
                return;
        }
    }

    public ik0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, wk0 wk0Var, View view, boolean z10, int i10) {
        this.f38933a = i10;
        this.f38934b = notificationsCustomSettingsActivity;
        this.f38935c = wk0Var;
        this.d = view;
    }
}
