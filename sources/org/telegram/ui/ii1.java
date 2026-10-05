package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class ii1 implements org.telegram.ui.Components.voip.d {
    public final ki1 f37436a;

    public ii1(ki1 ki1Var) {
        this.f37436a = ki1Var;
    }

    public final void a() {
        ki1 ki1Var = this.f37436a;
        if (ki1Var.f38050p0 == 17) {
            Intent intent = new Intent(ki1Var.f38021b, VoIPService.class);
            intent.putExtra("user_id", ki1Var.d.f20194id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", ki1Var.U0);
            intent.putExtra("can_video_call", ki1Var.U0);
            intent.putExtra("account", ki1Var.f38018a);
            try {
                ki1Var.f38021b.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else if (Build.VERSION.SDK_INT >= 23 && ki1Var.f38021b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            ki1Var.f38021b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            ki1Var.r(new hz0(this, 26));
        }
    }

    public final void b() {
        ki1 ki1Var = this.f37436a;
        if (ki1Var.f38050p0 == 17) {
            ki1Var.f38057u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            ki1Var.f38057u0.b();
        }
    }
}
