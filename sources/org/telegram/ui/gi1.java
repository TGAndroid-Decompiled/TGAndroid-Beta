package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class gi1 implements org.telegram.ui.Components.voip.d {
    public final ii1 f37116a;

    public gi1(ii1 ii1Var) {
        this.f37116a = ii1Var;
    }

    public final void a() {
        ii1 ii1Var = this.f37116a;
        if (ii1Var.m0 == 17) {
            Intent intent = new Intent(ii1Var.f37673b, VoIPService.class);
            intent.putExtra("user_id", ii1Var.d.f20992id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", ii1Var.R0);
            intent.putExtra("can_video_call", ii1Var.R0);
            intent.putExtra("account", ii1Var.f37670a);
            try {
                ii1Var.f37673b.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else if (Build.VERSION.SDK_INT >= 23 && ii1Var.f37673b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            ii1Var.f37673b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            ii1Var.r(new sz0(this, 24));
        }
    }

    public final void b() {
        ii1 ii1Var = this.f37116a;
        if (ii1Var.m0 == 17) {
            ii1Var.f37703r0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            ii1Var.f37703r0.b();
        }
    }
}
