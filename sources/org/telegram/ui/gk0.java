package org.telegram.ui;

import android.view.View;
public final class gk0 implements Runnable {
    public final int f38156a;
    public final NotificationsCustomSettingsActivity f38157b;
    public final uk0 f38158c;
    public final View d;

    public gk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, uk0 uk0Var, View view, int i10, int i11) {
        this.f38156a = i11;
        this.f38157b = notificationsCustomSettingsActivity;
        this.f38158c = uk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f38156a) {
            case 0:
                this.f38157b.k0(this.f38158c, this.d, false);
                return;
            case 1:
                this.f38157b.e0(this.f38158c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f38157b, this.f38158c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f38157b, this.f38158c, this.d);
                return;
            case 4:
                this.f38157b.e0(this.f38158c, this.d);
                return;
            default:
                this.f38157b.k0(this.f38158c, this.d, true);
                return;
        }
    }

    public gk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, uk0 uk0Var, View view, boolean z10, int i10) {
        this.f38156a = i10;
        this.f38157b = notificationsCustomSettingsActivity;
        this.f38158c = uk0Var;
        this.d = view;
    }
}
