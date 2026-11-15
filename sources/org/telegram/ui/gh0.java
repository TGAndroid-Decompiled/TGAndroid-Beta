package org.telegram.ui;

import android.view.View;
public final class gh0 implements Runnable {
    public final int f47454a;
    public final NotificationsCustomSettingsActivity f47455b;
    public final qh0 f47456c;
    public final View d;

    public gh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, qh0 qh0Var, View view, int i7, int i10) {
        this.f47454a = i10;
        this.f47455b = notificationsCustomSettingsActivity;
        this.f47456c = qh0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f47454a) {
            case 0:
                this.f47455b.p0(this.f47456c, this.d, false);
                return;
            case 1:
                this.f47455b.j0(this.f47456c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.c0(this.f47455b, this.f47456c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.a0(this.f47455b, this.f47456c, this.d);
                return;
            case 4:
                this.f47455b.j0(this.f47456c, this.d);
                return;
            default:
                this.f47455b.p0(this.f47456c, this.d, true);
                return;
        }
    }

    public gh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, qh0 qh0Var, View view, boolean z10, int i7) {
        this.f47454a = i7;
        this.f47455b = notificationsCustomSettingsActivity;
        this.f47456c = qh0Var;
        this.d = view;
    }
}
