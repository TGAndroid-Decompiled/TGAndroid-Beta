package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;
public final class hc1 implements org.telegram.ui.Components.voip.d {
    public final jc1 f46318a;

    public hc1(jc1 jc1Var) {
        this.f46318a = jc1Var;
    }

    public final void a() {
        jc1 jc1Var = this.f46318a;
        if (jc1Var.f46937o0 == 17) {
            Intent intent = new Intent(jc1Var.f46910b, VoIPService.class);
            intent.putExtra("user_id", jc1Var.d.f27109id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", jc1Var.T0);
            intent.putExtra("can_video_call", jc1Var.T0);
            intent.putExtra("account", jc1Var.f46907a);
            try {
                jc1Var.f46910b.startService(intent);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        } else if (jc1Var.f46910b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            jc1Var.f46910b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            jc1Var.i(new uu0(this, 27));
        }
    }

    public final void b() {
        jc1 jc1Var = this.f46318a;
        if (jc1Var.f46937o0 == 17) {
            jc1Var.f46944t0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            jc1Var.f46944t0.b();
        }
    }
}
