package org.telegram.ui;

import android.view.View;
public final class ii0 implements Runnable {
    public final int f38093a;
    public final NotificationsCustomSettingsActivity f38094b;
    public final si0 f38095c;
    public final View d;

    public ii0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, si0 si0Var, View view, int i10, int i11) {
        this.f38093a = i11;
        this.f38094b = notificationsCustomSettingsActivity;
        this.f38095c = si0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f38093a) {
            case 0:
                this.f38094b.p0(this.f38095c, this.d, false);
                return;
            case 1:
                this.f38094b.j0(this.f38095c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.c0(this.f38094b, this.f38095c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.a0(this.f38094b, this.f38095c, this.d);
                return;
            case 4:
                this.f38094b.j0(this.f38095c, this.d);
                return;
            default:
                this.f38094b.p0(this.f38095c, this.d, true);
                return;
        }
    }

    public ii0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, si0 si0Var, View view, boolean z10, int i10) {
        this.f38093a = i10;
        this.f38094b = notificationsCustomSettingsActivity;
        this.f38095c = si0Var;
        this.d = view;
    }
}
