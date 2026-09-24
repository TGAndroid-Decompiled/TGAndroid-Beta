package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class ki1 implements org.telegram.ui.Components.voip.d {
    public final mi1 f35062a;

    public ki1(mi1 mi1Var) {
        this.f35062a = mi1Var;
    }

    public final void a() {
        mi1 mi1Var = this.f35062a;
        if (mi1Var.f35586p0 == 17) {
            Intent intent = new Intent(mi1Var.f35558b, VoIPService.class);
            intent.putExtra("user_id", mi1Var.d.f18468id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", mi1Var.U0);
            intent.putExtra("can_video_call", mi1Var.U0);
            intent.putExtra("account", mi1Var.f35555a);
            try {
                mi1Var.f35558b.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else if (Build.VERSION.SDK_INT >= 23 && mi1Var.f35558b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            mi1Var.f35558b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            mi1Var.r(new vz0(this, 24));
        }
    }

    public final void b() {
        mi1 mi1Var = this.f35062a;
        if (mi1Var.f35586p0 == 17) {
            mi1Var.f35593u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            mi1Var.f35593u0.b();
        }
    }
}
