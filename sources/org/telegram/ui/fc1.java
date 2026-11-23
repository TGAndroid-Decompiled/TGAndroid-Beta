package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;
public final class fc1 implements org.telegram.ui.Components.voip.d {
    public final hc1 f47669a;

    public fc1(hc1 hc1Var) {
        this.f47669a = hc1Var;
    }

    public final void a() {
        hc1 hc1Var = this.f47669a;
        if (hc1Var.f48361p0 == 17) {
            Intent intent = new Intent(hc1Var.f48333b, VoIPService.class);
            intent.putExtra("user_id", hc1Var.d.f28583id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", hc1Var.U0);
            intent.putExtra("can_video_call", hc1Var.U0);
            intent.putExtra("account", hc1Var.f48330a);
            try {
                hc1Var.f48333b.startService(intent);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        } else if (hc1Var.f48333b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            hc1Var.f48333b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            hc1Var.i(new ru0(this, 27));
        }
    }

    public final void b() {
        hc1 hc1Var = this.f47669a;
        if (hc1Var.f48361p0 == 17) {
            hc1Var.f48368u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            hc1Var.f48368u0.b();
        }
    }
}
