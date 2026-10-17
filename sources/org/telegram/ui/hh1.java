package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class hh1 implements org.telegram.ui.Components.voip.d {
    public final jh1 f37562a;

    public hh1(jh1 jh1Var) {
        this.f37562a = jh1Var;
    }

    public final void a() {
        jh1 jh1Var = this.f37562a;
        if (jh1Var.f38203p0 == 17) {
            Intent intent = new Intent(jh1Var.f38175b, VoIPService.class);
            intent.putExtra("user_id", jh1Var.d.f20419id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", jh1Var.U0);
            intent.putExtra("can_video_call", jh1Var.U0);
            intent.putExtra("account", jh1Var.f38172a);
            try {
                jh1Var.f38175b.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else if (jh1Var.f38175b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            jh1Var.f38175b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            jh1Var.q(new sy0(this, 25));
        }
    }

    public final void b() {
        jh1 jh1Var = this.f37562a;
        if (jh1Var.f38203p0 == 17) {
            jh1Var.f38210u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            jh1Var.f38210u0.b();
        }
    }
}
