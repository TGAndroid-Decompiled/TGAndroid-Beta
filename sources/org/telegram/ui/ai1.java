package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class ai1 implements org.telegram.ui.Components.voip.d {
    public final ci1 f35191a;

    public ai1(ci1 ci1Var) {
        this.f35191a = ci1Var;
    }

    public final void a() {
        ci1 ci1Var = this.f35191a;
        if (ci1Var.m0 == 17) {
            Intent intent = new Intent(ci1Var.f35821b, VoIPService.class);
            intent.putExtra("user_id", ci1Var.d.f20990id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", ci1Var.R0);
            intent.putExtra("can_video_call", ci1Var.R0);
            intent.putExtra("account", ci1Var.f35818a);
            try {
                ci1Var.f35821b.startService(intent);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else if (Build.VERSION.SDK_INT >= 23 && ci1Var.f35821b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            ci1Var.f35821b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            ci1Var.r(new xy0(this, 25));
        }
    }

    public final void b() {
        ci1 ci1Var = this.f35191a;
        if (ci1Var.m0 == 17) {
            ci1Var.f35851r0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            ci1Var.f35851r0.b();
        }
    }
}
