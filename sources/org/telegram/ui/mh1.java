package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class mh1 implements org.telegram.ui.Components.voip.d {
    public final oh1 f40569a;

    public mh1(oh1 oh1Var) {
        this.f40569a = oh1Var;
    }

    public final void a() {
        oh1 oh1Var = this.f40569a;
        if (oh1Var.f41161l0 == 17) {
            Intent intent = new Intent(oh1Var.f41139b, VoIPService.class);
            intent.putExtra("user_id", oh1Var.d.f22539id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", oh1Var.Q0);
            intent.putExtra("can_video_call", oh1Var.Q0);
            intent.putExtra("account", oh1Var.f41136a);
            try {
                oh1Var.f41139b.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else if (Build.VERSION.SDK_INT >= 23 && oh1Var.f41139b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            oh1Var.f41139b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            oh1Var.r(new ky0(this, 26));
        }
    }

    public final void b() {
        oh1 oh1Var = this.f40569a;
        if (oh1Var.f41161l0 == 17) {
            oh1Var.f41166q0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            oh1Var.f41166q0.b();
        }
    }
}
