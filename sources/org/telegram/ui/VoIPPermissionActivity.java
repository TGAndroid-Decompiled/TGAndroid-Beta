package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.tl.TL_phone;
public class VoIPPermissionActivity extends Activity {
    @Override
    public final void onCreate(Bundle bundle) {
        boolean isVideo;
        int i;
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
                    i = 102;
                } else {
                    i = 101;
                }
                requestPermissions(strArr, i);
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 101 && i != 102) {
            return;
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < iArr.length) {
                if (iArr[i2] != 0) {
                    break;
                }
                i2++;
            } else {
                z = true;
                break;
            }
        }
        if (iArr.length > 0 && z) {
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
            xkc.h(this, new azb(this, (byte) 29), i);
        } else {
            finish();
        }
    }
}
