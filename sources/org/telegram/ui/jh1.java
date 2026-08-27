package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;

public final class jh1 implements org.telegram.ui.Components.voip.d {

    public final lh1 f39378a;

    public jh1(lh1 lh1Var) {
        this.f39378a = lh1Var;
    }

    public final void a() {
        lh1 lh1Var = this.f39378a;
        if (lh1Var.f40114l0 != 17) {
            if (Build.VERSION.SDK_INT >= 23 && lh1Var.f40092b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                lh1Var.f40092b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    lh1Var.r(new ky0(this, 26));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(lh1Var.f40092b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", lh1Var.d.f22527id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", lh1Var.Q0);
        intent.putExtra("can_video_call", lh1Var.Q0);
        intent.putExtra("account", lh1Var.f40089a);
        try {
            lh1Var.f40092b.startService(intent);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public final void b() {
        lh1 lh1Var = this.f39378a;
        if (lh1Var.f40114l0 == 17) {
            lh1Var.f40119q0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            lh1Var.f40119q0.b();
        }
    }
}
