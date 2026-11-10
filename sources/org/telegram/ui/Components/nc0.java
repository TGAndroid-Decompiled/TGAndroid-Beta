package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
public final class nc0 implements org.telegram.ui.ActionBar.r1 {
    public final int f36290a;
    public final Activity f36291b;

    public nc0(Activity activity, int i7) {
        this.f36290a = i7;
        this.f36291b = activity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f36290a) {
            case 0:
                Activity activity = this.f36291b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25570b.getPackageName()));
                    activity.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                Activity activity2 = this.f36291b;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25570b.getPackageName()));
                    activity2.startActivity(intent2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
