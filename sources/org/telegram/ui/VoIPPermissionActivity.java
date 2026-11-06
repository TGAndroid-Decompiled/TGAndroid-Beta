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
        int i7;
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
                    i7 = 102;
                } else {
                    i7 = 101;
                }
                requestPermissions(strArr, i7);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        if (i7 != 101 && i7 != 102) {
            return;
        }
        boolean z9 = false;
        int i10 = 0;
        while (true) {
            if (i10 < iArr.length) {
                if (iArr[i10] != 0) {
                    break;
                }
                i10++;
            } else {
                z9 = true;
                break;
            }
        }
        if (iArr.length > 0 && z9) {
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
            org.telegram.ui.Components.voip.y1.h(this, new qu0(this, 28), i7);
        } else {
            finish();
        }
    }
}
