package org.telegram.ui;

import android.view.View;
public final class eh0 implements Runnable {
    public final int f45349a;
    public final NotificationsCustomSettingsActivity f45350b;
    public final oh0 f45351c;
    public final View d;

    public eh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, oh0 oh0Var, View view, int i7, int i10) {
        this.f45349a = i10;
        this.f45350b = notificationsCustomSettingsActivity;
        this.f45351c = oh0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f45349a) {
            case 0:
                this.f45350b.p0(this.f45351c, this.d, false);
                return;
            case 1:
                this.f45350b.j0(this.f45351c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.c0(this.f45350b, this.f45351c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.a0(this.f45350b, this.f45351c, this.d);
                return;
            case 4:
                this.f45350b.j0(this.f45351c, this.d);
                return;
            default:
                this.f45350b.p0(this.f45351c, this.d, true);
                return;
        }
    }

    public eh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, oh0 oh0Var, View view, boolean z9, int i7) {
        this.f45349a = i7;
        this.f45350b = notificationsCustomSettingsActivity;
        this.f45351c = oh0Var;
        this.d = view;
    }
}
