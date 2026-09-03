package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class i1 implements org.telegram.ui.ActionBar.c2 {
    public final int f25552a;
    public final Activity f25553b;

    public i1(Activity activity, int i10) {
        this.f25552a = i10;
        this.f25553b = activity;
    }

    @Override
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f25552a) {
            case 0:
                z4.a(this.f25553b);
                return;
            case 1:
                Activity activity = this.f25553b;
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
                Activity activity2 = this.f25553b;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity2.startActivity(intent2);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }
}
