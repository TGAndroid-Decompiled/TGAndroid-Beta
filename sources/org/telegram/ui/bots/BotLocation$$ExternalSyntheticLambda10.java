package org.telegram.ui.bots;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.LaunchActivity;

public final class BotLocation$$ExternalSyntheticLambda10 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final Context f$0;

    public BotLocation$$ExternalSyntheticLambda10(Context context, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                try {
                    this.f$0.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                } catch (Exception unused) {
                    return;
                }
                break;
            case 1:
                Browser.openUrl(this.f$0, BuildVars.PLAYSTORE_APP_URL);
                break;
            case 2:
                Context context = this.f$0;
                if (context != null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 23) {
                            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
                            Activity activityFindActivity = AndroidUtilities.findActivity(context);
                            if (activityFindActivity instanceof LaunchActivity) {
                                activityFindActivity.startActivityForResult(intent, 105);
                            } else {
                                context.startActivity(intent);
                            }
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            default:
                try {
                    this.f$0.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }
}
