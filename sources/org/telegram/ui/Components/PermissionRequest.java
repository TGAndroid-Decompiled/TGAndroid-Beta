package org.telegram.ui.Components;

import android.app.Activity;
import android.content.DialogInterface;
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

    public static void ensurePermission(int i, int i2, String str, Utilities.Callback<Boolean> callback) {
        ensureEitherPermission(i, i2, new String[]{str}, new String[]{str}, callback);
    }

    public static void ensureEitherPermission(int i, int i2, String[] strArr, final String[] strArr2, final Utilities.Callback<Boolean> callback) {
        boolean z;
        boolean z2;
        boolean shouldShowRequestPermissionRationale;
        int checkSelfPermission;
        final Activity activity = LaunchActivity.instance;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (callback != null) {
                callback.run(Boolean.TRUE);
                return;
            }
            return;
        }
        int length = strArr.length;
        int i3 = 0;
        while (true) {
            z = true;
            if (i3 >= length) {
                z2 = false;
                break;
            }
            checkSelfPermission = activity.checkSelfPermission(strArr[i3]);
            if (checkSelfPermission == 0) {
                z2 = true;
                break;
            }
            i3++;
        }
        if (z2) {
            if (callback != null) {
                callback.run(Boolean.TRUE);
                return;
            }
            return;
        }
        int length2 = strArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length2) {
                z = false;
                break;
            }
            shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(strArr[i4]);
            if (shouldShowRequestPermissionRationale) {
                break;
            }
            i4++;
        }
        if (z) {
            new AlertDialog.Builder(activity, null).setTopAnimation(i, 72, false, Theme.getColor(Theme.key_dialogTopBackground)).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(i2))).setPositiveButton(LocaleController.getString("PermissionOpenSettings", R.string.PermissionOpenSettings), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    PermissionRequest.lambda$ensureEitherPermission$0(activity, dialogInterface, i5);
                }
            }).setNegativeButton(LocaleController.getString("ContactsPermissionAlertNotNow", R.string.ContactsPermissionAlertNotNow), null).create().show();
            if (callback != null) {
                callback.run(Boolean.FALSE);
                return;
            }
            return;
        }
        requestPermissions(strArr2, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                PermissionRequest.lambda$ensureEitherPermission$1(strArr2, activity, callback, (int[]) obj);
            }
        });
    }

    public static void lambda$ensureEitherPermission$0(Activity activity, DialogInterface dialogInterface, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            activity.startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$ensureEitherPermission$1(String[] strArr, Activity activity, Utilities.Callback callback, int[] iArr) {
        int checkSelfPermission;
        int length = strArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            checkSelfPermission = activity.checkSelfPermission(strArr[i]);
            if (checkSelfPermission == 0) {
                z = true;
                break;
            }
            i++;
        }
        if (callback != null) {
            callback.run(Boolean.valueOf(z));
        }
    }

    public static void requestPermissions(String[] strArr, final Utilities.Callback<int[]> callback) {
        Activity activity = LaunchActivity.instance;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity == null) {
            return;
        }
        final int i = lastId;
        lastId = i + 1;
        final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = {new NotificationCenter.NotificationCenterDelegate() {
            @Override
            public void didReceivedNotification(int i2, int i3, Object... objArr) {
                int i4 = NotificationCenter.activityPermissionsGranted;
                if (i2 == i4) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    String[] strArr2 = (String[]) objArr[1];
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == i) {
                        Utilities.Callback callback2 = callback;
                        if (callback2 != null) {
                            callback2.run(iArr);
                        }
                        NotificationCenter.getGlobalInstance().removeObserver(notificationCenterDelegateArr[0], i4);
                    }
                }
            }
        }};
        NotificationCenter.getGlobalInstance().addObserver(notificationCenterDelegateArr[0], NotificationCenter.activityPermissionsGranted);
        activity.requestPermissions(strArr, i);
    }

    public static boolean hasPermission(String str) {
        int checkSelfPermission;
        Activity activity = LaunchActivity.instance;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            checkSelfPermission = activity.checkSelfPermission(str);
            return checkSelfPermission == 0;
        }
        return true;
    }
}
