package org.telegram.ui;

import android.view.View;
public final class oj0 implements Runnable {
    public final int f41184a;
    public final NotificationsCustomSettingsActivity f41185b;
    public final bk0 f41186c;
    public final View d;

    public oj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, bk0 bk0Var, View view, int i10, int i11) {
        this.f41184a = i11;
        this.f41185b = notificationsCustomSettingsActivity;
        this.f41186c = bk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f41184a) {
            case 0:
                this.f41185b.k0(this.f41186c, this.d, false);
                return;
            case 1:
                this.f41185b.e0(this.f41186c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f41185b, this.f41186c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f41185b, this.f41186c, this.d);
                return;
            case 4:
                this.f41185b.e0(this.f41186c, this.d);
                return;
            default:
                this.f41185b.k0(this.f41186c, this.d, true);
                return;
        }
    }

    public oj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, bk0 bk0Var, View view, boolean z10, int i10) {
        this.f41184a = i10;
        this.f41185b = notificationsCustomSettingsActivity;
        this.f41186c = bk0Var;
        this.d = view;
    }
}
