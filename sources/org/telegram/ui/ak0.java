package org.telegram.ui;

import android.view.View;
public final class ak0 implements Runnable {
    public final int f32182a;
    public final NotificationsCustomSettingsActivity f32183b;
    public final nk0 f32184c;
    public final View d;

    public ak0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, nk0 nk0Var, View view, int i10, int i11) {
        this.f32182a = i11;
        this.f32183b = notificationsCustomSettingsActivity;
        this.f32184c = nk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f32182a) {
            case 0:
                this.f32183b.k0(this.f32184c, this.d, false);
                return;
            case 1:
                this.f32183b.e0(this.f32184c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f32183b, this.f32184c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f32183b, this.f32184c, this.d);
                return;
            case 4:
                this.f32183b.e0(this.f32184c, this.d);
                return;
            default:
                this.f32183b.k0(this.f32184c, this.d, true);
                return;
        }
    }

    public ak0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, nk0 nk0Var, View view, boolean z10, int i10) {
        this.f32182a = i10;
        this.f32183b = notificationsCustomSettingsActivity;
        this.f32184c = nk0Var;
        this.d = view;
    }
}
