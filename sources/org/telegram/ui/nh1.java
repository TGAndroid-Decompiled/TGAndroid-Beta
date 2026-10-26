package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class nh1 implements org.telegram.ui.Components.voip.d {
    public final ph1 f41898a;

    public nh1(ph1 ph1Var) {
        this.f41898a = ph1Var;
    }

    public final void a() {
        ph1 ph1Var = this.f41898a;
        if (ph1Var.f42541p0 == 17) {
            Intent intent = new Intent(ph1Var.f42513b, VoIPService.class);
            intent.putExtra("user_id", ph1Var.d.f22176id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", ph1Var.U0);
            intent.putExtra("can_video_call", ph1Var.U0);
            intent.putExtra("account", ph1Var.f42510a);
            try {
                ph1Var.f42513b.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else if (ph1Var.f42513b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            ph1Var.f42513b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            ph1Var.q(new my0(this, 28));
        }
    }

    public final void b() {
        ph1 ph1Var = this.f41898a;
        if (ph1Var.f42541p0 == 17) {
            ph1Var.f42548u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            ph1Var.f42548u0.b();
        }
    }
}
