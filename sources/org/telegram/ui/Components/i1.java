package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

public final class i1 implements org.telegram.ui.ActionBar.a2 {

    public final int f29196a;

    public final Activity f29197b;

    public i1(Activity activity, int i10) {
        this.f29196a = i10;
        this.f29197b = activity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f29196a) {
            case 0:
                y4.a(this.f29197b);
                break;
            case 1:
                Activity activity = this.f29197b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            default:
                Activity activity2 = this.f29197b;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity2.startActivity(intent2);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                break;
        }
    }
}
