package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class y10 {
    public x10[] f30461a;
    public x10 f30462b;
    public x10 f30463c;
    public x10 d;
    public float e;
    public float f30464f;
    public float f30465g;
    public float h;
    public float f30466i;
    public long f30467j;
    public float f30468k;
    public ArrayList f30469l;
    public Paint f30470m;
    public Path f30471n;

    public final void a(float f7) {
        this.f30465g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.f30466i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        x10 x10Var;
        x10 x10Var2 = this.f30462b;
        if (x10Var2 != null && x10Var2.f30235i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f30462b == null) {
            this.f30462b = this.d;
            return;
        }
        if (z10) {
            x10Var = this.f30462b;
        } else {
            x10Var = null;
        }
        this.f30463c = x10Var;
        this.f30462b = this.f30461a[i10];
        if (x10Var != null) {
            this.f30468k = 0.0f;
        } else {
            this.f30468k = 1.0f;
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
