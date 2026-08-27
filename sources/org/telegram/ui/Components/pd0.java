package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

public abstract class pd0 {

    public static int f31590a = 1500;

    public static void a(String[] strArr, Activity activity, Utilities.Callback callback) {
        boolean z10 = false;
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) == 0) {
                z10 = true;
                break;
            }
        }
        callback.run(Boolean.valueOf(z10));
    }

    public static void b(String[] strArr, Activity activity, Utilities.Callback callback) {
        boolean z10 = false;
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) != 0) {
                callback.run(Boolean.valueOf(z10));
            }
        }
        z10 = true;
        callback.run(Boolean.valueOf(z10));
    }

    public static boolean c() {
        Activity activityFindActivity = LaunchActivity.C1;
        if (activityFindActivity == null) {
            activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activityFindActivity != null && Build.VERSION.SDK_INT >= 23) {
            return activityFindActivity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
        }
        return false;
    }

    public static void d(int i10, int i11, String[] strArr, Utilities.Callback callback) {
        Activity activityFindActivity = LaunchActivity.C1;
        if (activityFindActivity == null) {
            activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activityFindActivity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23) {
            callback.run(Boolean.TRUE);
            return;
        }
        for (String str : strArr) {
            if (activityFindActivity.checkSelfPermission(str) != 0) {
                for (String str2 : strArr) {
                    if (activityFindActivity.shouldShowRequestPermissionRationale(str2)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activityFindActivity, 0, null);
                        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                        alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(i11));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new i1(activityFindActivity, 2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog$Builder.f22702a.show();
                        callback.run(Boolean.FALSE);
                        return;
                    }
                }
                g(strArr, new nd0(strArr, activityFindActivity, callback, 1));
                return;
            }
        }
        callback.run(Boolean.TRUE);
    }

    public static void e(int i10, int i11, String[] strArr, String[] strArr2, Utilities.Callback callback) {
        Activity activityFindActivity = LaunchActivity.C1;
        if (activityFindActivity == null) {
            activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activityFindActivity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23) {
            callback.run(Boolean.TRUE);
            return;
        }
        for (String str : strArr) {
            if (activityFindActivity.checkSelfPermission(str) == 0) {
                callback.run(Boolean.TRUE);
                return;
            }
        }
        for (String str2 : strArr) {
            if (!activityFindActivity.shouldShowRequestPermissionRationale(str2)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activityFindActivity, 0, null);
                alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(i11));
                alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new i1(activityFindActivity, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                alertDialog$Builder.f22702a.show();
                callback.run(Boolean.FALSE);
                return;
            }
        }
        g(strArr2, new nd0(strArr2, activityFindActivity, callback, 0));
    }

    public static boolean f(String str) {
        Activity activityFindActivity = LaunchActivity.C1;
        if (activityFindActivity == null) {
            activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activityFindActivity == null) {
            return false;
        }
        return Build.VERSION.SDK_INT < 23 || activityFindActivity.checkSelfPermission(str) == 0;
    }

    public static void g(String[] strArr, Utilities.Callback callback) {
        Activity activityFindActivity = LaunchActivity.C1;
        if (activityFindActivity == null) {
            activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activityFindActivity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            int i10 = f31590a;
            f31590a = i10 + 1;
            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
            notificationCenterDelegateArr[0] = new od0(i10, callback, notificationCenterDelegateArr);
            NotificationCenter.getGlobalInstance().addObserver(notificationCenterDelegateArr[0], NotificationCenter.activityPermissionsGranted);
            activityFindActivity.requestPermissions(strArr, i10);
            return;
        }
        if (callback != null) {
            int[] iArr = new int[strArr.length];
            for (int i11 = 0; i11 < strArr.length; i11++) {
                iArr[i11] = f(strArr[i11]) ? 0 : -1;
            }
            callback.run(iArr);
        }
    }

    public static void h() {
        Activity activityFindActivity = LaunchActivity.C1;
        if (activityFindActivity == null) {
            activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activityFindActivity == null) {
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
        try {
            activityFindActivity.startActivity(intent);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
