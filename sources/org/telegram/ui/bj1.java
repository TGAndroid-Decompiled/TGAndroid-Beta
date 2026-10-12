package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class bj1 implements org.telegram.ui.Components.voip.d {
    public final dj1 f34589a;

    public bj1(dj1 dj1Var) {
        this.f34589a = dj1Var;
    }

    public final void a() {
        dj1 dj1Var = this.f34589a;
        if (dj1Var.f35305p0 == 17) {
            Intent intent = new Intent(dj1Var.f35277b, VoIPService.class);
            intent.putExtra("user_id", dj1Var.d.f19363id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", dj1Var.U0);
            intent.putExtra("can_video_call", dj1Var.U0);
            intent.putExtra("account", dj1Var.f35274a);
            try {
                dj1Var.f35277b.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else if (dj1Var.f35277b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            dj1Var.f35277b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            dj1Var.q(new uz0(this, 25));
        }
    }

    public final void b() {
        dj1 dj1Var = this.f34589a;
        if (dj1Var.f35305p0 == 17) {
            dj1Var.f35312u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            dj1Var.f35312u0.b();
        }
    }
}
