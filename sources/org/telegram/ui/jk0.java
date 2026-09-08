package org.telegram.ui;

import android.view.View;
public final class jk0 implements Runnable {
    public final int f37824a;
    public final NotificationsCustomSettingsActivity f37825b;
    public final wk0 f37826c;
    public final View d;

    public jk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, wk0 wk0Var, View view, int i10, int i11) {
        this.f37824a = i11;
        this.f37825b = notificationsCustomSettingsActivity;
        this.f37826c = wk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f37824a) {
            case 0:
                this.f37825b.k0(this.f37826c, this.d, false);
                return;
            case 1:
                this.f37825b.e0(this.f37826c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f37825b, this.f37826c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f37825b, this.f37826c, this.d);
                return;
            case 4:
                this.f37825b.e0(this.f37826c, this.d);
                return;
            default:
                this.f37825b.k0(this.f37826c, this.d, true);
                return;
        }
    }

    public jk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, wk0 wk0Var, View view, boolean z10, int i10) {
        this.f37824a = i10;
        this.f37825b = notificationsCustomSettingsActivity;
        this.f37826c = wk0Var;
        this.d = view;
    }
}
