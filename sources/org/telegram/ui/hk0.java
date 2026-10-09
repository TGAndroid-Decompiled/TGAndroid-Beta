package org.telegram.ui;

import android.view.View;
public final class hk0 implements Runnable {
    public final int f38368a;
    public final NotificationsCustomSettingsActivity f38369b;
    public final vk0 f38370c;
    public final View d;

    public hk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, vk0 vk0Var, View view, int i10, int i11) {
        this.f38368a = i11;
        this.f38369b = notificationsCustomSettingsActivity;
        this.f38370c = vk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f38368a) {
            case 0:
                this.f38369b.k0(this.f38370c, this.d, false);
                return;
            case 1:
                this.f38369b.e0(this.f38370c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f38369b, this.f38370c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f38369b, this.f38370c, this.d);
                return;
            case 4:
                this.f38369b.e0(this.f38370c, this.d);
                return;
            default:
                this.f38369b.k0(this.f38370c, this.d, true);
                return;
        }
    }

    public hk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, vk0 vk0Var, View view, boolean z10, int i10) {
        this.f38368a = i10;
        this.f38369b = notificationsCustomSettingsActivity;
        this.f38370c = vk0Var;
        this.d = view;
    }
}
