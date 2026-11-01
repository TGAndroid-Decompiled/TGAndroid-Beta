package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
public final class id0 implements org.telegram.ui.ActionBar.u1 {
    public final int f27085a;
    public final Activity f27086b;

    public id0(Activity activity, int i10) {
        this.f27085a = i10;
        this.f27086b = activity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f27085a) {
            case 0:
                Activity activity = this.f27086b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f18945b.getPackageName()));
                    activity.startActivity(intent);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                Activity activity2 = this.f27086b;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + org.telegram.messenger.w0.f18945b.getPackageName()));
                    activity2.startActivity(intent2);
                    return;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
        }
    }
}
