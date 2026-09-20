package org.telegram.ui;

import android.view.View;
public final class jk0 implements Runnable {
    public final int f34944a;
    public final NotificationsCustomSettingsActivity f34945b;
    public final wk0 f34946c;
    public final View d;

    public jk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, wk0 wk0Var, View view, int i10, int i11) {
        this.f34944a = i11;
        this.f34945b = notificationsCustomSettingsActivity;
        this.f34946c = wk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f34944a) {
            case 0:
                this.f34945b.k0(this.f34946c, this.d, false);
                return;
            case 1:
                this.f34945b.e0(this.f34946c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f34945b, this.f34946c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f34945b, this.f34946c, this.d);
                return;
            case 4:
                this.f34945b.e0(this.f34946c, this.d);
                return;
            default:
                this.f34945b.k0(this.f34946c, this.d, true);
                return;
        }
    }

    public jk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, wk0 wk0Var, View view, boolean z10, int i10) {
        this.f34944a = i10;
        this.f34945b = notificationsCustomSettingsActivity;
        this.f34946c = wk0Var;
        this.d = view;
    }
}
