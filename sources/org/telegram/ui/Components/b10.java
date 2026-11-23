package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class b10 {
    public a10[] f33693a;
    public a10 f33694b;
    public a10 f33695c;
    public a10 d;
    public float f33696e;
    public float f33697f;
    public float f33698g;
    public float h;
    public float f33699i;
    public long f33700j;
    public float f33701k;
    public ArrayList f33702l;
    public Paint f33703m;
    public Path f33704n;

    public final void a(float f10) {
        this.f33698g = f10;
        float f11 = this.f33696e;
        this.h = (f10 - f11) / 250.0f;
        this.f33699i = (f10 - f11) / 120.0f;
    }

    public final void b(int i7, boolean z10) {
        a10 a10Var;
        a10 a10Var2 = this.f33694b;
        if (a10Var2 != null && a10Var2.f33259i == i7) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f33694b == null) {
            this.f33694b = this.d;
            return;
        }
        if (z10) {
            a10Var = this.f33694b;
        } else {
            a10Var = null;
        }
        this.f33695c = a10Var;
        this.f33694b = this.f33693a[i7];
        if (a10Var != null) {
            this.f33701k = 0.0f;
        } else {
            this.f33701k = 1.0f;
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
                if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.v3.w(14, sharedInstance.getChat())) || sharedInstance.groupCall.f26950b.rtmp_stream) {
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
