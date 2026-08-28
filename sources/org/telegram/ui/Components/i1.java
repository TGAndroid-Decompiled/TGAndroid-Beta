package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class i1 implements org.telegram.ui.ActionBar.b2 {
    public final int f29259a;
    public final Activity f29260b;

    public i1(Activity activity, int i9) {
        this.f29259a = i9;
        this.f29260b = activity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f29259a) {
            case 0:
                y4.a(this.f29260b);
                return;
            case 1:
                Activity activity = this.f29260b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                Activity activity2 = this.f29260b;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity2.startActivity(intent2);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
