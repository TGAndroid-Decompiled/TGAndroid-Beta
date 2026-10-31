package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class d10 {
    public c10[] f25246a;
    public c10 f25247b;
    public c10 f25248c;
    public c10 d;
    public float e;
    public float f25249f;
    public float f25250g;
    public float h;
    public float f25251i;
    public long f25252j;
    public float f25253k;
    public ArrayList f25254l;
    public Paint f25255m;
    public Path f25256n;

    public final void a(float f7) {
        this.f25250g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.f25251i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        c10 c10Var;
        c10 c10Var2 = this.f25247b;
        if (c10Var2 != null && c10Var2.f24937i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f25247b == null) {
            this.f25247b = this.d;
            return;
        }
        if (z10) {
            c10Var = this.f25247b;
        } else {
            c10Var = null;
        }
        this.f25248c = c10Var;
        this.f25247b = this.f25246a[i10];
        if (c10Var != null) {
            this.f25253k = 0.0f;
        } else {
            this.f25253k = 1.0f;
        }
    }

    public final void c(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int callState = sharedInstance.getCallState();
            if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                b(2, z10);
                return;
            }
            org.telegram.messenger.u3 u3Var = sharedInstance.groupCall;
            if (u3Var != null) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) u3Var.d.f(sharedInstance.getSelfId());
                if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.w3.w(14, sharedInstance.getChat())) || sharedInstance.groupCall.f18228b.rtmp_stream) {
                    sharedInstance.setMicMute(true, false, false);
                    b(3, z10);
                    return;
                }
                b(sharedInstance.isMicMute() ? 1 : 0, z10);
                return;
            }
            b(sharedInstance.isMicMute() ? 1 : 0, z10);
        }
    }
}
