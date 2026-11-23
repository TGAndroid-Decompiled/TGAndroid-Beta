package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;
public final class dc1 implements org.telegram.ui.Components.voip.d {
    public final fc1 f47041a;

    public dc1(fc1 fc1Var) {
        this.f47041a = fc1Var;
    }

    public final void a() {
        fc1 fc1Var = this.f47041a;
        if (fc1Var.f47783p0 == 17) {
            Intent intent = new Intent(fc1Var.f47755b, VoIPService.class);
            intent.putExtra("user_id", fc1Var.d.f28641id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", fc1Var.U0);
            intent.putExtra("can_video_call", fc1Var.U0);
            intent.putExtra("account", fc1Var.f47752a);
            try {
                fc1Var.f47755b.startService(intent);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        } else if (fc1Var.f47755b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            fc1Var.f47755b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            fc1Var.i(new qu0(this, 27));
        }
    }

    public final void b() {
        fc1 fc1Var = this.f47041a;
        if (fc1Var.f47783p0 == 17) {
            fc1Var.f47790u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            fc1Var.f47790u0.b();
        }
    }
}
