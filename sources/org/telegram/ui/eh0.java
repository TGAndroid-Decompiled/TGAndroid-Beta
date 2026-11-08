package org.telegram.ui;

import android.view.View;
public final class eh0 implements Runnable {
    public final int f45307a;
    public final NotificationsCustomSettingsActivity f45308b;
    public final oh0 f45309c;
    public final View d;

    public eh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, oh0 oh0Var, View view, int i7, int i10) {
        this.f45307a = i10;
        this.f45308b = notificationsCustomSettingsActivity;
        this.f45309c = oh0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f45307a) {
            case 0:
                this.f45308b.p0(this.f45309c, this.d, false);
                return;
            case 1:
                this.f45308b.j0(this.f45309c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.c0(this.f45308b, this.f45309c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.a0(this.f45308b, this.f45309c, this.d);
                return;
            case 4:
                this.f45308b.j0(this.f45309c, this.d);
                return;
            default:
                this.f45308b.p0(this.f45309c, this.d, true);
                return;
        }
    }

    public eh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, oh0 oh0Var, View view, boolean z9, int i7) {
        this.f45307a = i7;
        this.f45308b = notificationsCustomSettingsActivity;
        this.f45309c = oh0Var;
        this.d = view;
    }
}
