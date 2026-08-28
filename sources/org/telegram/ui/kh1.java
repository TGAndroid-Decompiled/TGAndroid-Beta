package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
public final class kh1 implements org.telegram.ui.Components.voip.d {
    public final mh1 f39844a;

    public kh1(mh1 mh1Var) {
        this.f39844a = mh1Var;
    }

    public final void a() {
        mh1 mh1Var = this.f39844a;
        if (mh1Var.f40453l0 == 17) {
            Intent intent = new Intent(mh1Var.f40431b, VoIPService.class);
            intent.putExtra("user_id", mh1Var.d.f22527id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", mh1Var.Q0);
            intent.putExtra("can_video_call", mh1Var.Q0);
            intent.putExtra("account", mh1Var.f40428a);
            try {
                mh1Var.f40431b.startService(intent);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        } else if (Build.VERSION.SDK_INT >= 23 && mh1Var.f40431b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            mh1Var.f40431b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            mh1Var.r(new ky0(this, 26));
        }
    }

    public final void b() {
        mh1 mh1Var = this.f39844a;
        if (mh1Var.f40453l0 == 17) {
            mh1Var.f40458q0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            mh1Var.f40458q0.b();
        }
    }
}
