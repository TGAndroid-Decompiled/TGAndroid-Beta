package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;
public final class cc1 implements org.telegram.ui.Components.voip.d {
    public final ec1 f46078a;

    public cc1(ec1 ec1Var) {
        this.f46078a = ec1Var;
    }

    public final void a() {
        ec1 ec1Var = this.f46078a;
        if (ec1Var.f46712p0 == 17) {
            Intent intent = new Intent(ec1Var.f46684b, VoIPService.class);
            intent.putExtra("user_id", ec1Var.d.f28200id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", ec1Var.U0);
            intent.putExtra("can_video_call", ec1Var.U0);
            intent.putExtra("account", ec1Var.f46681a);
            try {
                ec1Var.f46684b.startService(intent);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        } else if (ec1Var.f46684b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            ec1Var.f46684b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            ec1Var.i(new pu0(this, 27));
        }
    }

    public final void b() {
        ec1 ec1Var = this.f46078a;
        if (ec1Var.f46712p0 == 17) {
            ec1Var.f46719u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            ec1Var.f46719u0.b();
        }
    }
}
