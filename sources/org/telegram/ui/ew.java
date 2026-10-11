package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class ew implements Utilities.Callback {
    public final int f37467a;
    public final Activity f37468b;

    public ew(Activity activity, int i10) {
        this.f37467a = i10;
        this.f37468b = activity;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f37467a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!org.telegram.ui.Components.gf0.a()) {
                        org.telegram.ui.Components.gf0.f();
                        return;
                    }
                    this.f37468b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!org.telegram.ui.Components.gf0.a()) {
                        org.telegram.ui.Components.gf0.f();
                        return;
                    }
                    this.f37468b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
