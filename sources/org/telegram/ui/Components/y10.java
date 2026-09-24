package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class y10 {
    public x10[] f30453a;
    public x10 f30454b;
    public x10 f30455c;
    public x10 d;
    public float e;
    public float f30456f;
    public float f30457g;
    public float h;
    public float f30458i;
    public long f30459j;
    public float f30460k;
    public ArrayList f30461l;
    public Paint f30462m;
    public Path f30463n;

    public final void a(float f7) {
        this.f30457g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.f30458i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        x10 x10Var;
        x10 x10Var2 = this.f30454b;
        if (x10Var2 != null && x10Var2.f30220i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f30454b == null) {
            this.f30454b = this.d;
            return;
        }
        if (z10) {
            x10Var = this.f30454b;
        } else {
            x10Var = null;
        }
        this.f30455c = x10Var;
        this.f30454b = this.f30453a[i10];
        if (x10Var != null) {
            this.f30460k = 0.0f;
        } else {
            this.f30460k = 1.0f;
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
            ChatObject.Call call = sharedInstance.groupCall;
            if (call != null) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
                if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(sharedInstance.getChat())) || sharedInstance.groupCall.call.rtmp_stream) {
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
