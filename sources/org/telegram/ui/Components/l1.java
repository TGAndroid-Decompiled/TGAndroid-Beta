package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class l1 implements org.telegram.ui.ActionBar.c2 {
    public final int f24845a;
    public final Activity f24846b;

    public l1(Activity activity, int i10) {
        this.f24845a = i10;
        this.f24846b = activity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f24845a) {
            case 0:
                d5.a(this.f24846b);
                return;
            case 1:
                Activity activity = this.f24846b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                Activity activity2 = this.f24846b;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity2.startActivity(intent2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
