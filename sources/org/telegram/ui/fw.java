package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class fw implements Utilities.Callback {
    public final int f37704a;
    public final Activity f37705b;

    public fw(Activity activity, int i10) {
        this.f37704a = i10;
        this.f37705b = activity;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f37704a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!org.telegram.ui.Components.ef0.a()) {
                        org.telegram.ui.Components.ef0.f();
                        return;
                    }
                    this.f37705b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!org.telegram.ui.Components.ef0.a()) {
                        org.telegram.ui.Components.ef0.f();
                        return;
                    }
                    this.f37705b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
