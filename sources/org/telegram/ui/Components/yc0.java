package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
public final class yc0 implements org.telegram.ui.ActionBar.r1 {
    public final int f42468a;
    public final Activity f42469b;

    public yc0(Activity activity, int i7) {
        this.f42468a = i7;
        this.f42469b = activity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f42468a) {
            case 0:
                Activity activity = this.f42469b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26913b.getPackageName()));
                    activity.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                Activity activity2 = this.f42469b;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26913b.getPackageName()));
                    activity2.startActivity(intent2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
