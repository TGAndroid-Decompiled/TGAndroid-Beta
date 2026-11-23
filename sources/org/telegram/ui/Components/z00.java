package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class z00 {
    public y00[] f42602a;
    public y00 f42603b;
    public y00 f42604c;
    public y00 d;
    public float f42605e;
    public float f42606f;
    public float f42607g;
    public float h;
    public float f42608i;
    public long f42609j;
    public float f42610k;
    public ArrayList f42611l;
    public Paint f42612m;
    public Path f42613n;

    public final void a(float f10) {
        this.f42607g = f10;
        float f11 = this.f42605e;
        this.h = (f10 - f11) / 250.0f;
        this.f42608i = (f10 - f11) / 120.0f;
    }

    public final void b(int i7, boolean z10) {
        y00 y00Var;
        y00 y00Var2 = this.f42603b;
        if (y00Var2 != null && y00Var2.f42263i == i7) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f42603b == null) {
            this.f42603b = this.d;
            return;
        }
        if (z10) {
            y00Var = this.f42603b;
        } else {
            y00Var = null;
        }
        this.f42604c = y00Var;
        this.f42603b = this.f42602a[i7];
        if (y00Var != null) {
            this.f42610k = 0.0f;
        } else {
            this.f42610k = 1.0f;
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
                if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.v3.w(14, sharedInstance.getChat())) || sharedInstance.groupCall.f27034b.rtmp_stream) {
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
