package org.telegram.ui;

import android.view.View;
public final class ik0 implements Runnable {
    public final int f33748a;
    public final NotificationsCustomSettingsActivity f33749b;
    public final vk0 f33750c;
    public final View d;

    public ik0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, vk0 vk0Var, View view, int i10, int i11) {
        this.f33748a = i11;
        this.f33749b = notificationsCustomSettingsActivity;
        this.f33750c = vk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f33748a) {
            case 0:
                this.f33749b.k0(this.f33750c, this.d, false);
                return;
            case 1:
                this.f33749b.e0(this.f33750c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f33749b, this.f33750c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f33749b, this.f33750c, this.d);
                return;
            case 4:
                this.f33749b.e0(this.f33750c, this.d);
                return;
            default:
                this.f33749b.k0(this.f33750c, this.d, true);
                return;
        }
    }

    public ik0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, vk0 vk0Var, View view, boolean z10, int i10) {
        this.f33748a = i10;
        this.f33749b = notificationsCustomSettingsActivity;
        this.f33750c = vk0Var;
        this.d = view;
    }
}
