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
        int i10;
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
                    i10 = 102;
                } else {
                    i10 = 101;
                }
                requestPermissions(strArr, i10);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 101 && i10 != 102) {
            return;
        }
        boolean z4 = false;
        int i11 = 0;
        while (true) {
            if (i11 < iArr.length) {
                if (iArr[i11] != 0) {
                    break;
                }
                i11++;
            } else {
                z4 = true;
                break;
            }
        }
        if (iArr.length > 0 && z4) {
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
            org.telegram.ui.Components.voip.f2.h(this, new sz0(this, 25), i10);
        } else {
            finish();
        }
    }
}
