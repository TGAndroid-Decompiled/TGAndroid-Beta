package org.telegram.ui;

import android.view.View;
public final class jk0 implements Runnable {
    public final int f37825a;
    public final NotificationsCustomSettingsActivity f37826b;
    public final wk0 f37827c;
    public final View d;

    public jk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, wk0 wk0Var, View view, int i10, int i11) {
        this.f37825a = i11;
        this.f37826b = notificationsCustomSettingsActivity;
        this.f37827c = wk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f37825a) {
            case 0:
                this.f37826b.k0(this.f37827c, this.d, false);
                return;
            case 1:
                this.f37826b.e0(this.f37827c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f37826b, this.f37827c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f37826b, this.f37827c, this.d);
                return;
            case 4:
                this.f37826b.e0(this.f37827c, this.d);
                return;
            default:
                this.f37826b.k0(this.f37827c, this.d, true);
                return;
        }
    }

    public jk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, wk0 wk0Var, View view, boolean z10, int i10) {
        this.f37825a = i10;
        this.f37826b = notificationsCustomSettingsActivity;
        this.f37827c = wk0Var;
        this.d = view;
    }
}
