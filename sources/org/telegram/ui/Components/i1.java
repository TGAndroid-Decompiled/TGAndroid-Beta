package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class i1 implements org.telegram.ui.ActionBar.c2 {
    public final int f27682a;
    public final Activity f27683b;

    public i1(Activity activity, int i10) {
        this.f27682a = i10;
        this.f27683b = activity;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f27682a) {
            case 0:
                z4.a(this.f27683b);
                return;
            case 1:
                Activity activity = this.f27683b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                Activity activity2 = this.f27683b;
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
