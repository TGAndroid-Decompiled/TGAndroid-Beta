package org.telegram.ui;

import android.app.Activity;
public final class ou implements org.telegram.messenger.u10 {
    public final int f48352a;
    public final Activity f48353b;

    public ou(Activity activity, int i3) {
        this.f48352a = i3;
        this.f48353b = activity;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f48352a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!b8.nf.a()) {
                        b8.nf.f();
                        return;
                    }
                    this.f48353b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!b8.nf.a()) {
                        b8.nf.f();
                        return;
                    }
                    this.f48353b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
