package org.telegram.ui.bots;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.AlertDialog;

public final class BotLocation$$ExternalSyntheticLambda7 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final Activity f$0;

    public BotLocation$$ExternalSyntheticLambda7(Activity activity, int i) {
        this.$r8$classId = i;
        this.f$0 = activity;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                Activity activity = this.f$0;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 1:
                Activity activity2 = this.f$0;
                if (activity2.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    activity2.requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 30);
                }
                break;
            case 2:
                Activity activity3 = this.f$0;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity3.startActivity(intent2);
                } catch (Exception e2) {
                    FileLog.e(e2);
                    return;
                }
                break;
            case 3:
                Activity activity4 = this.f$0;
                try {
                    activity4.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + activity4.getPackageName())));
                } catch (Exception e3) {
                    FileLog.e(e3);
                    return;
                }
                break;
            case 4:
                Activity activity5 = this.f$0;
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity5.startActivity(intent3);
                } catch (Exception e4) {
                    FileLog.e(e4);
                    return;
                }
                break;
            case 5:
                Activity activity6 = this.f$0;
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity6.startActivity(intent4);
                } catch (Exception e5) {
                    FileLog.e(e5);
                    return;
                }
                break;
            default:
                Intent intent5 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                Activity activity7 = this.f$0;
                intent5.setData(Uri.fromParts("package", activity7.getPackageName(), null));
                activity7.startActivity(intent5);
                break;
        }
    }
}
