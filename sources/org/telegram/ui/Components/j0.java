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
public final class j0 implements org.telegram.ui.ActionBar.z1 {
    public final int f27502a;
    public final Context f27503b;

    public j0(Context context, int i10) {
        this.f27502a = i10;
        this.f27503b = context;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f27502a) {
            case 0:
                Context context = this.f27503b;
                try {
                    context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                Context context2 = this.f27503b;
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
                of.f.s(this.f27503b, BuildVars.PLAYSTORE_APP_URL);
                return;
            default:
                Context context3 = this.f27503b;
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
