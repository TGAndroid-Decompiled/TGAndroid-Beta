package org.telegram.ui;

import android.view.View;
public final class mk0 implements Runnable {
    public final int f38280a;
    public final NotificationsCustomSettingsActivity f38281b;
    public final al0 f38282c;
    public final View d;

    public mk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, al0 al0Var, View view, int i10, int i11) {
        this.f38280a = i11;
        this.f38281b = notificationsCustomSettingsActivity;
        this.f38282c = al0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f38280a) {
            case 0:
                this.f38281b.k0(this.f38282c, this.d, false);
                return;
            case 1:
                this.f38281b.e0(this.f38282c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f38281b, this.f38282c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f38281b, this.f38282c, this.d);
                return;
            case 4:
                this.f38281b.e0(this.f38282c, this.d);
                return;
            default:
                this.f38281b.k0(this.f38282c, this.d, true);
                return;
        }
    }

    public mk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, al0 al0Var, View view, boolean z10, int i10) {
        this.f38280a = i10;
        this.f38281b = notificationsCustomSettingsActivity;
        this.f38282c = al0Var;
        this.d = view;
    }
}
