package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class lw implements Utilities.Callback {
    public final int f38099a;
    public final Activity f38100b;

    public lw(Activity activity, int i10) {
        this.f38099a = i10;
        this.f38100b = activity;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f38099a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!org.telegram.ui.Components.cf0.a()) {
                        org.telegram.ui.Components.cf0.f();
                        return;
                    }
                    this.f38100b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!org.telegram.ui.Components.cf0.a()) {
                        org.telegram.ui.Components.cf0.f();
                        return;
                    }
                    this.f38100b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
