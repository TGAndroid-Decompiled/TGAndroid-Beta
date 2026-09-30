package org.telegram.ui;

import android.view.View;
public final class ak0 implements Runnable {
    public final int f32255a;
    public final NotificationsCustomSettingsActivity f32256b;
    public final nk0 f32257c;
    public final View d;

    public ak0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, nk0 nk0Var, View view, int i10, int i11) {
        this.f32255a = i11;
        this.f32256b = notificationsCustomSettingsActivity;
        this.f32257c = nk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f32255a) {
            case 0:
                this.f32256b.k0(this.f32257c, this.d, false);
                return;
            case 1:
                this.f32256b.e0(this.f32257c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f32256b, this.f32257c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f32256b, this.f32257c, this.d);
                return;
            case 4:
                this.f32256b.e0(this.f32257c, this.d);
                return;
            default:
                this.f32256b.k0(this.f32257c, this.d, true);
                return;
        }
    }

    public ak0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, nk0 nk0Var, View view, boolean z10, int i10) {
        this.f32255a = i10;
        this.f32256b = notificationsCustomSettingsActivity;
        this.f32257c = nk0Var;
        this.d = view;
    }
}
