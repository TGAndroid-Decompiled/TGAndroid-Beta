package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class z00 {
    public y00[] f42694a;
    public y00 f42695b;
    public y00 f42696c;
    public y00 d;
    public float f42697e;
    public float f42698f;
    public float f42699g;
    public float h;
    public float f42700i;
    public long f42701j;
    public float f42702k;
    public ArrayList f42703l;
    public Paint f42704m;
    public Path f42705n;

    public final void a(float f10) {
        this.f42699g = f10;
        float f11 = this.f42697e;
        this.h = (f10 - f11) / 250.0f;
        this.f42700i = (f10 - f11) / 120.0f;
    }

    public final void b(int i7, boolean z10) {
        y00 y00Var;
        y00 y00Var2 = this.f42695b;
        if (y00Var2 != null && y00Var2.f42230i == i7) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f42695b == null) {
            this.f42695b = this.d;
            return;
        }
        if (z10) {
            y00Var = this.f42695b;
        } else {
            y00Var = null;
        }
        this.f42696c = y00Var;
        this.f42695b = this.f42694a[i7];
        if (y00Var != null) {
            this.f42702k = 0.0f;
        } else {
            this.f42702k = 1.0f;
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
                if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.v3.w(14, sharedInstance.getChat())) || sharedInstance.groupCall.f26935b.rtmp_stream) {
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
