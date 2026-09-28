package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class ki1 implements org.telegram.ui.Components.voip.d {
    public final mi1 f35076a;

    public ki1(mi1 mi1Var) {
        this.f35076a = mi1Var;
    }

    public final void a() {
        mi1 mi1Var = this.f35076a;
        if (mi1Var.f35599p0 == 17) {
            Intent intent = new Intent(mi1Var.f35571b, VoIPService.class);
            intent.putExtra("user_id", mi1Var.d.f18483id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", mi1Var.U0);
            intent.putExtra("can_video_call", mi1Var.U0);
            intent.putExtra("account", mi1Var.f35568a);
            try {
                mi1Var.f35571b.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else if (Build.VERSION.SDK_INT >= 23 && mi1Var.f35571b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            mi1Var.f35571b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            mi1Var.r(new vz0(this, 24));
        }
    }

    public final void b() {
        mi1 mi1Var = this.f35076a;
        if (mi1Var.f35599p0 == 17) {
            mi1Var.f35606u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            mi1Var.f35606u0.b();
        }
    }
}
