package org.telegram.ui;

import android.view.View;
public final class gh0 implements Runnable {
    public final int f46007a;
    public final NotificationsCustomSettingsActivity f46008b;
    public final qh0 f46009c;
    public final View d;

    public gh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, qh0 qh0Var, View view, int i7, int i10) {
        this.f46007a = i10;
        this.f46008b = notificationsCustomSettingsActivity;
        this.f46009c = qh0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f46007a) {
            case 0:
                this.f46008b.p0(this.f46009c, this.d, false);
                return;
            case 1:
                this.f46008b.j0(this.f46009c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.c0(this.f46008b, this.f46009c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.a0(this.f46008b, this.f46009c, this.d);
                return;
            case 4:
                this.f46008b.j0(this.f46009c, this.d);
                return;
            default:
                this.f46008b.p0(this.f46009c, this.d, true);
                return;
        }
    }

    public gh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, qh0 qh0Var, View view, boolean z9, int i7) {
        this.f46007a = i7;
        this.f46008b = notificationsCustomSettingsActivity;
        this.f46009c = qh0Var;
        this.d = view;
    }
}
