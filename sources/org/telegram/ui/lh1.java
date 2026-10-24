package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class lh1 implements org.telegram.ui.Components.voip.d {
    public final nh1 f39300a;

    public lh1(nh1 nh1Var) {
        this.f39300a = nh1Var;
    }

    public final void a() {
        nh1 nh1Var = this.f39300a;
        if (nh1Var.f39857p0 == 17) {
            Intent intent = new Intent(nh1Var.f39829b, VoIPService.class);
            intent.putExtra("user_id", nh1Var.d.f20491id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", nh1Var.U0);
            intent.putExtra("can_video_call", nh1Var.U0);
            intent.putExtra("account", nh1Var.f39826a);
            try {
                nh1Var.f39829b.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else if (nh1Var.f39829b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            nh1Var.f39829b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            nh1Var.q(new ly0(this, 26));
        }
    }

    public final void b() {
        nh1 nh1Var = this.f39300a;
        if (nh1Var.f39857p0 == 17) {
            nh1Var.f39864u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            nh1Var.f39864u0.b();
        }
    }
}
