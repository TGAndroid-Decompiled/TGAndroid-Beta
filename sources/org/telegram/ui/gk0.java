package org.telegram.ui;

import android.view.View;
public final class gk0 implements Runnable {
    public final int f33945a;
    public final NotificationsCustomSettingsActivity f33946b;
    public final tk0 f33947c;
    public final View d;

    public gk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, tk0 tk0Var, View view, int i10, int i11) {
        this.f33945a = i11;
        this.f33946b = notificationsCustomSettingsActivity;
        this.f33947c = tk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f33945a) {
            case 0:
                this.f33946b.k0(this.f33947c, this.d, false);
                return;
            case 1:
                this.f33946b.e0(this.f33947c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f33946b, this.f33947c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f33946b, this.f33947c, this.d);
                return;
            case 4:
                this.f33946b.e0(this.f33947c, this.d);
                return;
            default:
                this.f33946b.k0(this.f33947c, this.d, true);
                return;
        }
    }

    public gk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, tk0 tk0Var, View view, boolean z10, int i10) {
        this.f33945a = i10;
        this.f33946b = notificationsCustomSettingsActivity;
        this.f33947c = tk0Var;
        this.d = view;
    }
}
