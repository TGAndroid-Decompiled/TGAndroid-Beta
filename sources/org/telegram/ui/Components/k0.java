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
public final class k0 implements org.telegram.ui.ActionBar.c2 {
    public final int f26077a;
    public final Context f26078b;

    public k0(Context context, int i10) {
        this.f26077a = i10;
        this.f26078b = context;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f26077a) {
            case 0:
                Context context = this.f26078b;
                try {
                    context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Context context2 = this.f26078b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    context2.startActivity(intent);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 2:
                af.g.s(this.f26078b, BuildVars.PLAYSTORE_APP_URL);
                return;
            default:
                Context context3 = this.f26078b;
                if (context3 != null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 23) {
                            Intent intent2 = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context3.getPackageName()));
                            Activity findActivity = AndroidUtilities.findActivity(context3);
                            if (findActivity instanceof LaunchActivity) {
                                findActivity.startActivityForResult(intent2, 105);
                            } else {
                                context3.startActivity(intent2);
                            }
                        }
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
        }
    }
}
