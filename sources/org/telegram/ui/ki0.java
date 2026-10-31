package org.telegram.ui;

import android.view.View;
public final class ki0 implements Runnable {
    public final int f38873a;
    public final NotificationsCustomSettingsActivity f38874b;
    public final ui0 f38875c;
    public final View d;

    public ki0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ui0 ui0Var, View view, int i10, int i11) {
        this.f38873a = i11;
        this.f38874b = notificationsCustomSettingsActivity;
        this.f38875c = ui0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f38873a) {
            case 0:
                this.f38874b.o0(this.f38875c, this.d, false);
                return;
            case 1:
                this.f38874b.i0(this.f38875c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.b0(this.f38874b, this.f38875c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.Z(this.f38874b, this.f38875c, this.d);
                return;
            case 4:
                this.f38874b.i0(this.f38875c, this.d);
                return;
            default:
                this.f38874b.o0(this.f38875c, this.d, true);
                return;
        }
    }

    public ki0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ui0 ui0Var, View view, boolean z10, int i10) {
        this.f38873a = i10;
        this.f38874b = notificationsCustomSettingsActivity;
        this.f38875c = ui0Var;
        this.d = view;
    }
}
