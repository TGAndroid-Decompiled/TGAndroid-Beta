package org.telegram.ui;

import android.view.View;
public final class qj0 implements Runnable {
    public final int f40588a;
    public final NotificationsCustomSettingsActivity f40589b;
    public final ek0 f40590c;
    public final View d;

    public qj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ek0 ek0Var, View view, int i10, int i11) {
        this.f40588a = i11;
        this.f40589b = notificationsCustomSettingsActivity;
        this.f40590c = ek0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f40588a) {
            case 0:
                this.f40589b.k0(this.f40590c, this.d, false);
                return;
            case 1:
                this.f40589b.e0(this.f40590c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f40589b, this.f40590c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f40589b, this.f40590c, this.d);
                return;
            case 4:
                this.f40589b.e0(this.f40590c, this.d);
                return;
            default:
                this.f40589b.k0(this.f40590c, this.d, true);
                return;
        }
    }

    public qj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ek0 ek0Var, View view, boolean z10, int i10) {
        this.f40588a = i10;
        this.f40589b = notificationsCustomSettingsActivity;
        this.f40590c = ek0Var;
        this.d = view;
    }
}
