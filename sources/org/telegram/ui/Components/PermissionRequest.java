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

public class PermissionRequest {
    private static int lastId = 1500;

    public static boolean canAskPermission(String str) {
        Activity activityFindActivity = LaunchActivity.instance;
        if (activityFindActivity == null) {
            activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activityFindActivity != null && Build.VERSION.SDK_INT >= 23) {
            return activityFindActivity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void ensureAllPermissions(int i, int i2, String[] strArr, Utilities.Callback<Boolean> callback) {
        ensureAllPermissions(i, i2, strArr, strArr, callback);
    }

    public static void ensureEitherPermission(int i, int i2, String[] strArr, Utilities.Callback<Boolean> callback) {
        ensureEitherPermission(i, i2, strArr, strArr, callback);
    }

    public static void ensurePermission(int i, int i2, String str) {
        ensurePermission(i, i2, str, null);
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

    public static void lambda$ensureAllPermissions$2(Activity activity, AlertDialog alertDialog, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            activity.startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$ensureAllPermissions$3(String[] strArr, Activity activity, Utilities.Callback callback, int[] iArr) {
        int length = strArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            } else if (activity.checkSelfPermission(strArr[i]) != 0) {
                break;
            } else {
                i++;
            }
        }
        if (callback != null) {
            callback.run(Boolean.valueOf(z));
        }
    }

    public static void lambda$ensureEitherPermission$0(Activity activity, AlertDialog alertDialog, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            activity.startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$ensureEitherPermission$1(String[] strArr, Activity activity, Utilities.Callback callback, int[] iArr) {
        boolean z = false;
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) == 0) {
                z = true;
                break;
            }
        }
        if (callback != null) {
            callback.run(Boolean.valueOf(z));
        }
    }

    public static void lambda$requestPermission$4(Utilities.Callback callback, int[] iArr) {
        boolean z = false;
        if (iArr.length >= 1 && iArr[0] == 0) {
            z = true;
        }
        callback.run(Boolean.valueOf(z));
    }

    public static void requestPermission(String str, Utilities.Callback<Boolean> callback) {
        requestPermissions(new String[]{str}, callback != null ? new PermissionRequest$$ExternalSyntheticLambda3(0, callback) : null);
    }

    public static void requestPermissions(String[] strArr, final Utilities.Callback<int[]> callback) {
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
                public void didReceivedNotification(int i2, int i3, Object... objArr) {
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

    public static void showPermissionSettings(String str) {
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

    public static void ensureAllPermissions(int i, int i2, String[] strArr, String[] strArr2, Utilities.Callback<Boolean> callback) {
        Activity activityFindActivity = LaunchActivity.instance;
        if (activityFindActivity == null) {
            activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activityFindActivity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (callback != null) {
                callback.run(Boolean.TRUE);
                return;
            }
            return;
        }
        for (String str : strArr) {
            if (activityFindActivity.checkSelfPermission(str) != 0) {
                for (String str2 : strArr) {
                    if (activityFindActivity.shouldShowRequestPermissionRationale(str2)) {
                        new AlertDialog.Builder(activityFindActivity, 0, null).setTopAnimation(i, 72, false, Theme.getColor(null, Theme.key_dialogTopBackground, false)).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(i2))).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new AlertsCreator$$ExternalSyntheticLambda100(activityFindActivity, 1)).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).create().show();
                        if (callback != null) {
                            callback.run(Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                }
                requestPermissions(strArr2, new PermissionRequest$$ExternalSyntheticLambda2(strArr2, activityFindActivity, callback, 0));
                return;
            }
        }
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
    }

    public static void ensureEitherPermission(int i, int i2, String[] strArr, String[] strArr2, Utilities.Callback<Boolean> callback) {
        Activity activityFindActivity = LaunchActivity.instance;
        if (activityFindActivity == null) {
            activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activityFindActivity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (callback != null) {
                callback.run(Boolean.TRUE);
                return;
            }
            return;
        }
        for (String str : strArr) {
            if (activityFindActivity.checkSelfPermission(str) == 0) {
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                    return;
                }
                return;
            }
        }
        for (String str2 : strArr) {
            if (!activityFindActivity.shouldShowRequestPermissionRationale(str2)) {
                new AlertDialog.Builder(activityFindActivity, 0, null).setTopAnimation(i, 72, false, Theme.getColor(null, Theme.key_dialogTopBackground, false)).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(i2))).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new AlertsCreator$$ExternalSyntheticLambda100(activityFindActivity, 2)).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).create().show();
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
            }
        }
        requestPermissions(strArr2, new PermissionRequest$$ExternalSyntheticLambda2(strArr2, activityFindActivity, callback, 1));
    }

    public static void ensurePermission(int i, int i2, String str, Utilities.Callback<Boolean> callback) {
        ensureEitherPermission(i, i2, new String[]{str}, new String[]{str}, callback);
    }
}
