package org.telegram.p009ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.C0890R;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.p009ui.Components.voip.VoIPHelper;
import org.telegram.tgnet.TLRPC$PhoneCall;

@TargetApi(C0890R.styleable.MapAttrs_zOrderOnTop)
public class VoIPPermissionActivity extends Activity {
    @Override
    protected void onCreate(Bundle bundle) {
        TLRPC$PhoneCall tLRPC$PhoneCall;
        super.onCreate(bundle);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z = (sharedInstance == null || (tLRPC$PhoneCall = sharedInstance.privateCall) == null || !tLRPC$PhoneCall.video) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (z && checkSelfPermission("android.permission.CAMERA") != 0) {
            arrayList.add("android.permission.CAMERA");
        }
        if (!arrayList.isEmpty()) {
            try {
                requestPermissions((String[]) arrayList.toArray(new String[0]), z ? 102 : FileLoader.MEDIA_DIR_VIDEO_PUBLIC);
            } catch (Exception e) {
                FileLog.m30e(e);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 101 || i == 102) {
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= iArr.length) {
                    z = true;
                    break;
                } else if (iArr[i2] != 0) {
                    break;
                } else {
                    i2++;
                }
            }
            if (iArr.length > 0 && z) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().acceptIncomingCall();
                }
                finish();
                startActivity(new Intent(this, LaunchActivity.class).setAction("voip"));
            } else if (!shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().declineIncomingCall();
                }
                VoIPHelper.permissionDenied(this, new Runnable() {
                    @Override
                    public final void run() {
                        VoIPPermissionActivity.this.finish();
                    }
                }, i);
            } else {
                finish();
            }
        }
    }
}
