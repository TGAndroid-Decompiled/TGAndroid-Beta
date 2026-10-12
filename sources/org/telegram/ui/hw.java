package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class hw implements Utilities.Callback {
    public final int f38551a;
    public final Activity f38552b;

    public hw(Activity activity, int i10) {
        this.f38551a = i10;
        this.f38552b = activity;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f38551a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!org.telegram.ui.Components.if0.a()) {
                        org.telegram.ui.Components.if0.f();
                        return;
                    }
                    this.f38552b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!org.telegram.ui.Components.if0.a()) {
                        org.telegram.ui.Components.if0.f();
                        return;
                    }
                    this.f38552b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
