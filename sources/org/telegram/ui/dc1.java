package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;
public final class dc1 implements org.telegram.ui.Components.voip.d {
    public final fc1 f45045a;

    public dc1(fc1 fc1Var) {
        this.f45045a = fc1Var;
    }

    public final void a() {
        fc1 fc1Var = this.f45045a;
        if (fc1Var.f45569o0 == 17) {
            Intent intent = new Intent(fc1Var.f45542b, VoIPService.class);
            intent.putExtra("user_id", fc1Var.d.f27105id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", fc1Var.T0);
            intent.putExtra("can_video_call", fc1Var.T0);
            intent.putExtra("account", fc1Var.f45539a);
            try {
                fc1Var.f45542b.startService(intent);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        } else if (fc1Var.f45542b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            fc1Var.f45542b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            fc1Var.i(new ru0(this, 27));
        }
    }

    public final void b() {
        fc1 fc1Var = this.f45045a;
        if (fc1Var.f45569o0 == 17) {
            fc1Var.f45576t0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            fc1Var.f45576t0.b();
        }
    }
}
