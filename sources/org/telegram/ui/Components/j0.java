package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;
public final class j0 implements org.telegram.ui.ActionBar.b2 {
    public final int f29454a;
    public final Context f29455b;

    public j0(Context context, int i10) {
        this.f29454a = i10;
        this.f29455b = context;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f29454a) {
            case 0:
                Context context = this.f29455b;
                try {
                    context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Context context2 = this.f29455b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    context2.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 2:
                qf.d.r(this.f29455b, BuildVars.PLAYSTORE_APP_URL);
                return;
            default:
                Context context3 = this.f29455b;
                if (context3 != null) {
                    try {
                        Intent intent2 = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context3.getPackageName()));
                        Activity findActivity = AndroidUtilities.findActivity(context3);
                        if (findActivity instanceof LaunchActivity) {
                            findActivity.startActivityForResult(intent2, 105);
                        } else {
                            context3.startActivity(intent2);
                        }
                        return;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        return;
                    }
                }
                return;
        }
    }
}
