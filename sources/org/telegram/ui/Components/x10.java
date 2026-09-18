package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class x10 {
    public w10[] f30204a;
    public w10 f30205b;
    public w10 f30206c;
    public w10 d;
    public float e;
    public float f30207f;
    public float f30208g;
    public float h;
    public float f30209i;
    public long f30210j;
    public float f30211k;
    public ArrayList f30212l;
    public Paint f30213m;
    public Path f30214n;

    public final void a(float f7) {
        this.f30208g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.f30209i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        w10 w10Var;
        w10 w10Var2 = this.f30205b;
        if (w10Var2 != null && w10Var2.f29829i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f30205b == null) {
            this.f30205b = this.d;
            return;
        }
        if (z10) {
            w10Var = this.f30205b;
        } else {
            w10Var = null;
        }
        this.f30206c = w10Var;
        this.f30205b = this.f30204a[i10];
        if (w10Var != null) {
            this.f30211k = 0.0f;
        } else {
            this.f30211k = 1.0f;
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
