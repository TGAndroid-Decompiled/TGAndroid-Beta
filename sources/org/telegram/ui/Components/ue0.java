package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class ue0 implements org.telegram.ui.ActionBar.b2 {
    public final int f33381a;
    public final Activity f33382b;

    public ue0(Activity activity, int i10) {
        this.f33381a = i10;
        this.f33382b = activity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f33381a) {
            case 0:
                Activity activity = this.f33382b;
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
                Activity activity2 = this.f33382b;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity2.startActivity(intent2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
