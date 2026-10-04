package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class ki1 implements org.telegram.ui.Components.voip.d {
    public final mi1 f37997a;

    public ki1(mi1 mi1Var) {
        this.f37997a = mi1Var;
    }

    public final void a() {
        mi1 mi1Var = this.f37997a;
        if (mi1Var.f38641p0 == 17) {
            Intent intent = new Intent(mi1Var.f38612b, VoIPService.class);
            intent.putExtra("user_id", mi1Var.d.f20189id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", mi1Var.U0);
            intent.putExtra("can_video_call", mi1Var.U0);
            intent.putExtra("account", mi1Var.f38609a);
            try {
                mi1Var.f38612b.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else if (Build.VERSION.SDK_INT >= 23 && mi1Var.f38612b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            mi1Var.f38612b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            mi1Var.r(new hz0(this, 26));
        }
    }

    public final void b() {
        mi1 mi1Var = this.f37997a;
        if (mi1Var.f38641p0 == 17) {
            mi1Var.f38648u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            mi1Var.f38648u0.b();
        }
    }
}
