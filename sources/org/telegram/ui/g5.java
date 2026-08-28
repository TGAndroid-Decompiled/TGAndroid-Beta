package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class g5 extends androidx.fragment.app.v {
    public int K = -1;

    public final boolean u(int i9, String[] strArr, int[] iArr) {
        boolean z10;
        String string;
        int i10;
        int i11;
        if (iArr == null) {
            iArr = new int[0];
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i9 == 104) {
            if (z10) {
                o50 o50Var = o50.f40880z3;
                if (o50Var != null) {
                    o50Var.f40933n.callOnClick();
                    return true;
                }
            } else {
                x(R.raw.permission_request_camera, LocaleController.getString(R.string.VoipNeedCameraPermission));
                return true;
            }
        } else if (i9 != 4 && i9 != 151) {
            if (i9 == 5) {
                if (!z10) {
                    x(R.raw.permission_request_contacts, LocaleController.getString(R.string.PermissionNoContactsSharing));
                    return false;
                }
                ContactsController.getInstance(this.K).forceImportContacts();
                return true;
            } else if (i9 != 3 && i9 != 150) {
                if (i9 != 18 && i9 != 19 && i9 != 20 && i9 != 22) {
                    if (i9 == 2) {
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        if (z10) {
                            i11 = NotificationCenter.locationPermissionGranted;
                        } else {
                            i11 = NotificationCenter.locationPermissionDenied;
                        }
                        globalInstance.lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
                        return true;
                    } else if (i9 == 211) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        if (z10) {
                            i10 = NotificationCenter.locationPermissionGranted;
                        } else {
                            i10 = NotificationCenter.locationPermissionDenied;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i10, 1);
                        return true;
                    }
                } else if (!z10) {
                    x(R.raw.permission_request_camera, LocaleController.getString(R.string.PermissionNoCameraWithHint));
                }
            } else {
                int min = Math.min(strArr.length, iArr.length);
                boolean z11 = true;
                boolean z12 = true;
                for (int i12 = 0; i12 < min; i12++) {
                    if ("android.permission.RECORD_AUDIO".equals(strArr[i12])) {
                        if (iArr[i12] == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else if ("android.permission.CAMERA".equals(strArr[i12])) {
                        if (iArr[i12] == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                }
                if (i9 == 150 && (!z11 || !z12)) {
                    x(R.raw.permission_request_camera, LocaleController.getString(R.string.PermissionNoCameraMicVideo));
                    return true;
                } else if (!z11) {
                    x(R.raw.permission_request_microphone, LocaleController.getString(R.string.PermissionNoAudioWithHint));
                    return true;
                } else if (!z12) {
                    x(R.raw.permission_request_camera, LocaleController.getString(R.string.PermissionNoCameraWithHint));
                    return true;
                } else {
                    if (SharedConfig.inappCamera) {
                        CameraController.getInstance().initCamera(null);
                    }
                    return false;
                }
            }
        } else if (!z10) {
            int i13 = R.raw.permission_request_folder;
            if (i9 == 151) {
                string = LocaleController.getString(R.string.PermissionNoStorageAvatar);
            } else {
                string = LocaleController.getString(R.string.PermissionStorageWithHint);
            }
            x(i13, string);
            return true;
        } else {
            ImageLoader.getInstance().checkMediaPaths();
            return true;
        }
        return true;
    }

    public final org.telegram.ui.ActionBar.c2 w(int i9, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        alertDialog$Builder.m(i9, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
        alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(str);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new b1(this, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.f22702a;
    }

    public final void x(int i9, String str) {
        w(i9, str).show();
    }
}
