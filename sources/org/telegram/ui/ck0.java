package org.telegram.ui;

import android.view.View;
public final class ck0 implements Runnable {
    public final int f32742a;
    public final NotificationsCustomSettingsActivity f32743b;
    public final pk0 f32744c;
    public final View d;

    public ck0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, pk0 pk0Var, View view, int i10, int i11) {
        this.f32742a = i11;
        this.f32743b = notificationsCustomSettingsActivity;
        this.f32744c = pk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f32742a) {
            case 0:
                this.f32743b.k0(this.f32744c, this.d, false);
                return;
            case 1:
                this.f32743b.e0(this.f32744c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f32743b, this.f32744c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f32743b, this.f32744c, this.d);
                return;
            case 4:
                this.f32743b.e0(this.f32744c, this.d);
                return;
            default:
                this.f32743b.k0(this.f32744c, this.d, true);
                return;
        }
    }

    public ck0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, pk0 pk0Var, View view, boolean z10, int i10) {
        this.f32742a = i10;
        this.f32743b = notificationsCustomSettingsActivity;
        this.f32744c = pk0Var;
        this.d = view;
    }
}
