package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;
public final class gc1 implements org.telegram.ui.Components.voip.d {
    public final ic1 f45974a;

    public gc1(ic1 ic1Var) {
        this.f45974a = ic1Var;
    }

    public final void a() {
        ic1 ic1Var = this.f45974a;
        if (ic1Var.f46601o0 == 17) {
            Intent intent = new Intent(ic1Var.f46574b, VoIPService.class);
            intent.putExtra("user_id", ic1Var.d.f27105id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", ic1Var.T0);
            intent.putExtra("can_video_call", ic1Var.T0);
            intent.putExtra("account", ic1Var.f46571a);
            try {
                ic1Var.f46574b.startService(intent);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        } else if (ic1Var.f46574b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            ic1Var.f46574b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            ic1Var.i(new tu0(this, 27));
        }
    }

    public final void b() {
        ic1 ic1Var = this.f45974a;
        if (ic1Var.f46601o0 == 17) {
            ic1Var.f46608t0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            ic1Var.f46608t0.b();
        }
    }
}
