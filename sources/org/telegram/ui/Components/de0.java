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
public abstract class de0 {
    public static int f25402a = 1500;

    public static void a(String[] strArr, Activity activity, Utilities.Callback callback) {
        int length = strArr.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            } else if (activity.checkSelfPermission(strArr[i10]) == 0) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        callback.run(Boolean.valueOf(z10));
    }

    public static void b(String[] strArr, Activity activity, Utilities.Callback callback) {
        int length = strArr.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (activity.checkSelfPermission(strArr[i10]) != 0) {
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        callback.run(Boolean.valueOf(z10));
    }

    public static boolean c() {
        Activity activity = LaunchActivity.G1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity != null && Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
        }
        return false;
    }

    public static void d(int i10, int i11, String[] strArr, Utilities.Callback callback) {
        Activity activity = LaunchActivity.G1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            for (String str : strArr) {
                if (activity.checkSelfPermission(str) != 0) {
                    for (String str2 : strArr) {
                        if (activity.shouldShowRequestPermissionRationale(str2)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, null);
                            alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                            alertDialog$Builder.f20225a.T = AndroidUtilities.replaceTags(LocaleController.getString(i11));
                            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new k1(activity, 2));
                            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                            alertDialog$Builder.f20225a.show();
                            callback.run(Boolean.FALSE);
                            return;
                        }
                    }
                    g(strArr, new be0(strArr, activity, callback, 1));
                    return;
                }
            }
            callback.run(Boolean.TRUE);
            return;
        }
        callback.run(Boolean.TRUE);
    }

    public static void e(int i10, int i11, String[] strArr, String[] strArr2, Utilities.Callback callback) {
        Activity activity = LaunchActivity.G1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            for (String str : strArr) {
                if (activity.checkSelfPermission(str) == 0) {
                    callback.run(Boolean.TRUE);
                    return;
                }
            }
            for (String str2 : strArr) {
                if (!activity.shouldShowRequestPermissionRationale(str2)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, null);
                    alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                    alertDialog$Builder.f20225a.T = AndroidUtilities.replaceTags(LocaleController.getString(i11));
                    alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new k1(activity, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                    alertDialog$Builder.f20225a.show();
                    callback.run(Boolean.FALSE);
                    return;
                }
            }
            g(strArr2, new be0(strArr2, activity, callback, 0));
            return;
        }
        callback.run(Boolean.TRUE);
    }

    public static boolean f(String str) {
        Activity activity = LaunchActivity.G1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23 && activity.checkSelfPermission(str) != 0) {
            return false;
        }
        return true;
    }

    public static void g(String[] strArr, Utilities.Callback callback) {
        int i10;
        Activity activity = LaunchActivity.G1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                int i11 = f25402a;
                f25402a = i11 + 1;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = {new ce0(i11, callback, notificationCenterDelegateArr)};
                NotificationCenter.getGlobalInstance().addObserver(notificationCenterDelegateArr[0], NotificationCenter.activityPermissionsGranted);
                activity.requestPermissions(strArr, i11);
            } else if (callback != null) {
                int[] iArr = new int[strArr.length];
                for (int i12 = 0; i12 < strArr.length; i12++) {
                    if (f(strArr[i12])) {
                        i10 = 0;
                    } else {
                        i10 = -1;
                    }
                    iArr[i12] = i10;
                }
                callback.run(iArr);
            }
        }
    }

    public static void h() {
        Activity activity = LaunchActivity.G1;
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
