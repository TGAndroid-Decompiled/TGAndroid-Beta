package org.telegram.ui;

import android.view.View;
public final class gk0 implements Runnable {
    public final int f33878a;
    public final NotificationsCustomSettingsActivity f33879b;
    public final tk0 f33880c;
    public final View d;

    public gk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, tk0 tk0Var, View view, int i10, int i11) {
        this.f33878a = i11;
        this.f33879b = notificationsCustomSettingsActivity;
        this.f33880c = tk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f33878a) {
            case 0:
                this.f33879b.k0(this.f33880c, this.d, false);
                return;
            case 1:
                this.f33879b.e0(this.f33880c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f33879b, this.f33880c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f33879b, this.f33880c, this.d);
                return;
            case 4:
                this.f33879b.e0(this.f33880c, this.d);
                return;
            default:
                this.f33879b.k0(this.f33880c, this.d, true);
                return;
        }
    }

    public gk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, tk0 tk0Var, View view, boolean z10, int i10) {
        this.f33878a = i10;
        this.f33879b = notificationsCustomSettingsActivity;
        this.f33880c = tk0Var;
        this.d = view;
    }
}
