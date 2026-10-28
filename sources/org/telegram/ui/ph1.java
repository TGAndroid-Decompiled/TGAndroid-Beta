package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class ph1 implements org.telegram.ui.Components.voip.d {
    public final rh1 f42405a;

    public ph1(rh1 rh1Var) {
        this.f42405a = rh1Var;
    }

    public final void a() {
        rh1 rh1Var = this.f42405a;
        if (rh1Var.f43031p0 == 17) {
            Intent intent = new Intent(rh1Var.f43003b, VoIPService.class);
            intent.putExtra("user_id", rh1Var.d.f22177id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", rh1Var.U0);
            intent.putExtra("can_video_call", rh1Var.U0);
            intent.putExtra("account", rh1Var.f43000a);
            try {
                rh1Var.f43003b.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else if (rh1Var.f43003b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            rh1Var.f43003b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            rh1Var.q(new oy0(this, 28));
        }
    }

    public final void b() {
        rh1 rh1Var = this.f42405a;
        if (rh1Var.f43031p0 == 17) {
            rh1Var.f43038u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            rh1Var.f43038u0.b();
        }
    }
}
