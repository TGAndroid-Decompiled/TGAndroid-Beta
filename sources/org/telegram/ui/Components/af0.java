package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public abstract class af0 {
    public static int f24712a = 1500;

    public static boolean a() {
        Activity activity = LaunchActivity.J1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity == null) {
            return false;
        }
        return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
    }

    public static void b(int i10, int i11, String[] strArr, Utilities.Callback callback) {
        Activity activity = LaunchActivity.J1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity == null) {
            return;
        }
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) != 0) {
                for (String str2 : strArr) {
                    if (activity.shouldShowRequestPermissionRationale(str2)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, null);
                        int i12 = org.telegram.ui.ActionBar.k6.L5;
                        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.k6.x0(null, i12, false), null);
                        alertDialog$Builder.n(i12, null);
                        alertDialog$Builder.f20678a.T = AndroidUtilities.replaceTags(LocaleController.getString(i11));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new j1(activity, 2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog$Builder.f20678a.show();
                        callback.run(Boolean.FALSE);
                        return;
                    }
                }
                e(strArr, new ye0(strArr, activity, callback, 1));
                return;
            }
        }
        callback.run(Boolean.TRUE);
    }

    public static void c(int i10, int i11, String[] strArr, String[] strArr2, Utilities.Callback callback) {
        Activity activity = LaunchActivity.J1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity == null) {
            return;
        }
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) == 0) {
                callback.run(Boolean.TRUE);
                return;
            }
        }
        for (String str2 : strArr) {
            if (!activity.shouldShowRequestPermissionRationale(str2)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, null);
                int i12 = org.telegram.ui.ActionBar.k6.L5;
                alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.k6.x0(null, i12, false), null);
                alertDialog$Builder.n(i12, null);
                alertDialog$Builder.f20678a.T = AndroidUtilities.replaceTags(LocaleController.getString(i11));
                alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new j1(activity, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                alertDialog$Builder.f20678a.show();
                callback.run(Boolean.FALSE);
                return;
            }
        }
        e(strArr2, new ye0(strArr2, activity, callback, 0));
    }

    public static boolean d(String str) {
        Context context = LaunchActivity.J1;
        if (context == null) {
            context = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (context != null && context.checkSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public static void e(String[] strArr, Utilities.Callback callback) {
        Activity activity = LaunchActivity.J1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity == null) {
            return;
        }
        int i10 = f24712a;
        f24712a = i10 + 1;
        NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = {new ze0(i10, callback, notificationCenterDelegateArr)};
        NotificationCenter.getGlobalInstance().addObserver(notificationCenterDelegateArr[0], NotificationCenter.activityPermissionsGranted);
        activity.requestPermissions(strArr, i10);
    }

    public static void f() {
        Activity activity = LaunchActivity.J1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity == null) {
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
        try {
            activity.startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
