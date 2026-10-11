package org.telegram.ui;

import android.view.View;
public final class gk0 implements Runnable {
    public final int f38122a;
    public final NotificationsCustomSettingsActivity f38123b;
    public final uk0 f38124c;
    public final View d;

    public gk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, uk0 uk0Var, View view, int i10, int i11) {
        this.f38122a = i11;
        this.f38123b = notificationsCustomSettingsActivity;
        this.f38124c = uk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f38122a) {
            case 0:
                this.f38123b.k0(this.f38124c, this.d, false);
                return;
            case 1:
                this.f38123b.e0(this.f38124c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f38123b, this.f38124c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f38123b, this.f38124c, this.d);
                return;
            case 4:
                this.f38123b.e0(this.f38124c, this.d);
                return;
            default:
                this.f38123b.k0(this.f38124c, this.d, true);
                return;
        }
    }

    public gk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, uk0 uk0Var, View view, boolean z10, int i10) {
        this.f38122a = i10;
        this.f38123b = notificationsCustomSettingsActivity;
        this.f38124c = uk0Var;
        this.d = view;
    }
}
