package org.telegram.ui;

import android.view.View;
public final class eh0 implements Runnable {
    public final int f45319a;
    public final NotificationsCustomSettingsActivity f45320b;
    public final oh0 f45321c;
    public final View d;

    public eh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, oh0 oh0Var, View view, int i7, int i10) {
        this.f45319a = i10;
        this.f45320b = notificationsCustomSettingsActivity;
        this.f45321c = oh0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f45319a) {
            case 0:
                this.f45320b.p0(this.f45321c, this.d, false);
                return;
            case 1:
                this.f45320b.j0(this.f45321c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.c0(this.f45320b, this.f45321c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.a0(this.f45320b, this.f45321c, this.d);
                return;
            case 4:
                this.f45320b.j0(this.f45321c, this.d);
                return;
            default:
                this.f45320b.p0(this.f45321c, this.d, true);
                return;
        }
    }

    public eh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, oh0 oh0Var, View view, boolean z9, int i7) {
        this.f45319a = i7;
        this.f45320b = notificationsCustomSettingsActivity;
        this.f45321c = oh0Var;
        this.d = view;
    }
}
