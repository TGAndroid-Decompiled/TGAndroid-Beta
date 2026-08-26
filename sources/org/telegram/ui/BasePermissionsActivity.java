package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;

public class BasePermissionsActivity extends FragmentActivity {
    public static final int REQUEST_CODE_ATTACH_CONTACT = 5;
    public static final int REQUEST_CODE_CALLS = 7;
    public static final int REQUEST_CODE_EXTERNAL_STORAGE = 4;
    public static final int REQUEST_CODE_EXTERNAL_STORAGE_FOR_AVATAR = 151;
    public static final int REQUEST_CODE_GEOLOCATION = 2;
    public static final int REQUEST_CODE_MEDIA_GEO = 211;
    public static final int REQUEST_CODE_OPEN_CAMERA = 20;
    public static final int REQUEST_CODE_PAYMENT_FORM = 210;
    public static final int REQUEST_CODE_SIGN_IN_WITH_GOOGLE = 200;
    public static final int REQUEST_CODE_VIDEO_MESSAGE = 150;
    protected int currentAccount = -1;

    public void lambda$createPermissionErrorAlert$0(AlertDialog alertDialog, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void showPermissionErrorAlert(int i, String str) {
        createPermissionErrorAlert(i, str).show();
    }

    public boolean checkPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null) {
            iArr = new int[0];
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        boolean z = iArr.length > 0 && iArr[0] == 0;
        if (i == 104) {
            if (z) {
                GroupCallActivity groupCallActivity = GroupCallActivity.groupCallInstance;
                if (groupCallActivity != null) {
                    groupCallActivity.enableCamera();
                }
            } else {
                showPermissionErrorAlert(R.raw.permission_request_camera, LocaleController.getString(R.string.VoipNeedCameraPermission));
            }
        } else if (i == 4 || i == 151) {
            if (z) {
                ImageLoader.getInstance().checkMediaPaths();
            } else {
                showPermissionErrorAlert(R.raw.permission_request_folder, i == 151 ? LocaleController.getString(R.string.PermissionNoStorageAvatar) : LocaleController.getString(R.string.PermissionStorageWithHint));
            }
        } else if (i == 5) {
            if (!z) {
                showPermissionErrorAlert(R.raw.permission_request_contacts, LocaleController.getString(R.string.PermissionNoContactsSharing));
                return false;
            }
            ContactsController.getInstance(this.currentAccount).forceImportContacts();
        } else if (i == 3 || i == 150) {
            int iMin = Math.min(strArr.length, iArr.length);
            boolean z2 = true;
            boolean z3 = true;
            for (int i2 = 0; i2 < iMin; i2++) {
                if ("android.permission.RECORD_AUDIO".equals(strArr[i2])) {
                    z2 = iArr[i2] == 0;
                } else if ("android.permission.CAMERA".equals(strArr[i2])) {
                    z3 = iArr[i2] == 0;
                }
            }
            if (i == 150 && !(z2 && z3)) {
                showPermissionErrorAlert(R.raw.permission_request_camera, LocaleController.getString(R.string.PermissionNoCameraMicVideo));
            } else if (!z2) {
                showPermissionErrorAlert(R.raw.permission_request_microphone, LocaleController.getString(R.string.PermissionNoAudioWithHint));
            } else {
                if (z3) {
                    if (SharedConfig.inappCamera) {
                        CameraController.getInstance().initCamera(null);
                    }
                    return false;
                }
                showPermissionErrorAlert(R.raw.permission_request_camera, LocaleController.getString(R.string.PermissionNoCameraWithHint));
            }
        } else if (i == 18 || i == 19 || i == 20 || i == 22) {
            if (!z) {
                showPermissionErrorAlert(R.raw.permission_request_camera, LocaleController.getString(R.string.PermissionNoCameraWithHint));
            }
        } else if (i == 2) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(z ? NotificationCenter.locationPermissionGranted : NotificationCenter.locationPermissionDenied, new Object[0]);
        } else if (i == 211) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(z ? NotificationCenter.locationPermissionGranted : NotificationCenter.locationPermissionDenied, 1);
        }
        return true;
    }

    public AlertDialog createPermissionErrorAlert(int i, String str) {
        return new AlertDialog.Builder(this, 0, null).setTopAnimation(i, 72, false, Theme.getColor(null, Theme.key_dialogTopBackground, false)).setMessage(AndroidUtilities.replaceTags(str)).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new BoostsActivity$$ExternalSyntheticLambda4(this, 1)).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).create();
    }
}
