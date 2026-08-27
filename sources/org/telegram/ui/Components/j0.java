package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;

public final class j0 implements org.telegram.ui.ActionBar.a2 {

    public final int f29528a;

    public final Context f29529b;

    public j0(Context context, int i10) {
        this.f29528a = i10;
        this.f29529b = context;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f29528a) {
            case 0:
                Context context = this.f29529b;
                try {
                    context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            case 1:
                Context context2 = this.f29529b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    context2.startActivity(intent);
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 2:
                we.e.s(this.f29529b, BuildVars.PLAYSTORE_APP_URL);
                break;
            default:
                Context context3 = this.f29529b;
                if (context3 != null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 23) {
                            Intent intent2 = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context3.getPackageName()));
                            Activity activityFindActivity = AndroidUtilities.findActivity(context3);
                            if (activityFindActivity instanceof LaunchActivity) {
                                activityFindActivity.startActivityForResult(intent2, 105);
                            } else {
                                context3.startActivity(intent2);
                            }
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        return;
                    }
                }
                break;
        }
    }
}
