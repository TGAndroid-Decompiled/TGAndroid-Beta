package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.tl.TL_phone;
public class VoIPPermissionActivity extends Activity {
    @Override
    public final void onCreate(Bundle bundle) {
        boolean isVideo;
        int i9;
        super.onCreate(bundle);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
            if (phoneCall != null && phoneCall.video) {
                isVideo = true;
            } else {
                isVideo = false;
            }
        } else {
            isVideo = VoIPPreNotificationService.isVideo();
        }
        ArrayList arrayList = new ArrayList();
        if (checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (isVideo && checkSelfPermission("android.permission.CAMERA") != 0) {
            arrayList.add("android.permission.CAMERA");
        }
        if (!arrayList.isEmpty()) {
            try {
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                if (isVideo) {
                    i9 = 102;
                } else {
                    i9 = 101;
                }
                requestPermissions(strArr, i9);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    @Override
    public final void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        if (i9 != 101 && i9 != 102) {
            return;
        }
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < iArr.length) {
                if (iArr[i10] != 0) {
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        if (iArr.length > 0 && z10) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().acceptIncomingCall();
            } else {
                VoIPPreNotificationService.answer(this);
            }
            finish();
            startActivity(new Intent(this, LaunchActivity.class).setAction("voip"));
        } else if (!shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().declineIncomingCall();
            } else {
                VoIPPreNotificationService.decline(this, 1);
            }
            org.telegram.ui.Components.voip.e2.i(this, new ky0(this, 27), i9);
        } else {
            finish();
        }
    }
}
