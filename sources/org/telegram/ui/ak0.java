package org.telegram.ui;

import android.view.View;
public final class ak0 implements Runnable {
    public final int f32168a;
    public final NotificationsCustomSettingsActivity f32169b;
    public final nk0 f32170c;
    public final View d;

    public ak0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, nk0 nk0Var, View view, int i10, int i11) {
        this.f32168a = i11;
        this.f32169b = notificationsCustomSettingsActivity;
        this.f32170c = nk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f32168a) {
            case 0:
                this.f32169b.k0(this.f32170c, this.d, false);
                return;
            case 1:
                this.f32169b.e0(this.f32170c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f32169b, this.f32170c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f32169b, this.f32170c, this.d);
                return;
            case 4:
                this.f32169b.e0(this.f32170c, this.d);
                return;
            default:
                this.f32169b.k0(this.f32170c, this.d, true);
                return;
        }
    }

    public ak0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, nk0 nk0Var, View view, boolean z10, int i10) {
        this.f32168a = i10;
        this.f32169b = notificationsCustomSettingsActivity;
        this.f32170c = nk0Var;
        this.d = view;
    }
}
