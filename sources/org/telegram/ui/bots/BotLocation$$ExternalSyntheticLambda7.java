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
            default:
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                Activity activity2 = this.f$0;
                intent2.setData(Uri.fromParts("package", activity2.getPackageName(), null));
                activity2.startActivity(intent2);
                break;
        }
    }
}
