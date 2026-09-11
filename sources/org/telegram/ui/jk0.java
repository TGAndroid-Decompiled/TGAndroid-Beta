package org.telegram.ui;

import android.view.View;
public final class jk0 implements Runnable {
    public final int f37797a;
    public final NotificationsCustomSettingsActivity f37798b;
    public final wk0 f37799c;
    public final View d;

    public jk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, wk0 wk0Var, View view, int i10, int i11) {
        this.f37797a = i11;
        this.f37798b = notificationsCustomSettingsActivity;
        this.f37799c = wk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f37797a) {
            case 0:
                this.f37798b.k0(this.f37799c, this.d, false);
                return;
            case 1:
                this.f37798b.e0(this.f37799c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f37798b, this.f37799c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f37798b, this.f37799c, this.d);
                return;
            case 4:
                this.f37798b.e0(this.f37799c, this.d);
                return;
            default:
                this.f37798b.k0(this.f37799c, this.d, true);
                return;
        }
    }

    public jk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, wk0 wk0Var, View view, boolean z10, int i10) {
        this.f37797a = i10;
        this.f37798b = notificationsCustomSettingsActivity;
        this.f37799c = wk0Var;
        this.d = view;
    }
}
