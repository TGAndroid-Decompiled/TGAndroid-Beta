package org.telegram.ui;

import android.view.View;
public final class ik0 implements Runnable {
    public final int f34614a;
    public final NotificationsCustomSettingsActivity f34615b;
    public final vk0 f34616c;
    public final View d;

    public ik0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, vk0 vk0Var, View view, int i10, int i11) {
        this.f34614a = i11;
        this.f34615b = notificationsCustomSettingsActivity;
        this.f34616c = vk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f34614a) {
            case 0:
                this.f34615b.k0(this.f34616c, this.d, false);
                return;
            case 1:
                this.f34615b.e0(this.f34616c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f34615b, this.f34616c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f34615b, this.f34616c, this.d);
                return;
            case 4:
                this.f34615b.e0(this.f34616c, this.d);
                return;
            default:
                this.f34615b.k0(this.f34616c, this.d, true);
                return;
        }
    }

    public ik0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, vk0 vk0Var, View view, boolean z10, int i10) {
        this.f34614a = i10;
        this.f34615b = notificationsCustomSettingsActivity;
        this.f34616c = vk0Var;
        this.d = view;
    }
}
