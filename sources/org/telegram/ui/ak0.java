package org.telegram.ui;

import android.view.View;
public final class ak0 implements Runnable {
    public final int f31813a;
    public final NotificationsCustomSettingsActivity f31814b;
    public final nk0 f31815c;
    public final View d;

    public ak0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, nk0 nk0Var, View view, int i10, int i11) {
        this.f31813a = i11;
        this.f31814b = notificationsCustomSettingsActivity;
        this.f31815c = nk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f31813a) {
            case 0:
                this.f31814b.k0(this.f31815c, this.d, false);
                return;
            case 1:
                this.f31814b.e0(this.f31815c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f31814b, this.f31815c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f31814b, this.f31815c, this.d);
                return;
            case 4:
                this.f31814b.e0(this.f31815c, this.d);
                return;
            default:
                this.f31814b.k0(this.f31815c, this.d, true);
                return;
        }
    }

    public ak0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, nk0 nk0Var, View view, boolean z10, int i10) {
        this.f31813a = i10;
        this.f31814b = notificationsCustomSettingsActivity;
        this.f31815c = nk0Var;
        this.d = view;
    }
}
