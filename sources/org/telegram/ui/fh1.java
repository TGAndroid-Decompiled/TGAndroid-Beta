package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class fh1 implements org.telegram.ui.Components.voip.d {
    public final hh1 f37013a;

    public fh1(hh1 hh1Var) {
        this.f37013a = hh1Var;
    }

    public final void a() {
        hh1 hh1Var = this.f37013a;
        if (hh1Var.f37683p0 == 17) {
            Intent intent = new Intent(hh1Var.f37655b, VoIPService.class);
            intent.putExtra("user_id", hh1Var.d.f20422id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", hh1Var.U0);
            intent.putExtra("can_video_call", hh1Var.U0);
            intent.putExtra("account", hh1Var.f37652a);
            try {
                hh1Var.f37655b.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else if (hh1Var.f37655b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            hh1Var.f37655b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            hh1Var.q(new qy0(this, 25));
        }
    }

    public final void b() {
        hh1 hh1Var = this.f37013a;
        if (hh1Var.f37683p0 == 17) {
            hh1Var.f37690u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            hh1Var.f37690u0.b();
        }
    }
}
