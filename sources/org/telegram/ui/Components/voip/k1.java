package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.f8;
public final class k1 implements org.telegram.ui.ActionBar.u1 {
    public final int f31567a;
    public final Activity f31568b;

    public k1(Activity activity, int i10) {
        this.f31567a = i10;
        this.f31568b = activity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f31567a) {
            case 0:
                Activity activity = this.f31568b;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
                activity.startActivity(intent);
                return;
            default:
                Activity activity2 = this.f31568b;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + org.telegram.messenger.w0.f18945b.getPackageName()));
                    activity2.startActivity(intent2);
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
        }
    }
}
