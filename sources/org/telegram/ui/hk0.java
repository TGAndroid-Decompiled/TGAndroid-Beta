package org.telegram.ui;

import android.view.View;
public final class hk0 implements Runnable {
    public final int f38366a;
    public final NotificationsCustomSettingsActivity f38367b;
    public final vk0 f38368c;
    public final View d;

    public hk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, vk0 vk0Var, View view, int i10, int i11) {
        this.f38366a = i11;
        this.f38367b = notificationsCustomSettingsActivity;
        this.f38368c = vk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f38366a) {
            case 0:
                this.f38367b.k0(this.f38368c, this.d, false);
                return;
            case 1:
                this.f38367b.e0(this.f38368c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f38367b, this.f38368c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f38367b, this.f38368c, this.d);
                return;
            case 4:
                this.f38367b.e0(this.f38368c, this.d);
                return;
            default:
                this.f38367b.k0(this.f38368c, this.d, true);
                return;
        }
    }

    public hk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, vk0 vk0Var, View view, boolean z10, int i10) {
        this.f38366a = i10;
        this.f38367b = notificationsCustomSettingsActivity;
        this.f38368c = vk0Var;
        this.d = view;
    }
}
