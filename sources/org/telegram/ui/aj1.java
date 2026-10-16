package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class aj1 implements org.telegram.ui.Components.voip.d {
    public final cj1 f33956a;

    public aj1(cj1 cj1Var) {
        this.f33956a = cj1Var;
    }

    public final void a() {
        cj1 cj1Var = this.f33956a;
        if (cj1Var.f34707p0 == 17) {
            Intent intent = new Intent(cj1Var.f34679b, VoIPService.class);
            intent.putExtra("user_id", cj1Var.d.f19063id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", cj1Var.U0);
            intent.putExtra("can_video_call", cj1Var.U0);
            intent.putExtra("account", cj1Var.f34676a);
            try {
                cj1Var.f34679b.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else if (cj1Var.f34679b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            cj1Var.f34679b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            cj1Var.q(new tz0(this, 25));
        }
    }

    public final void b() {
        cj1 cj1Var = this.f33956a;
        if (cj1Var.f34707p0 == 17) {
            cj1Var.f34714u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            cj1Var.f34714u0.b();
        }
    }
}
