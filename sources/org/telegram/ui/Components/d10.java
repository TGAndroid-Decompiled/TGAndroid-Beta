package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class d10 {
    public c10[] f25314a;
    public c10 f25315b;
    public c10 f25316c;
    public c10 d;
    public float e;
    public float f25317f;
    public float f25318g;
    public float h;
    public float f25319i;
    public long f25320j;
    public float f25321k;
    public ArrayList f25322l;
    public Paint f25323m;
    public Path f25324n;

    public final void a(float f7) {
        this.f25318g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.f25319i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        c10 c10Var;
        c10 c10Var2 = this.f25315b;
        if (c10Var2 != null && c10Var2.f24959i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f25315b == null) {
            this.f25315b = this.d;
            return;
        }
        if (z10) {
            c10Var = this.f25315b;
        } else {
            c10Var = null;
        }
        this.f25316c = c10Var;
        this.f25315b = this.f25314a[i10];
        if (c10Var != null) {
            this.f25321k = 0.0f;
        } else {
            this.f25321k = 1.0f;
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
                if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.w3.w(14, sharedInstance.getChat())) || sharedInstance.groupCall.f18361b.rtmp_stream) {
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
