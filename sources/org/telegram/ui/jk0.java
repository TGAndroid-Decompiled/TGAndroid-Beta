package org.telegram.ui;

import android.view.View;
public final class jk0 implements Runnable {
    public final int f34966a;
    public final NotificationsCustomSettingsActivity f34967b;
    public final wk0 f34968c;
    public final View d;

    public jk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, wk0 wk0Var, View view, int i10, int i11) {
        this.f34966a = i11;
        this.f34967b = notificationsCustomSettingsActivity;
        this.f34968c = wk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f34966a) {
            case 0:
                this.f34967b.k0(this.f34968c, this.d, false);
                return;
            case 1:
                this.f34967b.e0(this.f34968c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f34967b, this.f34968c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f34967b, this.f34968c, this.d);
                return;
            case 4:
                this.f34967b.e0(this.f34968c, this.d);
                return;
            default:
                this.f34967b.k0(this.f34968c, this.d, true);
                return;
        }
    }

    public jk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, wk0 wk0Var, View view, boolean z10, int i10) {
        this.f34966a = i10;
        this.f34967b = notificationsCustomSettingsActivity;
        this.f34968c = wk0Var;
        this.d = view;
    }
}
