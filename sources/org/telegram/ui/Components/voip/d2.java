package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class d2 implements org.telegram.ui.ActionBar.b2 {
    public final int f33659a;
    public final Activity f33660b;

    public d2(Activity activity, int i10) {
        this.f33659a = i10;
        this.f33660b = activity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f33659a) {
            case 0:
                Activity activity = this.f33660b;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
                activity.startActivity(intent);
                return;
            default:
                Activity activity2 = this.f33660b;
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
