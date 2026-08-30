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
public abstract class j5 extends androidx.fragment.app.v {
    public int L = -1;

    public final boolean u(int i10, String[] strArr, int[] iArr) {
        boolean z4;
        String string;
        int i11;
        int i12;
        if (iArr == null) {
            iArr = new int[0];
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i10 == 104) {
            if (z4) {
                c60 c60Var = c60.A3;
                if (c60Var != null) {
                    c60Var.f33149n.callOnClick();
                    return true;
                }
            } else {
                x(R.raw.permission_request_camera, LocaleController.getString(R.string.VoipNeedCameraPermission));
                return true;
            }
        } else if (i10 != 4 && i10 != 151) {
            if (i10 == 5) {
                if (!z4) {
                    x(R.raw.permission_request_contacts, LocaleController.getString(R.string.PermissionNoContactsSharing));
                    return false;
                }
                ContactsController.getInstance(this.L).forceImportContacts();
                return true;
            } else if (i10 != 3 && i10 != 150) {
                if (i10 != 18 && i10 != 19 && i10 != 20 && i10 != 22) {
                    if (i10 == 2) {
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        if (z4) {
                            i12 = NotificationCenter.locationPermissionGranted;
                        } else {
                            i12 = NotificationCenter.locationPermissionDenied;
                        }
                        globalInstance.lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                        return true;
                    } else if (i10 == 211) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        if (z4) {
                            i11 = NotificationCenter.locationPermissionGranted;
                        } else {
                            i11 = NotificationCenter.locationPermissionDenied;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i11, 1);
                        return true;
                    }
                } else if (!z4) {
                    x(R.raw.permission_request_camera, LocaleController.getString(R.string.PermissionNoCameraWithHint));
                }
            } else {
                int min = Math.min(strArr.length, iArr.length);
                boolean z10 = true;
                boolean z11 = true;
                for (int i13 = 0; i13 < min; i13++) {
                    if ("android.permission.RECORD_AUDIO".equals(strArr[i13])) {
                        if (iArr[i13] == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else if ("android.permission.CAMERA".equals(strArr[i13])) {
                        if (iArr[i13] == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                }
                if (i10 == 150 && (!z10 || !z11)) {
                    x(R.raw.permission_request_camera, LocaleController.getString(R.string.PermissionNoCameraMicVideo));
                    return true;
                } else if (!z10) {
                    x(R.raw.permission_request_microphone, LocaleController.getString(R.string.PermissionNoAudioWithHint));
                    return true;
                } else if (!z11) {
                    x(R.raw.permission_request_camera, LocaleController.getString(R.string.PermissionNoCameraWithHint));
                    return true;
                } else {
                    if (SharedConfig.inappCamera) {
                        CameraController.getInstance().initCamera(null);
                    }
                    return false;
                }
            }
        } else if (!z4) {
            int i14 = R.raw.permission_request_folder;
            if (i10 == 151) {
                string = LocaleController.getString(R.string.PermissionNoStorageAvatar);
            } else {
                string = LocaleController.getString(R.string.PermissionStorageWithHint);
            }
            x(i14, string);
            return true;
        } else {
            ImageLoader.getInstance().checkMediaPaths();
            return true;
        }
        return true;
    }

    public final org.telegram.ui.ActionBar.d2 v(int i10, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
        alertDialog$Builder.f19503a.Q = AndroidUtilities.replaceTags(str);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new a1(this, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.f19503a;
    }

    public final void x(int i10, String str) {
        v(i10, str).show();
    }
}
