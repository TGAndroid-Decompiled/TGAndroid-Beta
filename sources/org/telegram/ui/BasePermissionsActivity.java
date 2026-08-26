package org.telegram.ui;

import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentActivity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;

public abstract class BasePermissionsActivity extends FragmentActivity {
    public int currentAccount = -1;

    public final boolean checkPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null) {
            iArr = new int[0];
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        boolean z = iArr.length > 0 && iArr[0] == 0;
        if (i == 104) {
            if (!z) {
                createPermissionErrorAlert(R.raw.permission_request_camera, LocaleController.getString(R.string.VoipNeedCameraPermission)).show();
                return true;
            }
            GroupCallActivity groupCallActivity = GroupCallActivity.groupCallInstance;
            if (groupCallActivity != null) {
                groupCallActivity.cameraButton.callOnClick();
                return true;
            }
        } else {
            if (i == 4 || i == 151) {
                if (z) {
                    ImageLoader.getInstance().checkMediaPaths();
                    return true;
                }
                createPermissionErrorAlert(R.raw.permission_request_folder, i == 151 ? LocaleController.getString(R.string.PermissionNoStorageAvatar) : LocaleController.getString(R.string.PermissionStorageWithHint)).show();
                return true;
            }
            if (i == 5) {
                if (z) {
                    ContactsController.getInstance(this.currentAccount).forceImportContacts();
                    return true;
                }
                createPermissionErrorAlert(R.raw.permission_request_contacts, LocaleController.getString(R.string.PermissionNoContactsSharing)).show();
                return false;
            }
            if (i == 3 || i == 150) {
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
                if (i == 150 && (!z2 || !z3)) {
                    createPermissionErrorAlert(R.raw.permission_request_camera, LocaleController.getString(R.string.PermissionNoCameraMicVideo)).show();
                    return true;
                }
                if (!z2) {
                    createPermissionErrorAlert(R.raw.permission_request_microphone, LocaleController.getString(R.string.PermissionNoAudioWithHint)).show();
                    return true;
                }
                if (!z3) {
                    createPermissionErrorAlert(R.raw.permission_request_camera, LocaleController.getString(R.string.PermissionNoCameraWithHint)).show();
                    return true;
                }
                if (SharedConfig.inappCamera) {
                    CameraController.getInstance().initCamera(null);
                }
                return false;
            }
            if (i != 18 && i != 19 && i != 20 && i != 22) {
                if (i == 2) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(z ? NotificationCenter.locationPermissionGranted : NotificationCenter.locationPermissionDenied, new Object[0]);
                    return true;
                }
                if (i == 211) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(z ? NotificationCenter.locationPermissionGranted : NotificationCenter.locationPermissionDenied, 1);
                    return true;
                }
            } else if (!z) {
                createPermissionErrorAlert(R.raw.permission_request_camera, LocaleController.getString(R.string.PermissionNoCameraWithHint)).show();
            }
        }
        return true;
    }

    public final AlertDialog createPermissionErrorAlert(int i, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, 0, null);
        builder.setTopAnimation(i, 72, Theme.getColor(null, Theme.key_dialogTopBackground, false), null);
        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(str);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.message = spannableStringBuilderReplaceTags;
        builder.setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new WindowVisibilityManager$$ExternalSyntheticLambda0(this, 18));
        builder.setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog;
    }
}
