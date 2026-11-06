package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class o00 {
    public n00[] f36545a;
    public n00 f36546b;
    public n00 f36547c;
    public n00 d;
    public float f36548e;
    public float f36549f;
    public float f36550g;
    public float h;
    public float f36551i;
    public long f36552j;
    public float f36553k;
    public ArrayList f36554l;
    public Paint f36555m;
    public Path f36556n;

    public final void a(float f10) {
        this.f36550g = f10;
        float f11 = this.f36548e;
        this.h = (f10 - f11) / 250.0f;
        this.f36551i = (f10 - f11) / 120.0f;
    }

    public final void b(int i7, boolean z9) {
        n00 n00Var;
        n00 n00Var2 = this.f36546b;
        if (n00Var2 != null && n00Var2.f36174i == i7) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f36546b == null) {
            this.f36546b = this.d;
            return;
        }
        if (z9) {
            n00Var = this.f36546b;
        } else {
            n00Var = null;
        }
        this.f36547c = n00Var;
        this.f36546b = this.f36545a[i7];
        if (n00Var != null) {
            this.f36553k = 0.0f;
        } else {
            this.f36553k = 1.0f;
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
                if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, sharedInstance.getChat())) || sharedInstance.groupCall.f25201b.rtmp_stream) {
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
