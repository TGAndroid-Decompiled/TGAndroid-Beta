package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class b10 {
    public a10[] f33670a;
    public a10 f33671b;
    public a10 f33672c;
    public a10 d;
    public float f33673e;
    public float f33674f;
    public float f33675g;
    public float h;
    public float f33676i;
    public long f33677j;
    public float f33678k;
    public ArrayList f33679l;
    public Paint f33680m;
    public Path f33681n;

    public final void a(float f10) {
        this.f33675g = f10;
        float f11 = this.f33673e;
        this.h = (f10 - f11) / 250.0f;
        this.f33676i = (f10 - f11) / 120.0f;
    }

    public final void b(int i7, boolean z10) {
        a10 a10Var;
        a10 a10Var2 = this.f33671b;
        if (a10Var2 != null && a10Var2.f33225i == i7) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f33671b == null) {
            this.f33671b = this.d;
            return;
        }
        if (z10) {
            a10Var = this.f33671b;
        } else {
            a10Var = null;
        }
        this.f33672c = a10Var;
        this.f33671b = this.f33670a[i7];
        if (a10Var != null) {
            this.f33678k = 0.0f;
        } else {
            this.f33678k = 1.0f;
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
            org.telegram.messenger.t3 t3Var = sharedInstance.groupCall;
            if (t3Var != null) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(sharedInstance.getSelfId());
                if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.v3.w(14, sharedInstance.getChat())) || sharedInstance.groupCall.f26914b.rtmp_stream) {
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
