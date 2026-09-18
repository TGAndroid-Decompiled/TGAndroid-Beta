package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class qi1 implements org.telegram.ui.Components.voip.d {
    public final si1 f36840a;

    public qi1(si1 si1Var) {
        this.f36840a = si1Var;
    }

    public final void a() {
        si1 si1Var = this.f36840a;
        if (si1Var.f37326p0 == 17) {
            Intent intent = new Intent(si1Var.f37298b, VoIPService.class);
            intent.putExtra("user_id", si1Var.d.f18443id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", si1Var.U0);
            intent.putExtra("can_video_call", si1Var.U0);
            intent.putExtra("account", si1Var.f37295a);
            try {
                si1Var.f37298b.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else if (Build.VERSION.SDK_INT >= 23 && si1Var.f37298b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            si1Var.f37298b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            si1Var.r(new e01(this, 24));
        }
    }

    public final void b() {
        si1 si1Var = this.f36840a;
        if (si1Var.f37326p0 == 17) {
            si1Var.f37333u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            si1Var.f37333u0.b();
        }
    }
}
