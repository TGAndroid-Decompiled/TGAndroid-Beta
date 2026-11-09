package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class p00 {
    public o00[] f36843a;
    public o00 f36844b;
    public o00 f36845c;
    public o00 d;
    public float f36846e;
    public float f36847f;
    public float f36848g;
    public float h;
    public float f36849i;
    public long f36850j;
    public float f36851k;
    public ArrayList f36852l;
    public Paint f36853m;
    public Path f36854n;

    public final void a(float f10) {
        this.f36848g = f10;
        float f11 = this.f36846e;
        this.h = (f10 - f11) / 250.0f;
        this.f36849i = (f10 - f11) / 120.0f;
    }

    public final void b(int i7, boolean z9) {
        o00 o00Var;
        o00 o00Var2 = this.f36844b;
        if (o00Var2 != null && o00Var2.f36582i == i7) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f36844b == null) {
            this.f36844b = this.d;
            return;
        }
        if (z9) {
            o00Var = this.f36844b;
        } else {
            o00Var = null;
        }
        this.f36845c = o00Var;
        this.f36844b = this.f36843a[i7];
        if (o00Var != null) {
            this.f36851k = 0.0f;
        } else {
            this.f36851k = 1.0f;
        }
    }

    public final void c(boolean z9) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int callState = sharedInstance.getCallState();
            if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                b(2, z9);
                return;
            }
            org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
            if (r3Var != null) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, sharedInstance.getChat())) || sharedInstance.groupCall.f25222b.rtmp_stream) {
                    sharedInstance.setMicMute(true, false, false);
                    b(3, z9);
                    return;
                }
                b(sharedInstance.isMicMute() ? 1 : 0, z9);
                return;
            }
            b(sharedInstance.isMicMute() ? 1 : 0, z9);
        }
    }
}
