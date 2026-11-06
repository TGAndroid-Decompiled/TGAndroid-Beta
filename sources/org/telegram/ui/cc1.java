package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;
public final class cc1 implements org.telegram.ui.Components.voip.d {
    public final ec1 f44750a;

    public cc1(ec1 ec1Var) {
        this.f44750a = ec1Var;
    }

    public final void a() {
        ec1 ec1Var = this.f44750a;
        if (ec1Var.f45302o0 == 17) {
            Intent intent = new Intent(ec1Var.f45275b, VoIPService.class);
            intent.putExtra("user_id", ec1Var.d.f27101id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", ec1Var.T0);
            intent.putExtra("can_video_call", ec1Var.T0);
            intent.putExtra("account", ec1Var.f45272a);
            try {
                ec1Var.f45275b.startService(intent);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        } else if (ec1Var.f45275b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            ec1Var.f45275b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            ec1Var.i(new ru0(this, 27));
        }
    }

    public final void b() {
        ec1 ec1Var = this.f44750a;
        if (ec1Var.f45302o0 == 17) {
            ec1Var.f45309t0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            ec1Var.f45309t0.b();
        }
    }
}
