package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class o00 {
    public n00[] f36439a;
    public n00 f36440b;
    public n00 f36441c;
    public n00 d;
    public float f36442e;
    public float f36443f;
    public float f36444g;
    public float h;
    public float f36445i;
    public long f36446j;
    public float f36447k;
    public ArrayList f36448l;
    public Paint f36449m;
    public Path f36450n;

    public final void a(float f10) {
        this.f36444g = f10;
        float f11 = this.f36442e;
        this.h = (f10 - f11) / 250.0f;
        this.f36445i = (f10 - f11) / 120.0f;
    }

    public final void b(int i7, boolean z9) {
        n00 n00Var;
        n00 n00Var2 = this.f36440b;
        if (n00Var2 != null && n00Var2.f36112i == i7) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f36440b == null) {
            this.f36440b = this.d;
            return;
        }
        if (z9) {
            n00Var = this.f36440b;
        } else {
            n00Var = null;
        }
        this.f36441c = n00Var;
        this.f36440b = this.f36439a[i7];
        if (n00Var != null) {
            this.f36447k = 0.0f;
        } else {
            this.f36447k = 1.0f;
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
