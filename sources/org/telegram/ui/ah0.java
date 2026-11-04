package org.telegram.ui;

import android.view.View;
public final class ah0 implements Runnable {
    public final int f43779a;
    public final NotificationsCustomSettingsActivity f43780b;
    public final lh0 f43781c;
    public final View d;

    public ah0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, lh0 lh0Var, View view, int i3, int i10) {
        this.f43779a = i10;
        this.f43780b = notificationsCustomSettingsActivity;
        this.f43781c = lh0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f43779a) {
            case 0:
                this.f43780b.p0(this.f43781c, this.d, false);
                return;
            case 1:
                this.f43780b.j0(this.f43781c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.c0(this.f43780b, this.f43781c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.a0(this.f43780b, this.f43781c, this.d);
                return;
            case 4:
                this.f43780b.j0(this.f43781c, this.d);
                return;
            default:
                this.f43780b.p0(this.f43781c, this.d, true);
                return;
        }
    }

    public ah0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, lh0 lh0Var, View view, boolean z10, int i3) {
        this.f43779a = i3;
        this.f43780b = notificationsCustomSettingsActivity;
        this.f43781c = lh0Var;
        this.d = view;
    }
}
