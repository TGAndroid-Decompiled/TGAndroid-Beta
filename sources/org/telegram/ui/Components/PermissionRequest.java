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
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bots.BotLocation$$ExternalSyntheticLambda7;

public abstract class PermissionRequest {
    public static int lastId = 1500;

    public static boolean canAskPermission() {
        Activity activityFindActivity = LaunchActivity.instance;
        if (activityFindActivity == null) {
            activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activityFindActivity != null && Build.VERSION.SDK_INT >= 23) {
            return activityFindActivity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
        }
        return false;
    }

    public static void ensureAllPermissions(int i, int i2, String[] strArr, String[] strArr2, Utilities.Callback callback) {
        Activity activityFindActivity = LaunchActivity.instance;
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
                        AlertDialog.Builder builder = new AlertDialog.Builder(activityFindActivity, 0, null);
                        builder.setTopAnimation(i, 72, Theme.getColor(null, Theme.key_dialogTopBackground, false), null);
                        builder.alertDialog.message = AndroidUtilities.replaceTags(LocaleController.getString(i2));
                        builder.setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new BotLocation$$ExternalSyntheticLambda7(activityFindActivity, 5));
                        builder.setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        builder.alertDialog.show();
                        callback.run(Boolean.FALSE);
                        return;
                    }
                }
                requestPermissions(strArr2, new PermissionRequest$$ExternalSyntheticLambda4(strArr2, activityFindActivity, callback, 1));
                return;
            }
        }
        callback.run(Boolean.TRUE);
    }

    public static void ensureEitherPermission(int i, int i2, String[] strArr, String[] strArr2, Utilities.Callback callback) {
        Activity activityFindActivity = LaunchActivity.instance;
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
                AlertDialog.Builder builder = new AlertDialog.Builder(activityFindActivity, 0, null);
                builder.setTopAnimation(i, 72, Theme.getColor(null, Theme.key_dialogTopBackground, false), null);
                builder.alertDialog.message = AndroidUtilities.replaceTags(LocaleController.getString(i2));
                builder.setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new BotLocation$$ExternalSyntheticLambda7(activityFindActivity, 4));
                builder.setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                builder.alertDialog.show();
                callback.run(Boolean.FALSE);
                return;
            }
        }
        requestPermissions(strArr2, new PermissionRequest$$ExternalSyntheticLambda4(strArr2, activityFindActivity, callback, 0));
    }

    public static boolean hasPermission(String str) {
        Activity activityFindActivity = LaunchActivity.instance;
        if (activityFindActivity == null) {
            activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activityFindActivity == null) {
            return false;
        }
        return Build.VERSION.SDK_INT < 23 || activityFindActivity.checkSelfPermission(str) == 0;
    }

    public static void requestPermissions(String[] strArr, final Utilities.Callback callback) {
        Activity activityFindActivity = LaunchActivity.instance;
        if (activityFindActivity == null) {
            activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activityFindActivity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            final int i = lastId;
            lastId = i + 1;
            final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
            notificationCenterDelegateArr[0] = new NotificationCenter.NotificationCenterDelegate() {
                @Override
                public final void didReceivedNotification(int i2, int i3, Object... objArr) {
                    int i4 = NotificationCenter.activityPermissionsGranted;
                    if (i2 == i4) {
                        int iIntValue = ((Integer) objArr[0]).intValue();
                        int[] iArr = (int[]) objArr[2];
                        if (iIntValue == i) {
                            Utilities.Callback callback2 = callback;
                            if (callback2 != null) {
                                callback2.run(iArr);
                            }
                            NotificationCenter.getGlobalInstance().removeObserver(notificationCenterDelegateArr[0], i4);
                        }
                    }
                }
            };
            NotificationCenter.getGlobalInstance().addObserver(notificationCenterDelegateArr[0], NotificationCenter.activityPermissionsGranted);
            activityFindActivity.requestPermissions(strArr, i);
            return;
        }
        if (callback != null) {
            int[] iArr = new int[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                iArr[i2] = hasPermission(strArr[i2]) ? 0 : -1;
            }
            callback.run(iArr);
        }
    }

    public static void showPermissionSettings() {
        Activity activityFindActivity = LaunchActivity.instance;
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
