package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class y10 {
    public x10[] f30460a;
    public x10 f30461b;
    public x10 f30462c;
    public x10 d;
    public float e;
    public float f30463f;
    public float f30464g;
    public float h;
    public float f30465i;
    public long f30466j;
    public float f30467k;
    public ArrayList f30468l;
    public Paint f30469m;
    public Path f30470n;

    public final void a(float f7) {
        this.f30464g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.f30465i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        x10 x10Var;
        x10 x10Var2 = this.f30461b;
        if (x10Var2 != null && x10Var2.f30234i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f30461b == null) {
            this.f30461b = this.d;
            return;
        }
        if (z10) {
            x10Var = this.f30461b;
        } else {
            x10Var = null;
        }
        this.f30462c = x10Var;
        this.f30461b = this.f30460a[i10];
        if (x10Var != null) {
            this.f30467k = 0.0f;
        } else {
            this.f30467k = 1.0f;
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
