package org.telegram.ui;

import android.view.View;
public final class lk0 implements Runnable {
    public final int f37775a;
    public final NotificationsCustomSettingsActivity f37776b;
    public final zk0 f37777c;
    public final View d;

    public lk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, zk0 zk0Var, View view, int i10, int i11) {
        this.f37775a = i11;
        this.f37776b = notificationsCustomSettingsActivity;
        this.f37777c = zk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f37775a) {
            case 0:
                this.f37776b.k0(this.f37777c, this.d, false);
                return;
            case 1:
                this.f37776b.e0(this.f37777c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f37776b, this.f37777c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f37776b, this.f37777c, this.d);
                return;
            case 4:
                this.f37776b.e0(this.f37777c, this.d);
                return;
            default:
                this.f37776b.k0(this.f37777c, this.d, true);
                return;
        }
    }

    public lk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, zk0 zk0Var, View view, boolean z10, int i10) {
        this.f37775a = i10;
        this.f37776b = notificationsCustomSettingsActivity;
        this.f37777c = zk0Var;
        this.d = view;
    }
}
