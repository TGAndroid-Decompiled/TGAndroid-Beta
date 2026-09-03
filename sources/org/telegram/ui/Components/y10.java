package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class y10 {
    public x10[] f30796a;
    public x10 f30797b;
    public x10 f30798c;
    public x10 d;
    public float e;
    public float f30799f;
    public float f30800g;
    public float h;
    public float f30801i;
    public long f30802j;
    public float f30803k;
    public ArrayList f30804l;
    public Paint f30805m;
    public Path f30806n;

    public final void a(float f10) {
        this.f30800g = f10;
        float f11 = this.e;
        this.h = (f10 - f11) / 250.0f;
        this.f30801i = (f10 - f11) / 120.0f;
    }

    public final void b(int i10, boolean z4) {
        x10 x10Var;
        x10 x10Var2 = this.f30797b;
        if (x10Var2 != null && x10Var2.f30432i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f30797b == null) {
            this.f30797b = this.d;
            return;
        }
        if (z4) {
            x10Var = this.f30797b;
        } else {
            x10Var = null;
        }
        this.f30798c = x10Var;
        this.f30797b = this.f30796a[i10];
        if (x10Var != null) {
            this.f30803k = 0.0f;
        } else {
            this.f30803k = 1.0f;
        }
    }

    public final void c(boolean z4) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int callState = sharedInstance.getCallState();
            if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                b(2, z4);
                return;
            }
            ChatObject.Call call = sharedInstance.groupCall;
            if (call != null) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
                if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(sharedInstance.getChat())) || sharedInstance.groupCall.call.rtmp_stream) {
                    sharedInstance.setMicMute(true, false, false);
                    b(3, z4);
                    return;
                }
                b(sharedInstance.isMicMute() ? 1 : 0, z4);
                return;
            }
            b(sharedInstance.isMicMute() ? 1 : 0, z4);
        }
    }
}
