package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class kw implements Utilities.Callback {
    public final int f37535a;
    public final Activity f37536b;

    public kw(Activity activity, int i10) {
        this.f37535a = i10;
        this.f37536b = activity;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f37535a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!org.telegram.ui.Components.df0.a()) {
                        org.telegram.ui.Components.df0.f();
                        return;
                    }
                    this.f37536b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!org.telegram.ui.Components.df0.a()) {
                        org.telegram.ui.Components.df0.f();
                        return;
                    }
                    this.f37536b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
