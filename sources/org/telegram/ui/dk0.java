package org.telegram.ui;

import android.view.View;
public final class dk0 implements Runnable {
    public final int f38633a;
    public final NotificationsCustomSettingsActivity f38634b;
    public final qk0 f38635c;
    public final View d;

    public dk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, qk0 qk0Var, View view, int i10, int i11) {
        this.f38633a = i11;
        this.f38634b = notificationsCustomSettingsActivity;
        this.f38635c = qk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f38633a) {
            case 0:
                this.f38634b.l0(this.f38635c, this.d, false);
                return;
            case 1:
                this.f38634b.f0(this.f38635c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.Y(this.f38634b, this.f38635c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.W(this.f38634b, this.f38635c, this.d);
                return;
            case 4:
                this.f38634b.f0(this.f38635c, this.d);
                return;
            default:
                this.f38634b.l0(this.f38635c, this.d, true);
                return;
        }
    }

    public dk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, qk0 qk0Var, View view, boolean z10, int i10) {
        this.f38633a = i10;
        this.f38634b = notificationsCustomSettingsActivity;
        this.f38635c = qk0Var;
        this.d = view;
    }
}
